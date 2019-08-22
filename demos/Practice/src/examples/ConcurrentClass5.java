package examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentClass5 {
	public static void main(String args[]) {
		
		ExecutorService service =  Executors.newFixedThreadPool(100);
		
		for(int i=0;i<100;i++) {
			service.execute(new IOTask());
		}

	}
	
	static class IOTask implements Runnable{
		public void run() {
			// some IO opetrations which will cause thread to block / wait 
		}
	}
	
}


// Some IO intensive calls

// database calls
// http calls
// Network calls