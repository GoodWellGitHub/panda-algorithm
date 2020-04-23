package com.org.other.link;

/**
 * 输入一个单链表，输出此链表中的倒数第 K 个节点。（去除头结点，节点计数从 1 开始）。
 */
public class FindLastKNode {
    public static void main(String[] args) {
        LinkNode headNode=LinkNodeFactory.getLink();
        LinkNodeFactory.traceLink(headNode);
        int k=1;
        LinkNode kNode=trace2Link(headNode,k);
        System.out.println(kNode.getValue());
        LinkNode linkNode=dubblePointer(headNode,7);
        System.out.println(linkNode.getValue());
    }

    /**
     * 两次遍历法
     * @param node
     * @param k
     * @return
     */
    public static LinkNode trace2Link(LinkNode node,int k){
        if (k==0||node==null){
            return null;
        }

        int i=0;
        LinkNode traceNode=node;
        while (traceNode!=null){
            i++;
            traceNode=traceNode.getNext();
        }
        if (k>i){
            return null;
        }
        int j=0;
        traceNode=node;
        while (j<i-k){
            traceNode=traceNode.getNext();
            j++;
        }
        return traceNode;
    }

    /**
     * 递归法
     * （1）定义num = k
     * （2）使用递归方式遍历至链表末尾。
     * （3）由末尾开始返回，每返回一次 num 减 1
     * （4）当 num 为 0 时，即可找到目标节点
     * @param node
     * @param k
     * @return
     */
    public static LinkNode recursion(LinkNode node,int k){
        int num=k;
        if (node==null){
            return null;
        }
        LinkNode linkNode=recursion(node.getNext(),k);
        if (linkNode!=null){
            return linkNode;
        }else {
            num--;
            if (num==0){
                return node;
            }
            return null;
        }

    }

    public static LinkNode dubblePointer(LinkNode head,int k){
        LinkNode preHead=head;
        LinkNode tailHead=head;
        int i=0;
        while (i<k){
            if (tailHead==null){
                return null;
            }
            tailHead=tailHead.getNext();
            i++;
        }

        while (tailHead!=null){
            preHead=preHead.getNext();
            tailHead=tailHead.getNext();
        }
        return preHead;
    }

}
