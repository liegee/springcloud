package com.ligee.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: 李杰
 * Date: 2018/12/5 9:49 AM
 */
@RestController
public class HelloController {

    @GetMapping("index")
    public String index(){
        return "Hello World!";
    }

}
