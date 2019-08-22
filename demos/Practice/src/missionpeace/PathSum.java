package missionpeace;

public class PathSum {
	public int hasPathSum(Node root,int sum) {
		return check(root,sum) ? 1:0;
	}
	
	public boolean check(Node root,int sum) {
		if(root.left == null && root.right == null) {
			return root.data == sum;
		}
		
		return (root.left!=null && check(root.left,sum - root.data)||
				check(root.right,sum-root.data));
		
	}
}