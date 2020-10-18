package com.hsbc.productcatalogservice.model;


public class Product {
	private String pname; 
	private String cat;
	private double price;
	public Product() {
	}
	public Product(String pname, String cat, double price) {
		super();
		this.pname = pname;
		this.cat = cat;
		this.price = price;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
