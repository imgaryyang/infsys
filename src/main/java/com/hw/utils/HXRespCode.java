package com.hw.utils;

public enum HXRespCode {
	EL3005("EL3005","输入账号不合法"),
	EL6082("EL6082","未进行银企直联的柜台签约"),
	EL6083("EL6083","账号未签约"),

	EL3012("EL3012","记录条数有误"),
	EL3013("EL3013","输入账号无效"),
	EL3014("EL3014","查询账户余额失败"),
	EL3015("EL3015","查询无此机构信息"),
	EL3016("EL3016","查询无此交易记录"),
	EL3017("EL3017","日志查询失败"),
	EL3018("EL3018","无此账户信息"),
	EL3019("EL3019","查询单账户当日交易明细失败"),
	EL3020("EL3020","多账户余额查询失败"),

	EL2008("EL2008","短信定制失败"),
	EL2009("EL2009","定制查询失败"),
	EL2010("EL2010","短消息功能修改失败"),
	EL2011("EL2011","账号不可为空"),
	EL2012("EL2012","客户未登陆"),
	EL2013("EL2013","客户号或密码错误"),
	EL4155("EL4155","总笔数不合法"); 
	private String errcode;
	private String errmsg;
	
	public String getErrcode() {
		return errcode;
	}

	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

	private HXRespCode(String Errode, String ErrMsg)
	{
		this.errcode = Errode;
		this.errmsg = ErrMsg;
	}
}
