package runnable;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class ArrayThread implements Runnable {

	public void arrayText() {
		String arr[] = {"It","is","recommended","to","use","Calendar","class"};
		Random number = new Random();
		
		// set to avoid duplicate data
		Set<Integer> set = new LinkedHashSet<Integer>();

		while (set.size() < arr.length) {
			set.add(number.nextInt(arr.length));
		}

		Object textArr[] = set.toArray();

		String textOrder = "";
		for (int i = 0; i < arr.length; i++) {
			textOrder += arr[(int) textArr[i]] + " ";
		}
		System.out.println(textOrder);
	}

	public void extractText() {
		
		String text = "Distributed Application Development";
		String a = "";
		char c;
		
		for (int i = 0; i<10; i++) {
			c = text.charAt(i);
			a += c;
			System.out.println(a);
		}
	}

	public void run() {
		Thread currentThreads = Thread.currentThread();		
		if (currentThreads.getName().equals("text"))
			extractText();
		else 
			arrayText();
	}

}
