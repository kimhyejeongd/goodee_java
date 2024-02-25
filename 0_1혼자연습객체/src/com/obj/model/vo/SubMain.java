package com.obj.model.vo;

public class SubMain {
	public static void main(String[] args) {
		new DefaultObject();
		FiledTest ft=new FiledTest();
		System.out.println(ft.price);
		System.out.println(ft.name);
		ft.name="유병승";
		System.out.println(ft.name);
	}
	
}
