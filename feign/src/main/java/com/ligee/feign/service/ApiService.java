package com.ligee.feign.service;

import com.ligee.feign.service.impl.ApiServiceError;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Author: 李杰
 * Date: 2018/12/5 10:41 AM
 */
@FeignClient(value = "eurekaclient", fallback = ApiServiceError.class)
public interface ApiService {

    @GetMapping(value = "/index")
    String index();

}
