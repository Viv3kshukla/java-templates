package examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Test3 {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		int n = Integer.parseInt(input);
		
		HashMap<String,Boolean> hmap1 = new HashMap<String,Boolean>();
		HashMap<String,Integer> hmap2 = new HashMap<String,Integer>();		
		HashMap<String,Integer> hmap3 = new HashMap<String,Integer>();
		
		for(int i=0;i<n;i++) {
			input=br.readLine();
			hmap1.put(input,true);
			hmap2.put(input,i);
		}
		
		ArrayList<String> [] arr = new ArrayList[1000];
		for(int i=0;i<1000;i++) {
			arr[i] = new ArrayList<String>();
		}
		input = br.readLine();
		int m = Integer.parseInt(input);
		
		ArrayList<String> [] vec = new ArrayList[1000];
		for(int i=0;i<1000;i++) {
			vec[i] = new ArrayList<String>();
		}
		for(int i=0;i<m;i++) {
			input = br.readLine();
			hmap3.put(input,i);
			input = br.readLine();
			int x = Integer.parseInt(input);
			for(int j=0;j<x;j++) {
				input=br.readLine();
				vec[i].add(input);
			}
		}
		
		int q;
		q = Integer.parseInt(br.readLine());
		while(q > 0) {
			q--;
			String request,dname="";
			request=br.readLine();
			
			for(int i=0;i<request.length();i++) {
				if(request.charAt(i)=='/') {
					break;
				}
				dname+=request.charAt(i);
			}
			
			if(request.indexOf("machine_down")!=-1) {
				int ii = request.indexOf("=");
				String ip = "";
				for(int i=ii+1;i<request.length();i++) {
					ip=ip+request.charAt(i);
				}
				hmap1.put(ip, false);
				continue;
				
			}
			
			if(request.indexOf("machine_up")!=-1) {
				int ii = request.indexOf("=");
				String ip = "";
				for(int i=ii+1;i<request.length();i++) {
					ip=ip+request.charAt(i);
				}
				hmap1.put(ip,true);
			}
			
		
		}
	}
}
