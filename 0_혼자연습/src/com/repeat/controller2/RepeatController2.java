package com.repeat.controller2;
import java.util.Scanner;
public class RepeatController2 {
	public void basicRepeat() {
		//1~10 짝수만 출력
		for(int i=1;i<11;i++) {
			if(i%2==0) {
				System.out.println(i+" ");		
			}
		}
		//100부터1까지 출력하기
		for(int i=100;i>=1;i--) {
			System.out.println(i);
		} 
		//반친구들의 이름을 5명 입력받고 출력하는 기능 구현하기
		Scanner sc=new Scanner(System.in);
		String nic="";
		for(int i=0;i<6;i++) {
			System.out.println("친구이름 : ");
			nic=sc.next();
			System.out.println(nic);
		
		}
	
		// 한줄로 입력한 이름만 표시할 때
		String name="";
		for(int i=0;i<6;i++) {
			System.out.print("친구이름 : ");
			name+=sc.next()+" ";
			System.out.println(name);
		}
		
	}
	public void inputMsg() {
		Scanner sc=new Scanner(System.in);
		String msg="";// for문안에 쓰면 계속 반복되기때문에 누적이 안됨	
		for(;!msg.equals("exit");) {
		System.out.println("문자입력 : ");
		msg=sc.next();
		System.out.println(msg);
		}
		//test문자열에 대문자가 있는지 확인하는 기능
		String test="aAkajJ";
		String result="";
		for(int i=0;i<6;i++) {ㅇㅇㅇ
			char ch=test.charAt(i);
			if('A'<=ch&&ch<='Z') {
				System.out.println(ch+"는 대문자");
			}else {
					System.out.println(ch+"는 소문자");
				}
					System.out.println(result);
			}
		// 입력받은 문자열에 소문자가 있는지 확인하기
		}
	}

