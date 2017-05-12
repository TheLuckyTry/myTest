package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
	List<String> list1=new ArrayList<String>();
	
	List<String> list2=new LinkedList<String>();
	
	long start=System.nanoTime();
	
	for(int i=0;i<1000000;i++){
		
		list1.add("这是一个性能测试啊啊啊啊啊啊啊啊啊啊");
		
	}
 
	long end1=System.nanoTime();
	
	long arrayTime=end1-start;
	System.out.println("ArrayList插入花费的时间:"+arrayTime+" ns");
	
     for(int i=0;i<1000000;i++){
		
		list2.add("这是一个性能测试啊啊啊啊啊啊啊啊啊啊");
		
	}
     long linkedTime=System.nanoTime()-end1;
	
 	System.out.println("LinkedList插入花费的时间:"+linkedTime+" ns");
     
 	if(linkedTime>arrayTime){
 	
      System.out.println("ArrayList插入性能要好,节省时间为:"+(linkedTime-arrayTime)+" ns");
      
 	
 	}else{
 		
 		System.out.println("LinkedList插入性能要好,节省时间为:"+(arrayTime-linkedTime));
 	}
 	
	}

}
