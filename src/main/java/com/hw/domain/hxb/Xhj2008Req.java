package com.hw.domain.hxb;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class Xhj2008Req {
	@JsonProperty("flowno")
	@ApiModelProperty(value = "企业端流水号",required = true)
	private String FlowNO;

	@JsonProperty("paybranchno")
	@ApiModelProperty(value = "付款清算行号",required = true)
	private String PayBranchNo;

	@JsonProperty("acctno")
	@ApiModelProperty(value = "付款账号",required = true)
	private String AcctNo;

	@JsonProperty("acctname")
	@ApiModelProperty(value = "付款人户名",required = true)
	private String AcctName;

	@JsonProperty("paybanknm")
	@ApiModelProperty(value = "付款人开户行名称",required = true)
	private String PayBankNm;

	@JsonProperty("payaccttype")
	@ApiModelProperty(value = "付款人账户类型",required = true)
	private String PayAcctType;

	@JsonProperty("amount")
	@ApiModelProperty(value = "金额", required = true)
	private Double Amount;

	@JsonProperty("branchno")
	@ApiModelProperty(value = "收款清算行号",required = true)
	private String BranchNo;

	@JsonProperty("busitypecode1")
	@ApiModelProperty(value = "业务类型编码",required = true)
	private String Busitypecode1;

	@JsonProperty("busicategorycode")
	@ApiModelProperty(value = "业务种类编码",required = true)
	private String BusiCategoryCode;

	@JsonProperty("transferacctno")
	@ApiModelProperty(value = "收款帐号",required = true)
	private String TransferAcctNo;

	@JsonProperty("payeename")
	@ApiModelProperty(value = "收款人名称",required = true)
	private String PayeeName;

	@JsonProperty("abstract1")
	@ApiModelProperty(value = "附言",required = true)
	private String Abstract1;

	@JsonProperty("backup1")
	@ApiModelProperty(value = "备注1",required = true)
	private String Backup1;

	@JsonProperty("backup2")
	@ApiModelProperty(value = "备注2",required = true)
	private String Backup2;

	@JsonProperty("flowno")
	public String getFlowNO() {
		return FlowNO;
	}
	public void setFlowNO(String flowNO) {
		FlowNO = flowNO;
	}
	@JsonProperty("paybranchno")
	public String getPayBranchNo() {
		return PayBranchNo;
	}
	public void setPayBranchNo(String payBranchNo) {
		PayBranchNo = payBranchNo;
	}
	@JsonProperty("acctno")
	public String getAcctNo() {
		return AcctNo;
	}
	public void setAcctNo(String acctNo) {
		AcctNo = acctNo;
	}
	@JsonProperty("acctname")
	public String getAcctName() {
		return AcctName;
	}
	public void setAcctName(String acctName) {
		AcctName = acctName;
	}
	@JsonProperty("paybanknm")
	public String getPayBankNm() {
		return PayBankNm;
	}
	public void setPayBankNm(String payBankNm) {
		PayBankNm = payBankNm;
	}
	@JsonProperty("payaccttype")
	public String getPayAcctType() {
		return PayAcctType;
	}
	public void setPayAcctType(String payAcctType) {
		PayAcctType = payAcctType;
	}
	@JsonProperty("amount")
	public Double getAmount() {
		return Amount;
	}
	public void setAmount(Double amount) {
		Amount = amount;
	}
	@JsonProperty("branchno")
	public String getBranchNo() {
		return BranchNo;
	}
	@JsonProperty("busitypecode1")
	public String getBusitypecode1() {
		return Busitypecode1;
	}
	public void setBusitypecode1(String busitypecode1) {
		Busitypecode1 = busitypecode1;
	}
	@JsonProperty("busicategorycode")
	public String getBusiCategoryCode() {
		return BusiCategoryCode;
	}
	public void setBusiCategoryCode(String busiCategoryCode) {
		BusiCategoryCode = busiCategoryCode;
	}
	public void setBranchNo(String branchNo) {
		BranchNo = branchNo;
	}
	@JsonProperty("transferacctno")
	public String getTransferAcctNo() {
		return TransferAcctNo;
	}
	public void setTransferAcctNo(String transferAcctNo) {
		TransferAcctNo = transferAcctNo;
	}

	@JsonProperty("payeename")
	public String getPayeeName() {
		return PayeeName;
	}
	public void setPayeeName(String payeeName) {
		PayeeName = payeeName;
	}
	@JsonProperty("abstract1")
	public String getAbstract1() {
		return Abstract1;
	}
	public void setAbstract1(String abstract1) {
		Abstract1 = abstract1;
	}
	@JsonProperty("backup1")
	public String getBackup1() {
		return Backup1;
	}
	public void setBackup1(String backup1) {
		Backup1 = backup1;
	}
	@JsonProperty("backup2")
	public String getBackup2() {
		return Backup2;
	}
	public void setBackup2(String backup2) {
		Backup2 = backup2;
	}
	
	
}
