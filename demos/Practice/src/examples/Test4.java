package examples;

import java.util.ArrayList;
import java.util.Scanner;

public class Test4 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int arr[]=new int[n];
		
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
		ArrayList<Integer> ls = new ArrayList<Integer>();
		for(int i=0;i<n/2;i++) {
			ls.add(arr[i]);
			ls.add(arr[n-i-1]);
		}
		if(n%2==1) {
			ls.add(arr[n/2]);
		}
		
		Boolean flag=true;
		for(int i=1;i<ls.size();i++) {
			if(ls.get(i) < ls.get(i-1)) {
				flag=false;
				break;
			}
		}
		
		
		if(flag==true) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
		
		
		
		
		
	}
}	
