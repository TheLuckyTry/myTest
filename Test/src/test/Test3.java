package test;

import java.io.UnsupportedEncodingException;
import java.util.regex.Pattern;

public class Test3 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
String a="((1|2)\\d{3})/(0\\d|1[1|2])/((0[1-9])|((1|2)\\d)|(3[0|1]))\\s(((0|1)\\d)|(2[0-4])):([0-5]\\d):([0-5]\\d)";
		//((1|2)\\d{3})-(0\\d|1[1|2])-((0[1-9])|((1|2)\\d)|(3[0|1]))\\s(((0|1)\\d)|(2[0-4])):([0-5]\\d):([0-5]\\d)
  
String regex = "((1|2)\\d{3})(-|/)(0?\\d|1[1|2])(-|/)((0?[1-9])|((1|2)\\d)|(3[0|1]))\\s(((0?|1)\\d)|(2[0-4])):([0-5]\\d):([0-5]\\d)";

String re="\\d+|\\d+\\.\\d+";

String s="2011/1/01 10:05:22";
String s1="2.23";
///Pattern pattern = Pattern.compile(a);
//System.out.println(pattern);
  //boolean b=s.matches(a);
  
 // System.out.println(b);


//System.out.println(s.matches(regex));
	
String s4="P280DM-HW-ISS-ZZZ-000509";
System.out.println("0".matches(re));
	}

}
