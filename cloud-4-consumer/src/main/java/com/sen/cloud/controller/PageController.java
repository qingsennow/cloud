package com.sen.cloud.controller;

import com.sen.cloud.bean.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.net.URLEncoder;

@Controller
@RequestMapping("/cus")
public class PageController {
    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL_PRE="http://localhost:8081";
    //provider在eureka中注册的应用名
    private static final String REST_APP_NAME="http://provider";
    @ResponseBody
    @GetMapping("/getold/{id}")
    public Product getold(@PathVariable("id") Long id) {
        String url = REST_URL_PRE+"/product/get/"+id;

        return  restTemplate.getForEntity( url,Product.class).getBody();

    }

    @ResponseBody
    @GetMapping("/get/{id}")
    public Product get(@PathVariable("id") Long id) {
        String url = REST_APP_NAME+"/product/get/"+id;

        return  restTemplate.getForEntity( url,Product.class).getBody();

    }


}
