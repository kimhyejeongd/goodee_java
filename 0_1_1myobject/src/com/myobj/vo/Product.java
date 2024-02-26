package com.myobj.vo;

public class Product {
	public final String num;
	public String name;
	public int price;
	public String color;
	public double sale;
	private static int count;
	
	{num="P_"+(++Product.count);
	}
	public Product(String name,int price) {
		this.name=name;
		this.price=price;
	}
	public Product(String name,int price,String color) {
		this(name,price);
//		this.name=name;
//		this.price=price;
		this.color=color;
	}
	public Product(String name,int price,String color,double sale) {
		this(name, price,color);
//		this.name=name;
//		this.price=price;
//		this.color=color;
		this.sale=sale;
	}
}
