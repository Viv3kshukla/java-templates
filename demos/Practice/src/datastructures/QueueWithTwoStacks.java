package datastructures;

import java.util.Stack;

public class QueueWithTwoStacks {
	
	public static class MyQueue<T>{
		private Stack<T> stackNewestOnTop = new Stack<>();
		private Stack<T> stackOldestOnTop = new Stack<>();
		
		public void enqueue(T value) {
			stackNewestOnTop.push(value);
		}
		
		public T peek() {			// oldest item
			shiftStacks();
			return stackOldestOnTop.peek();
		}
		
		private void shiftStacks() {
			if(stackOldestOnTop.isEmpty()) {
				while(!stackNewestOnTop.isEmpty()) {
					stackOldestOnTop.push(stackNewestOnTop.pop());
				}
			}
		}
		
		public T dequeue() {		// returns oldest item and removes it
			shiftStacks();
			return stackOldestOnTop.pop();
		}
		
	}
	
	public static void main(String args[]) {
		
		
		
	}
	
	
}
