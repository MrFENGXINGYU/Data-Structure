package com.sort;

public class merge_sort3 {
    public static void main(String[] args) {
        int[] o = {6,4,2,3,1};
        int[] temp = new int[o.length];
        merge_sort(o,0,o.length-1,temp);

        for (int i = 0; i < o.length; i++) {
            System.out.print(o[i] + " ");
        }
    }

    public static void merge_sort(int[] o,int low,int hight,int[] temp){
        if(low<hight)
        {
            int mid = (low+hight)/2;
            merge_sort(o,low,mid,temp);
            merge_sort(o,mid+1,hight,temp);
            merge(o,low,mid,hight,temp);
        }
    }

    public static void merge(int[] o,int low,int mid,int hight,int[] temp){
        int i = 0;
        int j = low;
        int k = mid+1;
        while(j<=mid && k<=hight)
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
        while(k<=hight)
        {
            temp[i++] = o[k++];
        }

        for (int l = 0; l <i; l++) {
            o[low+l] = temp[l];
        }
    }
}
