package com.hw.jwt;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel()
public class LoginPara {
	@JsonProperty("clientid")
	@ApiModelProperty(value = "Client ID", required = true)
	private String clientId;

	@JsonProperty("username")
	@ApiModelProperty(value = "用户名", required = true)
	private String userName;

	@JsonProperty("password")
	@ApiModelProperty(value = "密码", required = true)
	private String password;
	
	@JsonIgnore
	private String captchaCode;
	
	@JsonIgnore
	private String captchaValue;

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCaptchaCode() {
		return captchaCode;
	}

	public void setCaptchaCode(String captchaCode) {
		this.captchaCode = captchaCode;
	}

	public String getCaptchaValue() {
		return captchaValue;
	}

	public void setCaptchaValue(String captchaValue) {
		this.captchaValue = captchaValue;
	}
}
