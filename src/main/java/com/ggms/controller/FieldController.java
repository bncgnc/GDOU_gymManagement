package com.ggms.controller;

import com.ggms.mapper.FieldTimetableMapper;
import com.ggms.pojo.Field;
import com.ggms.pojo.FieldTimetable;
import com.ggms.service.FieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.util.List;

@Controller
@RequestMapping("/field")
public class FieldController {
    @Autowired
    FieldService fieldService;
    @RequestMapping("/getFields")
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
    public @ResponseBody List<FieldTimetable> getTimes(@RequestParam("fieldid") Integer fieldId){
       return  fieldService.getFieldTimes(fieldId);
    }
    @RequestMapping("/applicateField")
    public String applicateField(HttpRequest request,@RequestParam Integer fieldid,Integer[] times,String date){
        return"";
    }
}
