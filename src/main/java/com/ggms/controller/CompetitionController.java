package com.ggms.controller;

import com.ggms.pojo.Competition;
import com.ggms.pojo.SimpleEquipment;
import com.ggms.pojo.SimpleField;
import com.ggms.service.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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
    public List<SimpleEquipment> getPermitEquipment(@RequestParam("userid") String userid){
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
    @RequestMapping("updateCompetitionApplication")
    @ResponseBody
    public void updateCompetitionApplication(@RequestParam("competitionid") Integer competitionid,@RequestParam("equipmentApplicationid") Integer equipmentApplicationid,@RequestParam("fieldApplicationid") Integer fieldApplicationid,@RequestParam("judge") String judge,@RequestParam("cname") String cname){
            competitionService.updateCompetitionApplication(competitionid,equipmentApplicationid,fieldApplicationid,judge,cname);
    }


    @GetMapping("/competitionSelect")
    public ModelAndView competitionSelect() {
        ModelAndView mv = new ModelAndView();

        List<Competition> competitions = competitionService.getCompetitions(null);

        mv.addObject("competitionList" , competitions);
        mv.setViewName("competitionManagerCheckTable");

        return mv;
    }

    @GetMapping("/competitionPermit/{competitionId}")
    public String competitionPermit(@PathVariable("competitionId")Integer competitionId){
        competitionService.competitionPermit(competitionId);
        return "redirect:/competition/competitionSelect";
    }

    @GetMapping("/competitionRefuse/{competitionId}")
    public String competitionRefuse(@PathVariable("competitionId")Integer competitionId){
        competitionService.competitionRefuse(competitionId);
        return "redirect:/competition/competitionSelect";
    }

}
