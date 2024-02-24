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
		for(int i=0;i<5;i++) {
			System.out.println("친구이름 : ");
			nic=sc.next();
			System.out.println(nic);
		
		}
	
		// 한줄로 입력한 이름만 표시할 때
		String name="";
		for(int i=0;i<5;i++) {
			System.out.print("친구이름 : ");
			name+=sc.next()+" ";
		
		}
		System.out.println(name);

		//사용자에게 숫자를 5개 입력받고 입력받은 숫자의 총합을 출력하기
		int sum= 0;
		for(int i=0;i<5;i++) {
			System.out.println("숫자 입력 : ");
			int numm=sc.nextInt();
			sum+=numm;
	}
		System.out.println("합계 : "+sum);
	}
	public void inputMsg() {	
		// 사용자에게 메세지를 입력받고 출력하는 기능 구현
		// 사용자가 exit 라는 메세지를 입력받을 때 까지 입력받고, 
		// 입력 내용을 한번에 출력하기
		// public void inputMsg()		
		Scanner sc=new Scanner(System.in);
		String sum="";
		String msg="";
		for(;!msg.equals("exit");) {
			System.out.println("내용 입력 : ");
			msg=sc.nextLine();
			System.out.println(msg);
			if(!msg.equals("exit")){
				sum+=msg;
			}
		}
			System.out.println(sum);
		// for문 응용해보기
			// 1부터 사용자가 입력한 수가지 출력하기
			System.out.println("숫자 : ");
			int input=sc.nextInt();
			for(int i=1;i<=input;i++) {
				System.out.print(i+" ");
			}
			System.out.println();}
			

			public void empInputData() {
			// 사원정보를 입력받는 기능구현하기
			// 3명의 사원의 정보를 입력받고 출력하는 기능
			// 입력정보 : 이름, 나이, 성별, 급여,보너스(실수)
			// 입력한 정보를 한번에 출력하게 구현 
			// 예) 유병승 19 남 100 0.2
			//    홍길동 24 남 50 0.3
			// 버전업 사용자가 원하는 만큼 사원정보 입력 후 출력하기
				///-> 버전업 수정
			Scanner sc=new Scanner(System.in);
			String sum="";
			///int count=sc.nextInt();
			for(int i=0;i<3;i++) { /// => for(int i=0;i<count;i++)
				System.out.println("이름을 입력하세요");
				String name=sc.next();
				System.out.println("나이를 입력하세요 ");
				int age=sc.nextInt();
				System.out.println("성별을 입력하세요");
				char gender=sc.next().charAt(0);
				System.out.println("급여를 입력하세요");
				double sal=sc.nextDouble();
				System.out.println("보너스를 입력하세요");
				double bonus=sc.nextDouble();
				sum+=name+" "+age+" "+gender+" "+sal+" "+bonus;
			}
			System.out.println(sum);

		}
		public void forApp2() {
			
		//test문자열에 대문자가 있는지 확인하는 기능
		String test="aAkajJ";
		String result="";
		for(int i=0;i<6;i++) {
			char ch= test.charAt(i);
			System.out.println(ch);
			if('A'<=ch&&ch<='Z') {
				System.out.println(ch+ "는 대문자");
			}else {
				System.out.println(ch+"는 소문자");
			}
			System.out.println(result);
		}
		
		
	/*	// 입력받은 문자열에 소문자가 있는지 확인하기
		Scanner sc=new Scanner(System.in);
		System.out.println("문자를 입력해주세요 : ");
		String str=sc.next();
		for(int i=0;i<=str.length();i++) {
			char ch=str.charAt(i);
			System.out.println(ch);
			if('a'<=ch&&ch<'z') {
				System.out.println(ch+ "는 소문자");
			}else {
				System.out.println(ch+"는 대문자");
			}
		}*/
		String tes="DKDJ";
		String result2="없다";
		for(int i=0;i<tes.length();i++) {
			char cha=tes.charAt(i);
			if('a'<=cha&&cha<='z') {
				result2="있다";
			}
		}
		System.out.println(result2);
		
		
		//사용자에게 입력받은 값에 소문자가 있는지 확인하는 기능
		// + 입력값에 소문자가 몇개있는지 출력하는 기능
		// 문자열, 문자를 입력받아 문자열에 문자가 있는지 확인하는기능
		// + 문자가 몇개있는지 확인
		Scanner sc=new Scanner(System.in);
		System.out.println("문자 입력 : ");
		String str2=sc.next();
		int count=0;
		for(int i=0;i<str2.length();i++) {
			char ch2=str2.charAt(i);
			if('a'<=ch2&&ch2<='z') {
				count++;
			}
		}
		System.out.println(count);
		
		System.out.println("문자열 입력 : ");
		String moon=sc.next();
		System.out.println("문자 입력 : ");
		char mon=sc.next().charAt(0);
		String result3="없다";
		for(int i=0;i<moon.length();i++) {
			char char2=moon.charAt(i);
			if(char2==mon) {
				result3="있다";
			}
		}System.out.println(result3);
		
		}
		public void forInfor() {
			// 중첩반복문 활용하기
			// for문 {} 안에 for 문을 작성하는 로직
			// 구구단 출력하기
			for(int i=2;i<10;i++) {
				System.out.println(i+"단");
				for(int j=1;j<10;j++) {
					System.out.println(i+"x"+j+"="+i*j);
				}System.out.println();
			}
			// 문자열에 중복문이 있는지 확인하는 로직
			String test="apple";
			for(int i=0;i<test.length();i++) {
				char ch=test.charAt(i);
				for(int j=0;j<test.length();j++) {
					char cch=test.charAt(j);
					if(i!=j&&ch==cch) {
						System.out.println(cch+"중복");
						break;
					}
				}
				System.out.println();
			}
	}
}



