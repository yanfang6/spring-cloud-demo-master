package cn.demo.service0.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class testConfig {

    @Value("${userName}")
    private String userName;

    @RequestMapping("/hello")
    public String sayhello(){
        return userName;
    }


}
