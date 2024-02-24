package com.repeat.controller;

import java.util.Scanner;
import java.util.Random;

public class RepeatController {
	public void basicRepeat() {
		// 기본 for 문 활용하기
		// 특정코드를 원하는 만큼 반복실행하게 하는 명령어
		// for(초기식;조건식;증감식) { 반복할 코드 작성 }
		// 초기식 : 변수선언, 반복횟수에 대한 정보를 저장하는 저장소
		// 조건식 : for문의 코드를 실행할지 결정하는 조건, true면 실행, false 실행안함, 조건식은 일반적으로 초기식에 선언된 변수를 가지고 구성
		// 증감식 : 초기식에 선언한 변수의 값을 수정하는 연산 - > 조건식의 결과를 변경
		
		// 안녕하세요를 10번 출력하기
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		
		for(int i=1;i<11;i++) {
			System.out.println("안녕하세요");
		}
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		//1부터 10까지 출력하기
		for(int i=1;i<=10;i++) {
			System.out.println(i+" ");
		}
		// for문의 {}내부에는 변수선언, 연산자, 조건문, 기능호출 등 모두
		// 선언이 가능함.
		for(int i=1;i<=5;i++) {
			int temp=100*i;
			temp++;
			if(temp>400) {
				System.out.println(temp+" "+i);
			}
			System.out.println(temp+" "+i);
			
		}
		//1부터 100까지의 수를 출력하기.
		//한줄로 출력
		for(int i=1;i<=100;i++) {
			System.out.println(i+ " ");
			
			
			}
			for(int i=1;i<=100;i++) {
				if(i%2==0) {
					System.out.print(i+" ");
				}
			}
			//100부터1까지 출력하기
			for(int i=100;i>=1;i--) {
				System.out.println(i);
			}
		
			//for 문 사용시 초기식, 조건식, 증감식을 반드시 써야하나 ?
			/*for(;;) {
				System.out.println("우왓!");
				// 무한으로 계속 우왓!이 반복됨
			}*/
		}
		
