package com.org.other.link;

public class LinkedCircle {

    public static void main(String[] args) {
        LinkNode headNode=LinkNodeFactory.getCircleLink();
        boolean circleResult=hasCircle(headNode);
        System.out.println(circleResult);
    }

    public static boolean hasCircle(LinkNode headNode){
        LinkNode lowNode=headNode;
        LinkNode fastNode=headNode;
        while (lowNode!=fastNode){
            if (lowNode!=null){
                lowNode=lowNode.getNext();
            }
            if (fastNode!=null){
                fastNode=fastNode.getNext();
                if (fastNode!=null){
                    fastNode=fastNode.getNext();
                }
            }
        }
        return lowNode!=null;
    }

}
