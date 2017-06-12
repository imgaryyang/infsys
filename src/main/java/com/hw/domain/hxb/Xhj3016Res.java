package com.hw.domain.hxb;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel()
public class Xhj3016Res {
	@ApiModelProperty(value = "响应码", required = true)
	private String response_code;
	@ApiModelProperty(value = "手续费")
	private Double fee;
	@ApiModelProperty(value = "余额")
	private Double balance;
	@ApiModelProperty(value = "备用域1")
	private String note1;
	@ApiModelProperty(value = "备用域2")
	private String note2;
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
	public Double getFee() {
		return fee;
	}
	public void setFee(Double fee) {
		this.fee = fee;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
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


	
}
