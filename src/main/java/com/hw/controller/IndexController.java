package com.hw.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pandehua on 2017/6/11.
 */
@RestController
@RequestMapping(value = "/index")
public class IndexController {
    @Value(value = "${HxBank.Socket_Ip}")
    private String active;
    @RequestMapping
    public String index() {
        return "active:"+active;
    }
}
