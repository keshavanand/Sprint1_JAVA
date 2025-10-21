package com.fdmgroup.problemSolvingExercises.Intermediate;

import java.util.Stack;

public class QueueUsingStack<E> {
	Stack<E> stack = new Stack<>();
	Stack<E> s2 = new Stack<>();
	
	boolean enqueue(E element) {
		int size = stack.size();
		
		for(int i=0;i<size;i++) {
			s2.add(stack.pop());
		}
		
		stack.add(element);

		for (int i=0;i<size;i++) {
			stack.add(s2.pop());
		}
		
		return true;
		
	}
	
	//   1 2 3 4 5 
	//   
	E dequeue() {
		return stack.pop();
	}
	
	E front() {
		return stack.peek();
	}
	
	boolean isEmpty() {
		return stack.isEmpty();
	}
	
}
