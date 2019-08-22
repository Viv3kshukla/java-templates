//package examples;
//
//import java.util.concurrent.ForkJoinPool;
//
//public class ForkJoinReciprocalArraySum {
//	
//	public static double seqArraySum(double [] X) {
//		long startTime = System.nanoTime();
//		double sum = 0;
//		for(int i=0;i<X.length;i++) {
//			sum+=1/X[i];
//		}
//		long timeInNanos = System.nanoTime() - startTime;
//		printResults("seqArraySum",timeInNanos,sum);
//		
//		return sum;
//		
//	}
//	
//	public static double parArraySum(double [] X) {
//		long startTime = System.nanoTime();
//		SumArray t = new SumArray(X,0,X.length);
//		ForkJoinPool.commonPool().invoke(t);
//		double sum = t.ans;
//		long timeInNanos = System.nanoTime() - startTime;
//		printResults("parArraySum",timeInNanos,sum);
//		
//		return sum;
//	}
//	
//	private static void printResults(String name,long timeInNanos,double sum) {
//		
//		
//		System.out.printf(" %s  completed in  %8.3f , with sum = %8.3f\n",name,timeInNanos,sum);
//		
//	}
//	
//	public static void main(())
//	
//	
//	
//}
