package com.pzhihao.mvc.controller;


import com.pzhihao.Service.PeopleService;
import com.pzhihao.dao.PeopleMapper;
import com.pzhihao.domain.entity.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @Autowired
    PeopleService peopleService;

    @RequestMapping("/show")
    public String index(){
        return "Hello World";
    }

    @GetMapping(value = "people/{id}")
    public  People findPeopleById(@PathVariable int id){
        return peopleService.findById(id);
    }
}
