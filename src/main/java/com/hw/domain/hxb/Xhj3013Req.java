package com.hw.domain.hxb;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Xhj3013Req {
	@JsonProperty("flowno")
	@ApiModelProperty(value = "企业端流水号", required = true)
	private String flowNo;

	@JsonProperty("no")
	@ApiModelProperty(value = "序号")
	private String No;
	
	@JsonProperty("transdate")
	@ApiModelProperty(value = "日期yyyyMMdd",required = true)
	private String TransDate;

	@JsonProperty("flowno")
	public String getFlowNo() {
		return flowNo;
	}
	@JsonProperty("flowno")
	public void setFlowNo(String flowNo) {
		this.flowNo = flowNo;
	}
	public String getNo() {
		return No;
	}
	public void setNo(String no) {
		No = no;
	}
	@JsonProperty("transdate")
	public String getTransDate() {
		return TransDate;
	}
	@JsonProperty("transdate")
	public void setTransDate(String transDate) {
		TransDate = transDate;
	}
	
	
	
}
