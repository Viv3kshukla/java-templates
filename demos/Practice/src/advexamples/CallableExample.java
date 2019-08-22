package advexamples;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
	public static void main(String args[]) throws Exception {
		
		ExecutorService service = Executors.newFixedThreadPool(5);
		
//		for(int i=0;i<5;i++) {
//			service.execute(new Task9());
//		}
		
		
		
		Future<Integer> future = service.submit(new Task9());
		
		// Future is just a placeholder for the value which will arrive
		// sometime in the future .
		// How much time ? you are not sure .
		

		//	perform some unrelated operations 
		
		
		Integer result = future.get();// blocking operation  until the future is ready to return a particular value
		
		System.out.println("Printing result "+ result);
		
		System.out.println("Thread Name : "+Thread.currentThread().getName());
		

		
		
	}
	
	static class Task9 implements Callable<Integer> {
		@Override
		public Integer call() throws Exception{
			Thread.sleep(3000);
			return new Random().nextInt();
		}
	}
	
}
