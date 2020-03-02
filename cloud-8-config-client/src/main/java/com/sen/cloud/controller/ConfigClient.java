package com.sen.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClient {
    @Value("${server.port}")
    private String port;
    @Value("${spring.application.name}")
    private String applicationName;

    @Autowired
    private Environment environment;


    @GetMapping("/config")
    public String config(){

        return "port: "+environment.getProperty("server.port")+"   name: "+environment.getProperty("spring.application.name");
    }

}
