package test;

import java.util.Arrays;

/**
 * 
 * 二维数组查找
 * 
 * @author chenYiLong
 *
 */
public class Test5 {

	public static void main(String[] args) {
		int[][] arrs = new int[4][4];

		for (int i = 0; i < arrs.length; i++) {
			arrs[i][0] = i;
			for (int j = 1; j < arrs[0].length; j++) {

				arrs[i][j] = arrs[i][j - 1] + 1;
			}

		}

		for(int k=0;k<arrs[0].length;k++){
		 System.out.println("第"+(k+1)+"行数组为:"+Arrays.toString(arrs[k]));
		
		 }
		
//		boolean b=find(7,arrs);
//		System.out.println(b);

	}

	public static boolean find(int target, int[][] arrs) {

		int len = arrs.length - 1;
		int row = 0;
		while (len >= 0 && row < arrs[0].length) {
			if (target > arrs[row][len]) {

				row++;
			} else if (target < (arrs[row][len])) {

				len--;
			} else {

				return true;
			}
		}

		return false;
	}
}
