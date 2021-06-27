package com.ggms.service;

import com.ggms.pojo.*;

import java.util.Date;
import java.util.List;

public interface FieldService {
    public List<Field> getFields(FieldExample fieldExample);

    public Field getField(Integer id);

    public List<FieldTimetable> getFieldTimes(Integer fieldId);

    public List<Integer> getDisableTimes(Integer fieldid, String date);

    public int doApplication(String userid,Integer fieldid,String date,List<Integer> time);

//    修改好麻烦,不想修改,直接删掉得了
//    public int changeApplication(Integer fapid,String userid,Integer fieldid,String date,List<Integer> time);

    public int deleteApplication(Integer fieldApplicationid);


    public List<Field> fuzzyFindField(String fieldExample);

    public int insertField(Field field);

    public void updateField(Field field);

    public int deleteField(Integer fieldId);

    public int insertFieldTimetable(FieldTimetable fieldTimetable);

    public int deleteFieldTimetable(Integer fieldTimetableId);

    public List<FieldApplication> findAllFieldApplication(FieldApplicationExample example);
}
