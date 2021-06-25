package com.ggms.controller;

import com.ggms.pojo.Equipment;
import com.ggms.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
}
