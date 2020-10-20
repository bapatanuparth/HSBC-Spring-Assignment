package com.hsbc.bankmanagerservice.model;

public class Customer {
	private int custId;
	private String cname;
	private String address;
	public Customer() {
	}
	public Customer(int custId, String cname, String address) {

		this.custId = custId;
		this.cname = cname;
		this.address = address;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
