package com.org.other.link;

public class ReverseLink {
    public static void main(String[] args) {
        LinkNode headNode=LinkNodeFactory.getLink();
        LinkNodeFactory.traceLink(headNode);
        reverseLink(headNode);
        System.out.println();
        LinkNode traceHead=reverseLink1(headNode);
        LinkNodeFactory.traceLink(traceHead);
        LinkNode traceHead2=reverseLink2(traceHead);
        LinkNodeFactory.traceLink(traceHead2);
    }

    public static LinkNode reverseLink(LinkNode head){
        if (head.getNext()==null){
            System.out.print(head.getValue()+" ");
            return head;
        }
        LinkNode node=reverseLink(head.getNext());
        if (node!=null){
            System.out.print(head.getValue()+" ");
        }
        return head;
    }

    public static LinkNode reverseLink1(LinkNode head){
        if (head==null||head.getNext()==null){
            return head;
        }
        LinkNode pre=head.getNext();
        LinkNode temp;
        LinkNode tail=head;
        tail.setNext(null);
        while (pre!=null){
            temp=pre.getNext();
            pre.setNext(tail);
            tail=pre;
            pre=temp;
        }
        return tail;
    }

    public static LinkNode reverseLink2(LinkNode head){
        if (head.getNext()==null){
            return head;
        }
        LinkNode node=reverseLink2(head.getNext());
        node.setNext(head);
        //head.setNext(null);

        return node;
    }
}
