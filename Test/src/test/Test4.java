package test;

import java.util.ArrayList;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {
//	 List<Integer> list=new ArrayList<Integer>();
//	 for(int i=0;i<10;i++){
//		 
//		 if(i%2==0){
//			 continue;
//		 }
//		 list.add(i);
//	 }
	 
	int a=6;
	a=a^4;
	System.out.println(a);
	
	 
	 //System.out.println(list);

	  
		
	}
	
	public static int test(int i){
		
		
		switch (i) {
		case 1:
			if(i>2){
				return i;	
			}
           break;
		case 2:
			if(i>6)
			return 4;
			break;
		default:
			return 5;
		}
		return 6;
		
		
	}

}
