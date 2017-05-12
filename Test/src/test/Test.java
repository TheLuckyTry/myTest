package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class Test {
 
  
  
	
	
	public static void main(String[] args) {
	
	    List<String> list=new ArrayList<String>();
	    
	    list.add("1");
	    list.add("3");
	    list.add("2");
	    list.add("3");
	    list.add("1");
	    list.add("1");
	    list.add("4");
	    list.add("4");
	    
	  list=new ArrayList<String>(new HashSet<String>(list));
	    
	  System.out.println(list);
	    
	}

}


	
	
	
	

