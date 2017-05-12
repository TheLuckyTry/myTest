package programTest;

/**
 * 
 * 二分法查找
 * @author chenYiLong
 *
 */
public class MiddleFind {
	
	public static int find(int[] arr,int value){
		
		int start=0;
		
		int end=arr.length-1;
		
		while(end>start){
			int middle=(end+start)/2;
			
			if(value==arr[middle]){
				return middle;
			}
			
			if(value<arr[middle]){
				
				end=middle-1;
			}
			
			if(value>arr[middle]){
				start=middle+1;
			}
			
		
		}
		return -1;
	}

	public static void main(String[] args) {
		
		
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		int i=find(arr,11);
		System.out.println(i);

	}

}
