package runnable;

public class ArrayThreadApplication {
	
public static void main(String[] args) {
		
		// Create object of Runnable
		Runnable statement1 = new ArrayThread();
		Runnable statement2 = new ArrayThread();
		Runnable statement3 = new ArrayThread();
		
		// Create object of Thread
		Thread word1 = new Thread (statement1, "word1");
		Thread word2 = new Thread (statement2, "word2");		
		Thread text  = new Thread (statement3, "text");
		
		//execute thread
		word1.start();
		word2.start();
		text.start();
	}

}
