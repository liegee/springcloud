package com.ligee.feign.controller;

import com.ligee.feign.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: 李杰
 * Date: 2018/12/5 10:58 AM
 */
@RestController
public class ApiController {

    private ApiService apiService;

    @Autowired
    public ApiController(ApiService apiService){
        this.apiService = apiService;
    }

    @RequestMapping("index")
    public String index(){
        return apiService.index();
    }
}
