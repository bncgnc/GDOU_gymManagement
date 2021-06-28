package com.ggms.controller;

import com.ggms.pojo.Competition;
import com.ggms.pojo.SimpleEquipment;
import com.ggms.pojo.SimpleField;
import com.ggms.service.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
    public String doApplication(@RequestParam("equipmentApplicationid") Integer equipmentApplicationid,@RequestParam("fieldApplicationid") Integer fieldApplicationid,@RequestParam("judge") String judge,@RequestParam("cname") String cname){
        competitionService.doApplicate(fieldApplicationid,equipmentApplicationid,cname,judge);
        return "/user/userMain";
    }
    @RequestMapping("updateCompetitionApplication")
    @ResponseBody
    public void updateCompetitionApplication(@RequestParam("competitionid") Integer competitionid,@RequestParam("equipmentApplicationid") Integer equipmentApplicationid,@RequestParam("fieldApplicationid") Integer fieldApplicationid,@RequestParam("judge") String judge,@RequestParam("cname") String cname){
            competitionService.updateCompetitionApplication(competitionid,equipmentApplicationid,fieldApplicationid,judge,cname);
    }
}
