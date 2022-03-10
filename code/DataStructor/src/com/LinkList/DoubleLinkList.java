package com.LinkList;

public class DoubleLinkList {
    static class Node{
        Object data;
        Node next;
        Node pre;
    }

    public Node head = new Node();
    private Node tail = head;

    public void add(Object data){
        Node newNode = new Node();
        newNode.data = data;
        if(head.next!=null)
        {
            newNode.pre = tail;
            tail.next = newNode;
        }
        else
        {
            newNode.pre = head;
            head.next = newNode;
        }
        newNode.next = null;
        tail = newNode;
    }

    public void del(Object data){
        if(head.next!=null)
        {
            Node p = head.next;
            while (p!=null)
            {
                if(p.data == data)
                {
                    p.next.pre = p.pre;
                    p.pre.next = p.next;
                }
                p = p.next;
            }
        }
    }
}
