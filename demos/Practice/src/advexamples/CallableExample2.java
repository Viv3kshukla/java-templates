package advexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample2 {
	public static void main(String args[]) throws Exception {
		
		ExecutorService service = Executors.newFixedThreadPool(5);
		System.out.println("Thread Name : "+Thread.currentThread().getName());
		List<Future> futures = new ArrayList<>();
		
		for(int i=0;i<5;i++) {
			Future<Integer> future = service.submit(new CallableTask());
			futures.add(future);
		}
		
		System.out.println("Printing Thread Name : "+Thread.currentThread().getName());
		
		//  5 futures with 5 placeholders
		
		//  perform some unrelated operations 
		
//		List<Integer> results = new ArrayList<>();
		for(int i=0;i<5;i++) {
			Future<Integer> future = futures.get(i);
			try {
				Integer result = future.get();
				System.out.println("Result of future # "+ i + " = "+ result);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	static class CallableTask implements Callable<Integer>{
		public Integer call() {
			return new Random().nextInt(10);
		}
	}
}
