package com.ggms.controller;

import com.ggms.pojo.Field;
import com.ggms.pojo.FieldTimetable;
import com.ggms.pojo.User;
import com.ggms.service.FieldService;
import com.sun.media.jfxmedia.logging.Logger;
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
}
