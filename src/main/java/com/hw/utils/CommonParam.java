package com.hw.utils;

import com.hw.controller.HxbController;
import org.apache.log4j.Logger;

import java.io.UnsupportedEncodingException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class CommonParam {
	private String propertyFileName;
    private ResourceBundle resourceBundle;
    Logger logger = Logger.getLogger(HxbController.class);
    public CommonParam() {
        propertyFileName = "HX_Server";
        resourceBundle = ResourceBundle.getBundle(propertyFileName);
    }
    public String getString(String key) {
        if (key == null || key.equals("") || key.equals("null")) {
            return "";
        }
        String result = "";
        try {
            result = new String(resourceBundle.getString(key).getBytes("ISO-8859-1"), "UTF-8");;
        } catch (MissingResourceException | UnsupportedEncodingException e) {
            //e.printStackTrace();
            logger.error("取错误代码描述失败:"+e.getMessage());
            result = "";
        }
        return result;
    }
}
