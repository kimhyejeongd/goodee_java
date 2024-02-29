package com.bs.example.practice.model.vo;

public class Stringtruemethod {
	private char num1;
	
	public Stringtruemethod() {
	}

	public char getNum1() {
		return num1;
	}

	public void setNum1(char num1) {
		this.num1 = num1;
	}
	/*문자 한개를 전달받아 영문자인지  확인
	후 결과를 리턴해주는 매소드 만들기
	true/false*/
	public boolean trueTest(char num1) {
		boolean tr=false;
		if(num1>='A'&&num1<='z') {
			tr=true;
		}
		return tr;
	}
	
}
