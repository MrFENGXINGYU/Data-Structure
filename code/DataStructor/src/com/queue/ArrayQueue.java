package com.queue;

public class ArrayQueue {
    private int n;
    private int[] arr;
    private int head = 0;
    private int tail = 0;

    public ArrayQueue(int capacity){
        this.n = capacity;
        arr = new int[capacity];
    }

    public Boolean enqueue(int data){
        if(tail == n) return false;
        arr[tail++] = data;
        return true;
    }
    public Integer dequeue(){
        if(head == tail) return null;
        int temp = arr[head--];
        return temp;
    }

    public void myprint(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    //当队列的 tail 指针移动到数组的最右边后，如果有新的数据入队，我
    //们可以将 head 到 tail 之间的数据，整体搬移到数组中 0 到 tail-head 的位置。
    public Boolean enqueue2(int data){
        if(tail == n)
        {
            if(head == 0) return false;
            //进行移动
            for(int i = head;i<tail;i++)
            {
                arr[i-head] = arr[i];
            }
            head =0;
            tail = tail-head;
        }
        //入队
        arr[tail++] = data;
        return true;
    }
}
