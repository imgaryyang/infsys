package com.hw.domain.hxb;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Xhj0009Res {
	@ApiModelProperty(value = "响应码", required = true)
	private String Response_code;
	@ApiModelProperty(value = "账号", required = true)
	private String AcctNo;
	@ApiModelProperty(value = "循环体条数", required = true)
	private Integer RecordNum;
	@ApiModelProperty(value = "错误消息")
	private String ErrorMsg;
	@ApiModelProperty(value = "明细",required = true)
	private List<Xhj0009ResDetail> Detail;
	public String getResponse_code() {
		return Response_code;
	}
	public void setResponse_code(String response_code) {
		Response_code = response_code;
	}
	public String getAcctNo() {
		return AcctNo;
	}
	public void setAcctNo(String acctNo) {
		AcctNo = acctNo;
	}
	public Integer getRecordNum() {
		return RecordNum;
	}
	public void setRecordNum(Integer recordNum) {
		RecordNum = recordNum;
	}
	public String getErrorMsg() {
		return ErrorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		ErrorMsg = errorMsg;
	}
	public List<Xhj0009ResDetail> getDetail() {
		return Detail;
	}
	public void setDetail(List<Xhj0009ResDetail> detail) {
		Detail = detail;
	}
	
}
