package com.bs.example.practice.model.vo;

public class Stringmethod {
	private String num1;
	private String num2;
	
	public Stringmethod() {
		
	}

	public Stringmethod(String num1, String num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public String getNum1() {
		return num1;
	}

	public void setNum1(String num1) {
		this.num1 = num1;
	}

	public String getNum2() {
		return num2;
	}

	public void setNum2(String num2) {
		this.num2 = num2;
	}
	public String sum(String num1,String num2) {
		String result;
		result=this.num1+this.num2;
		return result;
	}
}
	