package examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrencyClass6 {
	public static void main(String args[]) {
		
		ExecutorService service = Executors.newCachedThreadPool();
		
		for(int i=0;i<5;i++) {
			service.execute(new Task6());
		}
		
		System.out.println("Thread Name "+Thread.currentThread().getName());
		
	}

	static class Task6 implements Runnable {
		public void run() {
			System.out.println("Thread Name "+ Thread.currentThread().getName());
		}
	}

}
