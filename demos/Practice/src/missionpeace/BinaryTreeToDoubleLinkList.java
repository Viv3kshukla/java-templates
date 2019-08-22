package missionpeace;

public class BinaryTreeToDoubleLinkList {
	
	
	public void toDoubleLL(Node root) {
		NodeRef prev = new NodeRef();
		toDoubleLL(root,prev);
	}
	
	private void toDoubleLL(Node root,NodeRef prev) {
		if(root == null) {
			return;
		}
		
		toDoubleLL(root.left,prev);
		if(prev.node != null) {
			prev.node.right = root;
			root.left = prev.node; 
			prev.node = root;
		}
		else {
			prev.node = root;
		}
		toDoubleLL(root.right,prev);
		
	}
	
	
	public void print(Node root) {
		Node curr = null;
		while(root != null) {
			curr = root;
			System.out.print(root.data+ " ");
			root = root.right;
		}
		System.out.println();
		root = curr;
		while(root!=null) {
			System.out.print(root.data+ " ");
			root = root.left;
		}
	}
	
	public static void main(String args[]) {
		BinaryTreeToDoubleLinkList btd = new BinaryTreeToDoubleLinkList();
		BinaryTree bt = new BinaryTree();
		
		Node root = null;
		
		root = bt.addNode(4, root);
		root = bt.addNode(5, root);
		root = bt.addNode(2, root);
		root = bt.addNode(1, root);
		root = bt.addNode(3, root);
		
		btd.toDoubleLL(root);
		btd.print(root);
		
		
	}
	
	
	
}
