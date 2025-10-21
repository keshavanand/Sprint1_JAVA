package com.fdmgroup.problemSolvingExercises.Intermediate;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class DetectCycleLinkedList {
	public static void main(String[] args) {
        // Test 1: Empty list
        System.out.println(hasCycle(null)); // false

        // Test 2: Single node, no cycle
        ListNode t2 = new ListNode(1);
        System.out.println(hasCycle(t2)); // false

        // Test 3: Single node, cycle to itself
        ListNode t3 = new ListNode(1);
        t3.next = t3;
        System.out.println(hasCycle(t3)); // true

        // Test 5: Cycle in middle
        ListNode t5 = createList(new int[]{1, 2, 3, 4}, 1);
        System.out.println(hasCycle(t5)); // true

        // Test 6: Full cycle
        ListNode t6 = createList(new int[]{1, 2, 3, 4}, 0);
        System.out.println(hasCycle(t6)); // true


        // Test 8: Long list, cycle at 500
        int[] arr8 = new int[1000];
        for (int i = 0; i < 1000; i++) arr8[i] = i + 1;
        ListNode t8 = createList(arr8, 500);
        System.out.println(hasCycle(t8)); // true
	}
	
	static boolean hasCycle(ListNode node) {
		if(node == null || node.next == null || node.next.next == null) return false;
		
		ListNode tortoise = node.next;
		ListNode hare = node.next.next;
		do {
			if(hare == tortoise) return true;
			else {
				if(node.next == null || node.next.next==null) return false;
				tortoise = tortoise.next;
				hare = node.next.next;
			}
		}while(hare!=null);
		
		return false;
	}
	
	 // Helper: Create a linked list from an array, optionally with a cycle
    static ListNode createList(int[] values, Integer pos) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        ListNode cycleNode = null;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
            if (i == pos) cycleNode = current;
        }

        if (pos != null && pos >= 0 && pos < values.length)
            current.next = (pos == 0) ? head : cycleNode;

        return head;
    }
}
