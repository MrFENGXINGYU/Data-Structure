package com.stack;

import com.stack.MyStack;

public class MystackMain {
    public static void main(String[] args) {
        LinkStack linkStack = new LinkStack();
        linkStack.push("feng");
        linkStack.push("xing");
        linkStack.push("yu");
        Object pop1 = linkStack.pop();
        Object pop2 = linkStack.pop();
        Object pop3 = linkStack.pop();
        Object pop4 = linkStack.pop();
        System.out.println(pop1);
        System.out.println(pop2);
        System.out.println(pop3);
        System.out.println(pop4);


        linkStack.myprint(linkStack);


    }
}
