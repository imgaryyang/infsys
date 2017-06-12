package com.hw.controller;

import java.util.ArrayList;
import java.util.List;

import com.hw.HxBankConfig;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hw.domain.hxb.Xhj0004Req;
import com.hw.domain.hxb.Xhj0004Res;
import com.hw.domain.hxb.Xhj0009Req;
import com.hw.domain.hxb.Xhj0009Res;
import com.hw.domain.hxb.Xhj0009ResDetail;
import com.hw.domain.hxb.Xhj2001Req;
import com.hw.domain.hxb.Xhj2001Res;
import com.hw.domain.hxb.Xhj2008Req;
import com.hw.domain.hxb.Xhj2008Res;
import com.hw.domain.hxb.Xhj3011Req;
import com.hw.domain.hxb.Xhj3011Res;
import com.hw.domain.hxb.Xhj3013Req;
import com.hw.domain.hxb.Xhj3013Res;
import com.hw.domain.hxb.Xhj3016Req;
import com.hw.domain.hxb.Xhj3016Res;
import com.hw.domain.hxb.Xhj5001Req;
import com.hw.domain.hxb.Xhj5001Res;
import com.hw.domain.hxb.Xhj5002Req;
import com.hw.domain.hxb.Xhj5002Res;
import com.hw.domain.hxb.Xhj5002ResDetail;
import com.hw.domain.hxb.Xhj5003Req;
import com.hw.domain.hxb.Xhj5003Res;
import com.hw.utils.CommonParam;
import com.hw.utils.SocketClient;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
//@EnableConfigurationProperties({HxBankConfig.class})
@Api("华夏银行接口api")
public class HxbController {
//	@Value(value = "${HxBank.Socket_Ip}")
//	private String Socket_Ip;
	Logger logger = Logger.getLogger(HxbController.class);
	@Autowired
	SocketClient socketc;
	CommonParam commp = new CommonParam();
	@RequestMapping(value = "hxb/xhj0004", method = RequestMethod.POST)
	@ApiOperation(notes = "查询单账户余额", value = "查询单账户余额", httpMethod = "POST")
	public @ResponseBody Xhj0004Res xhj0004(@RequestBody Xhj0004Req req) {
		Xhj0004Res res = new Xhj0004Res();
		// 请求示例：xhj0004#10550000000292011#@@@@
		String req_str = "xhj0004#" + req.getAcctNo() + "#@@@@";

		logger.info(req_str);
		String rep = socketc.SendData(req_str);
		// 返回示例：000000#10250000001476313#2000000.00#2000000.00###@@@@
		String[] reps = rep.split("#");
		res.setResponse_code(reps[0]);
		if (reps[0].contains("000000")) {
			if (reps.length >= 2) {
				res.setAcctNo(reps[1]);
			}
			if (reps.length >= 3) {
				res.setBalance(Double.parseDouble(reps[2]));
			}
			if (reps.length >= 4) {
				res.setAvailBal(Double.parseDouble(reps[3]));
			}
		} else {
			res.setErrorMsg(commp.getString(reps[0]));
		}
		return res;
	}

