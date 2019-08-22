package examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test1 {
	
	static long sum = 0;
	public static void main(String args[]) throws Exception {
		
		ExecutorService service = Executors.newSingleThreadExecutor();
		long startTime = System.nanoTime();

		service.execute(new DivideTask());
		for(int i=0;i<=10000000;i++) {
			sum+=i;
		}
		
		service.shutdown();
		while (!service.awaitTermination(24L, TimeUnit.HOURS)) {
		    System.out.println("Not yet. Still waiting for termination");
		}

		long totTimeInNanos = System.nanoTime() - startTime;
		
		System.out.println("Total time taken is : "+totTimeInNanos);
		System.out.println(sum);
		
//		Thread.sleep(100);
		
	}
	static class DivideTask implements Runnable{
		public void run() {
			for(int i=10000001;i<=20000000;i++) {
				sum+=i;
			}
			return;
		}
	}
	
}
