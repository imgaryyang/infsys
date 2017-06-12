package com.hw.domain.hxb;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel()
public class Xhj0004Res {
	@ApiModelProperty(value = "报文标识", required = true)
	private String response_code;
	@ApiModelProperty(value = "账号", required = true)
	private String acctNo;
	@ApiModelProperty(value = "余额", required = true)
	private Double Balance;
	@ApiModelProperty(value = "可用余额", required = true)
	private Double availBal;
	@ApiModelProperty(value = "备用域1", required = true)
	private String Note1;
	@ApiModelProperty(value = "备用域2")
	private String Note2;
	@ApiModelProperty(value = "错误消息")
	private String ErrorMsg;
	
	public String getErrorMsg() {
		return ErrorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		ErrorMsg = errorMsg;
	}
	public String getResponse_code() {
		return response_code;
	}
	public void setResponse_code(String response_code) {
		this.response_code = response_code;
	}
	public String getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}
	public Double getBalance() {
		return Balance;
	}
	public void setBalance(Double balance) {
		Balance = balance;
	}
	public Double getAvailBal() {
		return availBal;
	}
	public void setAvailBal(Double availBal) {
		this.availBal = availBal;
	}
	public String getNote1() {
		return Note1;
	}
	public void setNote1(String note1) {
		Note1 = note1;
	}
	public String getNote2() {
		return Note2;
	}
	public void setNote2(String note2) {
		Note2 = note2;
	}

}
