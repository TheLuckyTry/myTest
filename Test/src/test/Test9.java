package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public abstract class Test9 {

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        Collection c=new ArrayList();
       int[] a={1,5,2,7,3,4,1}; 
       Arrays.sort(a);
       System.out.println(Arrays.toString(a));
    }

}
