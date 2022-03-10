package com.question;

import java.util.Arrays;

public class find_k_max {
    public static void main(String[] args) {
        int[] o = {7,4,8,2,9,1};
        int k = 1;//输入查找的第k大值
        find(o,0,o.length-1);
        System.out.println(Arrays.toString(o));
        System.out.println(o[o.length-k]);
    }




    public static void find(int[] o,int low,int high){
        if(low<high)
        {
            int temp = o[low];
            int p = partition(o,low,high);
                find(o,low,p-1);
                find(o,p+1,high);
        }
    }

    public static int partition(int[] o,int low,int high){
        int temp = o[low];
        while(low<high)
        {
            while(low<high && o[high]>temp)
            {
                high--;
            }
            if(low<high)
                o[low++] = o[high];

            while(low<high && o[low]<temp)
            {
                low++;
            }
            if(low<high)
                o[high--] = o[low];
        }
        o[low] = temp;
        return low;
    }
}
