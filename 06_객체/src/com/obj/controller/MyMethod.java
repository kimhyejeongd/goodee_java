package com.obj.controller;

import java.util.Scanner;

public class MyMethod {
	//1.점심 메뉴 뭐먹지? 출력하는 기능
	public void printLunch() {
		System.out.println("점심 메뉴 뭐먹지 ?");
	}
	//2.1부터 10까지 출력하는 기능
	public void printOneToTen() {
		for(int i=0;i<10;i++)
			System.out.println(i+1+" ");
		System.out.println();
	}
	//3.1부터 사용자가 원하는 수(전달받아서)까지 출력하는 기능
	public void printOneToInputNum(int inputNum) {
		for(int i=0;i<inputNum;i++) {
			System.out.println(i+1+" ");
		}
	}
	//4.1부터 5까지 더한수를 반환하는 기능
	public int sumOneToFive() {
		int sum=0;
		for(int i=0;i<5;i++) {
			sum+=i+1;
		}
		return sum;
	}
	//5.사용자에게 5번 메세지를 입력받고 입력받은 메세지를 반환하는 기능
	public String inputMsg() {
		Scanner sc=new Scanner(System.in);
		String total="";
		for(int i=0;i<5;i++) {
			System.out.println("메세지 : ");
			String msg=sc.nextLine()+"\n";
			total+=msg;
		}
		return total;
	}
	//6.숫자두개, 연산자를 전달받아 계산한결과를 반환해주는 기능
	public double calculator(int su, int su2, char op) {
		double result=0.0;
		switch(op) {
		case '+' : result=su+su2;break;
		case '-' : result=su=su2;break;
		case '*' : result=su*su2;break;
		case '/' : result=su/(double)su2;break;
		}
		return result;
	}
	//7.문자열을 전달받아 문자열의 중복값여부를 반환하는 기능
	public boolean checkString(String str) {
		//boolean flag=false;
		//a:
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<i;j++) {
				if(str.charAt(i)==str.charAt(j)) {
					//flag=true;
					//break a;
					return true;
				}
			}
		}
		//return flag;
		return false;
	}

}
