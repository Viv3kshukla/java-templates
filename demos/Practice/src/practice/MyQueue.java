package practice;

public class MyQueue<T> {

	
	private static class Node<T>{
		T data;
		Node<T> next;
		Node(T data){
			this.data = data;
			this.next = null;
		}
	}
	
	Node<T> head;
	Node<T> tail;
	
	public MyQueue() {
		head = null;
		tail = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public T peek() {
		if(head == null) return null;
		return head.data;
	}
	
	public void append(int data) {
		Node<T> node = new Node(data);
		if(tail!=null) {
			tail.next = node;
		}
		tail = node;
		if(head == null) {
			head = node;
		}
	}
	
	public T pop(){
		if(head == null) return null;
		T value = head.data;
		value = head.data;
		head = head.next;
		if(head == null) {
			tail = null;
		}
		return value;	
	}
	
}
