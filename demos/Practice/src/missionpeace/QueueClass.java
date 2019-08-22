package missionpeace;

public class QueueClass {
	
	
	Node head;
	Node tail;
	
	public QueueClass(){
		head = null;
	}
	
	private static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public int peek() {
		return head.data;
	}
	
	public void add(int data) {
		Node node = new Node(data);
		if(tail != null) {
			tail.next = node;
		}
		tail = node;
		if(head == null) {
			head = node;
		}
	}
	
	public int remove() {
		if(head == null) {
			return -1;
		}
		int data = head.data;
		head = head.next;
		if(head == null) {
			tail = null;
		}
		return data;
	}
	
	
	
}
