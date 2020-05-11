package com.org.leetcode;

import com.org.other.link.LinkNode;

/**
 * 19. 删除链表的倒数第N个节点
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * 示例：
 *
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 *
 * 给定的 n 保证是有效的。
 */
public class DeleteLastNLink {
    public static void main(String[] args){

    }

    public LinkNode deleteN(LinkNode head,int n){

        /**
         *        ListNode fast=head;
         *         ListNode slow=head;
         *         int i=1;
         *         while (i<=n&&fast!=null){
         *             fast=fast.next;
         *             i++;
         *         }
         *         if(fast==head){
         *             return null;
         *         }
         *         if(fast==null){
         *             return head.next;
         *         }
         *
         *         while (fast.next!=null){
         *             slow=slow.next;
         *             fast=fast.next;
         *         }
         *         slow.next=slow.next.next;
         *
         *         return head;
         */
        LinkNode fast=head;
        LinkNode slow=head;
        int i=1;
        while (i<=n&&fast.getNext()!=null){
            fast=fast.getNext();
            i++;
        }
        if (fast.getNext()==null){
            return head.getNext();
        }
        fast=fast.getNext();

        while (fast.getNext()!=null){
            slow=slow.getNext();
            fast=fast.getNext();
        }
        slow.setNext(slow.getNext().getNext());

        return head;
    }
}
