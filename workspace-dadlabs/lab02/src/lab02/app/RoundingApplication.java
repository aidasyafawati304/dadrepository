package lab02.app;

import lab02.rounding.RoundingManager;

/**
 * This application rounding the number to the nearest decimal points.
 *
 * @author aida
 *
 */


public class RoundingApplication {
	
	public static void main(String[]args) {
		System.out.println("Mian entry point of RoundingApplication");
		
		int divident = 200;
		int divisor = 357;
		RoundingManager roundManager = new RoundingManager();
		double value = roundManager.calculatePercentage(divident,divisor);
		
		System.out.println("Progress from " + divisor + "/"
				+ divident + " " + value + "%");
		
		int decimalPoint = 2;
		
		System.out.println("Round to " + decimalPoint + " decimal points:"
				+ roundManager.roundValue(value,decimalPoint) + "%");
		
		decimalPoint = 0;
		System.out.println("Round to " + decimalPoint + " decimal points: "
				+ roundManager.roundValue(value,decimalPoint) + "%");
		
		
	}

}