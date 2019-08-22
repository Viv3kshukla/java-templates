package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Predation {
	
	
	static int bfs(ArrayList<Integer> vec[],int s) {
		
		HashSet<Integer> visited = new HashSet<Integer>();
		visited.add(s);
		int ans = 0;
		int distance = 0;
		Queue<Integer> q = new LinkedList<Integer>();
		Queue<Integer> dist = new LinkedList<Integer>();
		q.add(s);
		dist.add(0);
		while(!q.isEmpty()) {
			s = q.poll();
			distance = dist.poll();
			for(int i = 0;i<vec[s].size();i++) {
				int v = vec[s].get(i);
				if(visited.contains(v)==false) {
					q.add(v);
					dist.add(distance+1);
					ans = Math.max(ans, distance+1);
				}
			}
		}
		
		
		return ans;
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0;i< n;i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("input done ");
		ArrayList<Integer> vec[] = new ArrayList[n];
		for(int i=0;i<n;i++) {
			vec[i] = new ArrayList<Integer>();
		}
		
		ArrayList<Integer> root = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			if(arr[i] == -1) {
				root.add(i);
			}
			else {
				vec[arr[i]].add(i);
			}
		}
		
		int answer = 0;
		for(Integer i : root) {
			answer = Math.max(answer, bfs(vec,i));
		}
		System.out.println(answer+1);
		
	}
}
