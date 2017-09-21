package com.pzhihao.mvc.controller;

import com.pzhihao.dao.PeopleMapper;
import com.pzhihao.domain.entity.People;
import com.pzhihao.domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {

    /**
     * 依赖注入获得对象
     */
    @Autowired
    ModelAndView modelAndView;



    @GetMapping("/showUser")
    public ModelAndView index(HttpServletRequest request){
        //自己new一个对象
//        ModelAndView modelAndView=new ModelAndView("showUser");
//        modelAndView.addObject("name","彭志豪");

        List<User> list=new ArrayList<User>();
        list.add(new User("abc","123"));
        list.add(new User("dfg","999"));

        modelAndView.setViewName("showUser");
        modelAndView.addObject("name","彭志豪2");
        modelAndView.addObject("users",list);
        modelAndView.addObject("url",request.getRequestURL());

        return modelAndView;
    }
}
