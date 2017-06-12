package com.hw.domain.hxb;

import io.swagger.annotations.ApiModelProperty;

public class Xhj2001ReqDetail {

	@ApiModelProperty(value = "收款清算行行号", required = true)
	private String BranchNo;
	@ApiModelProperty(value = "收款帐号",required = true)
	private String TransferAcctNo;
	@ApiModelProperty(value = "收款户名",required = true)
	private String PayeeName;
	@ApiModelProperty(value = "业务类型编码",required = true)
	private String Busitypecode1;
	@ApiModelProperty(value = "业务种类编码",required = true)
	private String BusiCategoryCode;
	@ApiModelProperty(value = "附言",required = true)
	private String Abstract1;
	@ApiModelProperty(value = "金额", required = true)
	private Double Amount;
	@ApiModelProperty(value = "备注", required = true)
	private String Backup;
	public String getBranchNo() {
		return BranchNo;
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
	public String getAbstract1() {
		return Abstract1;
	}
	public void setAbstract1(String abstract1) {
		Abstract1 = abstract1;
	}
	public Double getAmount() {
		return Amount;
	}
	public void setAmount(Double amount) {
		Amount = amount;
	}
	public String getBackup() {
		return Backup;
	}
	public void setBackup(String backup) {
		Backup = backup;
	}
	
}
