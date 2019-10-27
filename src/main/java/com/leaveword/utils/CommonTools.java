package com.leaveword.utils;

import java.sql.Timestamp;


/**
 * @author guoxiaofeng
 */
public class CommonTools {
    public static boolean isEmpty(String str){
        if(str == null) {
            return true;
        }
        return str.isEmpty();
    }

    public static Timestamp getCurrentTime(){
        return new Timestamp(System.currentTimeMillis());
    }
}
