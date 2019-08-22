package examples;

public class ConcurrencyClass2 {
	public static void main(String args[]) {
		System.out.println("Concurrency Class 2 ");
		for(int i=0;i<5;i++) {
			Thread t2 = new Thread(new Task2());
			t2.start();
		}
		System.out.println("Thread Name : "+Thread.currentThread().getName());
		
	}
	
	static class Task2 implements Runnable{
		public void run() {
			System.out.println("Thread Name : "+Thread.currentThread().getName());
		}
	}
	
}
