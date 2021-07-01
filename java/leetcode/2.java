/**
 * https://leetcode.com/problems/add-two-numbers/
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit. 
 * Add the two numbers and return the sum as a linked list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        int r = 0;
        ListNode current = result;
        while (l1 != null && l2 != null){
            //get int
            int num = l1.val + l2.val + r;
            r = 0;
            if (num > 9){
                num = num - 10;
                r = 1;
            }
            current.next = new ListNode(num);
            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
            if (r == 0){
                current.next = l1;
                break;
            }
            //get int
            int num = l1.val + r;
            r = 0;
            if (num > 9){
                num = num - 10;
                r = 1;
            }
            current.next = new ListNode(num);
            current = current.next;
            l1 = l1.next;
        }
        while(l2 != null){
            if (r == 0){
                current.next = l2;
                break;
            }
            //get int
            int num = l2.val + r;
            r = 0;
            if (num > 9){
                num = num - 10;
                r = 1;
            }
            current.next = new ListNode(num);
            current = current.next;
            l2 = l2.next;
        }
        if (r == 1) current.next = new ListNode(1);
        return result.next;
    }
}