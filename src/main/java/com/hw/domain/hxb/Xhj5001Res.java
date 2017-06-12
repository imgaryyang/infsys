package com.hw.domain.hxb;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Xhj5001Res {
	@ApiModelProperty(value = "响应码", required = true)
	private String response_code;
	@ApiModelProperty(value = "成功标志 1:成功  0：不成功", required = true)
	private String succFlag;
	@ApiModelProperty(value = "交易状态", required = true)
	private String Transtatus;
	@ApiModelProperty(value = "错误码", required = true)
	private String errcode;
	@ApiModelProperty(value = "具体失败原因", required = true)
	private String errcodeMsg;
	@ApiModelProperty(value = "备注", required = true)
	private String abstract1;
	@ApiModelProperty(value = "备用域1", required = true)
	private String note1;
	@ApiModelProperty(value = "备用域2", required = true)
	private String note2;
	@ApiModelProperty(value = "备用域3", required = true)
	private String note3;
	public String getResponse_code() {
		return response_code;
	}
	public void setResponse_code(String response_code) {
		this.response_code = response_code;
	}
	public String getSuccFlag() {
		return succFlag;
	}
	public void setSuccFlag(String succFlag) {
		this.succFlag = succFlag;
	}
	public String getTranstatus() {
		return Transtatus;
	}
	public void setTranstatus(String transtatus) {
		Transtatus = transtatus;
	}
	public String getErrcode() {
		return errcode;
	}
	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}
	public String getErrcodeMsg() {
		return errcodeMsg;
	}
	public void setErrcodeMsg(String errcodeMsg) {
		this.errcodeMsg = errcodeMsg;
	}
	public String getAbstract1() {
		return abstract1;
	}
	public void setAbstract1(String abstract1) {
		this.abstract1 = abstract1;
	}
	public String getNote1() {
		return note1;
	}
	public void setNote1(String note1) {
		this.note1 = note1;
	}
	public String getNote2() {
		return note2;
	}
	public void setNote2(String note2) {
		this.note2 = note2;
	}
	public String getNote3() {
		return note3;
	}
	public void setNote3(String note3) {
		this.note3 = note3;
	}

}
