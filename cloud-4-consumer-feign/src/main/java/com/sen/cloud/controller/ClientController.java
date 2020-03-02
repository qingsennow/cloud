package com.sen.cloud.controller;

import com.sen.cloud.bean.Product;
import com.sen.cloud.service.ClientService;
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
public class ClientController {


    @Autowired
    ClientService service;
    @ResponseBody
    @GetMapping("/get/{id}")
    Product get(@PathVariable("id") Long id){
        return service.get(id);
    }


}
