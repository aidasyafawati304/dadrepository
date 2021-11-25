package listobject;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import parcel.Parcel;
import parcel.ParcelManager;

public class ListParcelServerApp {
	
	public static void main(String[] args) {
		
		ParcelManager parcelManager = new ParcelManager();
		
		System.out.println("\n\nStarting ListParcelsServerApp");
		
		try {
			
			//Bind serversocket to port
			int portNo = 4229;
			ServerSocket serverSocket = new ServerSocket(portNo);
			
			//server need to be alive
			while(true) {
				
				//Accept client request for connection
				Socket clientSocket = serverSocket.accept();
				
				//Read object from clinet, cast into Parcel
				ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
				List<Parcel> parcels = (List<Parcel>)ois.readObject();
				System.out.println("Processing object from client: " + parcels.size());
				
				//Process object
				List<Parcel> completeParcels = new ArrayList<Parcel>();
				int totalWeight = 0;
				for (Parcel parcel:parcels) {
					
					Parcel completeParcel = parcelManager.createParcel(parcel);
					completeParcel.add(completeParcel);
					
					//update totalWeight
					totalWeight += completeParcel.getParcel();
				}
				
				//return object to clinet using input stream
				ObjectOutputStream oos = new
			}
		}
	}

}
