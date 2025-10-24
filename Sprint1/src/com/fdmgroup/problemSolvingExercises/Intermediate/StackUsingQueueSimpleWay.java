package com.fdmgroup.problemSolvingExercises.Intermediate;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueueSimpleWay<E> {
	private Queue<E> q = new LinkedList<>();
	
	boolean push(E element) {
		int size = q.size();
		q.add(element);
		
		for(int i=0; i<size;i++) {
			q.add(q.poll());
		}
		
		return true;
	}
	
	boolean isEmpty() {
		return q.isEmpty();
	}
	
	E top() {
		if(q.isEmpty()) return null;
		return q.peek();
	}
	
	E pop() {
		if(q.isEmpty()) return null;
		return q.poll();
	}
	
	int size() {
		return q.size();
	}
}
