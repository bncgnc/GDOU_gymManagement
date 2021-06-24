package com.ggms.service;

import com.ggms.pojo.Field;
import com.ggms.pojo.FieldExample;
import com.ggms.pojo.FieldTimetable;

import java.util.List;

public interface FieldService {
    public List<Field> getFields(FieldExample fieldExample);

    public Field getField(Integer id);

    public List<FieldTimetable> getFieldTimes(Integer fieldId);
}
