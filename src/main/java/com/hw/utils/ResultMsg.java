package com.hw.utils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel()
public class ResultMsg {
	@ApiModelProperty(value = "错误代码", required = true)
	private int errcode;
	@ApiModelProperty(value = "错误信息", required = true)
	private String errmsg;
	@ApiModelProperty(value = "数据", required = true)
	private Object p2pdata;
	
	public ResultMsg(int ErrCode, String ErrMsg, Object P2pData)
	{
		this.errcode = ErrCode;
		this.errmsg = ErrMsg;
		this.p2pdata = P2pData;
	}
	public int getErrcode() {
		return errcode;
	}
	public void setErrcode(int errcode) {
		this.errcode = errcode;
	}
	public String getErrmsg() {
		return errmsg;
	}
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public Object getP2pdata() {
		return p2pdata;
	}
	public void setP2pdata(Object p2pdata) {
		this.p2pdata = p2pdata;
	}
}
