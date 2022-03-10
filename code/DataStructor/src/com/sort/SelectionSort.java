package com.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,2,3,5,1,6,9};
        SelectSort(arr);
    }

    public static void SelectSort(int[] arr){
        int temp;
        int index = 0;
        for (int i = 0; i <arr.length-1 ; i++)
        {
            Boolean bool = true;
            temp=arr[i];
            for (int j = i+1; j <arr.length ; j++)
            {
                if(temp>arr[j])
                {
                    temp=arr[j];
                    index=j;
                    bool=false;
                }
            }
            if(bool==false)
            {
                arr[index]=arr[i];
                arr[i]=temp;
            }
        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
