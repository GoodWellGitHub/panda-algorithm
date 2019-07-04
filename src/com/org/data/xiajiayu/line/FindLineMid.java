package com.org.data.xiajiayu.line;

import com.org.factory.NodeFactory;
import com.org.factory.domain.NodeNext;

public class FindLineMid {
    public static void main(String[] args) {
        NodeNext nodeNext = NodeFactory.rootNext();
        while (nodeNext != null) {
            System.out.print(nodeNext.getValue() + " ");
            nodeNext = nodeNext.getNodeNext();
        }

        System.out.println();
        System.out.println("###############");

        NodeNext nodeNext1 = NodeFactory.rootNext();

        NodeNext quickNodeNext = nodeNext1;

        while (quickNodeNext.getNodeNext() != null) {
            if (quickNodeNext.getNodeNext().getNodeNext() != null) {
                nodeNext1 = (nodeNext1.getNodeNext());
                quickNodeNext = (quickNodeNext.getNodeNext().getNodeNext());
            } else {
                quickNodeNext = quickNodeNext.getNodeNext();
            }
        }


        if (quickNodeNext.getNodeNext() != null) {
            System.out.println(nodeNext1.getValue() + " " + nodeNext1.getNodeNext().getValue());
        } else {
            System.out.println(nodeNext1.getValue());
        }

    }
}
