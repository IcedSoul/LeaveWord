package com.leaveword.Utils;

import java.sql.Timestamp;

public class CommonTools {
    public static boolean isEmpty(String str){
        if(str == null)
            return true;
        if(str.isEmpty())
            return true;
        if(str == "" || str.equals(""))
            return true;
        return false;
    }

    public static Timestamp getCurrentTime(){
        return new Timestamp(System.currentTimeMillis());
    }
}
