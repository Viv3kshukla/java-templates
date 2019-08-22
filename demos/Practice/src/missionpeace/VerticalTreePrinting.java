package missionpeace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

/**
 * http://www.geeksforgeeks.org/print-binary-tree-vertical-order-set-2/
 */

public class VerticalTreePrinting {
	
	public static void printVertical(Node root) {
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>(); 
		ans = verticalOrderTraversal(root);
		System.out.println("printing levels");
		printLevels(ans);
	}
	
	public static ArrayList<ArrayList<Integer>> verticalOrderTraversal(Node root){
		
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		if(root == null) {
			return ans;
		}
		Queue<Node> q = new LinkedList<Node>();
		Queue<Integer> level = new LinkedList<Integer>();
		TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<>();
		Node node;
		Integer lvl;
		q.add(root);
		level.add(0);
		while(!q.isEmpty()) {
			node = q.remove();
			lvl = level.remove();
			if(!map.containsKey(lvl)) {
				map.put(lvl, new ArrayList<Integer>());
			}
			ArrayList<Integer> temp = map.get(lvl);
			temp.add(node.data);
			map.put(lvl, temp);
			
			if(node.left != null) {
				q.add(node.left);
				level.add(lvl-1);
			}
			
			if(node.right != null) {
				q.add(node.right);
				level.add(lvl+1);
			}
		
		}
		
		for(Integer key : map.keySet()) {
			ans.add(map.get(key));
		}
		
		return ans;
		
		
	}
	
	public static void printLevels(ArrayList<ArrayList<Integer>> ans) {
		for(ArrayList<Integer> arr: ans) {
			for(int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String args[]) {
		
		BinaryTree bt = new BinaryTree();
		Node root = null;
		root = bt.addNode(3, root);
		root = bt.addNode(-6, root);
		root = bt.addNode(-7, root);
		root = bt.addNode(2, root);
		root = bt.addNode(9, root);
		root = bt.addNode(6, root);
		root = bt.addNode(11, root);
		bt.printInorder(root);
		System.out.println();
		System.out.println(bt.height(root));
		printVertical(root);
	}
}
