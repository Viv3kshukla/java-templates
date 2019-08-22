package examples;

public class Test2 {
	static long sum = 0;
	public static void main(String args[]) throws Exception{
		
		
		Thread t = new Thread(new ThreadTask());
		long startTime = System.nanoTime();
//		
//		for(int i=0;i<=20000000;i++) {
//			sum+=i;						// to process serially
//		}
		
		t.start();
		for(int i=0;i<=10000000;i++) {
			sum+=i;						// to process in parallel
		}
		t.join();
		
		long totTimeInNanos = System.nanoTime() - startTime;
		System.out.println(sum);
		
		System.out.println("Total time in nanos "+ totTimeInNanos);

	}
	
	static class ThreadTask implements Runnable{
		public void run() {
			
			for(int i=10000001;i<=20000000;i++) {
				sum+=i;
			}
			
		}
	}
	
}
