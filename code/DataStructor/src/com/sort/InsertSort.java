package com.sort;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {4,2,3,5,1,6,9};
        InsertSort(arr);
    }

    public static void InsertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int j = i-1;
            for (; j >=0 ; --j) {
                if(arr[j]>value)
                {
                    arr[j + 1] = arr[j];
                }
                else{
                    break;
                }
            }
            arr[j+1] = value;
        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
