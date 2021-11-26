package parcelApp.payment;

import java.sql.Timestamp;

public class Payment {
	
	//Declare attributes
	private int paymentId;
	private Timestamp transactionDate;
	private Staff recordedBy;
	
	public int getPaymentId() {
		return paymentId;
	}
	
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	
	public Timestamp getTransactionDate() {
		return transactionDate;
	}
	
	public void setTransactionDate(Timestamp transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	public Staff getRecordedBy() {
		return recordedBy;
	}
	
	public void setRecordedBy(Staff staff) {
		this.recordedBy = recordedBy;
	}

}
