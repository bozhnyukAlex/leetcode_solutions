package com.company.solutions;

import com.company.solutions.utils.ListNode;

public class N21_MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode res = new ListNode();
        ListNode pr = res;
        ListNode pl1 = l1, pl2 = l2;
        while (pl1 != null || pl2 != null) {
            if (pl1 == null ^ pl2 == null) {
                if (pl1 == null) {
                    pr.next = new ListNode(pl2.val);
                    pr = pr.next;
                    pl2 = pl2.next;
                }
                else {
                    pr.next = new ListNode(pl1.val);
                    pr = pr.next;
                    pl1 = pl1.next;
                }

            }
            else {
                if (pl1.val == pl2.val) {
                    pr.next = new ListNode(pl1.val);
                    pr = pr.next;
                    pr.next = new ListNode(pl2.val);
                    pr = pr.next;
                    pl1 = pl1.next;
                    pl2 = pl2.next;
                }
                else if (pl1.val > pl2.val) {
                    pr.next = new ListNode(pl2.val);
                    pr = pr.next;
                    pl2 = pl2.next;
                }
                else {
                    pr.next = new ListNode(pl1.val);
                    pr = pr.next;
                    pl1 = pl1.next;
                }
            }
        }
        res = res.next;
        return res;
    }
}
