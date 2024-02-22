package com.obj.model.vo;

public class SubMain {

	public static void main(String[] args) {
		new DefaultObject();
		FieldTest ft=new FieldTest();
		System.out.println(ft.price);
		System.out.println(ft.name);
		//System.out.println(ft.height); 같은 클래스 내에서만 사용가능
		ft.name="유병승";
		System.out.println(ft.name);

	}

}
