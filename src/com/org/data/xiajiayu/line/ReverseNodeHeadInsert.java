package com.org.data.xiajiayu.line;

import com.org.data.xiajiayu.factory.Node;
import com.org.data.xiajiayu.factory.NodeFactory;

public class ReverseNodeHeadInsert {
    public static void main(String[] args) {
        Node head = NodeFactory.getLineNode();
        NodeFactory.traceNode(head);
        System.out.println();
        Node traceHead = headInsertReverse(head);
        NodeFactory.traceNode(traceHead);
    }

    static Node headInsertReverse(Node head) {
        Node left = head, right;
        if (head == null || head.getNext() == null) {
            return head;
        }
        do {
            right = head.getNext();
            head.setNext(right.getNext());
            right.setNext(left);
            left = right;
        } while (head.getNext() != null);
        return left;
    }

}
