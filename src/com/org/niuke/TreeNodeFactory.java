package com.org.niuke;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class TreeNodeFactory {
    public static TreeNode getBinaryTree() {
        TreeNode head = new TreeNode(13);
        TreeNode treeNode1 = new TreeNode(4);
        TreeNode treeNode2 = new TreeNode(14);
        TreeNode treeNode3 = new TreeNode(45);
        TreeNode treeNode4 = new TreeNode(8);
        TreeNode treeNode5 = new TreeNode(42);
        TreeNode treeNode6 = new TreeNode(94);
        TreeNode treeNode7 = new TreeNode(43);
        TreeNode treeNode8 = new TreeNode(44);

        head.setLeft(treeNode1);
        head.setRight(treeNode2);

        treeNode1.setRight(treeNode3);
        treeNode2.setLeft(treeNode4);
        treeNode2.setRight(treeNode5);
        treeNode3.setLeft(treeNode6);
        treeNode3.setRight(treeNode7);
        treeNode4.setRight(treeNode8);

        return head;
    }

    public static void traceTreeNode(TreeNode headNode) {
        Queue<TreeNode> queue = new LinkedList();
        TreeNode last = headNode;
        TreeNode nLast = headNode;
        queue.add(headNode);
        while (!queue.isEmpty()) {
            TreeNode tempNode = queue.poll();
            System.out.print("     " + tempNode.getValue() + "     ");
            nLast = tempNode.getLeft();
            if (nLast != null) {
                queue.add(nLast);
            }
            nLast = tempNode.getRight();
            if (nLast != null) {
                queue.add(nLast);
            }
            if (last == tempNode) {
                last = nLast;
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        TreeNode treeNode = getBinaryTree();
        traceTreeNode(treeNode);

        System.out.println();

        String result = serializeTree(treeNode);
        System.out.println(result);
    }

    public static String serializeTree(TreeNode treeNode) {
        Deque<TreeNode> deque = new LinkedList<>();
        String result = new String("");
        deque.add(treeNode);
        while (!deque.isEmpty()) {
            TreeNode node = deque.poll();
            if (node==null){
                result=result+"#!";
                continue;
            }else {
                result = result + node.getValue() + "!";
                deque.add(node.getLeft());
                deque.add(node.getRight());
            }

        }
        return result;
    }

    public static TreeNode reSerializeTree(String serializeStr){
        String[] val=serializeStr.split("!");

        return null;
    }

}
