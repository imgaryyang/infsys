package com.hw.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.hw.HxBankConfig;
import com.hw.controller.HxbController;
import org.springframework.stereotype.Component;
@Component
public class SocketClient {

	//华夏银行前置机IP
	@Value(value = "${HxBank.Socket_Ip}")
	private String Socket_Ip;//
	//华夏银行前置机端口
	@Value(value = "${HxBank.Socket_Port}")
	private String Socket_Port;//

	Logger logger = Logger.getLogger(HxbController.class);
	//CommonParam commp = new CommonParam();
	Socket socket = null;
	BufferedReader br = null;
	PrintWriter pw = null;
	///报文元素之间以“#”分割，循环体内部以“|”分割，并以“|”结束循环体。报文结束符为“@@@@”
	public String SendData(String req){
		//logger.info("hxbankconfig:"+hxbankconfig.getSocket_Ip());

		//logger.info("Socket_Ip="+Socket_Ip);
		String response = null;
		try {
			// 客户端socket指定服务器的地址和端口号
			//socket = new Socket(commp.getString("SOCKET_IP"), Integer.parseInt(commp.getString("SOCKET_PORT")));
			socket = new Socket(Socket_Ip,Integer.parseInt(Socket_Port));
			logger.info("Socket=" + socket);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"GBK"));
			pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"GBK")));
			pw.println(req);
			pw.flush();
			response = br.readLine();
			logger.info("返回值:"+response);
			if(StrUtil.isBlankOrNull(response)){
				response="NORETN##@@@@";
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			response="TIMEOT##@@@@";
			//e.printStackTrace();
		} finally {
			try {
				logger.info("close......");
				if(br != null){
					br.close();
				}if(pw != null){
				pw.close();
				}
				if(socket!=null && socket.isConnected()){
				socket.close();
				}
				return response;
			} catch (IOException e) {
				logger.error(e.getMessage());
				//e.printStackTrace();
			}
		}
		return response;
	}
}
