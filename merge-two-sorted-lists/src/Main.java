import java.util.*;

public class Main {
    public static void main(String[] args) {
        ListNode firstList = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        ListNode secondList = new ListNode(1, new ListNode(3, new ListNode(4, null)));

        ListNode result = mergeTwoLists(firstList, secondList);

        while(result != null) {
            System.out.println(result.val);
            result= result.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Dummy node that helps in simplifying the process of merging
        ListNode dummy = new ListNode(0, null);
        ListNode current = dummy;

        // Compare elements from both lists and merge them into the new list
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;  // Move the current pointer to the new node
        }

        // If one of the lists is not fully processed, link the remainder
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // Return the merged list starting from the node after the dummy
        return dummy.next;
    }

//    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        List<Integer> myList = new ArrayList<>();
//
//        while (list1 != null) {
//            myList.add(list1.val);
//            list1 = list1.next;
//        }
//
//        while (list2 != null) {
//            myList.add(list2.val);
//            list2 = list2.next;
//        }
//
//        Collections.sort(myList);
//
//        ListNode dummy = new ListNode(0, null);
//        ListNode current = dummy;
//
//        for (int element : myList) {
//            current.next = new ListNode(element, null);
//            current = current.next;
//        }
//
//        return dummy.next;
//    }

    // Definition for singly-linked list.
    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}