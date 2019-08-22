package missionpeace;

public class BSTSearch {
	public static Node search(Node root,int key){
		
		if(root==null) {
			return null;
		}
		if(root.data == key) {
			return root;
		}
		else if(root.data < key) {
			return search(root.right,key);
		}
		else {
			return search(root.left,key);
		}
		
	}

	public static void main(String args[]) {
		BinaryTree bt = new BinaryTree();
		Node root = null;
		root = bt.addNode(3, root);
		root = bt.addNode(-2, root);
		root = bt.addNode(4, root);
		root = bt.addNode(6, root);
		root = bt.addNode(-1, root);
		root = bt.addNode(9, root);
		
		bt.printInorder(root);
		bt.size(root);
		
		Node temp = search(root,4);
		if(temp == null) {
			System.out.println("Does not exists");
		}
		else {
			System.out.println("exists");
			System.out.println(temp.data);
		}
		
	}
	
}


