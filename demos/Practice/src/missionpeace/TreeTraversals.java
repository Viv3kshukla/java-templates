package missionpeace;

import java.util.Stack;

public class TreeTraversals {

	public void inOrder(Node root) {
		
		if(root == null) {
			inOrder(root.left);
			System.out.println(root.data+ " ");
			inOrder(root.right);
		}
	}
	
	public void postOrder(Node root) {
		if(root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+ " ");
		}
	}
	
	public void preOrder(Node root) {
		if(root != null) {
			System.out.println(root.data+ " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	
	public void inOrderIter(Node root) {
		Stack<Node> stack = new Stack<Node>();
		Node node = root;
		while(node != null || !stack.isEmpty()) {
			while(node != null) {
				stack.push(node);
				node = node.left;
			}
		
			node = stack.pop();
			System.out.print(node.data+ " ");
			node = node.right;
		}
	}
	
	public void preOrderIter(Node root){
		Stack<Node> stack = new Stack<Node>();
		Node node = root;
		stack.push(node);
		while(!stack.isEmpty()) {
			node = stack.pop();
			System.out.println(node.data + " ");
			if(root.right != null) {
				stack.push(node.right);
			}
			if(root.left != null) {
				stack.push(node.left);
			}
		}
	}
	
	
	
	
	
	
	
	
}
