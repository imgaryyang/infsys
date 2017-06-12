package com.hw.domain.hxb;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel()
public class Xhj2008Res {
	@ApiModelProperty(value = "响应码", required = true)
	private String Response_code;
	@ApiModelProperty(value = "业务状态", required = true)
	private String Busistatus;
	@ApiModelProperty(value = "应收手续费")
	private Double FeeAmt1;
	@ApiModelProperty(value = "实收手续费")
	private Double FeeAmt2;
	@ApiModelProperty(value = "备注1",required = true)
	private String Backup1;
	@ApiModelProperty(value = "备注2",required = true)
	private String Backup2;
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
	public String getBusistatus() {
		return Busistatus;
	}
	public void setBusistatus(String busistatus) {
		Busistatus = busistatus;
	}
	public Double getFeeAmt1() {
		return FeeAmt1;
	}
	public void setFeeAmt1(Double feeAmt1) {
		FeeAmt1 = feeAmt1;
	}
	public Double getFeeAmt2() {
		return FeeAmt2;
	}
	public void setFeeAmt2(Double feeAmt2) {
		FeeAmt2 = feeAmt2;
	}
	public String getBackup1() {
		return Backup1;
	}
	public void setBackup1(String backup1) {
		Backup1 = backup1;
	}
	public String getBackup2() {
		return Backup2;
	}
	public void setBackup2(String backup2) {
		Backup2 = backup2;
	}
		
}
