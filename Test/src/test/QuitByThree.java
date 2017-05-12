package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuitByThree {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入报数人数:");
		int n = s.nextInt();
		boolean[] arr = new boolean[n];
		
		for(int i=0; i<arr.length; i++) {
		arr[i] = true;
		}
		List<Boolean> list=new ArrayList<Boolean>();
		int leftCount = n;
		int countNum = 0;
		int index = 0;
		
		while(leftCount > 1) {
			
		if(arr[index] == true) {
		countNum ++;
		
		if(countNum == 3) {
			
		countNum =0;
		arr[index] = false;
		list.add(arr[index]);
		leftCount --;
		}
		
		}
		index ++;
		if(index == n) {
		index = 0;
		
		}
		
		if(list.size()==(n-1)){
			for(int i=0;i<n;i++){
				if(arr[i]==true){
					System.out.println(i+1);
				}
				
			}
			
		}

	}
	}
}
