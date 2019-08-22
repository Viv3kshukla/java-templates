package examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrencyClass4 {
	
	public static void main(String args[]) {
		int coreCount = Runtime.getRuntime().availableProcessors();
		
		// get count of available cores
		ExecutorService service = Executors.newFixedThreadPool(coreCount);
		
		// submit the task for execution 
		for(int i=0;i<100;i++) {
			service.execute(new CPUIntensiveTask());
		} 
		
	}
	
	static class CPUIntensiveTask implements Runnable{
		public void run() {
			// some CPU intensive task
			
		}
	}
	
	
}
