package multithread;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class currentThread extends Thread {
	
	public void printNumbers (String currentThread) {
		
		LocalTime time = LocalTime.now();
		DateTimeFormatter timeformat = DateTimeFormatter.ofPattern("HH:mm:ss");
		String timeFormatted = time.format(timeformat);
		
		for(int i=0; i<10; i++)
		{
			System.out.println("Round " + i + " : " + currentThread + " at " + timeFormatted);;
		}
		
	}
	
	public void run() {
		
		//Get current thread
		Thread currThread = Thread.currentThread();
		
		printNumbers(currThread.getName());
	}

}
