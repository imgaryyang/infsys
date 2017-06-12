package com.hw.domain.hxb;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Xhj5002Req {

	@JsonProperty("batchno")
	@ApiModelProperty(value = "批次号", required = true)
	private String batchno;
	@JsonProperty("entrydate")
	@ApiModelProperty(value = "录入日期", required = true)
	private String entryDate;
	@JsonProperty("batchno")
	public String getBatchno() {
		return batchno;
	}
	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}
	@JsonProperty("entrydate")
	public String getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}
	
}
