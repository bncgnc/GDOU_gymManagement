package com.ggms.controller;

import com.ggms.pojo.User;
import com.ggms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController{
    @Autowired
    private UserService userService;

    @GetMapping(value = "/toUserLogin")
    public String toUserLogin(){
        return "login";
    }

    @PostMapping(value = "/userLogin")
    public ModelAndView userLogin(String userid , String password , HttpSession session){
        ModelAndView mv = new ModelAndView();

        mv.setViewName("login");

        User loginUser = userService.login(userid , password);

        if( loginUser != null ) { //成功登录
            if(loginUser.getUtype() == 0) {         //普通用户
                mv.setViewName("usermain");
            } else if (loginUser.getUtype() == 1) { //用户管理员
                mv.setViewName("index");
            } else if (loginUser.getUtype() == 2) { //场地管理员
                mv.setViewName("index");
            } else if (loginUser.getUtype() == 3) { //器材管理员
                mv.setViewName("index");
            } else {                                //赛事管理员
                mv.setViewName("index");
            }

            //登录,放入session域
            session.setAttribute("user" , loginUser);
        }
        return mv;
    }

    @GetMapping(value = "/toUserRegister")
    public String toUserRegister() {
        return "register";
    }

    @PostMapping(value = "/userRegister")
    public ModelAndView userRegister(User user) {
        ModelAndView mv = new ModelAndView();

        if( userService.findUserById(user.getUserid()) != null) { //学号已被注册
            mv.setViewName("register");
        } else {                                                  //成功注册
            userService.register(user);
            mv.setViewName("login");
        }

        return mv;
    }
    @RequestMapping("/userMain")
    public String userMain(){
        return "usermain";
    }
}