package examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrencyClass8 {
	//  This particular of thread pool is used when you want to 
	//  ensure 
	
	// Since there only thread you are ensured that tasks are run sequentially 
	
	
	public static void main(String args[]) {
		ExecutorService service = Executors.newSingleThreadExecutor();
		
		for(int i=0;i<5;i++) {
			service.execute(new Task8());
		}
		System.out.println("Thread Name : "+Thread.currentThread().getName());
		
	}
	
	static class Task8 implements Runnable{
		public void run() {
			System.out.println("Thread Name : "+Thread.currentThread().getName());
		}
	}
	
	
}
