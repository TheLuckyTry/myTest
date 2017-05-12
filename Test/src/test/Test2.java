package test;

import java.util.HashMap;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {
		Map<Integer,String> m1=new HashMap<Integer,String>();
		Map<Integer,String> m2=new HashMap<Integer,String>(4,0.1f);
		
		long start=System.nanoTime();
		
		for(int i=0;i<10000;i++){
			m1.put(i, "abc");
		}
		
		long end1=System.nanoTime();
         long m1Time=end1-start;
        
         System.out.println("m1的插入时间:"+m1Time+"ns");
         
         
         for(int i=0;i<10000;i++){
 			m2.put(i, "abc");
 		}
         
         long m2Time=System.nanoTime()-end1;
         
         
         System.out.println("m2的插入时间:"+m2Time+"ns");
         
         if(m1Time>m2Time){
        	 
        	 System.out.println("m2的插入速度快:"+(m1Time-m2Time)+"ns");
         }else{
        	 
        	 System.out.println("m1的插入速度快:"+(m2Time-m1Time)+"ns");
         }
         
		
	}

}
