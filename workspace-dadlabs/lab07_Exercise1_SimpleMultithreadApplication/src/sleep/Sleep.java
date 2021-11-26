package sleep;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Sleep implements Runnable {

	// To detect word1 running status
		private static boolean status = false;
		
		/**
		 * This method will reorder the sentence in random order
		 */
		public void arrayText() {
		
			String arr[] = {"It","is","recommended","to","use","Calendar","class"};
			Random number = new Random();
			// set is used to avoid duplicate data
			Set<Integer> set = new LinkedHashSet<Integer>();

			while (set.size() < arr.length) {

				set.add(number.nextInt(arr.length));
			}

			Object textArr[] = set.toArray();

			String textOrder = "";
			for (int i = 0; i < arr.length; i++) {
				status = true;
				textOrder += arr[(int) textArr[i]] + " ";
				System.out.println(textOrder);
			}		
		}

		public void arrayText(String threads) {
			
				String arr[] = { "It", "is", "recommended", "to", "use", "Calendar", "class" };
				Random num = new Random();
				// set is used to avoid duplicate data
				Set<Integer> set = new LinkedHashSet<Integer>();

				while (set.size() < arr.length) {

					set.add(num.nextInt(arr.length));
				}

				Object textArr[] = set.toArray();

				String textOrder = "";
				for (int i = 0; i < arr.length; i++) {
					textOrder += arr[(int) textArr[i]] + " ";
					try {	
						if (status == true) {
							// suspend current thread for 5 seconds
							System.out.println("\n\n"+ threads + " is sleeping\n\n");
							Thread.sleep(5000);
							status = false;
						}

					} catch (InterruptedException e) {

						e.printStackTrace();
					}
					System.out.println(threads + " : " + textOrder);
				}
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

		@Override
		public void run() {
			Thread currentThread = Thread.currentThread();
			String name = currentThread.getName();
			if (name.equals("text"))
				extractText();
			else if (name.equals("word1"))
				arrayText();
			else
				arrayText(currentThread.getName());
		}

}