	@RequestMapping(value = "hxb/xhj0009", method = RequestMethod.POST)
	@ApiOperation(notes = "单账户多日明细查询", value = "单账户多日明细查询", httpMethod = "POST")
	public @ResponseBody Xhj0009Res xhj0009(@RequestBody Xhj0009Req req) {
		Xhj0009Res res = new Xhj0009Res();
		// 请求示例：xhj0009#13950000000003861#20140801#20140810#@@@@
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("xhj0009#");// 交易代码
		sBuilder.append(req.getAcctNo());// 交易账号
		sBuilder.append("#");
		sBuilder.append(req.getBeginDate());// 开始日期
		sBuilder.append("#");
		sBuilder.append(req.getEndDate());// 截至日期
		sBuilder.append("#@@@@");
		logger.info(sBuilder.toString());
		String rep = socketc.SendData(sBuilder.toString());
		// 返回示例：000000#
		String[] reps = rep.split("#", -1);
		res.setResponse_code(reps[0]);
		if (reps[0].equals("000000")) {
			res.setAcctNo(reps[1]);
			res.setRecordNum(Integer.parseInt(reps[2]));
			List<Xhj0009ResDetail> details = new ArrayList<Xhj0009ResDetail>();
			for (int i = 0; i < res.getRecordNum(); i++) {
				String cycString = reps[3 + i];
				String[] cycs = cycString.split("\\|", -1);
				Xhj0009ResDetail detail = new Xhj0009ResDetail();
				detail.setTransDate(cycs[0]);// 交易日期
				detail.setNo(cycs[1]);// 明细序号
				detail.setWaers(cycs[2]);// 币种
				detail.setAcnbr(cycs[3]);// 会计流水
				detail.setShkzg(cycs[4]);// 借贷标记
				detail.setAmount(Double.parseDouble(cycs[5]));// 交易金额
				detail.setBeneAcct(cycs[6]);// 对方账号
				detail.setBeneName(cycs[7]);// 对方账户名
				detail.setBeneBank(cycs[8]);// 对方开户行
				detail.setBalance(Double.parseDouble(cycs[9]));// 账户余额
				detail.setAcSummary(cycs[10]);// 摘要
				detail.setChannel(cycs[11]);// 渠道
				detail.setBlart(cycs[12]);// 凭证种类-此字段不显示或显示字符
				detail.setBeizhu(cycs[13]);// 备用域1[备注：]
				detail.setTransTime(cycs[14]);// 交易时间|
				details.add(detail);
			}
			res.setDetail(details);
		} else {
			res.setErrorMsg(commp.getString(reps[0]));
		}
		return res;
	}

	@RequestMapping(value = "hxb/xhj3013", method = RequestMethod.POST)
	@ApiOperation(notes = "银企直联进行转账汇款，交易成功后，生成电子凭证查询", value = "电子凭证查询", httpMethod = "POST")
	public @ResponseBody Xhj3013Res xhj3013(@RequestBody Xhj3013Req req) {
		//logger.info("测试："+hxconfigBean.getSocket_Ip());
		//logger.error("测试："+Socket_Ip);
		Xhj3013Res res = new Xhj3013Res();
		// 请求示例：xhj3013#6105281981050131618##20141015#@@@@
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("xhj3013#");// 交易代码
		sBuilder.append(req.getFlowNo());// 流水号
		sBuilder.append("#");
		sBuilder.append(req.getNo());// 序号
		sBuilder.append("#");
		sBuilder.append(req.getTransDate());// 日期
		sBuilder.append("#@@@@");
		logger.info(sBuilder.toString());
		String rep = socketc.SendData(sBuilder.toString());
		logger.info(rep);
		// 返回示例：000000#
		String[] reps = rep.split("#", -1);
		res.setResponse_code(reps[0]);
		if (reps[0].equals("000000")) {
			res.setEleNo(reps[1]);
			res.setValidateCode(reps[2]);
			res.setAcctNo(reps[3]);
			res.setTransDate(reps[4]);
			res.setTransAmt(Double.parseDouble(reps[5]));
			res.setBeneAcct(reps[6]);
			res.setBeneBank(reps[7]);
			res.setBeneName(reps[8]);
		} else {
			res.setErrorMsg(commp.getString(reps[0]));
		}
		return res;
	}

	@RequestMapping(value = "hxb/xhj5003", method = RequestMethod.POST)
	@ApiOperation(notes = "电子回单批量查询", value = "电子回单批量查询", httpMethod = "POST")
	public @ResponseBody Xhj5003Res xhj5003(@RequestBody Xhj5003Req req) {
		Xhj5003Res res = new Xhj5003Res();
		// 请求示例：xhj5003#13950000000003861#20140319#20140321#0.22#100000.00#@@@@
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("xhj5003#");// 交易代码
		sBuilder.append(req.getAcctNo());// 交易账号
		sBuilder.append("#");
		sBuilder.append(req.getStartDate());// 开始日期
		sBuilder.append("#");
		sBuilder.append(req.getEndDate());// 截至日期
		sBuilder.append("#");
		sBuilder.append(req.getStartAmt());// 起始交易金额
		sBuilder.append("#");
		sBuilder.append(req.getEndAmt());// 截至交易金额
		sBuilder.append("#@@@@");
		String rep = socketc.SendData(sBuilder.toString());
		// 返回示例：000000#
		String[] reps = rep.split("#");
		res.setResponse_code(reps[0]);
		if (reps[0].contains("000000")) {

		} else {
			res.setErrorMsg(commp.getString(reps[0]));
		}
		return res;
	}

