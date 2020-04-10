package com.org.niuke;

public class ReverseLinkNode {
    public static void main(String[] args) {
        ListNode head = ListNodeFactory.createLinkedNode(5);
        ListNodeFactory.traverseListNode(head);
        head = reverseLink(head);
        System.out.println();
        ListNodeFactory.traverseListNode(head);
    }

    private static ListNode reverseLink(ListNode headNode) {
        if (headNode==null ||headNode.next==null){
            return headNode;
        }

        ListNode newHead;
        ListNode currentHead;
        ListNode preHead;

        preHead = headNode;
        currentHead = headNode.next;

        newHead = preHead;
        preHead.next=null;
        while (currentHead != null) {
            preHead = currentHead;
            currentHead = currentHead.next;
            preHead.next=newHead;
            newHead=preHead;
        }
        return newHead;
    }
}
