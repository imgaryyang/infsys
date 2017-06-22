package com.hw.domain.hxb;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Xhj3013Res {
	@JsonProperty("response_code")
	@ApiModelProperty(value = "响应码", required = true)
	private String Response_code;

	@JsonProperty("errormsg")
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

	@JsonProperty("eleno")
	public String getEleNo() {
		return EleNo;
	}
	@JsonProperty("eleno")
	public void setEleNo(String eleNo) {
		EleNo = eleNo;
	}
	@JsonProperty("validatecode")
	public String getValidateCode() {
		return ValidateCode;
	}
	@JsonProperty("validatecode")
	public void setValidateCode(String validateCode) {
		ValidateCode = validateCode;
	}
	@JsonProperty("acctno")
	public String getAcctNo() {
		return AcctNo;
	}
	@JsonProperty("acctno")
	public void setAcctNo(String acctNo) {
		AcctNo = acctNo;
	}
	@JsonProperty("transdate")
	public String getTransDate() {
		return TransDate;
	}
	@JsonProperty("transdate")
	public void setTransDate(String transDate) {
		TransDate = transDate;
	}
	@JsonProperty("transamt")
	public Double getTransAmt() {
		return TransAmt;
	}
	@JsonProperty("transamt")
	public void setTransAmt(Double transAmt) {
		TransAmt = transAmt;
	}
	@JsonProperty("beneacct")
	public String getBeneAcct() {
		return BeneAcct;
	}
	@JsonProperty("beneacct")
	public void setBeneAcct(String beneAcct) {
		BeneAcct = beneAcct;
	}
	@JsonProperty("benename")
	public String getBeneName() {
		return BeneName;
	}
	@JsonProperty("benename")
	public void setBeneName(String beneName) {
		BeneName = beneName;
	}
	@JsonProperty("benebank")
	public String getBeneBank() {
		return BeneBank;
	}
	@JsonProperty("benebank")
	public void setBeneBank(String benebank) {
		BeneBank = benebank;
	}
	@JsonProperty("response_code")
	public String getResponse_code() {
		return Response_code;
	}
	@JsonProperty("response_code")
	public void setResponse_code(String response_code) {
		Response_code = response_code;
	}

	@JsonProperty("errormsg")
	public String getErrorMsg() {
		return ErrorMsg;
	}
	@JsonProperty("errormsg")
	public void setErrorMsg(String errormsg) {
		ErrorMsg = errormsg;
	}
}
