/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class No11 {

    public static void main(String[] args) {
        No11 o = new No11();
        ListNode n3 = new ListNode(3);
        ListNode n2 = new ListNode(4);//.next=n3;
        ListNode n1 = new ListNode(2);//.next=n2;
        ListNode a3 = new ListNode(4);
        ListNode a2 = new ListNode(6);//.next=a3;
        ListNode a1 = new ListNode(5);//.next=a2;
        n1.next = n2;
        n2.next = n3;
        a1.next = a2;
        a2.next = a3;

        ListNode node = o.addTwoNumbers(n1, a1);

        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode temp = head;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            if (sum > 9) {
                temp.next = new ListNode(sum - 10);
            } else {
                temp.next = new ListNode(sum);
            }
            temp = temp.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry == 1) {
            temp.next = new ListNode(1);
        }
        return head.next;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