	@RequestMapping(value = "hxb/xhj5001", method = RequestMethod.POST)
	@ApiOperation(notes = "可通过此接口对交易状态及结果进行查询", value = "单笔转账交易结果查询", httpMethod = "POST")
	public @ResponseBody Xhj5001Res xhj5001(@RequestBody Xhj5001Req req) {
		Xhj5001Res res = new Xhj5001Res();
		StringBuilder sBuilder = new StringBuilder();
		// 请求示例：xhj5001#20130630#20130630044107#@@@@
		sBuilder.append("xhj5001#");// 交易代码
		sBuilder.append(req.getEntryDate());// 录入日期
		sBuilder.append("#");
		sBuilder.append(req.getFlowNo());// 企业端流水号
		sBuilder.append("#@@@@");
		logger.info(sBuilder.toString());

		String rep = socketc.SendData(sBuilder.toString());
		// 返回示例：000000#
		String[] reps = rep.split("#", -1);
		res.setResponse_code(reps[0]);

		if (reps[0].equals("000000")) {
			res.setSuccFlag(reps[1]);// 成功标志 1:成功 0：不成功
			res.setTranstatus(reps[2]);// 交易状态1:已处理并扣帐 0：银行已收妥待处理 9:被系统自动冲正
			res.setErrcode(reps[3]);// 错误码
			res.setErrcodeMsg(reps[4]);// 具体失败原因
			res.setAbstract1(reps[5]);// 备注
			res.setNote1(reps[6]);// 备用域1
			res.setNote2(reps[7]);// 备用域2
			res.setNote3(reps[8]);// 备用域3
		} else {
			res.setErrcodeMsg(commp.getString(reps[0]));
		}
		return res;
	}

	@RequestMapping(value = "hxb/xhj5002", method = RequestMethod.POST)
	@ApiOperation(notes = "可通过此接口对批量转账交易状态及结果进行查询", value = "批量转账交易结果查询", httpMethod = "POST")
	public @ResponseBody Xhj5002Res xhj5002(@RequestBody Xhj5002Req req) {
		Xhj5002Res res = new Xhj5002Res();
		StringBuilder sBuilder = new StringBuilder();
		// 请求示例：xhj5002#20130630#20130521789876#@@@@
		sBuilder.append("xhj5002#");// 交易代码
		sBuilder.append(req.getEntryDate());// 录入日期
		sBuilder.append("#");
		sBuilder.append(req.getBatchno());// 企业端流水号
		sBuilder.append("#@@@@");
		logger.info(sBuilder.toString());

		String rep = socketc.SendData(sBuilder.toString());
		// 返回示例：000000#201706050610061#100#1#0#0#100.00#1#1#1|10250000001476313|银企互联测试|华夏银行北京分行分行营业部|0250|6|6230202013309928|薛韩宏||304100040000|100.00|附言1|09|BAG338|收付款清算行不能同为华夏银行|||||#@@@@
		String[] reps = rep.split("#");
		res.setResponse_code(reps[0]);
		if (reps[0].equals("000000")) {
			res.setBatchNo(reps[1]);// 批次号
			res.setAmount(Double.parseDouble(reps[2]));// 总金额
			res.setRecNumber(Integer.parseInt(reps[3]));// 总笔数
			res.setSuccAmount(Double.parseDouble(reps[4]));// 成功金额
			res.setSuccNum(Integer.parseInt(reps[5]));// 成功笔数
			res.setFailAmount(Double.parseDouble(reps[6]));// 失败金额
			res.setFailNum(Integer.parseInt(reps[7]));// 失败笔数
			res.setRecordNum(Integer.parseInt(reps[8]));// 循环体数量
			List<Xhj5002ResDetail> details = new ArrayList<Xhj5002ResDetail>();
			for (int i = 0; i < res.getRecordNum(); i++) {
				String cycString = reps[9 + i];
				String[] cycs = cycString.split("\\|", -1);
				Xhj5002ResDetail detail = new Xhj5002ResDetail();
				detail.setNo(Integer.parseInt(cycs[0]));// 序号
				detail.setAcctNo(cycs[1]);// 付款账号
				detail.setAcctName(cycs[2]);// 付款人户名
				detail.setPayBankNm(cycs[3]);// 付款行名称
				detail.setPayBranchNo(cycs[4]);// 付款行行号
				detail.setTransType(cycs[5]);// 转账类型
				detail.setTransferAcctNo(cycs[6]);// 收款帐号
				detail.setPayeeName(cycs[7]);// 收款人名称
				detail.setPayeeBankName(cycs[8]);// 收款行名称
				detail.setPayeeBankNo(cycs[9]);// 收款联行行号
				detail.setPayeeAmount(Double.parseDouble(cycs[10]));// 金额
				detail.setAcSummary(cycs[11]);// 摘要
				detail.setTransStat(cycs[12]);// 交易状态标志位
				detail.setErrorCode(cycs[13]);// 错误码
				detail.setErrorMessage(cycs[14]);// 失败原因
				detail.setBackup(cycs[15]);// 备注
				detail.setNote1(cycs[16]);// 备用域1
				detail.setNote2(cycs[17]);// 备用域2
				detail.setNote3(cycs[18]);// 备用域3
				details.add(detail);
			}
			res.setDetail(details);
		} else {
			res.setErrorMsg(commp.getString(reps[0]));
		}
		return res;
	}

