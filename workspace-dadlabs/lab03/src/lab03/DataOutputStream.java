package lab03;

import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream {
	
		public static void main(String[] args) {
			
			// 1. Declaration of target storage
			String targetStorage = "outByteDemo.dat";


			try {

				// 2. Create an output stream between this program and the target storage
				FileOutputStream fosObject = new FileOutputStream(targetStorage);

				// 3. Create write data into stream
				fosObject.write(1);
				fosObject.write(2);
				fosObject.write(3);
				fosObject.write(4);
				fosObject.write(5);
				fosObject.write(6);
				
				// 4. Clear the stream
				fosObject.flush();
				
				// Write more data into stream
				fosObject.write(400);

				// 5. Close the stream
				fosObject.close();  

			} catch (IOException e) {
				
				e.printStackTrace();
			}  

			// Indicate end of program - Could be successful
			System.out.println("End of program.  Check out " + targetStorage + ".");   
		}
	}
