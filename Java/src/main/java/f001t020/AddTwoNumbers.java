package f001t020;

import datastructure.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode cursor = result;
        ListNode cursorPrev = cursor;
        int carry = 0;
        while (l1 != null || l2 != null) {
            cursorPrev = cursor;
            if (l1 == null) {
                cursor.val = l2.val + carry;
                l2 = l2.next;
            }
            else if (l2 == null) {
                cursor.val = l1.val + carry;
                l1 = l1.next;
            }
            else {
                cursor.val = l1.val + l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            }
            carry = cursor.val > 9 ? 1 : 0;
            cursor.val -= carry * 10;
            cursor.next = new ListNode();
            cursor = cursor.next;
        }
        cursor.val += carry;
        if (cursor.val == 0) {
            cursorPrev.next = null;
        }
        return result;
    }
}
