package com.ggms.controller;

import com.ggms.pojo.Competition;
import com.ggms.service.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
    @RequestMapping("/competitionApplication/{id}")
    public ModelAndView competitionApplication(@PathVariable("id") Integer competitionId){
        ModelAndView m = new ModelAndView();
        m.setViewName("WEB-INF/jsp/competitionApplication");
        Competition competition = competitionService.getCompetition(competitionId);
        m.addObject("competition",competition);
        return m;
    }
}
