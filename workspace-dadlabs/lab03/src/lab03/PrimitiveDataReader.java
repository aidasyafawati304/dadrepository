package lab03;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * This program demonstrate reading byte-based data as it intended type 
 * it is using DataInputStream.
 * 
 * The data represents 6 days reading of daily rainfall in Melaka 
 * 
 * The program calculates the average raifall in Melaka from selected station Cheng (Taman Merdeka) and display it on the console.
 * @author aida
 *
 */

public class PrimitiveDataReader {

	public static void main(String[] args) {

		// 1. Declare output file 
		String sourceFile = "bedUtilization1.txt";
		System.out.println("Reading data from " + sourceFile + "\n");

		try {

			// 2. Create stream to read data
			DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile));

			// Variables for processing byte-based data
			double rainfall = 0;
			double totalrainfall = 0;
			int noOfRecords = 0;
			String date = "";
			
			// 3. Process data until end-of-file
			while(dis.available() > 0) {
				
				// Read data
				date = dis.readUTF();
				rainfall = dis.readDouble();
				System.out.println( date + "\t" + rainfall);
				
				// Calculate total rainfall
				totalrainfall += rainfall;
				noOfRecords ++;
			}
			
			// 4. Close stream
			dis.close();
			
			// Calculate average rainfall
			double averagerainfall = totalrainfall / noOfRecords;
			String formattedAverage = String.format("%.1f", averagerainfall);
			System.out.print("\nAverage rainfall for " + noOfRecords 
					+ " date: " + formattedAverage + "%");
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}

		// Indicate end of program - Could be successful
		System.out.println("\nEnd of program.");
		

	}

}
