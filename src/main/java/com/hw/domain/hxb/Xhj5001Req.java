package com.hw.domain.hxb;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Xhj5001Req {

	@JsonProperty("flowno")
	@ApiModelProperty(value = "企业端流水号", required = true)

	private String flowNo;
	@JsonProperty("entrydate")
	@ApiModelProperty(value = "录入日期", required = true)
	private String entryDate;

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
