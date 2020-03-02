package com.sen.cloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sen.cloud.bean.Product;
import com.sen.cloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    //开启熔断机制   fallbackMethod指定服务熔断的处理方法
    //处理方法返回值和参数一致
    @HystrixCommand(fallbackMethod = "getDefult")
    @ResponseBody
    @GetMapping("/get/{id}")
    public Product get(@PathVariable("id") Long id){
        Product product = productService.get(id);
        if(product == null){
            throw new RuntimeException("ID:"+id+"  无对应信息");
        }
        return product;
    }
    public Product getDefult(@PathVariable("id") Long id){
        return new Product();
    }

}
