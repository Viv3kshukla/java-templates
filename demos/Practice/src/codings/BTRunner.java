package codings;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

class TreeNode<T>{
	T data;
	TreeNode<T> left;
	TreeNode<T> right;
	
	public TreeNode(T x) {
		this.data = x;
		this.left = null;
		this.right = null;
	}
}


class BinaryTree<T>{
	TreeNode<T> root;
	
	public BinaryTree() {
		this.root = null;
	}
	
	
	public void appendLevelOrderWise(T x) {
		if(root == null) {
			root = new TreeNode(x);
			return;
		}
		
		TreeNode temp = root;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(temp);
		
		while(!q.isEmpty()) {
			
			temp = q.peek();
			q.remove();
			
			if(temp.left == null) {
				temp.left = new TreeNode(x);
				break;
			}
			else {
				q.add(temp.left);
			}
			
			if(temp.right == null) {
				temp.right = new TreeNode(x);
				break;
			}
			else {
				q.add(temp.left);
			}
			
		}
		
	}
	
	public void inorder(TreeNode node) {
		if(node != null) {
			inorder(node.left);
			System.out.println(node.data);
			inorder(node.right);
		}
		
	}
	
	public int height(TreeNode node) {
		
		if(node == null) {
			return 0;
		}
		
		
		int left = height(node.left);
		int right = height(node.right);
		
		return 1+Math.max(left, right);
	}
	
	
	
	
}



public class BTRunner {
	
//	Scanner scan  = new Scanner(System.in);
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		BinaryTree<Integer> btree = new BinaryTree<Integer>();
		BinaryTree<String> stree = new BinaryTree<String>();
		
		int n = scan.nextInt();
		
		for(int i = 0;i < 5;i++) {
			int x = scan.nextInt();
			btree.appendLevelOrderWise(x);
		}
		
		for(int i=0;i<5;i++) {
			String s = scan.next();
			stree.appendLevelOrderWise(s);
		}
		
		btree.inorder(btree.root);
		
		stree.inorder(stree.root);
		
		
		System.out.println("Height of Integer tree "+ btree.height(btree.root));
		System.out.println("Height of Integer tree "+ btree.height(stree.root));
		
	}
	
}











