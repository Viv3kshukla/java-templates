package missionpeace;

import java.util.ArrayList;


public class PathsWithPathSum {
	

	public class Solution {

	    public ArrayList<ArrayList<Integer>> vec;
	    public void check(Node root,int sum,ArrayList<Integer> temp) {

	        temp.add(root.data);
	        if(root.left == null && root.right == null && root.data == sum) {
	            vec.add(new ArrayList<Integer>(temp));            
	        }
	        
	        if(root.left !=null) {
	            check(root.left,sum - root.data,temp);
	        }
	        
	        if(root.right != null) {
	            check(root.right,sum-root.data,temp);
	        }
	        
	        temp.remove(temp.size()-1);
	        
	    }
	    
	    
	    public ArrayList<ArrayList<Integer>> pathSum(Node root,int sum){
	        
	        vec = new ArrayList<ArrayList<Integer>>();
	        check(root,sum,new ArrayList<Integer>());
	        return vec;
	    }
	}
	
}
