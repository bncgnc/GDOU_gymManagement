package com.ggms.service.impl;

import com.ggms.mapper.CompetitionMapper;
import com.ggms.pojo.*;
import com.ggms.service.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetitionServiveImpl implements CompetitionService {
    @Autowired
    CompetitionMapper competitionMapper;
    @Override
    public List<Competition> getCompetitions(CompetitionExample competitionExample) {
        return competitionMapper.selectByExample(competitionExample);
    }

    @Override
    public Competition getCompetition(Integer id) {
        return competitionMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SimpleField> getPermitedField(String userid) {
        return competitionMapper.getPermitedField(userid);
    }

    @Override
    public List<SimpleEquipment> getPermitEquipment(String userid) {
        return competitionMapper.getPermitEquipment(userid);
    }

    @Override
    public int doApplicate(Integer fapid, Integer eapid, String name, String judge) {
        Competition competition = new Competition();
        competition.setCjudge(judge);
        competition.setCname(name);
        competition.setEquipmentApplicationid(eapid);
        competition.setFieldApplicationid(fapid);
        competition.setCapermit(0);
        return competitionMapper.insertSelective(competition);
    }

    @Override
    public int changeApplication(Integer cid,Integer fapid, Integer eapid, String name, String judge) {
        Competition competition = new Competition();
        competition.setCompetitionid(cid);
        competition.setCjudge(judge);
        competition.setCname(name);
        competition.setEquipmentApplicationid(eapid);
        competition.setFieldApplicationid(fapid);
        return competitionMapper.updateByPrimaryKey(competition);
    }

    @Override
    public int deleteApplication(Integer competitionid) {
        return 0;
    }

    @Override
    public Competition getCompetitionApplication(Integer id) {
        return competitionMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateCompetitionApplication(Integer competitionid,Integer equipmentApplicationid, Integer fieldApplicationid, String judge, String cname) {
        Competition competition = new Competition();
        competition.setCapermit(0);
        competition.setCjudge(judge);
        competition.setCname(cname);
        competition.setCompetitionid(competitionid);
        competition.setFieldApplicationid(fieldApplicationid);
        competition.setEquipmentApplicationid(equipmentApplicationid);
        competitionMapper.updateByPrimaryKey(competition);
    }

    @Override
    public void competitionPermit(Integer competitionId) {
        Competition competition = competitionMapper.selectByPrimaryKey(competitionId);
        competition.setCapermit(1);

        competitionMapper.updateByPrimaryKey(competition);
    }

    @Override
    public void competitionRefuse(Integer competitionId) {
        Competition competition = competitionMapper.selectByPrimaryKey(competitionId);
        competition.setCapermit(2);

        competitionMapper.updateByPrimaryKey(competition);
    }
}
