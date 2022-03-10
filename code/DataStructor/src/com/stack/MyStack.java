package com.stack;


public class MyStack {

        private int[] array;
        private int count;//元素个数
        private int size;//数组大小

    public MyStack(int n){
        this.count = 0;
        this.size = n;
        this.array = new int[n];
    }

    public Boolean push(int data){
        if(count == size) return false;
        array[count] = data;
        ++count;
        return true;
    }

    public Integer pop(){
        if(count==0) return null;
        int temp = array[count-1];
        count--;
        return temp;
    }

}
