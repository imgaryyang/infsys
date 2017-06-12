package com.hw;

import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "HxBank")
public class HxBankConfig {
	//华夏银行前置机IP
	@Value(value = "${HxBank.Socket_Ip}")
	@NotNull
	private String Socket_Ip;//
	//华夏银行前置机端口
	@Value(value = "${HxBank.Socket_Port}")
    private String Socket_Port;//
	public String getSocket_Ip() {
		return Socket_Ip;
	}
	public void setSocket_Ip(String socket_Ip) {
		Socket_Ip = socket_Ip;
	}
	public String getSocket_Port() {
		return Socket_Port;
	}
	public void setSocket_Port(String socket_Port) {
		Socket_Port = socket_Port;
	}

}
