package examples;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ConcurrencyClass7 {
	public static void main(String args[]) {
		
		ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
		
		service.schedule(new Task7(), 1, TimeUnit.SECONDS);
		service.scheduleAtFixedRate(new Task7(), 3, 1, TimeUnit.SECONDS);
		service.scheduleWithFixedDelay(new Task7(), 5, 1, TimeUnit.SECONDS);
		
		System.out.println("Thread Name : "+ Thread.currentThread().getName());
	
	}
	
	static class Task7 implements Runnable{
		public void run() {
			System.out.println("Thread Name : "+Thread.currentThread().getName());
			
		}
	}
	
	
}
