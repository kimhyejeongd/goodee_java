package com.member.vo;

public class Product {
	public String proNumber;
	public String name;
	public long price;
	public String color;
	public double discount;
	
	public static int count;
	{
		proNumber="P_"+Product.count++;
	}
	public Product(String name, long price) {
		this.name=name;
		this.price=price;
		
	}
	public Product(String name,long price,String color) {
		this.name=name;
		this.price=price;
		this.color=color;
	}
	public Product(String name, long price, String color, double discount) {
		this.name=name;
		this.price=price;
		this.color=color;
		this.discount=discount;
	}
}
