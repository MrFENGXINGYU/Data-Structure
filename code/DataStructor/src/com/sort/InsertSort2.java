package com.sort;

public class InsertSort2 {
    public static void main(String[] args) {
        int[] arr = {4,3,6,2,8,5};
        myst(arr);
    }

    public static void myst(int[] o){
        for (int i = 1; i < o.length; i++) {
            int value = o[i];
            int j = i - 1;
            for (; j>=0 ; j--) {
                if(o[j]>value)
                    o[j+1] = o[j];
                else
                    break;
            }
            o[j+1] = value;
        }

        for (int i = 0; i < o.length; i++) {
            System.out.print(o[i] + " ");
        }
    }
}
