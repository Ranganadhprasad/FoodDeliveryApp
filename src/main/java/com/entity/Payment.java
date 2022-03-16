package com.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="name")
public class Payment {
      @Id
      @GeneratedValue(strategy=GenerationType.IDENTITY)
	  @Column(name="Payment_id")
      private int paymentid;
      @Column(name="cardnumber")
      private int cardnumber;
      @Column(name="cvv")
      private int cvv;
	public int getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}
	public int getcardnumber() {
		return cardnumber;
	}
	public void setCardnumber(int cardnumber) {
		this.cardnumber = cardnumber;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public String toString() {
		return "Payment [paymentid=" + paymentid + ", cardnumber=" + cardnumber + ", cvv=" + cvv + "]";
	}
      
	
}