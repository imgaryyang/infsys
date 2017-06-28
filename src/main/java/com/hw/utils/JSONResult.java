package com.hw.utils;


import com.alibaba.fastjson.JSONObject;

/**
 * Created by pandehua on 2017/6/27.
 */
public class JSONResult {
    public static String fillResultString(Integer status, String message, Object result){
        JSONObject jsonObject = new JSONObject(){{
            put("status", status);
            put("message", message);
            put("result", result);
        }};
        return jsonObject.toString();
    }
}
