package codings;

import java.util.Scanner;

class Node{
	
	int data;
	Node next;
	
	public Node(int data){
		this.data = data;
		next = null;
	}
}



class LinkedList{
	Node head = null;
	
	public void append(int data) {
		if(head==null) {
			head = new Node(data);
		}
		else {
			Node temp = head;
			
			while(temp.next != null) {
				temp = temp.next;
			}
			
			temp.next = new Node(data);
		}
	}
	
	public void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public void reverseList() {
		Node curr,prev,nxt;
		curr = head;
		prev = null;
		nxt = null;
		
		while(curr!=null) {
			nxt = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nxt;
		}
		
		head = prev;
	}
	
	
	
	
}

public class AnotherJavaOOOPSClass {
	public static void main(String args[]) {
		Scanner scan  = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		LinkedList ls1 = new LinkedList();
		
		
		for(int i=0;i<n;i++) {
			int x = scan.nextInt();
			ls1.append(x);
		}
		ls1.printList();
		
		ls1.reverseList();
		
		ls1.printList();

	}
	
	
}
