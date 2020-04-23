package com.org.other.link;

public class LinkNode {
    private int value;
    private LinkNode pre;
    private LinkNode next;

    public LinkNode(){}

    public LinkNode(int value){
        this.value=value;
    }

    public LinkNode getPre(){
        return this.pre;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LinkNode getNext() {
        return next;
    }

    public void setNext(LinkNode next) {
        this.next = next;
    }

    public void setPre(LinkNode pre) {
        this.pre = pre;
    }
}
