package com.iu.s2_test;

public class SmartPhone {

	
	private String brand;
	private String color;
	private int price;
	
	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public SmartPhone(String brand,String color,int price) {
		// TODO Auto-generated constructor stub
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	
	
	
}
