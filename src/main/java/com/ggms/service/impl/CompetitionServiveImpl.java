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
    public List<PermitedEquipment> getPermitEquipment(String userid) {
        return competitionMapper.getPermitEquipment(userid);
    }

    @Override
    public int doApplicate(Integer fapid, Integer eapid, String name, String judge) {
        Competition competition = new Competition();
        competition.setCjudge(judge);
        competition.setCname(name);
        competition.setEquipmentApplicationid(eapid);
        competition.setFieldApplicationid(fapid);
        return competitionMapper.insert(competition);
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
}
