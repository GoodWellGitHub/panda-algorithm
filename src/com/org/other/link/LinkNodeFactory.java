package com.org.other.link;

public class LinkNodeFactory {

    public static LinkNode getLink() {
        LinkNode node = new LinkNode(10);
        LinkNode node1 = new LinkNode(13);
        LinkNode node2 = new LinkNode(10);
        LinkNode node3 = new LinkNode(4);
        LinkNode node4 = new LinkNode(12);
        LinkNode node5 = new LinkNode(1);
        LinkNode node6 = new LinkNode(29);

        node.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);

        return node;
    }


    public static LinkNode getOrderLink() {
        LinkNode node = new LinkNode(10);
        LinkNode node1 = new LinkNode(15);
        LinkNode node2 = new LinkNode(20);
        LinkNode node3 = new LinkNode(24);
        LinkNode node4 = new LinkNode(32);
        LinkNode node5 = new LinkNode(41);
        LinkNode node6 = new LinkNode(49);

        node.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);

        return node;
    }

    public static void traceLink(LinkNode node) {
        LinkNode traceNode = node;
        while (traceNode != null) {
            System.out.print(traceNode.getValue() + "  ");
            traceNode = traceNode.getNext();
        }
        System.out.println();
    }
}
