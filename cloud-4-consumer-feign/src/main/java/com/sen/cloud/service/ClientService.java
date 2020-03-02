package com.sen.cloud.service;

import com.sen.cloud.bean.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

//   value指定调用的对应微服务的名称  fallback指定熔断后调用
@FeignClient(value = "product",fallback = ClientServiceFallback.class)

public interface ClientService {

    @GetMapping("/get/{id}")
    Product get(@PathVariable("id") Long id);
}
