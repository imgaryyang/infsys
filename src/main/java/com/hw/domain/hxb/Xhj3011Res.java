package com.hw.domain.hxb;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel()
public class Xhj3011Res {
	@ApiModelProperty(value = "响应码", required = true)
	private String response_code;
	@ApiModelProperty(value = "批次号")
	private String flowNo;
	@ApiModelProperty(value = "错误消息")
	private String ErrorMsg;
	
	public String getErrorMsg() {
		return ErrorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		ErrorMsg = errorMsg;
	}
	public String getResponse_code() {
		return response_code;
	}
	public void setResponse_code(String response_code) {
		this.response_code = response_code;
	}
	public String getFlowNo() {
		return flowNo;
	}
	public void setFlowNo(String flowNo) {
		this.flowNo = flowNo;
	}

	
}
