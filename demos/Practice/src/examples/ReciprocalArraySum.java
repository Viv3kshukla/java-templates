package examples;

import java.util.Scanner;

public class ReciprocalArraySum {
	
	
	public static void main(String args[]) {
		System.out.println("Begin");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		double [] list = new double[x];
		for(int i=0;i<x;i++) {
			list[i] = scan.nextDouble();
		}
		
		double var1 = seqArraySum(list);
		double var2 = parArraySum(list);
		scan.close();
	}
	
	
	public static double sum1,sum2;
	
	public static double seqArraySum(double [] X) {
		
		long startTime = System.nanoTime();
		
		sum1 = 0;
		sum2 = 0;
		
		for(int i=0;i<X.length/2;i++) {
			sum1+= 1/X[i];
		}
		
		for(int i=X.length/2;i<X.length;i++) {
			sum2+=1/X[i];
		}
		
		double sum = sum1+sum2;
		long timeInNanos = System.nanoTime() - startTime;
		
		printResults("seqArraySum",timeInNanos, sum);
		
		return sum;
		
	}
	
	
	
	
	public static double parArraySum(double [] X) {
		long startTime = System.nanoTime();
		sum1 = 0;
		sum2 = 0;
		
		for(int i = 0;i < X.length/2;i++) {
			sum1+=1 / X[i];
		}
		
		for(int i = X.length/2;i < X.length;i++) {
			sum2+=1 / X[i];
		}
		
		double sum = sum1 + sum2;
		
		long timeInNanos = System.nanoTime() - startTime;
		
		printResults("parArraySum ",timeInNanos, sum);
		
		return sum;
		
	}
	
	private static void printResults(String name, long timeInNanos,double sum) {
		System.out.printf(" %s  completed in %8.3f milliseconds , with sum = %8.3f \n", name ,timeInNanos/1e6, sum);
		
	}
	
	
	
}
