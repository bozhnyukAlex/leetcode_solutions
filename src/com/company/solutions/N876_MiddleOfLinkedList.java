package com.company.solutions;

import com.company.solutions.utils.ListNode;

public class N876_MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode fast = head;
        while (fast != null) {
            head = head.next;
            fast = fast.next.next;
            if (fast != null && fast.next == null) {
                return head;
            }
        }
        int a = 5;
        return head;
    }
}
