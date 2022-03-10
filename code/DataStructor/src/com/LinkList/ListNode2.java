package com.LinkList;


public class ListNode2 {

    public ListNode head = new ListNode();
    public ListNode tail = head;

    public void add(ListNode newNode){
        if(tail == null)
        {
            head.next = newNode;
            newNode.next = null;
            tail = newNode;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


