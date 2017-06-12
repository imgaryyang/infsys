package com.hw.domain.hxb;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Xhj3013Res {
	@ApiModelProperty(value = "响应码", required = true)
	private String Response_code;
	@ApiModelProperty(value = "错误消息")
	private String ErrorMsg;
	
	@JsonProperty("eleno")
	@ApiModelProperty(value = "电子回单号码")
	private String EleNo;
	
	@JsonProperty("validatecode")
	@ApiModelProperty(value = "电子回单验证码")
	private String ValidateCode;
	
	@JsonProperty("acctno")
	@ApiModelProperty(value = "账号")
	private String AcctNo;
	
	@JsonProperty("transdate")
	@ApiModelProperty(value = "日期")
	private String TransDate;
	
	@JsonProperty("transamt")
	@ApiModelProperty(value = "金额")
	private Double TransAmt;
	
	@JsonProperty("beneacct")
	@ApiModelProperty(value = "对方账号")
	private String BeneAcct;
	
	@JsonProperty("benename")
	@ApiModelProperty(value = "对方户名")
	private String BeneName;
	
	@JsonProperty("benebank")
	@ApiModelProperty(value = "对方银行")
	private String BeneBank;

	public String getEleNo() {
		return EleNo;
	}

	public void setEleNo(String eleNo) {
		EleNo = eleNo;
	}

	public String getValidateCode() {
		return ValidateCode;
	}

	public void setValidateCode(String validateCode) {
		ValidateCode = validateCode;
	}

	public String getAcctNo() {
		return AcctNo;
	}

	public void setAcctNo(String acctNo) {
		AcctNo = acctNo;
	}

	public String getTransDate() {
		return TransDate;
	}

	public void setTransDate(String transDate) {
		TransDate = transDate;
	}

	public Double getTransAmt() {
		return TransAmt;
	}

	public void setTransAmt(Double transAmt) {
		TransAmt = transAmt;
	}

	public String getBeneAcct() {
		return BeneAcct;
	}

	public void setBeneAcct(String beneAcct) {
		BeneAcct = beneAcct;
	}

	public String getBeneName() {
		return BeneName;
	}

	public void setBeneName(String beneName) {
		BeneName = beneName;
	}

	public String getBeneBank() {
		return BeneBank;
	}

	public void setBeneBank(String beneBank) {
		BeneBank = beneBank;
	}
	
	public String getResponse_code() {
		return Response_code;
	}
	public void setResponse_code(String response_code) {
		Response_code = response_code;
	}
	public String getErrorMsg() {
		return ErrorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		ErrorMsg = errorMsg;
	}
}
