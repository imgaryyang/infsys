package com.hw.domain.hxb;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Xhj5001Req {
	@ApiModelProperty(value = "交易代码", required = true,allowableValues="xhj5001")
	private String tran_code;
	@ApiModelProperty(value = "企业端流水号", required = true)
	private String flowNo;
	@ApiModelProperty(value = "录入日期", required = true)
	private String entryDate;
	public String getTran_code() {
		return tran_code;
	}
	public void setTran_code(String tran_code) {
		this.tran_code = tran_code;
	}
	public String getFlowNo() {
		return flowNo;
	}
	public void setFlowNo(String flowNo) {
		this.flowNo = flowNo;
	}
	public String getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}
	
}
