package com.company.solutions;


import com.company.solutions.utils.ListNode;

public class N160_IntersectionOfTwoLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int la = 1, lb = 1;
        ListNode hA = headA, hB = headB;
        ListNode big = null, small = null;
        while (true) {
            la++;
            lb++;
            hA = hA.next;
            hB = hB.next;
            if (hA == null && hB == null) {
                big = headA;
                small = headB;
                break;
            }
            if (hA == null) {
                big = headB;
                small = headA;
                la--;
                break;
            }
            if (hB == null) {
                big = headA;
                small = headB;
                lb--;
                break;
            }
        }

        if (hB != null) {
            while (true) {
                hB = hB.next;
                if (hB == null) {
                    break;
                }
                lb++;
            }
        }
        if (hA != null) {
            while (true) {
                hA = hA.next;
                if (hA == null) {
                    break;
                }
                la++;
            }
        }
        System.out.println(la);
        System.out.println(lb);
        int diff = Math.abs(la - lb);
        while (diff > 0) {
            big = big.next;
            diff--;
        }
        while (true) {
            if (big == small) {
                return big;
            }
            if (big == null || small == null) {
                return null;
            }
            big = big.next;
            small = small.next;
        }
    }
}
