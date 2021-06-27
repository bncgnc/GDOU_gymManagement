package com.ggms.service.impl;

import com.ggms.mapper.FieldApplicationMapper;
import com.ggms.mapper.FieldMapper;
import com.ggms.mapper.FieldTimetableMapper;
import com.ggms.pojo.*;
import com.ggms.service.FieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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



    @Override
    public List<Field> fuzzyFindField(String fieldExample) {
        FieldExample example = new FieldExample();

        example.or().andFnameLike("%" + fieldExample + "%");
        example.or().andFlocationLike("%" + fieldExample + "%");
        example.or().andFhostLike("%" + fieldExample + "%");
        example.or().andFhostcallLike("%" + fieldExample + "%");

        List<Field> fields = fieldMapper.selectByExample(example);

        if( fields.size() > 0 ){
            return fields;
        } else {
            return null;
        }
    }

    @Override
    public int insertField(Field field) {
        return fieldMapper.insert(field);
    }

    @Override
    public void updateField(Field field) {
        FieldExample example = new FieldExample();
        FieldExample.Criteria criteria = example.createCriteria();

        criteria.andFieldidEqualTo(field.getFieldid());

        fieldMapper.updateByExample(field , example);
    }

    @Override
    public int deleteField(Integer fieldId) {
        FieldApplicationExample fieldApplicationExample = new FieldApplicationExample();
        FieldTimetableExample fieldTimetableExample = new FieldTimetableExample();

        FieldApplicationExample.Criteria criteria1 = fieldApplicationExample.createCriteria();
        FieldTimetableExample.Criteria criteria2 = fieldTimetableExample.createCriteria();

        //获取时间表中场地的所有时间
        criteria2.andFieldidEqualTo(fieldId);

        //获取对应场地时间的所有申请
        List<FieldTimetable> fieldTimetables = fieldTimetableMapper.selectByExample(fieldTimetableExample);
        for(int i = 0 ; i < fieldTimetables.size() ; i++) {
            Integer fieldTimetableid = fieldTimetables.get(i).getFieldTimetableid();
            criteria1.andFieldTimetableidEqualTo(fieldTimetableid);
        }

        fieldApplicationMapper.deleteByExample(fieldApplicationExample);
        fieldTimetableMapper.deleteByExample(fieldTimetableExample);

        return fieldMapper.deleteByPrimaryKey(fieldId);
    }

    @Override
    public int insertFieldTimetable(FieldTimetable fieldTimetable) {
        return fieldTimetableMapper.insert(fieldTimetable);
    }

    @Override
    public int deleteFieldTimetable(Integer fieldTimetableId) {
        FieldApplicationExample fieldApplicationExample = new FieldApplicationExample();
        FieldApplicationExample.Criteria criteria = fieldApplicationExample.createCriteria();

        criteria.andFieldTimetableidEqualTo(fieldTimetableId);

        fieldApplicationMapper.deleteByExample(fieldApplicationExample);

        return fieldTimetableMapper.deleteByPrimaryKey(fieldTimetableId);
    }

    @Override
    public List<FieldApplication> findAllFieldApplication(FieldApplicationExample example) {
        List<FieldApplication> fieldApplications = fieldApplicationMapper.selectByExample(example);

        if ( fieldApplications.size() > 0 ) {
            return fieldApplications;
        } else {
            return null;
        }
    }

    @Override
    public List<FieldApplication> fuzzyFindFieldApplication(String selectExample) {
        FieldApplicationExample fieldApplicationExample = new FieldApplicationExample();

        fieldApplicationExample.or().andUseridLike("%" + selectExample + "%");
        if( "未审核".equals(selectExample) ) {
            fieldApplicationExample.or().andFapermitEqualTo(0);
        } else if( "申请通过".equals(selectExample) ) {
            fieldApplicationExample.or().andFapermitEqualTo(1);
        } else if( "申请驳回".equals(selectExample) ) {
            fieldApplicationExample.or().andFapermitEqualTo(2);
        }

        if( "未付款".equals(selectExample) ) {
            fieldApplicationExample.or().andFapaidEqualTo(0);
        } else if( "已付款".equals(selectExample) ) {
            fieldApplicationExample.or().andFapaidEqualTo(1);
        }

        List<FieldApplication> fieldApplications = fieldApplicationMapper.selectByExample(fieldApplicationExample);

        if ( fieldApplications.size() > 0 ) {
            return fieldApplications;
        }else {
            return null;
        }
    }

    @Override
    public void fieldApplicationPermit(Integer fieldApplicationId) {
        FieldApplication fieldApplication = fieldApplicationMapper.selectByPrimaryKey(fieldApplicationId);
        fieldApplication.setFapermit(1);

        fieldApplicationMapper.updateByPrimaryKey(fieldApplication);
    }

    @Override
    public void fieldApplicationRefuse(Integer fieldApplicationId) {
        FieldApplication fieldApplication = fieldApplicationMapper.selectByPrimaryKey(fieldApplicationId);
        fieldApplication.setFapermit(2);

        fieldApplicationMapper.updateByPrimaryKey(fieldApplication);
    }

    @Override
    public void fieldApplicationPaid(Integer fieldApplicationId) {
        FieldApplication fieldApplication = fieldApplicationMapper.selectByPrimaryKey(fieldApplicationId);
        fieldApplication.setFapaid(1);

        fieldApplicationMapper.updateByPrimaryKey(fieldApplication);
    }

}
