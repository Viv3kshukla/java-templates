package datastructures;


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
		this.root = null;
	}
	
	public void insert(int value) {
		if(root == null) {
			root = new BSTNode(value);
			return;
		}
		else {
			insert(root,value);			
		}

	}
	
	
//	public BSTNode insert(BSTNode node,int value) {
//		
//		if(value <= node.data) {
//			root.left = insert(node.left, value);
//		}
//		else {
//			root.right = insert(node.right,value);
//		}
//		return node;
//	}

	public void insert(BSTNode node,int value) {
		if(value < node.data) {
			if(node.left != null) {
				insert(node.left,value);
			}
			else {
				node.left = new BSTNode(value);
				return;
			}
		}
		else {
			if(node.right != null) {
				insert(node.right,value);
			}
			else {
				node.right = new BSTNode(value);
				return;
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
	
	public void inorder() {
		this.inorder(root);
	}
	
	public void inorder(BSTNode node) {
		if(node != null) {
			inorder(node.left);
			System.out.print(node.data + " ");
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
	public static void main(String args[]) {
		BST bst = new BST();
		bst.insert(4);
		bst.insert(2);
		bst.insert(6);
		bst.insert(3);
		bst.insert(1);
		bst.insert(5);
		bst.inorder();
	}
}
