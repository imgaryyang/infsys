package com.hw.domain.hxb;


import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Xhj2001Req {
	@ApiModelProperty(value = "经办人姓名",required = true)
	private String CustName;
	@ApiModelProperty(value = "批次号",required = true)
	private String BatchNo;
	@ApiModelProperty(value = "付款账号",required = true)
	private String AcctNo;
	@ApiModelProperty(value = "摘要",required = true)
	private String Summary;
	@ApiModelProperty(value = "明细",required = true)
	private List<Xhj2001ReqDetail> Detail;
	public String getCustName() {
		return CustName;
	}
	public void setCustName(String custName) {
		CustName = custName;
	}
	public String getBatchNo() {
		return BatchNo;
	}
	public void setBatchNo(String batchNo) {
		BatchNo = batchNo;
	}
	public String getAcctNo() {
		return AcctNo;
	}
	public void setAcctNo(String acctNo) {
		AcctNo = acctNo;
	}
	public String getSummary() {
		return Summary;
	}
	public void setSummary(String summary) {
		Summary = summary;
	}
	public List<Xhj2001ReqDetail> getDetail() {
		return Detail;
	}
	public void setDetail(List<Xhj2001ReqDetail> detail) {
		Detail = detail;
	}
	

}
