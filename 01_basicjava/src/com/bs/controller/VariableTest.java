package com.bs.controller;

public class VariableTest {
	public static void main(String[] args) {
		// 변수선언하기
		// 자료형 변수명;
		// 논리형 데이터를 저장하는 변수선언하기
		// 저장할 수 있는 데이터 : true, false
		boolean flag;
		flag=true;//////
		flag=false;
		// 문자를 저장하는 변수 선언하기
		char gender;
		gender='남';
		gender='여';
		
		int age;
		age=19;
		
		long stock;
		stock=10000000000L;
		
		float weight;
		weight=65.5f;
		
		double height;
		height=180.5;
		
		String name;
		name="유병승";
		
		//명명규칙
		String testg;
		// int double;
		
		// char 1gender;
		char gender1;
		
		int num_ber;
		int num$ber;
		int _number;
		/*int ^number;
		int num^ber;*/
		
		String studentName;
		String studentname; // 관례상 x
		
		// 변수명은 중복되면 안됨! * 같은 영역에 있을 때
		
		// 변수에 저장된 값을 가져오기
		// 변수명을 작성하면 변수에 저장된 값을 가져옴.
		System.out.println(flag);
		System.out.println(name);
		
		/*String name1;
		String name2;
		String name3;
		Stirng name4;*/
		String name1,name2,name3,name4;
		
		long salary=1000000L;
		
		String test1="";
		String test2=null;
		
		char chtest=' ';
		
		
		// 상수 활용ㅇ하기
		final int AGE=19;
		
		// 변수에 저장도니 값을 다른 변수에 저장
		String hobby="게임";
		
		String hobby2=hobby;
		
		//hobby2=age;
		
		
		
		
	}// main
	int studentName;
}
