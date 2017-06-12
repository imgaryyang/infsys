package com.hw.utils;

import java.io.UnsupportedEncodingException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class CommonParam {
	private String propertyFileName;
    private ResourceBundle resourceBundle;
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
            e.printStackTrace();
        }
        return result;
    }
}
