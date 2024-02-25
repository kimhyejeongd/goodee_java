package com.myobj.run;

import com.myobj.vo.InitialBlockTest;

public class InitialMain {

	public static void main(String[] args) {
		System.out.println(InitialBlockTest.count);
		for(int i=0;i<5;i++) {
		InitialBlockTest ibt=new InitialBlockTest();
		System.out.println(ibt.name);
		System.out.println(ibt.age);
		System.out.println(ibt.gender);
		System.out.println(ibt.empNo);
		System.out.println("객체 생성수 : "+InitialBlockTest.count);
		}
	}

}
