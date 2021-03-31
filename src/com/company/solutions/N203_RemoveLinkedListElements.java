package com.company.solutions;

import com.company.solutions.utils.ListNode;

public class N203_RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode ph = head;
        while (ph != null && ph.next != null) {
            System.out.println(ph.val);
            while (ph.next != null && ph.next.val == val) {
                ph.next = ph.next.next;
            }
            ph = ph.next;
        }
        return head;
    }
}
