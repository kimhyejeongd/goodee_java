package com.obj.run;

import com.obj.model.vo.ConstructorTest;

public class ConstructorMain {

	public static void main(String[] args) {
		ConstructorTest ct;
		ct=new ConstructorTest();
		ConstructorTest ct2=new ConstructorTest(10,"test");

		System.out.println(ct.num+" "+ct2.num);
		System.out.println(ct2.num+" "+ct2.msg);
		
		ConstructorTest ct3=new ConstructorTest(20);
		
		ConstructorTest ct4=new ConstructorTest("하이");
		
		//매개변수있는 생성자가 선언되어있을때는 기본생성자를 자동으로 생성하지 않음
		
	}

}
