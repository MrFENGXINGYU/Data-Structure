package com.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,2,3,5,1,6,9};
        Bubble(arr);
    }

    public static void Bubble(int[] arr){
        int len = arr.length;
        int temp;
        int count=0;
        for (int i = len-1; i >0; i--) {
            Boolean bool = true;
            for (int j = 0; j <i ; j++) {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    bool = false;
                }
            }
            count++;
            if(bool==true) break;
        }

        for (int i = 0; i <len ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        System.out.println(count);
    }
}
