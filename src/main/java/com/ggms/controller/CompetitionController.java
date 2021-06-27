package com.ggms.controller;

import com.ggms.pojo.Competition;
import com.ggms.pojo.Equipment;
import com.ggms.pojo.PermitedEquipment;
import com.ggms.pojo.SimpleField;
import com.ggms.service.CompetitionService;
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
@RequestMapping("/competition")
public class CompetitionController {
    @Autowired
    CompetitionService competitionService;

    @RequestMapping("/getCompetitions")
    @ResponseBody
    public List<Competition> getCompetitions(){
        return competitionService.getCompetitions(null);
    }

/*    @RequestMapping("/competitionApplication/{id}")
    public ModelAndView competitionApplication(@PathVariable("id") Integer competitionId){
        ModelAndView m = new ModelAndView();
        m.setViewName("WEB-INF/jsp/competitionApplication");
        Competition competition = competitionService.getCompetition(competitionId);
        m.addObject("competition",competition);
        return m;
    }*/

        @RequestMapping("/competitionApplication")
    public String competitionApplication(){
        return "competitionApplication";
    }

    @RequestMapping("/getSimpleField")
    @ResponseBody
    public List<SimpleField> getSimpleField(@RequestParam("userid") String userid){
            return competitionService.getPermitedField(userid);
    }
    @RequestMapping("/getPermitEquipment")
    @ResponseBody
    public List<PermitedEquipment> getPermitEquipment(@RequestParam("userid") String userid){
        return competitionService.getPermitEquipment(userid);
    }
    @RequestMapping("/applicateCompetition")
    @ResponseBody
    public String doApplication(HttpSession session,@RequestParam("equipmentApplicationid") Integer equipmentApplicationid,@RequestParam("fieldApplicationid") Integer fieldApplicationid,@RequestParam("judge") String judge,@RequestParam("cname") String cname){
        //        User user = (User)session.getAttribute("user");
//        String userid = user.getUserid();
        competitionService.doApplicate(fieldApplicationid,equipmentApplicationid,cname,judge);
        return "/user/userMain";
    }
}
