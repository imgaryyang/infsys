package com.hw.domain.hxb;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Xhj3011Req {
	@JsonProperty("custname")
	@ApiModelProperty(value = "客户名称",required = true)
	private String CustName;

	@JsonProperty("flowno")
	@ApiModelProperty(value = "批次号",required = true)
	private String flowNo;

	@JsonProperty("summary")
	@ApiModelProperty(value = "摘要",required = true)
	private String Summary;

	@JsonProperty("detail")
	@ApiModelProperty(value = "明细",required = true)
	private List<Xhj3011ReqDetail> detail;
	
	
	public List<Xhj3011ReqDetail> getDetail() {
		return detail;
	}
	public void setDetail(List<Xhj3011ReqDetail> detail) {
		this.detail = detail;
	}

    @JsonProperty("custname")
	public String getCustName() {
		return CustName;
	}
	public void setCustName(String custName) {
		CustName = custName;
	}
	public String getFlowNo() {
		return flowNo;
	}
	public void setFlowNo(String flowNo) {
		this.flowNo = flowNo;
	}
	public String getSummary() {
		return Summary;
	}
	public void setSummary(String summary) {
		Summary = summary;
	}

}
