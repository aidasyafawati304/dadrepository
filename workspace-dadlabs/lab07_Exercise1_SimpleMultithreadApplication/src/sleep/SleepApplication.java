package sleep;

public class SleepApplication {
	
	public static void main(String[] args) {
		
		
		//Create object of runnable
		Runnable statement1 = new Sleep();
		Runnable statements2 = new Sleep();
		Runnable statements3 = new Sleep();
		
		
		//create object of thread
		Thread word1 = new Thread(statement1, "word1");
		Thread word2 = new Thread(statements2, "word2");
		Thread text = new Thread(statements3, "text");
		
		//execute thread
		word1.start();
		text.start();
		word2.start();
	}

}