	//반친구들의 이름을 5명 입력받고 출력하는 기능 구현하기
	public void inputStudent() {
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			System.out.println("친구이름 : ");
			String name=sc.next();
			System.out.println(name);
			
		}
		/*
		 * 한줄로 입력한 이름만 표시할 떄 
		 * public void inputStudent() {
			Scanner sc=new Scanner(System.in);
			String name="";
			for(int i=1;i<=5;i++) {
				System.out.println("친구이름 : ");
				String name=sc.next();
				name+=sc.next()+" ";}
				//name=name+sc.next();은  name+=과 같음
				
				System.out.println(name);
				*/
		
		
			
		}
	// 사용자에게 숫자를 5개 입력받고 입력받은 숫자의 총합을 출력하기
	// public void sumNumber()
	public void sumNumber() {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for(int i = 1;i<=5;i++) {
			System.out.println("숫자 : ");
			int num=sc.nextInt();
			sum+=num;}
		System.out.println("합계 : "+sum);
	// 사용자에게 메세지를 입력받고 출력하는 기능 구현
	// 사용자가 exit 라는 메세지를 입력받을 때 까지 입력받고, 
	// 입력 내용을 한번에 출력하기
	// public void inputMsg()		
		}
	public void inputmMsg() {
		Scanner sc=new Scanner(System.in);
		String msg="";
		String total="";
		for(;!msg.equals("exit");) {
		System.out.println("문자입력 : ");
		msg=sc.nextLine();
		System.out.println(msg);
		//total+=msg.equals("exit")?"":msg;
		if(!msg.equals("exit")) {
			total+=msg;
		}
		}
		System.out.println(total);
	}
	public void forApp() {
		// for문 응용해보기
		// 1부터 사용자가 입력한 수까지 출력하기
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자 :");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	// 사원정보를 입력받는 기능구현하기
	// 3명의 사원의 정보를 입력받고 출력하는 기능
	// 입력정보 : 이름, 나이, 성별, 급여,보너스(실수)
	// 입력한 정보를 한번에 출력하게 구현 
	// 예) 유병승 19 남 100 0.2
	//    홍길동 24 남 50 0.3
	// 버전업 사용자가 원하는 만큼 사원정보 입력 후 출력하기
	public void empInputData() {
		Scanner sc=new Scanner(System.in);
		//System.out.println("입력할 사원수 : ");
		//int count=sc.nextInt();
		String sum= "";
		for(int i=1;i<=3;i++) { //int i=0; i<count;i++
			System.out.println("이름을 입력하세요");
			String name=sc.next();
			System.out.println("나이를 입력하세요");
			int age=sc.nextInt();
			System.out.println("성별을 입력하세요?(남,여)");
			char gender=sc.next().charAt(0);
			System.out.println("급여를 입력하세요");
			int sal=sc.nextInt();
			System.out.println("보너스를 입력하세요");
			double bonus=sc.nextDouble();
			sum+=name+" "+age+" "+gender+" "+sal+" "+bonus;
						
		}
		System.out.println(sum);
	}
	//for문 응용하기 -> 활용2
	public void forApp2() {
		//숫자에 규칙 있는 경우 for 문을 활용해서 기능을 구현할 수 있음
		//String name="유병승";
		//name.charAt(0); -> 유 첫번째 글자
		//name.charAt(1); -> 병 첫번째 글자
		//name.charAt(2); -> 승 첫번째 글자
		String name="유병승";
		for(int i=0;i<3;i++) {
			//System.out.println(i);
			char ch=name.charAt(i);
			System.out.println(ch);
		}
		String test="abCDef";
		// test문자열에 대문자가 있는지 확인하는 기능
		String result="";
		for(int i=0;i<6;i++) {
			char ch=test.charAt(i);
			System.out.println(ch);
			if('A'<=ch&&ch<='Z') {
				System.out.println(ch+"는 대문자");
			}else {
				System.out.println(ch+"는 소문자");
			}
			System.out.println(result);
		}
			//입력받은 문자열에 소문자가 있는지 확인하기
			Scanner sc=new Scanner(System.in);
			String test2=sc.next();
			for(int i=0;i<test2.length();i++) {
				char ch=test2.charAt(i);
				System.out.println(ch);	
		}	
	}
	//문제 풀기
	//사용자에게 입력받은 값에 소문자가 있는지 확인하는 기능
	// + 입력값에 소문자가 몇개있는지 출력하는 기능
	// 문자열, 문자를 입력받아 문자열에 문자가 있는지 확인하는기능
	// + 문자가 몇개있는지 확인
	
	public void forInfor() {
		// 중첩반복문 활용하기
		// for문 {} 안에 for 문을 작성하는 로직
		// 구구단 출력하기
		for(int i=2;i<10;i++) {
			System.out.println(i+"단");
			for(int j=1;j<10;j++) {
				System.out.print(i+"x"+j+"="+i*j);
			}System.out.println();
			
		}
		// 문자열에 중복문가 있는지 확인하는 로직
		String test="apple";
		for(int i=0;i<test.length();i++) {
			char target=test.charAt(i);
			System.out.println(target);
			for(int j=0;j<test.length();j++) {
				char compare=test.charAt(j);
				if(i!=j&&target==compare) {
					System.out.println(compare+"중복");
				}
			}
			System.out.println();	
		}
		//각 문자별 중복값의 갯수를 출력하기
		//apple
		//a는 중복값 0개
		//p는 중복값 2개
		
		//별찍기
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//*
		//**
		//***
		//****
		//*****
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j<=i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public void whileTest() {
		//while문 활용하기
		//반복문을 구현하는 방법 중 하나
		//while(조건문){반복실행할 코드}
		//특정 조건에서 반복을 중지하는 로직에서 많이 사용
		//의도적인 무한루프를 발생시킬 때 사용
		
		//1~10까지 출력하기
		for(int i=0;i<10;i++) {
			System.out.print((i+1+" "));
		}
		int j=0;
		while(j<10) {
			System.out.print(j+1+" ");
			j++;
		}
		// 사용자가 끝이라고 입력할때까지 입력받는 기능
		// 사용자가 지정한 범위의 값을 입력할때 까지 재입력 받는 기능
		
		Scanner sc=new Scanner(System.in);
		String inputDate="";
		String totalInput="";
		while(!inputDate.equals("끝")) {
			System.out.println("메세지 : ");
			inputDate=sc.nextLine();
			System.out.println(inputDate);
			totalInput+=inputDate;
		}
		System.out.println(totalInput);
		
		//사용자가 3의 배수를 입력할 때 까지 숫자를 입력받는 로직
		int inputNum=1;
		while(inputNum%3!=0) {
			System.out.println("3의배수 입력 : ");
			inputNum=sc.nextInt();
			
		}
		//메뉴를 출력하는 기능 -> while
		int menu=0;
		while(menu!=9) {
			System.out.println("==점심메뉴==");
			System.out.println("1.구내식당");
			System.out.println("2.순대국밥");
			System.out.println("3.감자탕");
			System.out.println("4.김밥");
			System.out.println("9.선택종료");
			System.out.println("선택 : ");
			menu=sc.nextInt();
		}
    //do~while
    //do{반복할 코드}while(조건식);
		char ch='Y';
		while(ch=='N') {
			System.out.println("반복");
		}
		do {
			System.out.println("do~while의 반복");
	 
		}while(ch=='N');
	}
	//계속 계산할 수 있는 계산기 프로그램만들기
	//두개의 정수, 연산자를 입력받아 계산하는 기능
	//계산결과 : 10 + 10 = 20
	//계산이 끝나면 계속하시겠습니까?Y를 입력하면 한번더 실행
	//N을 입력하면 프로그램을 종료합니다 출력 후 종료 !
	
	public void whileClacultor() {
	Scanner sc=new Scanner(System.in);
	char choice='Y';
	while(choice=='Y'||choice=='y' ) {
		System.out.println("첫번째 정수를 입력해주세요");
		int num1=sc.nextInt();
		System.out.println("두번쨰 정수를 입력해주세요");
		int num2=sc.nextInt();
		System.out.println("사용할 연산자를 입력해주세요(+,-,*,/)");
		char ch=sc.next().charAt(0);
		double result=0.0;
			switch(ch) {
			case '+': result=num1+num2; break;
			case '-': result=num1-num2; break;
			case '*': result=num1*num2; break;
			case '/': result=(double)num1/num2; break;
			
	}
		System.out.println(""+num1+ch+num2+"="+result);
		System.out.print("계속 하시겠습니까?(Y/N)?");
		choice=sc.next().charAt(0);
	
	}
	System.out.println("계산기를 종료합니다!");
}
	public void continueBreakTest() {
		//분기문 활용하기
		//continue : 반복문에서 continue문을 만나면 아래(continue 다음 라인) 코드를 생략하고 증감식으로 넘어감
		//break : 반목문에서 break문을 만나면 반복문을 종료!
		//분기문은 조건문과 같이 사용을 한다.
		
		for(int i=0;i<10;i++) {
			System.out.print(i);
		}
		System.out.println();
		for(int i=0;i<10;i++) {
			if(i%3==0) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=1;i<10;i++) {
			if(i%3==0) {
				break;
			}
			System.out.print(i+" ");
		}
		int count=0;
		while(true) {
			System.out.println(count++);
			if(count==100) {
				break;
			}
		}
		
		//중첩반목문엔서 분기문활용하기 -> break;
		t:
		for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.println(i+"X"+j+"="+i*j+" ");
				if(j==5) {
					break t;
				}
			}
			System.out.println();
		}
	
		}
	//자바에서 랜덤값을 출력하는 방법
			public void randomTest() {
				// 임의의 수를 출력하는 것
				//1. Math클래스에서 제공하는 random()기능 이용
				//2. Random클래스에서 제공하는 nextInt() 기능 이용
				//기본적으로 실수로 랜덤값을 출력
				System.out.println(Math.random());
				//특정범위에 정수값을 랜덤으로 출력하려면
				// (int)Math.random()*정수) - > 0~정수-1 범위 랜덤값출력
				// (int)(Math.random()*10) -> 0~9사이의 랜덤값
				// (int)(Math.random()*5) -> 0~4사이의 랜덤값
				for(int i=0;i<5;i++) {
					System.out.println((int)(Math.random()*10));
				}
				//Random클래스 이용하기 
			Random rnd=new Random();
			//nextInt()
			System.out.println(rnd.nextInt());
			// nextInt(정수)-> 0~정수-1 범위 랜덤값
			//0~9
			for(int i=0;i<10;i++) {
			System.out.println(rnd.nextInt(10));
			}
		
			}
