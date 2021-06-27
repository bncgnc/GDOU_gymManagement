package com.ggms.service.impl;

import com.ggms.mapper.FieldApplicationMapper;
import com.ggms.mapper.FieldMapper;
import com.ggms.mapper.FieldTimetableMapper;
import com.ggms.pojo.*;
import com.ggms.service.FieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
@Service
public class FieldServiceImpl implements FieldService {
    @Autowired
    FieldMapper fieldMapper;
    @Autowired
    FieldTimetableMapper fieldTimetableMapper;
    @Autowired
    FieldApplicationMapper fieldApplicationMapper;

    @Override
    public List<Field> getFields(FieldExample fieldExample) {
        return fieldMapper.selectByExample(fieldExample);
    }

    @Override
    public Field getField(Integer id) {
        return fieldMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<FieldTimetable> getFieldTimes(Integer fieldId) {
        FieldTimetableExample example = new FieldTimetableExample();
        FieldTimetableExample.Criteria criteria =example.createCriteria();
        criteria.andFieldidEqualTo(fieldId);
        return fieldTimetableMapper.selectByExample(example);
    }

    @Override
    public List<Integer> getDisableTimes(Integer fieldid, String date) {
        return fieldApplicationMapper.selectDisableTimes(fieldid,date);
    }

    @Override
    public int doApplication(String userid, Integer fieldid, String date, List<Integer> time) {
        return fieldApplicationMapper.doApplication(userid,fieldid,date,time);
    }

    @Override
    public int deleteApplication(Integer fieldApplicationid) {
        return fieldApplicationMapper.deleteByPrimaryKey(fieldApplicationid);
    }


}
