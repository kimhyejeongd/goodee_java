package com.myobj.run;

import com.myobj.vo.ConstructorTest;

public class ConstructorMain {

	public static void main(String[] args) {
		ConstructorTest ct;
		ct=new ConstructorTest(); // 기본생성자를 실행한 것
		ConstructorTest ct2=new ConstructorTest(10,"test");
		
		System.out.println(ct.num+" "+ct.msg);
		System.out.println(ct2.num+" "+ct2.msg);
		
		ConstructorTest ct3=new ConstructorTest(20);
		
		ConstructorTest ct4=new ConstructorTest("하이");
	}

}
