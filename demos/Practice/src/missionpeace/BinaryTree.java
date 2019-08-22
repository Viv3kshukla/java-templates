package missionpeace;


class NodeRef{
	Node node;
}


enum Color{
	RED,
	BLACK
}

class Node{
	
	int data;
	int height;
	int size;
	
	Node left;
	Node right;
	Color color;
	
	public static Node newNode(int data) {
		Node node = new Node();
		node.left = null;
		node.right = null;
		node.data = data;
		node.height = 1;
		node.size = 1;
		node.color = Color.RED;
	
		return node;	
	}
}

public class BinaryTree {
	
	public Node addNode(int data, Node root) {
		Node temp = root;
		Node node = Node.newNode(data);
		
		if(root == null) {
			root = node;
			return root;
		}
		
		Node prev = null;
		while(temp != null) {
			prev = temp;
			if(temp.data < data) {
				temp = temp.right;
			}
			else {
				temp = temp.left;
			}
		}
		if(prev.data < data) {
			prev.right = node;
		}
		else {
			prev.left = node;
		}
		return root;
	}
	
	public Node addNodeRecursive(int data, Node root) {
		if(root == null) {
			root = Node.newNode(data);
			return root;
		}
		if(data <= root.data) {
			root.left = addNodeRecursive(data, root.left);
		}
		else {
			root.right = addNodeRecursive(data, root.right);
		}
		
		return root;
	}
	
	public int size(Node root) {
		if(root==null) {
			return 0;
		}
		
		return 1+size(root.left)+size(root.right);
		
	}
	
	public int height(Node root) {
		
		if(root == null) {
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		return Math.max(leftHeight, rightHeight)+1;
		
	}
	
	public void printInorder(Node root) {
		if(root!=null) {
			printInorder(root.left);
			System.out.print(root.data + " ");
			printInorder(root.right);
		}
	}
	
	
	
}
