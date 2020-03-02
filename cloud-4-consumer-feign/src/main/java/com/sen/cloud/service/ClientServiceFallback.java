package com.sen.cloud.service;

import com.sen.cloud.bean.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
@Component//纳入容器
public class ClientServiceFallback implements ClientService {
    @Override
    public Product get(@PathVariable("id") Long id){
        return new Product();
    }
}
