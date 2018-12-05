package com.ligee.feign.service.impl;

import com.ligee.feign.service.ApiService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Author: 李杰
 * Date: 2018/12/5 10:55 AM
 */
@Component
public class ApiServiceError implements ApiService {

    @Override
    public String index() {
        return "服务发生故障！";
    }

}
