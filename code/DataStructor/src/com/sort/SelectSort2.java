package com.sort;

public class SelectSort2 {
    public static void main(String[] args) {
        int[] arr = {4,2,3,5,1,6,9};
        sort(arr);
    }
    public static void sort(int[] o){
        for(int i = 0;i<o.length-1;i++)//需要循环n-1次
        {
            int min = i;
            for (int j = i+1; j < o.length; j++) {//每次找出最小的地址
                if(o[j]<o[min])
                    min = j;
            }

            if(min != i)//找到最小的后进行交换
            {
                int temp = o[i];
                o[i] = o[min];
                o[min] = temp;
            }
        }

        for (int i = 0; i <o.length ; i++) {
            System.out.print(o[i]+" ");
        }
    }
}
