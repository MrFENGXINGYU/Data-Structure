package com.queue;

public class LinkQueue {
    static class Node {
        private Object data;
        private Node next;
    }

    private Node head = new  Node();
    private Node tail = head;

    public Boolean enqueue(Object data){
        Node newNode = new Node();
        newNode.data = data;
        if(head==tail)
            head.next = newNode;
        else
            tail.next = newNode;
        tail = newNode;
        return true;
    }

    public Object dequeue(){
        if(head==tail) return null;
        Object data = head.next.data;
        head.next = head.next.next;
        return data;
    }

    public void myprint(){
        Node p = new Node();
        p = head.next;
        while(p!=null)
        {
            System.out.print(p.data+" ");
            p = p.next;
        }
    }

}
