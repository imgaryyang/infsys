package com.hw.domain.hxb;

import io.swagger.annotations.ApiModelProperty;

public class Xhj2008Req {
	
	@ApiModelProperty(value = "企业端流水号",required = true)
	private String FlowNO;
	@ApiModelProperty(value = "付款清算行号",required = true)
	private String PayBranchNo;
	@ApiModelProperty(value = "付款账号",required = true)
	private String AcctNo;
	@ApiModelProperty(value = "付款人户名",required = true)
	private String AcctName;
	@ApiModelProperty(value = "付款人开户行名称",required = true)
	private String PayBankNm;
	@ApiModelProperty(value = "付款人账户类型",required = true)
	private String PayAcctType;	
	@ApiModelProperty(value = "金额", required = true)
	private Double Amount;
	@ApiModelProperty(value = "收款清算行号",required = true)
	private String BranchNo;
	@ApiModelProperty(value = "业务类型编码",required = true)
	private String Busitypecode1;
	@ApiModelProperty(value = "业务种类编码",required = true)
	private String BusiCategoryCode;
	@ApiModelProperty(value = "收款帐号",required = true)
	private String TransferAcctNo;
	@ApiModelProperty(value = "收款人名称",required = true)
	private String PayeeName;
	@ApiModelProperty(value = "附言",required = true)
	private String Abstract1;
	@ApiModelProperty(value = "备注1",required = true)
	private String Backup1;
	@ApiModelProperty(value = "备注2",required = true)
	private String Backup2;
	public String getFlowNO() {
		return FlowNO;
	}
	public void setFlowNO(String flowNO) {
		FlowNO = flowNO;
	}
	public String getPayBranchNo() {
		return PayBranchNo;
	}
	public void setPayBranchNo(String payBranchNo) {
		PayBranchNo = payBranchNo;
	}
	public String getAcctNo() {
		return AcctNo;
	}
	public void setAcctNo(String acctNo) {
		AcctNo = acctNo;
	}
	public String getAcctName() {
		return AcctName;
	}
	public void setAcctName(String acctName) {
		AcctName = acctName;
	}
	public String getPayBankNm() {
		return PayBankNm;
	}
	public void setPayBankNm(String payBankNm) {
		PayBankNm = payBankNm;
	}
	public String getPayAcctType() {
		return PayAcctType;
	}
	public void setPayAcctType(String payAcctType) {
		PayAcctType = payAcctType;
	}
	public Double getAmount() {
		return Amount;
	}
	public void setAmount(Double amount) {
		Amount = amount;
	}
	public String getBranchNo() {
		return BranchNo;
	}
	public String getBusitypecode1() {
		return Busitypecode1;
	}
	public void setBusitypecode1(String busitypecode1) {
		Busitypecode1 = busitypecode1;
	}
	public String getBusiCategoryCode() {
		return BusiCategoryCode;
	}
	public void setBusiCategoryCode(String busiCategoryCode) {
		BusiCategoryCode = busiCategoryCode;
	}
	public void setBranchNo(String branchNo) {
		BranchNo = branchNo;
	}
	public String getTransferAcctNo() {
		return TransferAcctNo;
	}
	public void setTransferAcctNo(String transferAcctNo) {
		TransferAcctNo = transferAcctNo;
	}
	public String getPayeeName() {
		return PayeeName;
	}
	public void setPayeeName(String payeeName) {
		PayeeName = payeeName;
	}
	public String getAbstract1() {
		return Abstract1;
	}
	public void setAbstract1(String abstract1) {
		Abstract1 = abstract1;
	}
	public String getBackup1() {
		return Backup1;
	}
	public void setBackup1(String backup1) {
		Backup1 = backup1;
	}
	public String getBackup2() {
		return Backup2;
	}
	public void setBackup2(String backup2) {
		Backup2 = backup2;
	}
	
	
}
