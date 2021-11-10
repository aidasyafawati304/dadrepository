package lab04_TCPBasedTranslationServer;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class translationServer {
	
	public static void main (String[] args) throws IOException{
		
		ServerSocket serverSocket = null;
		
		
			//Bind ServerSocket to a port
			int portNo = 4228;
			serverSocket = new ServerSocket(portNo);
			
			//Accept client request for connection
			Socket clientSocket = serverSocket.accept();
			
			DataInputStream dis = new DataInputStream(clientSocket.getInputStream());
			BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
			DataOutputStream dos = new DataOutputStream(clientSocket.getOutputStream());
			Translation t = new Translation();
	
			
			while(true) {
				
				String hai = dis.readUTF();
				System.out.println("hai");
				String input = t.Translate(hai);
				System.out.println(input);
				
				dos.writeUTF(input);	
				
			}
		}			
			
	}


