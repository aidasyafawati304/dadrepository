package multithread;

public class MultithreadingApp {
	
	public static void main(String[]args) {
		
		//create object of thread with current time
		Thread thread1 = new currentThread();
		Thread thread2 = new currentThread();
		
		
		//create object of thread name
		Thread currThread1 = new Thread(thread1, "currThread1");
		Thread currThread2 = new Thread(thread2);
		
		
		//execute thread
		currThread1.start();
		currThread2.start();
		
	}

}
