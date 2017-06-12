package com.hw.domain.hxb;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel
public class Xhj5003Req {
	@ApiModelProperty(value = "交易账号", required = true)
	@JsonProperty("acctno")
	private String acctNo;

    @JsonProperty("startdate")
	@ApiModelProperty(value = "开始日期yyyyMMdd",required = true)
	private String startDate;

    @JsonProperty("enddate")
	@ApiModelProperty(value = "结束日期yyyyMMdd",required = true)
	private String endDate;

    @JsonProperty("startamt")
	@ApiModelProperty(value = "起始交易金额",required = true)
	private Double startAmt;

    @JsonProperty("endamt")
	@ApiModelProperty(value = "截至交易金额",required = true)
	private Double endAmt;
	public String getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public Double getStartAmt() {
		return startAmt;
	}
	public void setStartAmt(Double startAmt) {
		this.startAmt = startAmt;
	}
	public Double getEndAmt() {
		return endAmt;
	}
	public void setEndAmt(Double endAmt) {
		this.endAmt = endAmt;
	}

}
