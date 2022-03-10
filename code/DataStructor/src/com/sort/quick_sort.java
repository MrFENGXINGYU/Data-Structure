package com.sort;

import java.util.Arrays;

public class quick_sort {
    public static void main(String[] args) {
        int[] o = {72,6,57,88,60,42,83,73,48,85};
        quickSort(o,0,o.length-1);

        System.out.println(Arrays.toString(o));
    }

    public static void quickSort(int[] o,int left,int right){
        int count = 0;
        if(left<right)
        {
            int p = partition(o,left,right);
            quickSort(o,left,p-1);
            quickSort(o,p+1,right);
            System.out.println(count++);
        }


    }
    public static int partition(int[] o,int low,int high){
        int temp = o[low];
        while(low<high)
        {
            while(low<high && o[high]>temp)
                high--;
            if(low<high)
                o[low++] = o[high];

            while(low<high && o[low]<=temp)
                low++;
            if(low<high)
                o[high--] = o[low];
        }
        o[low] = temp;

        return low;
    }
}
