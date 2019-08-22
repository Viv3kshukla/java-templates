//package examples;
//
//import java.util.Scanner;
//
//public class Test5 {
//	public static void main(String args[]) {
//		Scanner scan = new Scanner(System.in);
//		String str;
//		int n;
//		str = scan.next();
//		n = scan.nextInt();
//		
//		
//		int cul[] = new int[n];
//		cul[0]=1;
//		for(int i=0;i<n;i++) {
//			if(str.charAt(i)== str.charAt(i-1)) {
//				cul[i]=cul[i-1]+1;
//			}
//			else {
//				cul[i]=1;
//			}
//		}
//		
//		int i=n-1;
//		boolean arr[] = new boolean[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=true;
//		}
//		while(i>=0) {
//			if(cul[i]==n) {
//				int temp = 0;
//				while(temp <n) {
//					temp++;
//					i--;
//					cul[i]
//				}
//			}
//			if(cul[i]>n) {
//				i=i-cul[i];
//				continue;
//			}
//			i--;
//		}
//		
//	}
//
//}
