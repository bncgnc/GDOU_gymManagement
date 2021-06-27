package com.ggms.controller;

import com.ggms.pojo.Field;
import com.ggms.pojo.FieldApplication;
import com.ggms.pojo.FieldTimetable;
import com.ggms.pojo.User;
import com.ggms.service.FieldService;
import com.sun.media.jfxmedia.logging.Logger;
import javafx.geometry.Pos;
import org.apache.ibatis.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/field")
public class FieldController {
    @Autowired
    FieldService fieldService;

    @RequestMapping(value = "/getFields")
    @ResponseBody
    public List<Field> getFields(){
        return fieldService.getFields(null);
    }

    @RequestMapping("/fieldApplication/{id}")
    public ModelAndView fieldApplication(@PathVariable("id") Integer fieldId){
        ModelAndView m = new ModelAndView();
        m.setViewName("fieldApplication");
        Field field = fieldService.getField(fieldId);
        m.addObject("field",field);
        return m;
    }
    @RequestMapping("/getTimes")
    public @ResponseBody Map<String, Object> getTimes(@RequestParam("fieldid") Integer fieldId, @RequestParam("date")String date){
        Map<String,Object> timesmap = new HashMap<String, Object>();
        timesmap.put("times",fieldService.getFieldTimes(fieldId));
        List<Integer> list = fieldService.getDisableTimes(fieldId,date);
        timesmap.put("disabletimes",list);
        return timesmap;
    }
    @RequestMapping("/applicateField")
    public @ResponseBody String applicateField(HttpSession session, @RequestParam("fieldid") Integer fieldid, @RequestParam("time")List<Integer> times, @RequestParam("date")String date){
//        User user = (User)session.getAttribute("user");
//        String userid = user.getUserid();
        fieldService.doApplication("201811701316",fieldid,date,times);
        return "/user/userMain";
    }



    @GetMapping("/fieldSelect")
    public ModelAndView fieldSelect() {
        ModelAndView mv = new ModelAndView();

        List<Field> fields = fieldService.getFields(null);

        mv.addObject("fieldList" , fields);
        mv.setViewName("fieldManagerCheckTable");

        return mv;
    }

    //模糊查询
    @PostMapping("/fieldExampleSelect")
    public ModelAndView fieldExampleSelect(String selectExample) {
        ModelAndView mv = new ModelAndView();

        List<Field> fields = fieldService.getFields(null);

        if( !"".equals(selectExample) && !"查询条件".equals(selectExample) ){
            fields = fieldService.fuzzyFindField(selectExample);
        }

        mv.addObject("fieldList" , fields);
        mv.setViewName("fieldManagerCheckTable");

        return mv;
    }

    @GetMapping("/toFieldAdd")
    public String toFieldAdd() {
        return "fieldAddForm";
    }

    @PostMapping("/fieldAdd")
    public ModelAndView fieldAdd(Field field) {
        ModelAndView mv = new ModelAndView();

        fieldService.insertField(field);
        mv.setViewName("redirect:/field/fieldSelect");

        return mv;
    }

    @GetMapping("/toFieldUpdate/{fieldId}")
    public ModelAndView toFieldUpdate(@PathVariable("fieldId")Integer fieldId) {
        ModelAndView mv = new ModelAndView();

        Field curField = fieldService.getField(fieldId);
        mv.addObject("field" , curField);
        mv.setViewName("fieldForm");

        return mv;
    }

    @PostMapping("/fieldUpdate")
    public String fieldUpdate(Field field) {
        fieldService.updateField(field);
        return "redirect:/field/fieldSelect";
    }

    @GetMapping("/fieldRemove/{fieldId}")
    public String fieldRemove(@PathVariable("fieldId")Integer fieldId) {
        fieldService.deleteField(fieldId);
        return "redirect:/field/fieldSelect";
    }

    @GetMapping("/toFieldTimetable/{fieldId}")
    public ModelAndView toFieldTimetable(@PathVariable("fieldId")Integer fieldId) {
        ModelAndView mv = new ModelAndView();

        List<FieldTimetable> fieldTimes = fieldService.getFieldTimes(fieldId);
        mv.addObject("curFieldId" , fieldId);
        mv.addObject("fieldTime" , fieldTimes);
        mv.setViewName("fieldTimeTableCheck");

        return mv;
    }

    @PostMapping("/fieldTimetableAdd")
    public String fieldTimetableAdd(FieldTimetable fieldTimetable) {
        fieldService.insertFieldTimetable(fieldTimetable);
        return "redirect:/field/toFieldTimetable/"+fieldTimetable.getFieldid();
    }

    @GetMapping("/fieldTimetableRemove/{fieldTimetableId}&{fieldId}")
    public String fieldTimetableRemove(@PathVariable("fieldTimetableId")Integer fieldTimetableId , @PathVariable("fieldId")Integer fieldId) {
        int column = fieldService.deleteFieldTimetable(fieldTimetableId);
        return "redirect:/field/toFieldTimetable/" + fieldId;
    }

    @GetMapping("/fieldApplicationSelect")
    public ModelAndView toFieldApplication() {
        ModelAndView mv = new ModelAndView();

        List<FieldApplication> fieldApplications = fieldService.findAllFieldApplication(null);

        mv.addObject("fieldApplications" , fieldApplications);
        mv.setViewName("fieldApplicationTable");

        return mv;
    }


}
