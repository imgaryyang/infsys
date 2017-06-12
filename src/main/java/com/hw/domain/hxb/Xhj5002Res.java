package com.hw.domain.hxb;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Xhj5002Res {
	@ApiModelProperty(value = "响应码", required = true)
	private String response_code;
	@ApiModelProperty(value = "批次号", required = true)
	private String batchNo;
	@ApiModelProperty(value = "总金额", required = true)
	private Double amount;
	@ApiModelProperty(value = "总笔数", required = true)
	private Integer recNumber;
	@ApiModelProperty(value = "成功金额", required = true)
	private Double succAmount;
	@ApiModelProperty(value = "成功笔数", required = true)
	private Integer succNum;
	@ApiModelProperty(value = "失败金额", required = true)
	private Double failAmount;
	@ApiModelProperty(value = "失败笔数", required = true)
	private Integer failNum;
	@ApiModelProperty(value = "循环体条数", required = true)
	private Integer RecordNum;

	@ApiModelProperty(value = "错误消息")
	private String ErrorMsg;
	@ApiModelProperty(value = "明细",required = true)
	private List<Xhj5002ResDetail> detail;
	
	public List<Xhj5002ResDetail> getDetail() {
		return detail;
	}
	public void setDetail(List<Xhj5002ResDetail> detail) {
		this.detail = detail;
	}
	public String getResponse_code() {
		return response_code;
	}
	public void setResponse_code(String response_code) {
		this.response_code = response_code;
	}
	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Integer getRecNumber() {
		return recNumber;
	}
	public void setRecNumber(Integer recNumber) {
		this.recNumber = recNumber;
	}
	public Double getSuccAmount() {
		return succAmount;
	}
	public void setSuccAmount(Double succAmount) {
		this.succAmount = succAmount;
	}
	public Integer getSuccNum() {
		return succNum;
	}
	public void setSuccNum(Integer succNum) {
		this.succNum = succNum;
	}
	public Double getFailAmount() {
		return failAmount;
	}
	public void setFailAmount(Double failAmount) {
		this.failAmount = failAmount;
	}
	public Integer getFailNum() {
		return failNum;
	}
	public void setFailNum(Integer failNum) {
		this.failNum = failNum;
	}
	public String getErrorMsg() {
		return ErrorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		ErrorMsg = errorMsg;
	}
	public Integer getRecordNum() {
		return RecordNum;
	}
	public void setRecordNum(Integer recordNum) {
		RecordNum = recordNum;
	}

}
