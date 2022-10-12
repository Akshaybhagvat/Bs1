package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Banking 
{
    @Id
    private int accno;
    private String name;
    private String address;
    private long contact;
    private double balance;
    
	public Banking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Banking(int accno, String name, String address, long contact, double balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.balance = balance;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	} 
    
}
