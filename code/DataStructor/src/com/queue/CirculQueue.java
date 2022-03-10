package com.queue;

public class CirculQueue {
    private Object arr[];
    private int n;
    private int head = 0;
    private int tail = 0;

    public CirculQueue(int capacity){
        this.n = capacity;
        arr = new Object[n];
    }

    public Boolean Enqueue(Object data){
        if((tail+1)% n==head) return false;
        arr[tail] = data;
        tail = (tail+1)%n;
        return true;
    }

    public Object Dequeue(){
        if(head == tail) return null;
        Object temp = arr[head++];
        head = (head + 1) % n;
        return temp;
    }

}
