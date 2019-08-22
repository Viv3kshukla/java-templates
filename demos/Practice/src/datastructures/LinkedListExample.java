package datastructures;

class Node{
	
	Node next;
	int data;
	Node(int data){
		this.data = data;
	}
	
}

class LinkedList{
	Node head;
	
	
	public void append(int data) {
		if(head == null) {
			head = new Node(data);
			return;
		}
		
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);
	}
	
	
	public void prepend(int data) {
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}
	
	public void deleteWithValue(int data) {
		if(head == null) return;
		
		if(head.data == data) {
			head = head.next;
			return;
		}
		
		Node current = head;
		while(current.next != null) {
			if(current.next.data == data) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}
	
	public void printList() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
}

public class LinkedListExample {
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		list.append(4);
		list.append(3);
		list.append(5);
		list.append(1);
		list.printList();
	}
}