	@RequestMapping(value = "hxb/xhj3011", method = RequestMethod.POST)
	@ApiOperation(notes = "交易状态及结果用xhj5002查询", value = "公对公转账-集中支付", httpMethod = "POST")
	public @ResponseBody Xhj3011Res xhj3011(@RequestBody Xhj3011Req req) {
		Xhj3011Res res = new Xhj3011Res();
		// 请求示例：xhj3011#1153285#6105281981052888996#11.11#1#摘要#1|10550000000294518|0|华夏银行北京分行分行营业部|NRA10550000000295396|企业1726|华夏银行北京分行分行营业部|11.11|摘要|304100042626|11111111111|#@@@@
		StringBuilder sBuilder = new StringBuilder();
		StringBuilder cyc_str = new StringBuilder();
		Double SUM_AMT = 0.00;
		// 循环体
		for (int i = 0; i < req.getDetail().size(); i++) {
			SUM_AMT += req.getDetail().get(i).getAmount();
			cyc_str.append("#");
			int xh = i + 1;
			cyc_str.append(xh);// 序号
			cyc_str.append("|");
			cyc_str.append(req.getDetail().get(i).getAcctNo());// 付款账号
			cyc_str.append("|");
			cyc_str.append(req.getDetail().get(i).getTransType());// 转账类型
			cyc_str.append("|");
			cyc_str.append(req.getDetail().get(i).getPayeeBankName());// 收款行名称
			cyc_str.append("|");
			cyc_str.append(req.getDetail().get(i).getPayeeAcctNo());// 收款帐号
			cyc_str.append("|");
			cyc_str.append(req.getDetail().get(i).getPayeeName());// 收款人名称
			cyc_str.append("|");
			cyc_str.append(req.getDetail().get(i).getPayeeBankAddr());// 收款行地址
			cyc_str.append("|");
			cyc_str.append(req.getDetail().get(i).getAmount());// 金额
			cyc_str.append("|");
			cyc_str.append(req.getDetail().get(i).getAc_summary());// 摘要
			cyc_str.append("|");
			cyc_str.append(req.getDetail().get(i).getPayeeBankNo());// 收款联行行号
			cyc_str.append("|");
			cyc_str.append(req.getDetail().get(i).getMobileTel());// 手机号
			cyc_str.append("|");
		}

		sBuilder.append("xhj3011#");// 交易代码
		sBuilder.append(req.getCustName());// 客户名称
		sBuilder.append("#");
		sBuilder.append(req.getFlowNo());// 批次号
		sBuilder.append("#");
		sBuilder.append(SUM_AMT);// 总金额
		sBuilder.append("#");
		sBuilder.append(req.getDetail().size());// 总笔数
		sBuilder.append("#");
		sBuilder.append(req.getSummary());// 摘要
		sBuilder.append(cyc_str);// 循环体
		sBuilder.append("#@@@@");
		logger.info(sBuilder.toString());

		String rep = socketc.SendData(sBuilder.toString());
		// 返回示例：000000#
		String[] reps = rep.split("#");
		res.setResponse_code(reps[0]);
		res.setErrorMsg(commp.getString(reps[0]));
		if (reps[0].equals("000000")) {
			res.setFlowNo(reps[1]);
		}
		return res;
	}

