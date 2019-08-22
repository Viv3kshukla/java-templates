package codings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	
	public static int toInt(String input) {
		return Integer.parseInt(input);
	}
	public static void main(String args[]) throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int n = toInt(input);
	    int vector[] = new int[n+1];
	    
	    input = br.readLine();
	    String vals[] = input.split(" ");
	    for(int i=1;i<=n;i++) {

	    	int x = toInt(vals[i-1]);
	    	vector[i] = vector[i-1]+x;
	    }
	    List<List<Integer> > ls = new ArrayList();
	    
	    for(int i=1;i<=n;i++)
	    {
	    	for(int j=i;j<=n;j++) {
	    		int nemo = vector[j] - vector[i-1];
	    		int deno = (j-i+1);
	    		double cmean = (double)nemo/deno;
	    		double mean;
	    		if(deno == n) {
	    			mean = (double)0;
	    		}
	    		else {
	    			mean = (double)(vector[n] - nemo) / (n-deno);
	    		}
	    		if(cmean > mean) {
	    			ls.add(new ArrayList<Integer>(Arrays.asList(i,j)));
	    		}
	    	}
	    }
	    
	    System.out.println(ls.size());
	    
	    for(List<Integer> ii:ls) {
	    	System.out.println(ii);
	    }
	    
	    
	}
}

//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Arrays;
//import java.util.Scanner;
//
//class TestClass {
//
//	public static void main(String args[]) throws Exception  {
//		
//// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//// 		String input = br.readLine();
//// 		int n = toInt(input);
//	   // int vector[] = new int[n+1];
//	    
//// 	    input = br.readLine();
//// 	    String vals[] = input.split(" ");
//
//        Scanner scan = new Scanner(System.in);
//        int n=scan.nextInt();
//	    int vector[] = new int[n+1];
//	    for(int i=1;i<=n;i++) {
//
//	    	int x = scan.nextInt();
//	    	vector[i] = vector[i-1]+x;
//	    }
//	    List<List<Integer> > ls = new ArrayList();
//	    List<Integer> first = new ArrayList<Integer>();
//	    List<Integer> second = new ArrayList<Integer>();
//	    
//	    for(int i=1;i<=n;i++)
//	    {
//	    	for(int j=i;j<=n;j++) {
//	    		int nemo = vector[j] - vector[i-1];
//	    		int deno = (j-i+1);
//	    		double cmean = (double)nemo/deno;
//	    		double mean;
//	    		if(deno == n) {
//	    			mean = (double)0;
//	    		}
//	    		else {
//	    			mean = (double)(vector[n] - nemo) / (n-deno);
//	    		}
//	    		if(cmean > mean) {
//	    			first.add(i);
//	    			second.add(j);
//	    		}
//	    	}
//	    }
//	    
//	    System.out.println(first.size());
//	    
//	    for(int i=0;i<first.size();i++){
//	        System.out.println(first.get(i) + " "+ second.get(i));
//	    }
//	    
//	    
//	}
////     public static int toInt(String input) {
//// 		return Integer.parseInt(input);
//// 	}
//	
//}

