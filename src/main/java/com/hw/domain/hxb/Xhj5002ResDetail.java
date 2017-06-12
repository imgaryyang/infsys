package com.hw.domain.hxb;

import io.swagger.annotations.ApiModelProperty;

public class Xhj5002ResDetail {
	@ApiModelProperty(value = "序号",required = true)
	private Integer No;
	@ApiModelProperty(value = "付款账号",required = true)
	private String AcctNo;
	@ApiModelProperty(value = "付款人户名",required = true)
	private String AcctName;
	@ApiModelProperty(value = "付款行名称",required = true)
	private String PayBankNm;
	@ApiModelProperty(value = "付款行行号",required = true)
	private String PayBranchNo;
	@ApiModelProperty(value = "转账类型",required = true)
	private String TransType;
	@ApiModelProperty(value = "收款帐号",required = true)
	private String TransferAcctNo;
	@ApiModelProperty(value = "收款人名称",required = true)
	private String PayeeName;
	@ApiModelProperty(value = "收款行名称",required = true)
	private String PayeeBankName;
	@ApiModelProperty(value = "收款联行行号", required = true)
	private String PayeeBankNo;
	@ApiModelProperty(value = "金额", required = true)
	private Double PayeeAmount;
	@ApiModelProperty(value = "摘要", required = true)
	private String AcSummary;
	@ApiModelProperty(value = "交易状态标志位", required = true)
	private String TransStat;
	@ApiModelProperty(value = "错误码")
	private String ErrorCode;
	@ApiModelProperty(value = "失败原因")
	private String ErrorMessage;
	@ApiModelProperty(value = "备注",required = true)
	private String Backup;
	@ApiModelProperty(value = "备用域1",required = true)
	private String Note1;
	@ApiModelProperty(value = "备用域2",required = true)
	private String Note2;
	@ApiModelProperty(value = "备用域3",required = true)
	private String Note3;
	public Integer getNo() {
		return No;
	}
	public void setNo(Integer no) {
		No = no;
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
	public String getPayBranchNo() {
		return PayBranchNo;
	}
	public void setPayBranchNo(String payBranchNo) {
		PayBranchNo = payBranchNo;
	}
	public String getTransType() {
		return TransType;
	}
	public void setTransType(String transType) {
		TransType = transType;
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
	public String getPayeeBankName() {
		return PayeeBankName;
	}
	public void setPayeeBankName(String payeeBankName) {
		PayeeBankName = payeeBankName;
	}
	public String getPayeeBankNo() {
		return PayeeBankNo;
	}
	public void setPayeeBankNo(String payeeBankNo) {
		PayeeBankNo = payeeBankNo;
	}
	public Double getPayeeAmount() {
		return PayeeAmount;
	}
	public void setPayeeAmount(Double payeeAmount) {
		PayeeAmount = payeeAmount;
	}
	public String getAcSummary() {
		return AcSummary;
	}
	public void setAcSummary(String acSummary) {
		AcSummary = acSummary;
	}
	public String getTransStat() {
		return TransStat;
	}
	public void setTransStat(String transStat) {
		TransStat = transStat;
	}
	public String getErrorCode() {
		return ErrorCode;
	}
	public void setErrorCode(String errorCode) {
		ErrorCode = errorCode;
	}
	public String getErrorMessage() {
		return ErrorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		ErrorMessage = errorMessage;
	}
	public String getBackup() {
		return Backup;
	}
	public void setBackup(String backup) {
		Backup = backup;
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
	public String getNote3() {
		return Note3;
	}
	public void setNote3(String note3) {
		Note3 = note3;
	}
}
