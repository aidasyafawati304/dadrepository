package lab04_TCPBasedTextProcessingClient;


import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class ClientTextProcessing {
	
	public static void main(String[] args) throws UnknownHostException, 
	IOException {

	
	int c;;
	String input;
	Scanner sc=new Scanner(System.in);
	Socket soc = new Socket(InetAddress.getLocalHost(), 4228);
	Scanner sc1=new Scanner(soc.getInputStream());
	System.out.println("Please enter word: ");
	input=sc.nextLine();
	PrintStream p=new PrintStream(soc.getOutputStream());
	p.println(input);
	
	c=sc1.nextInt();
	System.out.println(c);
	

}

}
