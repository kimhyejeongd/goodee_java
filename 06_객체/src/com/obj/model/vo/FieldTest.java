package com.obj.model.vo;

public class FieldTest {
	// 필드선언하기
	// 접근제한자 [예약어] 자료형 변수명;
	// 접근제한자 -> 생성된 객체에서 .(접근연산자)으로 접근이 가능하게 설정
	// public 프로젝트내 어디서든 접근이 가능
	// protected 상속받은 클래스 내부에서 접근 가능
	// default(생략) 같은패키지 내부에서 접근가능
	// private 클래스 내부에서만 접근가능 -> 대부분 이걸로 선언!
	public int price;
	String name;
	private double height=180.5; //heigth=180.5; //오류 위의 {} 에서만 사용할 수 있음
	
	// final예약어 사용하기 -> 초기값을 설정해줘야한다. 
	// 직접대입, 초기화블록, 생성자를 이용할 수 있음.
	//public final String CLASS_NAME; -> NULL들어가기 때문에 오류가남 ( 사용의미가 없어짐 )
	public final String CLASS_NAME="GDJ79";
	
	//참조형 자료형 필드만들기
	public int[] numbers;
	public BasicObject obj=new BasicObject();
	}
	
	


