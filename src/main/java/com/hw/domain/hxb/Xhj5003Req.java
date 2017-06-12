package com.hw.domain.hxb;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel
public class Xhj5003Req {
	@ApiModelProperty(value = "交易账号", required = true)
	private String acctNo;
	@ApiModelProperty(value = "开始日期yyyyMMdd",required = true)
	private String startDate;
	@ApiModelProperty(value = "结束日期yyyyMMdd",required = true)
	private String endDate;
	@ApiModelProperty(value = "起始交易金额",required = true)
	private Double startAmt;
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
