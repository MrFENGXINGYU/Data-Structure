package com.stack;

/**
 * 思路：创建一个带有头节点的单链表，每次入栈出栈都在首节点操作
 */
public class LinkStack {
    static class Node{
        private Object data;
        private Node next;
    }

    //创建一个只有头节点的空栈
    private Node head = new Node();


    public void push(Object data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head.next;
        head.next = newNode;
    }

    public Object pop(){
        if(head.next == null) return null;
        Object data = head.next.data;
        head.next = head.next.next;
        return data;
    }

    public void myprint(LinkStack stack){
        Node p = new Node();
        p = head.next;
        while (p!=null)
        {
            System.out.println(p.data);
            p = p.next;
        }
    }
}
