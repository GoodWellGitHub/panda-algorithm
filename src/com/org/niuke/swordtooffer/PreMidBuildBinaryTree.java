package com.org.niuke.swordtooffer;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class PreMidBuildBinaryTree {
    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 7, 8, 3, 5, 6, 8};
        int[] mid = {4, 7, 8, 2, 1, 5, 3, 8, 6};
        PreMidBuildBinaryTree preMidBuildBinaryTree = new PreMidBuildBinaryTree();
        TreeNode rootNode = preMidBuildBinaryTree.buildTree(pre, mid);
        System.out.println(rootNode.getLeft());
    }

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        return buildTree(pre, in);

    }

    public TreeNode buildTree(int[] pre, int[] mid) {
        if (pre.length == 0) {
            return null;
        }

        int i = 0;
        int rootValue = pre[0];
        while (mid[i] != rootValue) {
            i++;
        }

        TreeNode rootNode = new TreeNode(rootValue);
        if (i == 0 && pre.length == 1) {
            return rootNode;
        }
        int[] beforePre = new int[i];
        int[] beforeMid = new int[i];
        for (int j = 0, m = 0, n = 0; j < i + 1; j++) {
            if (pre[j] != rootValue) {
                beforePre[m++] = pre[j];
            }
            if (mid[j] != rootValue) {
                beforeMid[n++] = mid[j];
            }
        }

        int afterLength = pre.length - 1 - i;
        int[] afterPre = new int[afterLength];
        int[] afterMid = new int[afterLength];
        for (int k = 0; k < afterLength; k++) {
            afterPre[k] = pre[i + 1 + k];
            afterMid[k] = mid[i + 1 + k];
        }
        TreeNode left = buildTree(beforePre, beforeMid);
        TreeNode right = buildTree(afterPre, afterMid);
        rootNode.left = left;
        rootNode.right = right;
        return rootNode;
    }

/*    public TreeNode A(int[] pre, int[] in) {
        //先判断是否符合构建二叉树的条件
        if (pre == null || in == null || pre.length != in.length) {
            TreeNode node = reConstruct(pre, 0, pre.length - 1, in, 0, in.length);
            return node;
        } else {
            return null;
        }

    }

    public TreeNode reConstruct(int[] preOrder, int pStart, int pEnd, int[] inOrder, int iStart, int iEnd) {
        if (pStart > pEnd || iStart > iEnd) {
            return null;
        }
        TreeNode treenode = new TreeNode(preOrder[pStart]);
        for (int i = iStart; i <= iEnd; i++) {
            if (inOrder[i] == preOrder[pStart]) {
                treenode.left = reConstruct(preOrder, pStart + 1, i - iStart + pStart, inOrder, iStart, i - 1);
                treenode.right = reConstruct(preOrder, i - iStart + pStart + 1, pEnd, inOrder, i + 1, iEnd);
            }
        }
        return treenode;
    }*/
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
