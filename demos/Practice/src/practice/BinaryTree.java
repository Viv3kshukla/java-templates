package practice;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T> {

	TreeNode<T> root;
	
	public BinaryTree() {
		root = null;
	}
	
	public void insert(T data) {
		
		if(root == null) {
			root = new TreeNode<T>(data);
			return;
		}
		
		TreeNode<T> temp = root;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(temp);
		
		while(!q.isEmpty()) {
			temp = q.poll();
			
			if(temp.left != null) {
				q.add(temp.left);
			}
			else {
				temp.left = new TreeNode(data);
				return;
			}
			
			if(temp.right != null) {
				q.add(temp.right);
			}
			else {
				temp.right = new TreeNode(data);
				return;
			}
			
		}
	}
	
	public int getHeight(TreeNode<T> node) {
		
		if(node == null) {
			return 0;
		}
		int leftHeight = getHeight(node.left);
		int rightHeight = getHeight(node.right);
		
		return Math.max(leftHeight, rightHeight)+1;
		
	}
	
	
	public void printInorder(TreeNode<T> node) {
		if(node != null) {
			printInorder(node.left);
			System.out.print(node.data+ " ");
			printInorder(node.right);
		}
	}
	
	public void printPreorder(TreeNode<T> node) {
		if(node != null) {
			System.out.print(node.data+ " ");
			printPreorder(node.left);
			printPreorder(node.right);
		}
	}
	
	public void printPostorder(TreeNode<T> node) {
		if(node != null) {
			printPostorder(node.left);
			printPostorder(node.right);
			System.out.print(node.data+ " ");
		}
	}
	
	// Wrappers
	
	public void printInorder() {
		printInorder(root);
	}
	
	public void printPreorder() {
		printPreorder(root);
	}

	public void printPostorder() {
		printPostorder(root);
	}
	
	public int getHeight() {
		return getHeight(root);
	}
	
}
