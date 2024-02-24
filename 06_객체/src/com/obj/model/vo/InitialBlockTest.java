package com.obj.model.vo;
import java.util.*;
public class InitialBlockTest {
	public final String empNo;
	public String name="유병승";
	public int age=19;
	public char gender='여';
	public static int count;
	
	//초기화블록을 이용해서 필드값을 초기화
	{
		
		//인스턴스 초기화블록
		System.out.println("인스턴스 초기화블록 실행");
		//필드값을 초기화 특정 로직을 통해서 초기화할 경우
		name="초기화";
		int ageTemp=(int)(Math.random()*5);
		switch(ageTemp){
			case 0: age=13;break;
			case 1: age=23;break;
			case 2: age=36;break;
		}
		char[] genderTemp= {'남','여'};
		gender=genderTemp[(int)Math.random()*2];
		// 회원번호, 사원번호, 상품번호
		//empNo="BS_"+new Date()+"_"+(int)(Math.random()*1000);
		
		//객체 생성 수 확인
		//int count=0;
		empNo="BS_"+InitialBlockTest.count++;
		
	}
	//static 초기화 블록
	//static필드(클래스 변수)를 초기화할때 사용
	//statci{초기화 내용설정}
	static {
		System.out.println("static초기화 블록");
		//name="되니?";
		count=100;
	}
}
