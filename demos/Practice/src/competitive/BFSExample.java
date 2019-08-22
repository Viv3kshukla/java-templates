package competitive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSExample {
	
	static void dfs(ArrayList<Integer> [] vec,int s,int par) {
		System.out.print(s + " ");
		for(int i=0;i<vec[s].size();i++) {
			int u = vec[s].get(i);
			if(u == par) {
				continue;
			}
			dfs(vec,u,s);
		}
	}
	
	
	static void bfs(ArrayList<Integer> [] vec,boolean [] visited,int root) {
		Queue<Integer> q = new LinkedList<Integer>();
		visited[root] = true;
		q.add(root);
		
		while(!q.isEmpty()) {
			root = q.poll();
			System.out.print(root + " ");
			for(int i = 0;i < vec[root].size(); i++) {
				int u = vec[root].get(i);
				if(visited[u] == false) {
					visited[u] = true;
					q.add(u);
				}
			}
		}
		
	}
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Integer> vec[] = new ArrayList[n+1];
		
		for(int i=0;i<=n;i++) {
			vec[i] = new ArrayList<Integer>();
		}
		
		int u,v;
		
		for(int i=0;i<n-1;i++) {
			u = scan.nextInt();
			v = scan.nextInt();
			
			vec[u].add(v);
			vec[v].add(u);
			
		}
		
		
		dfs(vec,1,0);
		System.out.println();
		
		boolean visited[] = new boolean[n+1];
		Arrays.fill(visited, false);
		
		
		bfs(vec,visited,1);
		
		scan.close();
		
		
	}
}
