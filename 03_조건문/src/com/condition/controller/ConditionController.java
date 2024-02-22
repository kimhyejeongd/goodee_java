package com.condition.controller;

import java.util.Scanner;
public class ConditionController {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// int char, String
		// char형으로 분기하기
		System.out.println("==== BS중국집 ====");
		System.out.println("가. 짜장면");
		System.out.println("나. 짬뽕");
		System.out.println("다. 탕수육");
		System.out.println("입력 : ");
		char chChoice=sc.next().charAt(0);
		switch(chChoice) {
		case '가': System.out.println("짜장면 선택");break;
		case '나': System.out.println("짬뽕 선택");break;
		case '다': System.out.println("탕수육 선택");break;
		default : System.out.println("가~다 중 한개를 입력하세요!");
		
		}
		sc.nextLine();
		//String
		System.out.println("==== 문자열 이용하기");
		System.out.println("당신의 취미(운동, 노래, 영화감상) : ");
		String strChoice=sc.nextLine();
		switch(strChoice) {
		case "운동" : System.out.println("운동하면 건강해져요");break;
		case "노래" : System.out.println("코인노래방?");break;
		
		}
		/*double height=180.5;
		switch(height) {
		
		}*/

		switch(strChoice.charAt(0)) {
			
		}
		int num=sc.nextInt();
		switch(num%5) {
		case 0 : 
		case 1 : 
		case 2 : 
		case 3 : 
		case 4 : 
		
		}
		// 분식집 주문프로그램만들기
		// 1. 떡볶이(3000), 2. 순대(2500), 3. 튀김(3000)
		// 4. 김밥(4000), 5. 라면(3500)
		// 갯수를 추가로 입력 받아 3
		// 예) 당신은 떡볶이를 고르셨습니다. 결제금액은 3000원입니다. 
		// 잘못고르면 그런메뉴는 없습니다. 다시 선택하세요 출력!
		System.out.println("==== BS분식집 주문 메뉴 ====");
		System.out.println("1. 떡볶이(3000)");
		System.out.println("2. 순대(2500)");
		System.out.println("3. 튀김(3000)");
		System.out.println("4. 김밥(4000)");
		System.out.println("5. 라면(3500)");
		System.out.println("메뉴선택 : ");
		int cho=sc.nextInt();
		String menu="";
		int price=0;
		
		switch(cho) {
			case 1 : menu="떡볶이"; price=3000;break;
			case 2 : menu="순대"; price=2500;break;
			case 3 : menu="튀김"; price=3000;break;
			case 4 : menu="김밥"; price=4000;break;
			case 5 : menu="라면"; price=3500;break;
		//default : System.out.println("그런메뉴는 없습니다. 다시 선택하세요");
		}
		if(price==0) {
			System.out.println("그런메뉴는 없습니다. 다시 선택하세요");
		}else {
			System.out.println("당신은 "+menu+"를 선택하셨습니다. 결제금액은 "+price+"원입니다.");
		}
	}
	
	// public void ex_test()
	// 성인만 가입할 수 있는 회원가입
	// -> 미성년이면 회원가입이 불가능합니다 출력
	// -> 성인이면 내국인, 외국인 구분
	//    내국인이면 회원가입으로 이동하여 회원정보 입력 진행
	//    외국인인면 외국인등록번호를 확인 -> 있다 없다
	//       등록번호가 있으면 회원가입 진행
	//       등록번호가 없으면 회원가입이 불가능합니다 출력
	//    잘못 선택하면 잘못누르셨습니다 출력 후 종료
	// 회원가입 정보 : 이름, 주소, 나이, 키, 성별
	/* 내가 푼 풀이 
	 * public void ex_test() {
		Scanner sc=new Scanner(System.in);
		System.out.println("==회원가입==");
		System.out.println("성인이십니까?(네,아니요)");
		String strChoice=sc.next();
		if(strChoice.equals("네")) {
			System.out.println("내국인이십니까?(네,아니요)");
			String yes=sc.next();
			if(yes.equals("네")) {
				System.out.println("회원가입이 가능합니다. 이름, 주소, 나이, 키, 성별을 입력해주세요");
				String ss=sc.next();
				System.out.println("회원가입이 완료되었습니다 정보는"+ss+" 입니다.");
				
			}else {
				System.out.println("외국인 등록번호가 있습니까?(있다,없다)");
				String no=sc.next();
				if(no.equals("있다")) {
					System.out.println("회원가입이 가능합니다. 이름, 주소, 나이, 키, 성별을 입력해주세요");
					String num=sc.next();
					System.out.println("회원가입이 완료되었습니다 정보는"+num+"입니다.");
					
					
				}else if(no.equals("없다")) {
					System.out.println("회원가입이 불가능합니다");
				}else {
					System.out.println("잘못 입력하셨습니다");
				}
			}
			
		}else {
			System.out.println("회원가입이 불가능합니다");
		}
		
*/		

public void ex_test() {
	Scanner sc=new Scanner(System.in);
	System.out.println("===회원가입===");
	System.out.print("당신의 연세는 ? ");
	int age=sc.nextInt();
	if(age<=19 ) {
		// 미성년일 때
		System.out.println("회원가입이 불가능합니다!");
	}else {
		// 성인일 때
		System.out.println("1. 내국인 /n 2. 외국인");
		System.out.println("선택 : ");
		int nationChoice=sc.nextInt();
		if(nationChoice==1) {
			//내국인
			System.out.print("이름 : ");
			String name=sc.next();
			System.out.print("주소 : ");
			String address=sc.nextLine();
			System.out.print("키 : ");
			double height=sc.nextDouble();
			System.out.print("성별(남/여) : ");
			char gender=sc.next().charAt(0);
			System.out.print("입력된 정보는 "+name+" "+address+" "+age+" "+height+" "+gender+"입니다");
			
		}else if(nationChoice==2) {
			//외국인
			System.out.print("외국인등록번호여부(1.있다/2.없다) : ");
			int fchoice=sc.nextInt();
			if(fchoice==1) {
				System.out.print("이름 : ");
				String name=sc.next();
				System.out.print("주소 : ");
				String address=sc.nextLine();
				System.out.print("키 : ");
				double height=sc.nextDouble();
				System.out.print("성별(남/여) : ");
				char gender=sc.next().charAt(0);
				System.out.print("입력된 정보는 "+name+" "+address+" "+age+" "+height+" "+gender+"입니다");
				
			}else if(fchoice==2) {
				System.out.println("회원가입이 불가능합니다");
			}else {
				System.out.println("잘못누르셨습니다. 다시 선택하세요");
			}
		}
	}

}
}