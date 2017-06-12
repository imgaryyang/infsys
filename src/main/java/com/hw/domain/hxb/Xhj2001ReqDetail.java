package com.hw.domain.hxb;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class Xhj2001ReqDetail {
	@JsonProperty("branchno")
	@ApiModelProperty(value = "收款清算行行号", required = true)
	private String BranchNo;

	@JsonProperty("transferacctno")
	@ApiModelProperty(value = "收款帐号",required = true)
	private String TransferAcctNo;
	@JsonProperty("payeename")
	@ApiModelProperty(value = "收款户名",required = true)
	private String PayeeName;
	@JsonProperty("busitypecode1")
	@ApiModelProperty(value = "业务类型编码",required = true)
	private String Busitypecode1;
	@JsonProperty("busicategorycode")
	@ApiModelProperty(value = "业务种类编码",required = true)
	private String BusiCategoryCode;
	@JsonProperty("abstract1")
	@ApiModelProperty(value = "附言",required = true)
	private String Abstract1;
	@JsonProperty("amount")
	@ApiModelProperty(value = "金额", required = true)
	private Double Amount;
	@JsonProperty("backup")
	@ApiModelProperty(value = "备注", required = true)
	private String Backup;
	@JsonProperty("branchno")
	public String getBranchNo() {
		return BranchNo;
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
	@JsonProperty("abstract1")
	public String getAbstract1() {
		return Abstract1;
	}
	public void setAbstract1(String abstract1) {
		Abstract1 = abstract1;
	}
	@JsonProperty("amount")
	public Double getAmount() {
		return Amount;
	}
	public void setAmount(Double amount) {
		Amount = amount;
	}
	@JsonProperty("backup")
	public String getBackup() {
		return Backup;
	}
	public void setBackup(String backup) {
		Backup = backup;
	}
	
}
