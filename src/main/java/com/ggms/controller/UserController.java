package com.ggms.controller;

import com.ggms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController{
    @Autowired
    private UserService userService;

    @GetMapping("/userLogin")
    public ModelAndView userLogin() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("login");
        mv.addObject("userList", userService.findAllUser(null));

        return mv;
    }
    @RequestMapping("/userMain")
    public String userMain(){
        return "usermain";
    }
}