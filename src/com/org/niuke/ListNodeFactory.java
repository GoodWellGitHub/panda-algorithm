package com.org.niuke;

import java.util.Objects;

public class ListNodeFactory {
    public static ListNode createLinkedNode(int num) {
        ListNode currentNode = new ListNode((int) (1 + Math.random() * (10)));
        ListNode head = currentNode;
        for (int i = 1; i < num; i++) {
            ListNode tempNode = new ListNode((int) (1 + Math.random() * (10)));
            currentNode.next = tempNode;
            currentNode = tempNode;
        }
        return head;
    }

    public static void traverseListNode(ListNode head) {
        if (Objects.isNull(head)) {
            return;
        }
        System.out.print(head.val);
        head = head.next;
        while (head != null) {
            System.out.print("  ==>  " + head.val);
            head=head.next;
        }
        System.out.println();
    }

}
