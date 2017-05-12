package sort;

/**
 * 插入排序
 * 
 * @author chenYiLong
 * @time 2017年5月3日 下午4:35:04
 */

public class InsertSort {

    public static void main(String[] args) {
        int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};
        System.out.println("排序之前：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        //insertSort(a);
        middleSort(a);
        System.out.println();
        System.out.println("排序之后：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }


    public static void insertSort(int[] a) {
        
        // 直接插入排序
        for (int i = 1; i < a.length; i++) {
            // 待插入元素
            int temp = a[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                // 将大于temp的往后移动一位
                if (a[j] > temp) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = temp;
        }

    }
    /**
     * 二分法排序
     * @description
     * @author chenYiLong
     * @time 2017年5月4日 上午10:34:49
     * @param a
     *
     */

    public static void middleSort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            int left = 0;
            int right = i - 1;

            int mid = 0;

            while (right >= left) {
                mid = (right + left) / 2;

                if (temp < a[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

            }

            for (int j = i - 1; j >= left; j--) {
                a[j + 1] = a[j];
            }
            if (left != i) {
                a[left] = temp;
            }

        }


    }
}


