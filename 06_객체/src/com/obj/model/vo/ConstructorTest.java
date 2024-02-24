package com.obj.model.vo;

public class ConstructorTest {

	public int num;
	public String msg;
	
	// 생성자 선언
	// 접근제한자 클래스명([매개변수,매개변수....]){로직}
	public ConstructorTest() { 
		System.out.println("기본생성자");
	} // 기본 생성자
	
	// 매개변수 있는 생성자 선언
	// 외부(호출하는 곳)에서 보내준 값을 필드에 저장하는 기능
	// 일반적으로 매개변수로 선언해서 받는 값은 필드에 선언된것과 동일하게 설정
	public ConstructorTest(int num, String msg) {
		System.out.println("매개변수 있는 생성자");
		System.out.println("su :"+" "+num+"" +"str : "+msg);
		this.num=num;
		this.msg=msg;
	}
	public ConstructorTest(int num) {
		this("호호");
		this.num=num;
		
	}
	public ConstructorTest(String msg) {
		this.msg=msg;
	}
	
}
