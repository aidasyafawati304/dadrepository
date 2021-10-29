package lab03;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Exercise4_PrimitiveDataGenerator {
	
public static void main(String[] args) {
		
		
		// 1. Declare output file 
		String outFile = "dataRainfall.txt";
		
		// Data declaration
		//---------------String name[] = Hospital Jasin;
		String date[] = {"22Oct", "23Oct", "24Oct", "25Oct", "26Oct", "27Oct"};
		double rainfall[] = {0.0, 0.0, 0.0, 0.0, 0.0, 8.0};
		
		try {
			
			// 2. Create stream to read data
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));
			
			// Process data
			for (int index = 0; index < date.length; index++) {
				
				// 3. Write data into data stream
				//------------dos.writeUTF(name[index]);
				dos.writeUTF(date[index]);
				dos.writeDouble(rainfall[index]);
				
				// 4. Flush for each writing
				dos.flush();
			}
			
			// 5. Close stream
			dos.close();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		
		// Indicate end of program - Could be successful
		System.out.println("End of program. Check out " + outFile); 
	}

}
