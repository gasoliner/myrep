package cn.wan.myrep.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 万洪基 on 2016/12/19.
 */
public class NiceMatch {
    public static String  match(String txt,String regx){
        Pattern pattern=Pattern.compile(regx);
        Matcher matcher=pattern.matcher(txt);
        if (matcher.find()){
            return matcher.group();
        }else {
            return null;
        }
    }
}
