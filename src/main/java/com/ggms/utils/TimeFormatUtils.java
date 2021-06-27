package com.ggms.utils;

import org.springframework.core.convert.converter.Converter;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeFormatUtils implements Converter<String , Time> {

    @Override
    public Time convert(String s) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        s = s + ":00";

        Date date = null;
        try {
            date = simpleDateFormat.parse(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Time time = new Time(date.getTime());
        return time.valueOf(s);
    }
}
