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


	@JsonProperty("acctno")
	public String getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(String acctno) {
		this.acctNo = acctno;
	}

	@JsonProperty("startdate")
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startdate) {
		this.startDate = startdate;
	}

	@JsonProperty("enddate")
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String enddate) {
		this.endDate = enddate;
	}

	@JsonProperty("startamt")
	public Double getStartAmt() {
		return startAmt;
	}
	public void setStartAmt(Double startamt) {
		this.startAmt = startamt;
	}

	@JsonProperty("endamt")
	public Double getEndAmt() {
		return endAmt;
	}
	public void setEndAmt(Double endamt) {
		this.endAmt = endamt;
	}

}
