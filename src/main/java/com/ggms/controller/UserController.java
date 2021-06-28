package com.ggms.controller;

import com.ggms.pojo.*;
import com.ggms.service.CompetitionService;
import com.ggms.service.EquipmentService;
import com.ggms.service.UserService;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController{
    @Autowired
    private UserService userService;
    @Autowired
    private EquipmentService equipmentService;
    @Autowired
    private CompetitionService competitionService;
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
                mv.setViewName("redirect:/user/userSelect");
            } else if (loginUser.getUtype() == 2) { //场地管理员
                mv.setViewName("redirect:/field/fieldSelect");
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

    @GetMapping(value = "/userLogout")
    public String userLogout(HttpSession session) {
        if ( session != null ) {
            session.invalidate();
        }
        return "login";
    }

    @RequestMapping("/userMain")
    public String userMain(){
        return "usermain";
    }

    @PostMapping("/userExampleSelect")
    public ModelAndView userExampleSelect(String selectExample) {
        ModelAndView mv = new ModelAndView();

        List<User> users = userService.findAllUser(null);

        if( !"".equals(selectExample) && !"查询条件".equals(selectExample) ) {
            users = userService.fuzzyFindUser(selectExample);
        }

        mv.addObject("userList" , users);
        mv.setViewName("adminCheckTable");

        return mv;
    }

    @GetMapping("/userSelect")
    public ModelAndView userSelect() {
        ModelAndView mv = new ModelAndView();

        List<User> users = userService.findAllUser(null);

        mv.addObject("userList" , users);
        mv.setViewName("adminCheckTable");

        return mv;
    }


    @GetMapping("/toUserAdd")
    public String toUserAdd() {
        return "adminAddForm";
    }

    @PostMapping("/userAdd")
    public ModelAndView userAdd(User user) {
        ModelAndView mv = new ModelAndView();

        if( userService.findUserById(user.getUserid()) != null) { //学号已被注册
            mv.setViewName("adminAddForm");
        } else {                                                  //成功注册
            userService.insertUser(user);
            mv.setViewName("redirect:/user/userSelect");
        }

        return mv;
    }

    @GetMapping("/userRemove/{userid}")
    public String userRemove(@PathVariable("userid") String userid) {
        int column = userService.deleteUserById(userid);
        return "redirect:/user/userSelect";
    }

    @GetMapping("/toUserUpdate/{userid}")
    public ModelAndView toUserUpdate(@PathVariable("userid") String userid) {
        ModelAndView mv = new ModelAndView();

        User curUser = userService.findUserById(userid);
        mv.addObject("user" , curUser);
        mv.setViewName("adminForm");

        return mv;
    }

    @PostMapping("/userUpdate")
    public String userUpdate(User user) {
        userService.updateUser(user);
        return "redirect:/user/userSelect";
    }

    @GetMapping("/userApplication")
    public String userApplication(HttpSession session) {
        return "userApplication";
    }

    @GetMapping("/getApplicationField")
    @ResponseBody
    public List<SimpleField> getApplicationField(HttpSession session){
        User user = (User)session.getAttribute("user");
        String userid = user.getUserid();
        return userService.getApplicationField(userid);
    }

    @GetMapping("/getApplicationEquipment")
    @ResponseBody
    public List<SimpleEquipment> getApplicationEquipment(HttpSession session){
        User user = (User)session.getAttribute("user");
        String userid = user.getUserid();
        return userService.getApplicationEquipment(userid);
    }


    @GetMapping("/getApplicationCompetition")
    @ResponseBody
    public List<SimpleCompetition> getApplicationCompetition(HttpSession session){
        User user = (User)session.getAttribute("user");
        String userid = user.getUserid();
        return userService.getApplicationCompetition(userid);
    }
    @PostMapping("/deleteApplicateField")
    @ResponseBody
    public Integer deleteApplicateField(@RequestParam("id") Integer applicationid){
        return userService.deleteApplicateField(applicationid);
    }

    @PostMapping("/deleteApplicateEquipment")
    @ResponseBody
    public Integer deleteApplicateEquipment(@RequestParam("id") Integer applicationid){
        return userService.deleteApplicateEquipment(applicationid);
    }
    @PostMapping("/deleteApplicateCompetition")
    @ResponseBody
    public void deleteApplicateCompetition(@RequestParam("id") Integer applicationid){
        userService.deleteApplicateCompetition(applicationid);
    }


    @RequestMapping("/updateApplicationEquipment/{id}")
    public ModelAndView updateEquipmentApplication (@PathVariable("id") Integer id, ModelAndView modelAndView) {
        EquipmentApplication equipmentApplication = equipmentService.getEquipmentApplication(id);
        Equipment equipment = equipmentService.getEquipment(equipmentApplication.getEquipmentid());
        modelAndView.addObject("equipment",equipment);
        modelAndView.addObject("equipmentApplication",equipmentApplication);
        modelAndView.setViewName("equipmentApplicationUpdate");
        return modelAndView;
    }

    @RequestMapping("/updateApplicationCompetition/{id}")
    public ModelAndView updateCompetitionApplication (@PathVariable("id") Integer id, ModelAndView modelAndView) {
        Competition competition = competitionService.getCompetitionApplication(id);
        modelAndView.setViewName("competitionApplicationUpdate");
        modelAndView.addObject("competition",competition);
        return modelAndView;
    }
}