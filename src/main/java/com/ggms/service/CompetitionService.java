package com.ggms.service;

import com.ggms.pojo.*;

import java.util.List;

public interface CompetitionService {
    public List<Competition> getCompetitions(CompetitionExample competitionExample);

    public Competition getCompetition(Integer id);

    public List<SimpleField> getPermitedField(String userid);

    public List<SimpleEquipment> getPermitEquipment(String userid);

    public int doApplicate(Integer fapid,Integer eapid,String name,String judge);

    public int changeApplication(Integer cid,Integer fapid,Integer eapid,String name,String judge);

    public int deleteApplication(Integer competitionid);

    public Competition getCompetitionApplication(Integer id);

    void updateCompetitionApplication(Integer competitionid,Integer equipmentApplicationid, Integer fieldApplicationid, String judge, String cname);
}
