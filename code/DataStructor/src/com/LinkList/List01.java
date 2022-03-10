package com.LinkList;

public class List01 {

    static class Node {
        Object data;
        Node next;
    }

    public  Node head = new Node();
    public  Node tail = head;


    public  void add(Object data){
        Node newNode = new Node();
        newNode.data = data;
        if(head.next == null)
        {
            head.next = newNode;
        }
        else
        {
            tail.next = newNode;
        }
        newNode.next = null;
        tail = newNode;
    }

    public void del(Object data){
        if(head.next!=null)
        {
            Node p = head;
            while (p.next!=null)
            {
                if(p.next.data == data)
                {
                    p.next = p.next.next;
                }
                else{
                    p = p.next;
                }
            }
        }
    }



    public int DataCount(){
        int count = 0;
        Node node = head;
        if(node.next!=null)
        {
            while (node.next!=null)
            {
                count++;
                node = node.next;
            }
            return count;
        }else {
            return 0;
        }
    }

}




