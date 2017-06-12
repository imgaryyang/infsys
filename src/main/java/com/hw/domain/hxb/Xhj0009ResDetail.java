package com.hw.domain.hxb;

import io.swagger.annotations.ApiModelProperty;

public class Xhj0009ResDetail {
	@ApiModelProperty(value = "交易日期",required = true)
	private String TransDate;	
	@ApiModelProperty(value = "序号",required = true)
	private String No;	
	@ApiModelProperty(value = "币种",required = true)
	private String Waers;
	@ApiModelProperty(value = "会计流水",required = true)
	private String Acnbr;
	@ApiModelProperty(value = "借贷标记",required = true)
	private String Shkzg;
	@ApiModelProperty(value = "交易金额",required = true)
	private Double Amount;
	@ApiModelProperty(value = "对方账号",required = true)
	private String BeneAcct;
	@ApiModelProperty(value = "对方户名",required = true)
	private String BeneName;
	@ApiModelProperty(value = "对方银行",required = true)
	private String BeneBank;
	@ApiModelProperty(value = "账户余额",required = true)
	private Double Balance;
	@ApiModelProperty(value = "摘要", required = true)
	private String AcSummary;
	@ApiModelProperty(value = "渠道", required = true)
	private String Channel;
	@ApiModelProperty(value = "凭证种类", required = true)
	private String Blart;
	@ApiModelProperty(value = "备注", required = true)
	private String Beizhu;
	@ApiModelProperty(value = "交易时间", required = true)
	private String TransTime;
	public String getTransDate() {
		return TransDate;
	}
	public void setTransDate(String transDate) {
		TransDate = transDate;
	}
	public String getNo() {
		return No;
	}
	public void setNo(String no) {
		No = no;
	}
	public String getWaers() {
		return Waers;
	}
	public void setWaers(String waers) {
		Waers = waers;
	}
	public String getAcnbr() {
		return Acnbr;
	}
	public void setAcnbr(String acnbr) {
		Acnbr = acnbr;
	}
	public String getShkzg() {
		return Shkzg;
	}
	public void setShkzg(String shkzg) {
		Shkzg = shkzg;
	}
	public Double getAmount() {
		return Amount;
	}
	public void setAmount(Double amount) {
		Amount = amount;
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
	public Double getBalance() {
		return Balance;
	}
	public void setBalance(Double balance) {
		Balance = balance;
	}
	public String getAcSummary() {
		return AcSummary;
	}
	public void setAcSummary(String acSummary) {
		AcSummary = acSummary;
	}
	public String getChannel() {
		return Channel;
	}
	public void setChannel(String channel) {
		Channel = channel;
	}
	public String getBlart() {
		return Blart;
	}
	public void setBlart(String blart) {
		Blart = blart;
	}
	public String getBeizhu() {
		return Beizhu;
	}
	public void setBeizhu(String beizhu) {
		Beizhu = beizhu;
	}
	public String getTransTime() {
		return TransTime;
	}
	public void setTransTime(String transTime) {
		TransTime = transTime;
	}
	
	
}
