package parcel;

import java.io.Serializable;

public class Parcel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public int parcel;
	private double weight;
	private double price;
	
	public int getParcel() {
		return parcel;	
	}
	
	public void setParcel(int parcel) {
		this.parcel = parcel;
	}
	
	private double getWeight() {
		return weight;
	}
	
	private void setWeight(double weight) {
		this.weight = weight;
	}
	
	private double getPrice() {
		return price;
	}
	
	private void setPrice(double price) {
		this.price = price;
	}

}
