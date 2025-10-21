package com.fdmgroup.problemSolvingExercises.Intermediate;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue<E> {
	Queue<E> topOfStack = new LinkedList<>(); 
	Queue<E> restElements = new LinkedList<>();
	
	public boolean push(E element) {
		if(topOfStack.isEmpty()) {
			topOfStack.add(element);
		}else {
			restElements.add(topOfStack.poll());
			topOfStack.add(element);
		}
		return true;
	}

	public boolean isEmpty() {
		return topOfStack.isEmpty();
	}
	
	public E top() {
		if(!topOfStack.isEmpty())
			return topOfStack.peek();
		else
			return null;
		
	}
	
	public E pop() {
		E element = null;
		if(!topOfStack.isEmpty() && !restElements.isEmpty()) {
			element = topOfStack.poll();
			
			int limit = restElements.size() - 1;
			for(int i =0;i<limit; i++) {
				topOfStack.add(restElements.poll());
			}
			
			Queue<E> temp = topOfStack;
			topOfStack = restElements;
			restElements = temp;
			
		}else if(!topOfStack.isEmpty()){
			element = topOfStack.poll();
		}
		return element;
	}
	
	public int size() {
		return topOfStack.size() + restElements.size();
	}
	
}
