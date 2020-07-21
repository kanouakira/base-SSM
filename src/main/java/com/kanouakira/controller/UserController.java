package com.kanouakira.controller;

import com.kanouakira.domain.User;
import com.kanouakira.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView();

        List<User> users = userService.findAll();
        for (User user : users) {
            System.out.println(user);
        }
        modelAndView.addObject("userList", users);
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/error")
    public String error() throws Exception{
        int i = 1/0;
        return "success";
    }

}
