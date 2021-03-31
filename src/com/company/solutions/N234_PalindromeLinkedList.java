package com.company.solutions;

import com.company.solutions.utils.ListNode;

import java.util.Stack;

public class N234_PalindromeLinkedList {

    public int listLength(ListNode head) {
        ListNode ph = head;
        int result = 0;
        while (ph != null) {
            result++;
            ph = ph.next;
        }
        return result;
    }

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
    // My solution with half reversing
    public boolean isPalindrome(ListNode head) {
        if (head.next == null) {
            return true;
        }
        int len = listLength(head);
        int upLimit = len / 2 + 1;
        ListNode ph1 = head, ph2, afterLimit;
        int cnt = 1;
        while (cnt < upLimit - 1) {
            cnt++;
            ph1 = ph1.next;
        }
        ph2 = (len % 2 == 0)? ph1.next : ph1.next.next;
        ph1.next = null;
        ListNode ph1Rev = reverseList(head);
        while (ph1Rev != null) {
            if (ph1Rev.val != ph2.val) {
                return false;
            }
            ph1Rev = ph1Rev.next;
            ph2 = ph2.next;
        }
        return true;
    }


    // Not my solution, but I saved it because of very cool idea about measuring list half with 2x-fast pointer
    public boolean isPalindromeNotMy(ListNode head) {
        // case: <= 1 element (no comparisons)
        if (head == null) return true;
        if (head.next == null) return true;

        // case: >= 2 elements (need comparison)
        ListNode fast = head;
        Stack<Integer> stack = new Stack<>();

        // case: breaks at end of even length list
        // we can use fast pointer to locate middle and len % 2 = ?
        while (fast != null) {
            // case: breaks at end of odd length list
            if (fast.next == null) {
                head = head.next; // iterate past the middle element (no comparison needed)
                break;
            }
            stack.push(head.val);
            head = head.next;
            fast = fast.next.next;
        }
        while (!stack.isEmpty()) {
            if (head.val != stack.pop()) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
