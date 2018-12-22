package com.org.traverse;

import com.org.factory.NodeFactory;
import com.org.factory.domain.Node;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by huajun.wang01 on 2018/12/22.
 */
public class Binary_Tree_Traverse_Deep {
    public static void main(String[] args) {
        Node node = NodeFactory.rootNode();
        Binary_Tree_Traverse_Deep traverse = new Binary_Tree_Traverse_Deep();
        System.out.println("---------递归先序遍历----------");
        traverse.firstTraverseRec(node);
        System.out.println("\n---------非递归先序遍历-------");
        traverse.firstTraverseNRec(node);
        System.out.println("\n---------递归中序遍历---------");
        traverse.midTraverseRec(node);
        System.out.println("\n---------非递归中序遍历--------");
        traverse.midTraverseNRec(node);
        System.out.println("\n---------后续遍历递归----------");
        traverse.afterTraverseRec(node);
        System.out.println("\n---------后续遍历非递归----------");
        traverse.postOrder2(node);
    }

    /**
     * 递归先序遍历
     *
     * @param root
     */
    public void firstTraverseRec(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getValue() + " ");
        firstTraverseRec(root.getLeft());
        firstTraverseRec(root.getRight());
    }

    /**
     * 非递归先序遍历
     *
     * @param root
     */
    public void firstTraverseNRec(Node root) {
        Node p = root;
        LinkedList<Node> stack = new LinkedList<>();
        while (!stack.isEmpty() || p != null) {
            if (p != null) {
                stack.push(p);
                System.out.print(p.getValue() + " ");
                p = p.getLeft();
            } else {
                p = stack.pop();
                p = p.getRight();
            }
        }
    }

    /**
     * 递归中序遍历
     *
     * @param root
     */
    public void midTraverseRec(Node root) {
        if (root == null) {
            return;
        }
        midTraverseRec(root.getLeft());
        System.out.print(root.getValue() + " ");
        midTraverseRec(root.getRight());
    }

    /**
     * 非递归中序遍历
     *
     * @param root
     */
    public void midTraverseNRec(Node root) {
        Node p = root;
        LinkedList<Node> stack = new LinkedList<>();
        while (p != null || !stack.isEmpty()) {
            if (p != null) {
                stack.push(p);
                p = p.getLeft();
            } else {
                p = stack.pop();
                System.out.print(p.getValue() + " ");
                p = p.getRight();
            }
        }
    }

    /**
     * 递归后序遍历
     *
     * @param root
     */
    public void afterTraverseRec(Node root) {
        if (root == null) {
            return;
        }
        afterTraverseRec(root.getLeft());
        afterTraverseRec(root.getRight());
        System.out.print(root.getValue() + " ");
    }

    /**
     * 后序遍历 非递归
     * 双栈法
     *
     * @param root
     */
    public void postOrder2(Node root) {
        Stack<Node> stack = new Stack<Node>();
        Stack<Node> output = new Stack<Node>();
        Node node = root;
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                stack.push(node);
                output.push(node);
                node = node.getRight();
            } else {
                node = stack.pop();
                node = node.getLeft();
            }
        }

        while (output.size() > 0) {
            Node n = output.pop();
            System.out.print(n.getValue() + " ");
        }
    }
}
