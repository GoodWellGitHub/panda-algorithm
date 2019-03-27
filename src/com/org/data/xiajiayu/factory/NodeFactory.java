package com.org.data.xiajiayu.factory;

public class NodeFactory {
    public static Node getLineNode() {
        Node node = new Node(1, null);
        Node node1 = new Node(4, node);
        Node node2 = new Node(23, node1);
        Node node3 = new Node(-90, node2);
        Node node4 = new Node(1, node3);
        return node4;
    }

    public static Node getLineNode1() {
        Node node = new Node(1, null);
        Node node1 = new Node(-4, node);
        Node node2 = new Node(3, node1);
        Node node3 = new Node(-90, node2);
        Node node4 = new Node(21, node3);
        return node4;
    }

    public static void traceNode(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ==> ");
            temp = temp.getNext();
        }
    }
}
