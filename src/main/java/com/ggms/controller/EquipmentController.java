package com.ggms.controller;

import com.ggms.pojo.Equipment;
import com.ggms.pojo.EquipmentApplication;
import com.ggms.pojo.EquipmentRent;
import com.ggms.pojo.User;
import com.ggms.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

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
        User user = (User)session.getAttribute("user");
        String userid = user.getUserid();
        equipmentService.doApplication(equipmentid,num,time,userid);
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


    @GetMapping("/equipmentSelect")
    public ModelAndView equipmentSelect() {
        ModelAndView mv = new ModelAndView();

        List<Equipment> equipments = equipmentService.getEquipments(null);

        mv.addObject("equipmentList" , equipments);
        mv.setViewName("equipmentManagerCheckTable");

        return mv;
    }

    @PostMapping("/equipmentExampleSelect")
    public ModelAndView equipmentExampleSelect(String selectExample) {
        ModelAndView mv = new ModelAndView();

        List<Equipment> equipments = equipmentService.getEquipments(null);

        if( !"".equals(selectExample) && !"查询条件".equals(selectExample) ) {
            equipments = equipmentService.fuzzyFindEquipment(selectExample);
        }

        mv.addObject("equipmentList" , equipments);
        mv.setViewName("equipmentManagerCheckTable");

        return mv;
    }

    @GetMapping("/toEquipmentAdd")
    public String toEquipmentAdd() {
        return "equipmentAddForm";
    }

    @PostMapping("/equipmentAdd")
    public ModelAndView equipmentAdd(Equipment equipment) {
        ModelAndView mv = new ModelAndView();

        int column = equipmentService.insertEquipment(equipment);
        mv.setViewName("redirect:/equipment/equipmentSelect");

        return mv;
    }

    @GetMapping("/toEquipmentUpdate/{equipmentId}")
    public ModelAndView toEquipmentUpdate(@PathVariable("equipmentId")Integer equipmentId) {
        ModelAndView mv = new ModelAndView();

        Equipment curEquipment = equipmentService.getEquipment(equipmentId);

        mv.addObject("equipment" , curEquipment);
        mv.setViewName("equipmentForm");

        return mv;
    }

    @PostMapping("/equipmentUpdate")
    public String equipmentUpdate(Equipment equipment) {
        equipmentService.updateEquipment(equipment);
        return "redirect:/equipment/equipmentSelect";
    }

    @GetMapping("/equipmentRemove/{equipmentId}")
    public String equipmentRemove(@PathVariable("equipmentId")Integer equipmentId) {
        equipmentService.deleteEquipment(equipmentId);
        return "redirect:/equipment/equipmentSelect";
    }

    @GetMapping("/equipmentApplicationSelect")
    public ModelAndView equipmentApplicationSelect() {
        ModelAndView mv = new ModelAndView();

        List<EquipmentApplication> equipmentApplications = equipmentService.findAllEquipmentApplication(null);
        Map<String, User> applicants = equipmentService.findApplicant(equipmentApplications);

        mv.addObject("equipmentApplicationList" , equipmentApplications);
        mv.addObject("applicants" , applicants);
        mv.setViewName("equipmentApplicationTable");

        return mv;
    }

    @PostMapping("/equipmentApplicationExampleSelect")
    public ModelAndView equipmentApplicationExampleSelect(String selectExample) {
        ModelAndView mv = new ModelAndView();

        List<EquipmentApplication> equipmentApplications = equipmentService.findAllEquipmentApplication(null);
        Map<String, User> applicants = equipmentService.findApplicant(equipmentApplications);

        if( !"".equals(selectExample) && !"查询条件".equals(selectExample) ) {
            equipmentApplications = equipmentService.fuzzyFindEquipmentApplication(selectExample);
        }

        mv.addObject("equipmentApplicationList" , equipmentApplications);
        mv.addObject("applicants" , applicants);
        mv.setViewName("equipmentApplicationTable");

        return mv;
    }

    @GetMapping("/equipmentApplicationPermit/{equipmentApplicationId}")
    public String equipmentApplicationPermit(@PathVariable("equipmentApplicationId")Integer equipmentApplicationId){
        equipmentService.equipmentApplicationPermit(equipmentApplicationId);
        return "redirect:/equipment/equipmentApplicationSelect";
    }

    @GetMapping("/equipmentApplicationRefuse/{equipmentApplicationId}")
    public String equipmentApplicationRefuse(@PathVariable("equipmentApplicationId")Integer equipmentApplicationId){
        equipmentService.equipmentApplicationRefuse(equipmentApplicationId);
        return "redirect:/equipment/equipmentApplicationSelect";
    }

    @GetMapping("/equipmentRentSelect")
    public ModelAndView equipmentRentSelect() {
        ModelAndView mv = new ModelAndView();

        List<EquipmentRent> equipmentRents = equipmentService.findAllEquipmentRent(null);


        mv.addObject("equipmentRentList" , equipmentRents);
        mv.setViewName("equipmentRent");

        return mv;
    }

    @PostMapping("/equipmentRentAdd")
    public String equipmentRentAdd(EquipmentRent equipmentRent) {
        EquipmentApplication curEquipmentApplication = equipmentService.getEquipmentApplication(equipmentRent.getEquipmentApplicationid());
        //实际损坏数量不能大于申请的数量
        if ( curEquipmentApplication.getEanum() >= equipmentRent.getErbreaknum() ) {
            int column = equipmentService.insertEquipmentRent(equipmentRent);
        }
        return "redirect:/equipment/equipmentApplicationSelect";
    }

    @GetMapping("/equipmentRentRemove/{equipmentRentId}")
    public String equipmentRentRemove(@PathVariable("equipmentRentId")Integer equipmentRentId) {
        int column = equipmentService.deleteEquipmentRent(equipmentRentId);
        return "redirect:/equipment/equipmentRentSelect";
    }
}
