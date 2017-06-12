package com.hw.domain.hxb;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Xhj2001Req {
	@JsonProperty("custname")
	@ApiModelProperty(value = "经办人姓名",required = true)
	private String CustName;

	@JsonProperty("batchno")
	@ApiModelProperty(value = "批次号",required = true)
	private String BatchNo;

	@JsonProperty("acctno")
	@ApiModelProperty(value = "付款账号",required = true)
	private String AcctNo;

	@JsonProperty("summary")
	@ApiModelProperty(value = "摘要",required = true)
	private String Summary;
	@JsonProperty("detail")
	@ApiModelProperty(value = "明细",required = true)
	private List<Xhj2001ReqDetail> Detail;

	@JsonProperty("custname")
	public String getCustName() {
		return CustName;
	}
	public void setCustName(String custName) {
		CustName = custName;
	}
	@JsonProperty("batchno")
	public String getBatchNo() {
		return BatchNo;
	}
	public void setBatchNo(String batchNo) {
		BatchNo = batchNo;
	}

	@JsonProperty("acctno")
	public String getAcctNo() {
		return AcctNo;
	}
	public void setAcctNo(String acctNo) {
		AcctNo = acctNo;
	}
	@JsonProperty("summary")
	public String getSummary() {
		return Summary;
	}
	public void setSummary(String summary) {
		Summary = summary;
	}
	@JsonProperty("detail")
	public List<Xhj2001ReqDetail> getDetail() {
		return Detail;
	}
	public void setDetail(List<Xhj2001ReqDetail> detail) {
		Detail = detail;
	}
	

}
