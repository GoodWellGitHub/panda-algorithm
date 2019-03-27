package com.org.data.xiajiayu.line;

import com.org.data.xiajiayu.factory.Node;
import com.org.data.xiajiayu.factory.NodeFactory;

public class UpdateNode {
    public static void main(String[] args) {
        Node node = NodeFactory.getLineNode();
        printNodeLine(node);


    }

    static void printNodeLine(Node node) {
        Node temp = node;
        while (temp != null) {
            System.out.print(node.getData() + " <==> ");
            temp = temp.getNext();
        }
    }

    static void insert(Node head, int i, Node node) {
        int length = getLineLength(head);
        if (i < 0 && i > length) {
            return;
        }
        int j = 1;
        Node temp = node;
        while (j < i) {
            temp = temp.getNext();
            ++j;
        }
        return;
    }

    static int getLineLength(Node node) {
        int i = 0;
        Node temp = node;
        while (temp != null) {
            ++i;
            temp = temp.getNext();
        }
        return i;
    }
}
