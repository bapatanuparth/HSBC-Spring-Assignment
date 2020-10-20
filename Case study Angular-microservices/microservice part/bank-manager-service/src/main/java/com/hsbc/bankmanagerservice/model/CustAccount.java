package com.hsbc.bankmanagerservice.model;

public class CustAccount {
	private int accId;
	private int custId;
	private double bal;
	public CustAccount() {
	}
	public CustAccount(int accId, int custId, double bal) {
		super();
		this.accId = accId;
		this.custId = custId;
		this.bal = bal;
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
	

}
