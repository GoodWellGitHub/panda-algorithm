package com.org.traverse;

import com.org.factory.NodeFactory;
import com.org.factory.domain.Node;

import java.util.LinkedList;

/**
 * Created by huajun.wang01 on 2018/12/22.
 */
public class Binary_Tree_Traverse_Width {
    public static void main(String[] args) {
        Node root = NodeFactory.rootNode();
        Binary_Tree_Traverse_Width traverseWidth = new Binary_Tree_Traverse_Width();
        traverseWidth.traverse_withLine(root);
        System.out.println("\n----层次遍历------");
        traverseWidth.traverse(root);
    }

    /**
     * 遍历换行
     *
     * @param root
     */
    public void traverse_withLine(Node root) {
        LinkedList<Node> queue = new LinkedList<>();
        Node last = root;
        Node nlast = root;
        queue.addFirst(nlast);
        while (!queue.isEmpty()) {
            nlast = queue.removeLast();
            System.out.print(nlast.getValue() + " ");
            if (nlast.getLeft() != null) {
                queue.addFirst(nlast.getLeft());
            }
            if (nlast.getRight() != null) {
                queue.addFirst(nlast.getRight());
            }
            if (last == nlast) {
                System.out.println();
                if (last.getRight() != null) {
                    last = last.getRight();
                } else if (last.getLeft() != null) {
                    last = last.getLeft();
                }
            }
        }
    }

    public void traverse(Node node) {
        LinkedList<Node> queue = new LinkedList<>();
        Node q = node;
        queue.addFirst(q);
        while (!queue.isEmpty()) {
            q = queue.removeLast();
            if (q.getLeft() != null) {
                queue.addFirst(q.getLeft());
            }
            if (q.getRight() != null) {
                queue.addFirst(q.getRight());
            }
            System.out.print(q.getValue() + " ");
        }
    }
}
