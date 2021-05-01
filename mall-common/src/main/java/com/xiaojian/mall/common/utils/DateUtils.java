package com.xiaojian.mall.common.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {
    private static final Calendar calendar = Calendar.getInstance();

    public static Date getLastTimeCurrentDate(Date date){
        calendar.setTime(date);
        calendar.set(Calendar.HOUR , 23);
        calendar.set(Calendar.MINUTE , 59);
        calendar.set(Calendar.SECOND , 59);
        return calendar.getTime();
    }

    public static Date getOffsetDays(Date start ,int offset){
        calendar.setTime(start);
        calendar.add(Calendar.DATE , offset);
        return calendar.getTime();
    }
}
