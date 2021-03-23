package com.company.solutions;

import com.company.solutions.utils.ListNode;

public class N83_RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode hp = head;
        while (hp != null) {
            while (hp.next != null && hp.val == hp.next.val) {
                hp.next = hp.next.next;
            }
            hp = hp.next;
        }
        return head;
    }
}
