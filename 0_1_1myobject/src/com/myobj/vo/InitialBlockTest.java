package com.myobj.vo;

import java.util.Date;

public class InitialBlockTest {
	//원래 클래스는 역할에 따른 기능이 있어야 생성함 
	public final String empNo;
	public String name="유병승";
	public int age=19;
	public char gender='여';
	public static int count;
	
	//초기화블록을 이용해서 필드값을 초기화
	{
		//인스턴스 초기화 블록
		System.out.println("인스턴스 초기화 블록 실행");
	//필드값을 초기화 특정 로직을 통해서 초기화할 경우
	name="초기화";
	int ageTemp=(int)(Math.random()*3);
	switch(ageTemp) {
	case 0: age=13;break;
	case 1: age=23;break;
	case 2: age=36;break;
	}
	char[] genderTemp= {'남','여'};
	gender=genderTemp[(int)(Math.random()*2)];
	//회원번호, 사원번호, 상품번호
	//empNo="BS_"+new Date()+"_"+(int)(Math.random()*1000);
	
	//객체 생성 수 확인
//	int count=0; //인스턴스블럭이 실행되면 사라지기 때문에 사용 x
	empNo="Bs_"+InitialBlockTest.count++;
	}
	
	//static 초기화 블록
	//static필드(클래스변수)를 초기화 할 때 사용
	//static{초기화 내용설정} 
	static {
		System.out.println("static초기화 블록");
		count=100;
	}
}

