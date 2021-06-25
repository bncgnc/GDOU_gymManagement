package com.ggms.service;

import com.ggms.pojo.Competition;
import com.ggms.pojo.CompetitionExample;
import com.ggms.pojo.Field;
import com.ggms.pojo.FieldExample;

import java.util.List;

public interface CompetitionService {
    public List<Competition> getCompetitions(CompetitionExample competitionExample);

    public Competition getCompetition(Integer id);
}
