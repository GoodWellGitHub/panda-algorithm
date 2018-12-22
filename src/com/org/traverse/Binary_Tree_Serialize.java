package com.org.traverse;

import com.org.factory.NodeFactory;
import com.org.factory.domain.Node;

import java.util.LinkedList;

/**
 * Created by huajun.wang01 on 2018/12/23.
 */
public class Binary_Tree_Serialize {
    public static void main(String[] args) {
        Node root = NodeFactory.rootNode();
        Binary_Tree_Serialize serialize = new Binary_Tree_Serialize();
        String str = serialize.firstTraverseSer(root);
        System.out.println(str);
    }

    /**
     * 二叉树的序列化
     *
     * @param node
     * @return
     */
    public String firstTraverseSer(Node node) {
        StringBuilder ser = new StringBuilder();
        LinkedList<Node> stack = new LinkedList<>();
        Node p = node;
        while (!stack.isEmpty() || p != null) {
            if (p != null) {
                stack.push(p);
                ser.append(p.getValue() + "!");
                p=p.getLeft();
            } else {
                ser.append("#!");
                p = stack.pop();
                p=p.getRight();
            }
        }
        return ser.toString();
    }
}
