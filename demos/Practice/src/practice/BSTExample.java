package practice;


class BSTNode{
	int data;
	BSTNode left,right;
	
	BSTNode(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
}

class BST{
	
	BSTNode root;
	
	BST(){
		root = null;
	}
	
	public void insert(BSTNode node,int value) {
		if(value <= node.data) {
			if(node.left == null) {
				node.left = new BSTNode(value);
			}
			else {
				insert(node.left, value);
			}
		}
		else {
			if(node.right == null) {
				node.right = new BSTNode(value);
			}
			else {
				insert(node.right,value);
			}
		}
	}
	
	public boolean contains(BSTNode node,int value) {
		if(node.data == value) {
			return true;
		}
		else if(value < node.data) {
			if(node.left == null) {
				return false;
			}
			else {
				return contains(node.left,value);
			}
		}
		else {
			if(node.right == null) {
				return false;
			}
			else {
				return contains(node.right,value);
			}
		}
	}
	
	public void inorder(BSTNode node) {
		if(node != null) {
			inorder(node.left);
			System.out.println(node.data);
			inorder(node.right);
		}
		
	}
	
	public int height(BSTNode node) {
		
		if(node == null) {
			return 0;
		}
		
		
		int left = height(node.left);
		int right = height(node.right);
		
		return 1+Math.max(left, right);
	}
		
}


public class BSTExample {

}
