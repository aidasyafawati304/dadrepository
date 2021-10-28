package lab03;

import java.io.FileInputStream;

public class ReadByte {

	public static void main(String[]args) {
		
		//1. Declare of input source
		String fileName = "outByteDemo.dat";
		
		//2. Declare input stream object
		FileInputStream fisObject;
		
		System.out.println("Input from " + fileName + "\n");
		
		try {
			
		//3. Create object
		fisObject = new FileInputStream (fileName);
		
		
			
		//4. Read value from stream
		int value = 0;
		value = fisObject.read();
		//-1 Read until end of file
		while (value != -1) {
			System.out.println(value);
			
			//read next value 
			value=fisObject.read();
		}
		
		
		//5. Close stream
		fisObject.close();
			
			
		}catch (Exception ex) {
			ex.printStackTrace();
			
		}
		
		//End of program
		System.out.println("\nEnd of program");
		
	}
	
	
	
}
