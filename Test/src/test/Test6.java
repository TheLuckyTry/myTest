package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test6 {

    public static void main(String[] args) throws ParseException {
        String str="2013/13/13 0:03:00";
        String s2 = "yyyy/MM/dd HH:mm:ss";
        String s3 = "yyyyMMdd";
        
        String str2="20160101";
     if(str.contains("/")){
         SimpleDateFormat sdf=new SimpleDateFormat(s2);
         
         System.out.println(str.contains(" "));
         Date d=sdf.parse(str);
         
         System.out.println(d);
     }else{
         System.out.println(0);
     }
        
    }

}
