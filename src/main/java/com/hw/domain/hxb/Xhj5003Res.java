package com.hw.domain.hxb;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel()
public class Xhj5003Res {
	@ApiModelProperty(value = "报文标识", required = true)
	private String response_code;
	@ApiModelProperty(value = "明细数")
	private Integer rec;
	@ApiModelProperty(value = "错误消息")
	private String ErrorMsg;


	@ApiModelProperty(value = "明细",required = true)
	private List<Xhj5003ResDetail> detail;

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
	public Integer getRec() {
		return rec;
	}
	public void setRec(Integer rec) {
		this.rec = rec;
	}

	public List<Xhj5003ResDetail> getDetail() {
		return detail;
	}

	public void setDetail(List<Xhj5003ResDetail> detail) {
		this.detail = detail;
	}
}
