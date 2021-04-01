package com.company.solutions;

import com.company.solutions.utils.ListNode;

public class N141_LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode ph = head, fast = head;
        if (head == null) {
            return false;
        }
        if (head.next == null) {
            return false;
        }
        if (head.next == head) {
            return true;
        }
        while (fast != null) {
            ph = ph.next;
            fast = fast.next.next;
            if (fast != null && fast.next == null) {
                return false;
            }
            if (ph == fast) {
                return true;
            }
        }
        return false;
    }
}
