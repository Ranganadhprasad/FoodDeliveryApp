package com.entity;



import java.util.function.Supplier;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Address {
	
	@Id
	
	private int cid;
	
	@NotNull
	@Size(max=30)
	private String cname;
	
	
	private int rid;
	
	@NotNull
	@Size(max=30)
	private String fooditeam;
	
	@NotNull
	
	private int price_total_bill;
	
	@NotNull
	
	private int Payment;
	
	@NotNull
	@Size(max=50)
	private String Baddress;
	
	@NotNull
	@Size(min=10,max=10)
    @Pattern(regexp="^[0-9]+$")
	private String rphone;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getFooditeam() {
		return fooditeam;
	}

	public void setFooditeam(String fooditeam) {
		this.fooditeam = fooditeam;
	}

	public int getPrice_total_bill() {
		return price_total_bill;
	}

	public void setPrice_total_bill(int price_total_bill) {
		this.price_total_bill = price_total_bill;
	}

	public int getPayment() {
		return Payment;
	}

	public void setPayment(int payment) {
		Payment = payment;
	}

	public String getBaddress() {
		return Baddress;
	}

	public void setBaddress(String baddress) {
		Baddress = baddress;
	}

	public String getRphone() {
		return rphone;
	}

	public void setRphone(String rphone) {
		this.rphone = rphone;
	}

	@Override
	public String toString() {
		return "Address [cid=" + cid + ", cname=" + cname + ", rid=" + rid + ", fooditeam=" + fooditeam
				+ ", price_total_bill=" + price_total_bill + ", Payment=" + Payment + ", Baddress=" + Baddress
				+ ", rphone=" + rphone + "]";
	}

	
	
}