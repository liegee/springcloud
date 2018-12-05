package com.ligee.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: 李杰
 * Date: 2018/12/5 9:49 AM
 */
@RestController
@RefreshScope
public class HelloController {

    @Value("${server.port}")
    private int port;

    @GetMapping("index")
    public String index(){
        return "Hello World!, 端口：" + port;
    }
}
