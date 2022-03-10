package com.queue;

public class Queuemain {
    public static void main(String[] args) {
        CirculQueue queue = new CirculQueue(5);
        queue.Enqueue(1);
        queue.Enqueue(2);
        queue.Enqueue(3);
        queue.Enqueue(4);

        queue.Dequeue();
        queue.Dequeue();
        queue.Dequeue();

        queue.Enqueue(5);
        queue.Enqueue(6);

    }
}
