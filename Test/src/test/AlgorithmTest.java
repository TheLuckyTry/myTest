package test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AlgorithmTest {
	
	private static AlgorithmTest test=new AlgorithmTest();
	
	/**
	 * 判断0到100 之间有多少个素数，并输出所有素数。
	 */
	public void prime(){
		List<Integer> list=new LinkedList<Integer>();
		for(int i=0;i<101;i++){
			if(!(i%2==0)){
				list.add(i);
				
				
			}
		}
		System.out.println(list);
		
		
	}
	
	/**
	 * 有 1、2、3、4 个数字，能组成多少个互不相同且无重复数字的
	 * 三位数？都是多少？
	 * 
	 */
	
	public void number(){
		int count=0;
		for(int x=1;x<5;x++){
			for(int y=1;y<5;y++){
				for(int z=1;z<5;z++){
					if(x!=y&&x!=z&&y!=z){
						count++;
						System.out.print(x*100+y*10+z+" ");
						if(count%6==0){
							System.out.println();
						}
					}
				}
			}
		}
		System.out.println("不重复的数字个数:"+count+"个");
	}
	
	

	public static void main(String[] args) {
		 //test.prime();
		 test.number();
      Map<String,String> map=null;
      if(map==null){
			map=new HashMap<String,String>();
			
		}
      map.put("a", "a");
	}

}
