package com.ggms.controller;

import com.ggms.pojo.Equipment;
import com.ggms.pojo.User;
import com.ggms.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/equipment")
public class EquipmentController {
    @Autowired
    EquipmentService equipmentService;

    @RequestMapping("/getEquipments")
    @ResponseBody
    public List<Equipment> getEquipments(){
        return equipmentService.getEquipments(null);
    }
    @RequestMapping("/equipmentApplication/{id}")
    public ModelAndView equipmentApplication(@PathVariable("id") Integer equipmentId){
        ModelAndView m = new ModelAndView();
        m.setViewName("equipmentApplication");
        Equipment equipment = equipmentService.getEquipment(equipmentId);
        m.addObject("equipment",equipment);
        return m;
    }

    @RequestMapping("/applicateEquipment")
    public @ResponseBody String applicateEquipment(HttpSession session, @RequestParam("equipmentid") Integer equipmentid, @RequestParam("num")Integer num, @RequestParam("time")Integer time){
//        User user = (User)session.getAttribute("user");
//        String userid = user.getUserid();
        equipmentService.doApplication(equipmentid,num,time,"201811701316");
        return "/user/userMain";
    }
    @RequestMapping("/getCanRent")
    public @ResponseBody Integer getCanRent(@RequestParam("equipmentid") Integer eid){
        return equipmentService.getCanRent(eid);
    }
    @RequestMapping("/updateEquipmentApplication")
    @ResponseBody
    public void updateEquipmentApplication(@RequestParam("equipmentApplicationid") Integer applicationid, @RequestParam("num")Integer num, @RequestParam("time")Integer time){
        equipmentService.updateEquipmentApplication(applicationid,num,time);
    }
}
