package com.pzhihao.mvc.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @RequestMapping("/show")
    public String index(){
        return "Hello World";
    }
}
