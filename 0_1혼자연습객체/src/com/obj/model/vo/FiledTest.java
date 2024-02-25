package com.obj.model.vo;

public class FiledTest {
	//필드 선언하기 
	//접근제한자 예약어 자료형 변수명;
	//접근제한자와 예약어는 필요하지않으면 안써도된다
	//접근제한자 -> 생성된 객체에서 .(접근연산자)으로 접근가능하게 설정(직접접근에 가능하게하기)
	//public,protected,default(생략),private
	public int price=100;
	String name="기본잉름";
	private double height=180.5;
	
	//final예약어 사용하기 -> 초기값을 설정해줘야 한다.
	//직접대입, 초기화블록, 생성자를 이용할 수 있음.
	public final String CLASS_NAME="GDJ79";
	
	//참조형 자료형 필드만들기 =>필드는 참조형 자료형 상관 둘 다 사용 가능하다.
	public int[] numbers;//new int[5];
	public BasicObject obj; //new BasicObject(); //has a관계 객체가 객체를 가지고 있다

	public void test() {
		System.out.println(this.height); //멤버메소드);
	}
}
