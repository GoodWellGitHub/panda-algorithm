package com.org.data.xiajiayu.line;

import com.org.data.xiajiayu.factory.Node;
import com.org.data.xiajiayu.factory.NodeFactory;

public class JosePlus {
    public static void main(String[] args) {
       Node head= NodeFactory.circleNode(39);
       NodeFactory.traceNode(head);
       Node tail=head;
       while (tail.getNext()!=null){
           tail=tail.getNext();
       }
       tail.setNext(head);


    }
}
