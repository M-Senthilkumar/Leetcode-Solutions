// Last updated: 8/11/2026, 10:05:45 PM
/**
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
    int len(ListNode head){
        ListNode temp = head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }
    public ListNode middleNode(ListNode head) {
        int pos = len(head);
        int mid = pos/2;
        int cnt = 0;
        ListNode temp = head;
        while(cnt<mid) {
            cnt++;
            temp = temp.next;
        }
        return temp;
    }
}