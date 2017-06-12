package com.hw.domain.hxb;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Xhj0009Req {

	@JsonProperty("acctno")
	@ApiModelProperty(value = "账号", required = true)
	private String acctNo;

	@JsonProperty("begindate")
	@ApiModelProperty(value = "开始日期yyyyMMdd",required = true)
	private String beginDate;
	@JsonProperty("enddate")
	@ApiModelProperty(value = "结束日期yyyyMMdd",required = true)
	private String endDate;

	
	
	public String getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

}
