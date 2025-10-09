package com.fdmgroup.Collections;

import java.util.LinkedList;


public class ReverseLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Object> linkedList = new LinkedList<Object>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add("Keshav");
		
		LinkedList<Object> reversed = reverseLinkedList(linkedList);
		
		System.out.println(reversed);
		
	}
	
	public static LinkedList<Object> reverseLinkedList(LinkedList<Object> linkedList){
		LinkedList<Object> reverseLinkedList = new LinkedList<Object>();
		int size = linkedList.size();
				
		for(int i =0; i<size;i++){
			reverseLinkedList.add(linkedList.pollLast());
		}
		return reverseLinkedList;
	}

}
