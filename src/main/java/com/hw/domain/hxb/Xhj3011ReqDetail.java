package com.hw.domain.hxb;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class Xhj3011ReqDetail {
	@JsonProperty("acctno")
	@ApiModelProperty(value = "付款账号",required = true)
	private String acctNo;


	@JsonProperty("transtype")
	@ApiModelProperty(value = "转账类型",required = true)
	private String transType;

	@JsonProperty("payeebankname")
	@ApiModelProperty(value = "收款行名称",required = true)
	private String payeeBankName;

	@JsonProperty("payeeacctno")
	@ApiModelProperty(value = "收款帐号",required = true)
	private String payeeAcctNo;

	@JsonProperty("payeename")
	@ApiModelProperty(value = "收款人名称",required = true)
	private String payeeName;

	@JsonProperty("payeebankaddr")
	@ApiModelProperty(value = "收款行地址",required = true)
	private String payeeBankAddr;

	@JsonProperty("amount")
	@ApiModelProperty(value = "金额", required = true)
	private Double amount;

	@JsonProperty("ac_summary")
	@ApiModelProperty(value = "摘要", required = true)
	private String ac_summary;

	@JsonProperty("payeebankno")
	@ApiModelProperty(value = "收款联行行号", required = true)
	private String payeeBankNo;

	@JsonProperty("mobiletel")
	@ApiModelProperty(value = "手机号")
	private String mobileTel;
	public String getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public String getPayeeBankName() {
		return payeeBankName;
	}
	public void setPayeeBankName(String payeeBankName) {
		this.payeeBankName = payeeBankName;
	}
	public String getPayeeAcctNo() {
		return payeeAcctNo;
	}
	public void setPayeeAcctNo(String payeeAcctNo) {
		this.payeeAcctNo = payeeAcctNo;
	}
	public String getPayeeName() {
		return payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}
	public String getPayeeBankAddr() {
		return payeeBankAddr;
	}
	public void setPayeeBankAddr(String payeeBankAddr) {
		this.payeeBankAddr = payeeBankAddr;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getAc_summary() {
		return ac_summary;
	}
	public void setAc_summary(String ac_summary) {
		this.ac_summary = ac_summary;
	}
	public String getPayeeBankNo() {
		return payeeBankNo;
	}
	public void setPayeeBankNo(String payeeBankNo) {
		this.payeeBankNo = payeeBankNo;
	}
	public String getMobileTel() {
		return mobileTel;
	}
	public void setMobileTel(String mobileTel) {
		this.mobileTel = mobileTel;
	}
	
}
