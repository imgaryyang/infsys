package com.hw.domain.hxb;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel()
public class Xhj2001Res {
	@ApiModelProperty(value = "响应码", required = true)
	private String Response_code;
	@ApiModelProperty(value = "批次号")
	private String Batch_no;
	@ApiModelProperty(value = "备用域1")
	private String Note1;
	@ApiModelProperty(value = "备用域2")
	private String Note2;
	@ApiModelProperty(value = "错误消息")
	private String ErrorMsg;
	
	public String getErrorMsg() {
		return ErrorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		ErrorMsg = errorMsg;
	}
	public String getResponse_code() {
		return Response_code;
	}
	public void setResponse_code(String response_code) {
		Response_code = response_code;
	}
	public String getBatch_no() {
		return Batch_no;
	}
	public void setBatch_no(String batch_no) {
		Batch_no = batch_no;
	}
	public String getNote1() {
		return Note1;
	}
	public void setNote1(String note1) {
		Note1 = note1;
	}
	public String getNote2() {
		return Note2;
	}
	public void setNote2(String note2) {
		Note2 = note2;
	}
	
	
}
