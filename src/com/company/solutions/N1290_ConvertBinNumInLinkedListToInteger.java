package com.company.solutions;

import com.company.solutions.utils.ListNode;

public class N1290_ConvertBinNumInLinkedListToInteger {


    public int length(ListNode head) {
        ListNode ph = head;
        int res = 0;
        while (ph != null) {
            ph = ph.next;
            res++;
        }
        return res;
    }

    public int getDecimalValue(ListNode head) {
        int len = length(head), pow = len - 1, res = 0;
        while (head != null) {
            res += head.val * (int) Math.pow(2, pow);
            pow--;
            head = head.next;
        }
        return res;
    }
}
