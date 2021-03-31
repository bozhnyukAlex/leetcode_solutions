package com.company.solutions;

import com.company.solutions.utils.ListNode;

public class N206_ReverseLinkedListElements {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        if (head.next.next == null) {
            ListNode h2 = head.next;
            head.next = null;
            h2.next = head;
            return h2;
        }
        ListNode prev, curr, next;
        prev = head;
        curr = head.next;
        next = head.next.next;
        prev.next = null;
        while (next != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }
        curr.next = prev;
        return curr;
    }
}
