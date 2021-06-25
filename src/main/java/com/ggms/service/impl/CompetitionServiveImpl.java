package com.ggms.service.impl;

import com.ggms.mapper.CompetitionMapper;
import com.ggms.pojo.Competition;
import com.ggms.pojo.CompetitionExample;
import com.ggms.pojo.Field;
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
}
