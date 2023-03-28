package mergetwosortedlists;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public ListNode mergeTwoLists(ListNode node1, ListNode node2) {
        ListNode listResult = new ListNode(-1);
        ListNode curr = listResult;

        while(node1 != null && node2 != null) {
            if(node1.val < node2.val) {
                curr.next = node1;
                node1 = node1.next;
            } else {
                curr.next = node2;
                node2 = node2.next;
            }
            curr = curr.next;
        }

        curr.next = node1 == null ? node2 : node1;

        return listResult.next;
    } 
}
