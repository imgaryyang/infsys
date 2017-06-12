package com.hw.domain.hxb;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Xhj0004Req {
	@JsonProperty("acctno")
	@ApiModelProperty(value = "账号", required = true)
	private String acctNo;
	public String getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

}
