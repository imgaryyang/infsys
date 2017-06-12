package com.hw.domain.hxb;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Xhj5002Req {
	@ApiModelProperty(value = "交易代码",hidden=true, required = true,allowableValues="xhj5002")
	private String tran_code = "xhj5002";
	@ApiModelProperty(value = "批次号", required = true)
	private String batchno;
	@ApiModelProperty(value = "录入日期", required = true)
	private String entryDate;
	public String getTran_code() {
		return tran_code;
	}
	public void setTran_code(String tran_code) {
		this.tran_code = tran_code;
	}
	public String getBatchno() {
		return batchno;
	}
	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}
	public String getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}
	
}