	@RequestMapping(value = "hxb/xhj3016", method = RequestMethod.POST)
	@ApiOperation(notes = "交易状态及结果用xhj5001查询", value = "公对公转账-单笔跨行直通式转账", httpMethod = "POST")
	public @ResponseBody Xhj3016Res xhj3016(@RequestBody Xhj3016Req req) {
		Xhj3016Res res = new Xhj3016Res();
		// 请求示例：xhj3016#610528198105094#13950000000003861#50.00#当阳市#20310000003512#华夏银行天津分行滨海支行#088779#10250000000891250#0#摘要#@@@@
		StringBuilder sBuilder = new StringBuilder();

		sBuilder.append("xhj3016#");// 交易代码
		sBuilder.append(req.getSignature());// 企业端流水号
		sBuilder.append("#");
		sBuilder.append(req.getAcctNo());// 付款账号
		sBuilder.append("#");
		sBuilder.append(req.getAmount());// 发生额
		sBuilder.append("#");
		sBuilder.append(req.getPayeeBankAddr());// 收款行地址
		sBuilder.append("#");
		sBuilder.append(req.getPayeeBankNo());// 收款联行号
		sBuilder.append("#");
		sBuilder.append(req.getPayeeBankName());// 收款行名
		sBuilder.append("#");
		sBuilder.append(req.getPayeeName());// 收款人名称
		sBuilder.append("#");
		sBuilder.append(req.getPayeeAcctNo());// 收款账号
		sBuilder.append("#");
		sBuilder.append(req.getTransType());// 转账类别
		sBuilder.append("#");
		sBuilder.append(req.getSummary());// 摘要
		sBuilder.append("#@@@@");
		logger.info(sBuilder.toString());

		String rep = socketc.SendData(sBuilder.toString());
		// 返回示例：000000#
		String[] reps = rep.split("#");
		res.setResponse_code(reps[0]);
		res.setErrorMsg(commp.getString(reps[0]));
		if (reps[0].equals("000000")) {
			res.setFee(Double.parseDouble(reps[1]));
			res.setBalance(Double.parseDouble(reps[2]));
			res.setNote1(reps[3]);
			res.setNote2(reps[4]);
		}
		return res;
	}

	@RequestMapping(value = "hxb/xhj2008", method = RequestMethod.POST)
	@ApiOperation(notes = "交易状态及结果用xhj5001查询", value = "公对公转账-单笔网银跨行转账", httpMethod = "POST")
	public @ResponseBody Xhj2008Res xhj2008(@RequestBody Xhj2008Req req) {
		Xhj2008Res res = new Xhj2008Res();
		// 请求示例：xhj2008#20130430000007#304100040000#10550000000293547#XIAOYANYAN#华夏银行上海分行分行营业部#AT00#1.11#102100099996#C204#00500#4059200001819900000743#北京石创永合装饰有限公司#hlnhelina#阿发#个人#@@@@
		StringBuilder sBuilder = new StringBuilder();

		sBuilder.append("xhj2008#");// 交易代码
		sBuilder.append(req.getFlowNO());// 企业端流水号
		sBuilder.append("#");
		sBuilder.append(req.getPayBranchNo());// 付款清算行号
		sBuilder.append("#");
		sBuilder.append(req.getAcctNo());// 付款账号
		sBuilder.append("#");
		sBuilder.append(req.getAcctName());// 付款人户名
		sBuilder.append("#");
		sBuilder.append(req.getPayBankNm());// 付款人开户行名称
		sBuilder.append("#");
		sBuilder.append(req.getPayAcctType());// 付款人账户类型
		sBuilder.append("#");
		sBuilder.append(req.getAmount());// 发生额
		sBuilder.append("#");
		sBuilder.append(req.getBranchNo());// 收款清算行号
		sBuilder.append("#");
		sBuilder.append(req.getBusitypecode1());// 业务类型编码
		sBuilder.append("#");
		sBuilder.append(req.getBusiCategoryCode());// 业务种类编码
		sBuilder.append("#");
		sBuilder.append(req.getTransferAcctNo());// 收款账号
		sBuilder.append("#");
		sBuilder.append(req.getPayeeName());// 收款人名称
		sBuilder.append("#");
		sBuilder.append(req.getAbstract1());// 附言
		sBuilder.append("#");
		sBuilder.append(req.getBackup1());// 备注1
		sBuilder.append("#");
		sBuilder.append(req.getBackup2());// 备注2
		sBuilder.append("#@@@@");
		logger.info(sBuilder.toString());

		String rep = socketc.SendData(sBuilder.toString());
		// 返回示例：000000#
		String[] reps = rep.split("#", -1);
		res.setResponse_code(reps[0]);
		if (reps[0].equals("000000")) {
			res.setBusistatus(reps[1]);
			res.setFeeAmt1(Double.parseDouble(reps[2]));
			res.setFeeAmt2(Double.parseDouble(reps[3]));
			res.setBackup1(reps[4]);
			res.setBackup2(reps[5]);
		} else {
			res.setErrorMsg(commp.getString(reps[0]));
		}
		return res;
	}

