package com.hsbc.bankmanagerservice.model;

public class CustDetails {
	private int accId;
	private int custId;
	private double bal;
	private String cname;
	private String address;
	public CustDetails() {
	}
	public CustDetails(int accId, int custId, double bal, String cname, String address) {
		super();
		this.accId = accId;
		this.custId = custId;
		this.bal = bal;
		this.cname = cname;
		this.address = address;
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
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
