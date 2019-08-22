package examples;

public class ConcurrencyClass1 {
	public static void main(String args[]) {
		System.out.println("Concurrency Class 1 ");
		Thread thread1 = new Thread(new Task());
		thread1.start();
		System.out.println("Thread name : "+ Thread.currentThread().getName());
	}
	
	static class Task implements Runnable{
		public void run() {
			System.out.println("Thread name : "+Thread.currentThread().getName());;
		}
	}
	
}
