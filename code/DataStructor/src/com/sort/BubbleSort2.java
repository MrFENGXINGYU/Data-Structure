package com.sort;

public class BubbleSort2 {
    public static void main(String[] args) {
        int[] arr = {3,5,4,1,2,6};
        BubbleSort(arr);
    }
    
    public static void BubbleSort(int[] o){
        int count = 0;
        for (int i = 0; i < o.length; i++) {
            Boolean flag = true;
            for (int j = 0; j < o.length - i - 1; j++) {
                if(o[j]>o[j+1])
                {
                    int temp = o[j+1];
                    o[j+1] = o[j];
                    o[j] = temp;
                    flag = false;
                }
            }
            count ++;
            if(flag == true) break;
        }
        for (int i = 0; i < o.length; i++) {
            System.out.print(o[i] + " ");
        }
        System.out.println(count);
    }
}