//		    설명 
//		    - 사용자에게 가위, 바위, 보 중 한개를 입력하도록하고(입력방식은 숫자)
//		    - 컴퓨터가 랜덤값으로 세개중 하나의 데이터를 대입
//		    - 컴퓨터의 값과 사용자의 값을 비교하여 다음의 결과출력
//		      같으면 비겼습니다. 출력 후 다시 사용자와 컴퓨터가 선택할 수 있도록 로직구성
//		      컴퓨터가 사용자에게 이기면 컴퓨터가 이겼습니다. 출력
//		      사용자가 컴퓨터에게 이기면 사용자가 있겼습니다. 출력   
		//
		//   -  승자가 나왔으면 다시 하겠습니다 출력 
//		       다시하면 위에 로직 다시 실행
//		       종료하면 프로그램 종료
		//   - 추가 : 만일 위 내용을 쉽게 처리 했으면 프로그램 종료시 지금까지 전적을 출력
//		          컴퓨터 승 00번, 사용자 승 00번
			public void rkdlnqkfnlqh() {
				Scanner sc=new Scanner(System.in);
				int rkdnl=1; //가위
				int qkdnl=2; //바위
				int qh=3;	 //보
				String rkqt="내가 입력한 값은";
				String tkdeo="상대가 입력한 값은";
				
				char ch=sc.next().charAt(0);
				int ran=(int)(Math.random()*3)+1;
				System.out.println("숫자를 입력하세요(가위:1 바위:2 보:3) : ");
				int num=sc.nextInt();
				
				while(ch=='y'||ch=='Y') {
					switch(num) {
					case 1: System.out.println(rkqt+" 가위");break;
					case 2: System.out.println(rkqt+" 바위");break;
					case 3: System.out.println(rkqt+" 보자기");break;
					}
					switch(ran) {
					case 1: System.out.println(tkdeo+" 가위");break;
					case 2: System.out.println(tkdeo+" 바위");break;
					case 3: System.out.println(tkdeo+" 보자기");break;
					}while(ch=='N'||ch=='n') {
					if(num==ran) {
					System.out.println("비겼습니다");
					continue;
					}
					if(num==rkdnl) {
						if(ran==2) {
							System.out.println("사용자가 이겼습니다");
						}else if(ran==3){
							System.out.println("컴퓨터가 이겼습니다");
						}
					}
					if(num==qkdnl) {
						if(ran==1) {
							System.out.println("사용자가 이겼습니다");
						}else if(ran==3){
							System.out.println("컴퓨터가 이겼습니다");
						}
					}
					if(num==qh) {
						if(ran==1) {
							System.out.println("컴퓨터가 이겼습니다");
						}else if(ran==2){
							System.out.println("사용자가 이겼습니다");
						}
					}
					
					}
				}
				
				
				
				
				/*
				switch(num) {
				case 1: System.out.println(rkqt+" 가위");break;
				case 2: System.out.println(rkqt+" 바위");break;
				case 3: System.out.println(rkqt+" 보자기");break;
				}
				switch(ran) {
				case 1: System.out.println(tkdeo+" 가위");break;
				case 2: System.out.println(tkdeo+" 바위");break;
				case 3: System.out.println(tkdeo+" 보자기");break;
				}
				if(num==ran) {
				System.out.println("비겼습니다");
				continue;
				}
				if(num==rkdnl) {
					if(ran==2) {
						System.out.println("사용자가 이겼습니다");
					}else if(ran==3){
						System.out.println("컴퓨터가 이겼습니다");
					}
				}
				if(num==qkdnl) {
					if(ran==1) {
						System.out.println("사용자가 이겼습니다");
					}else if(ran==3){
						System.out.println("컴퓨터가 이겼습니다");
					}
				}
				if(num==qh) {
					if(ran==1) {
						System.out.println("컴퓨터가 이겼습니다");
					}else if(ran==2){
						System.out.println("사용자가 이겼습니다");
					}
				}
				*/
			}
			}

				
				

			

	
	