	@RequestMapping(value = "hxb/xhj2001", method = RequestMethod.POST)
	@ApiOperation(notes = "交易状态及结果用xhj5002查询", value = "公对私转账-跨行对公向对私批量转账", httpMethod = "POST")
	public @ResponseBody Xhj2001Res xhj2001(@RequestBody Xhj2001Req req) {
		Xhj2001Res res = new Xhj2001Res();
		// 请求示例：xhj2001#3863011#100086105281981#10550000000292011#3.33#3#人行二期摘要
		// #1|304110001990|6226300114300014|张恭弢河|C204|00100|人行二期摘要2|1.11|人行二期
		// 摘要2|
		// #2|304110001990|6226300114300014|张恭弢河|C204|00100|人行二期摘要2|1.11|人
		// 行二期摘要2|
		// #3|304110001990|6226300114300014|张恭弢河|C204|00100|人行二期摘要
		// 2|1.11|人行二期摘要2|#@@@@
		StringBuilder sBuilder = new StringBuilder();
		StringBuilder cyc_str = new StringBuilder();
		Double SUM_AMT = 0.00;// 总金额
		// 循环体
		for (int i = 0; i < req.getDetail().size(); i++) {
			SUM_AMT += req.getDetail().get(i).getAmount();
			cyc_str.append("#");
			int xh = i + 1;
			cyc_str.append(xh);// 序号
			cyc_str.append("|");
			cyc_str.append(req.getDetail().get(i).getBranchNo());// 收款清算行行号
			cyc_str.append("|");
			cyc_str.append(req.getDetail().get(i).getTransferAcctNo());// 收款帐号
			cyc_str.append("|");
			cyc_str.append(req.getDetail().get(i).getPayeeName());// 收款户名
			cyc_str.append("|");
			cyc_str.append(req.getDetail().get(i).getBusitypecode1());// 业务类型编码
			cyc_str.append("|");
			cyc_str.append(req.getDetail().get(i).getBusiCategoryCode());// 业务种类编码
			cyc_str.append("|");
			cyc_str.append(req.getDetail().get(i).getAbstract1());// 附言
			cyc_str.append("|");
			cyc_str.append(req.getDetail().get(i).getAmount());// 金额
			cyc_str.append("|");
			cyc_str.append(req.getDetail().get(i).getBackup());// 备注
			cyc_str.append("|");
		}
		sBuilder.append("xhj2001#");// 交易代码
		sBuilder.append(req.getCustName());// 经办人姓名
		sBuilder.append("#");
		sBuilder.append(req.getBatchNo());// 批次号
		sBuilder.append("#");
		sBuilder.append(req.getAcctNo());// 付款账号
		sBuilder.append("#");
		sBuilder.append(SUM_AMT);// 总金额
		sBuilder.append("#");
		sBuilder.append(req.getDetail().size());// 记录数
		sBuilder.append("#");
		sBuilder.append(req.getSummary());// 摘要
		sBuilder.append(cyc_str);// 循环体
		sBuilder.append("#@@@@");
		logger.info(sBuilder.toString());
		String rep = socketc.SendData(sBuilder.toString());
		// 返回示例：000000#
		String[] reps = rep.split("#");
		res.setResponse_code(reps[0]);
		res.setErrorMsg(commp.getString(reps[0]));
		if (reps[0].equals("000000")) {
			res.setBatch_no(reps[1]);
		}
		return res;
	}
}
