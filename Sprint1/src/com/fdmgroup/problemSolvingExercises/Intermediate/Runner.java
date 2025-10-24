package com.fdmgroup.problemSolvingExercises.Intermediate;

public class Runner {
	public static void main(String[] args) {
		StackUsingQueue<Integer> stack = new StackUsingQueue<>();
		
		stack.push(1);
		
		System.out.println("Top Element: "+stack.top());
		System.out.println("Removed: "+stack.pop());
		
		stack.push(2);
		System.out.println("Top Element: "+stack.top());
		System.out.println("Size: "+stack.size());

		stack.push(3);
		stack.push(4);
		stack.push(5);
				
		System.out.println("Top Element: "+stack.top());
		System.out.println("Size: "+stack.size());

		System.out.println("Removed: "+stack.pop());
		System.out.println("Removed: "+stack.pop());
		System.out.println("Removed: "+stack.pop());
		System.out.println("Removed: "+stack.pop());
		System.out.println("Removed: "+stack.pop());
		
		
		StackUsingQueueSimpleWay<Integer> s = new StackUsingQueueSimpleWay<>();
		
		s.push(1);
		
		System.out.println("Top Element: "+s.top());
		System.out.println("Removed: "+s.pop());
		
		s.push(2);
		System.out.println("Top Element: "+s.top());
		System.out.println("Size: "+s.size());

		s.push(3);
		s.push(4);
		s.push(5);
				
		System.out.println("Top Element: "+s.top());
		System.out.println("Size: "+s.size());

		System.out.println("Removed: "+s.pop());
		System.out.println("Removed: "+s.pop());
		System.out.println("Removed: "+s.pop());
		System.out.println("Removed: "+s.pop());
		System.out.println("Removed: "+s.pop());
		
		QueueUsingStack<Integer> q = new QueueUsingStack<>();
		q.enqueue(3);
		q.enqueue(2);
		q.enqueue(1);
		q.enqueue(4);
		
		System.out.println("Removed: "+q.dequeue());
		System.out.println("Removed: "+q.dequeue());
		System.out.println("Removed: "+q.dequeue());
		System.out.println("Removed: "+q.dequeue());

		
	}
}
