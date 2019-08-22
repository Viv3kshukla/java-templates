package practice;

public class MyStack<T> {

	private static class Node<T>{
		T data;
		Node<T> next;
		Node(T data){
			this.data = data;
			this.next = null;
		}
	}
	
	Node<T> top;
	
	public MyStack() {
		top = null;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public T peek() {
		if(top == null) return null;
		return top.data;
	}
	
	public void push(T data) {
		Node<T> node = new Node(data);
		node.next = top;
		top = node;
	}
	
	public T pop() {
		if(top == null) return null;
		T value = top.data;
		top = top.next;
		return value;
	}
	
	
}
