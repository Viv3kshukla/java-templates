package datastructures;

public class ValidBinarySearchTree {
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
		
	}
	
	boolean checkBST(Node root) {
		return checkBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	
	boolean checkBST(Node root,int minValue,int maxValue) {
		if(root == null) {
			return true;
		}
		
		if(root.data > minValue && root.data < maxValue && checkBST(root.left,minValue,root.data) && checkBST(root.right,root.data,maxValue)) {
			return true;
		}
		return false;
	}
	
	
	
}
