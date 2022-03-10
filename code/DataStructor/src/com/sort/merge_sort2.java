package com.sort;

public class merge_sort2 {
    public static void main(String[] args) {
        int[] arr = {3,5,4,1,2,6};
        int[] tmp = new int[arr.length];
        mergeSort(arr,0,arr.length-1,tmp);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergeSort(int[] o,int low,int high,int[] temp){
        if(low<high)
        {
            int mid = (low+high)/2;
            mergeSort(o,low,mid,temp);
            mergeSort(o,mid+1,high,temp);
            merge(o,low,mid,high,temp);
        }
    }

    public static void merge(int[] o,int low,int mid,int high,int[] temp){
        int i = 0;
        int j = low;
        int k = mid+1;
        while(j <= mid && k <= high)
        {
            if(o[j]<o[k])
                temp[i++] = o[j++];
            else
                temp[i++] = o[k++];
        }
        while(j<=mid)
        {
            temp[i++] = o[j++];
        }
        while(k<=high)
        {
            temp[i++] = o[k++];
        }

        for (int l = 0; l <i ; l++) {
            o[low+l] = temp[l];
        }

    }

}
