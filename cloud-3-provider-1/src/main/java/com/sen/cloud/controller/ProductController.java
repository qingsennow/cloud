package com.sen.cloud.controller;

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

    @ResponseBody
    @GetMapping("/get/{id}")
    public Product get(@PathVariable("id") Long id){
        return productService.get(id);
    }
}
