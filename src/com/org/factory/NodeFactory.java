package com.org.factory;

import com.org.factory.domain.Node;

/**
 * Created by huajun.wang01 on 2018/12/22.
 */
public class NodeFactory {
    public static Node rootNode() {
        Node node = new Node(9);
        Node node1 = new Node(4);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(7);
        Node node5 = new Node(3);
        Node node6 = new Node(9);
        Node node7 = new Node(34);
        Node node8 = new Node(14);

        node.setLeft(node1);
        node.setRight(node2);

        node1.setLeft(node3);
        node1.setRight(node4);

        node2.setLeft(node5);
        node2.setRight(node6);

        node3.setLeft(node7);

        node4.setLeft(node8);

        return node;
    }
}
