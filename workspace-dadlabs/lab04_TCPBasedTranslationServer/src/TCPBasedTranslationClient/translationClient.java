package TCPBasedTranslationClient;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;



public class translationClient {
	
	public static void main(String[] args)throws UnknownHostException, 
	IOException { 
		
		
		Socket socket = new Socket (InetAddress.getLocalHost(), 4228);
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			String eng = "", 
					malay = "", 
					arabic = "", 
					korean = "";
			
				System.out.println("masuk");
				dos.writeUTF(null);
				String hai = dis.readUTF();
				
			}
		
		}
				
				
	
}
			
			
		
