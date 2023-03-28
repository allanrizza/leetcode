package mergetwosortedlists;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public ListNode mergeTwoLists(ListNode node1, ListNode node2) {
        ListNode mergedList = new ListNode(-1);
        ListNode current = mergedList;

        while (node1 != null && node2 != null) {
            if(node1.val < node2.val) {
                current.next = node1;
                node1 = node1.next;
            } else {
                current.next = node2;
                node2 = node2.next;
            }
            current = current.next;
        }

        if(node1 == null) current.next = node2;
        if(node2 == null) current.next = node1;

        return mergedList.next;
    }
}
