package examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//  ThreadPool uses blocking queue because we want it to be thread safe

public class ConcurrencyClass3 {
	public static void main(String args[]) {
		ExecutorService service = Executors.newFixedThreadPool(5);
		
		for(int i=0;i<5;i++) {
			service.execute(new Task3());
		}
		 
		System.out.println("Thread's Name : "+ Thread.currentThread().getName());
	}
	
	static class Task3 implements Runnable{
		public void run() {
			System.out.println("Thread's Name : "+ Thread.currentThread().getName());
		}
	}
}
