package missionpeace;

public class StackClass {
	
	Node top;
	
	public StackClass() {
		top = null;
	}
	
	private static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public int peek() {
		return top.data;
	}
	
	public void add(int data) {
		Node node = new Node(data);
		node.next = top;
		top = node;
		
	}
	
	public int pop() {
		int data = top.data;
		top = top.next;
		return data;
	}
	
	
	
}
