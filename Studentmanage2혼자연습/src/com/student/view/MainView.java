package com.student.view;

import java.util.Scanner;

public class MainView {
	public void mainMenu() {
		while(true) {
			System.out.println("==== 학생관리 프로그램 ====");
			System.out.println("1. 등록");
			System.out.println("2. 전체조회"); 
			System.out.println("3. 이름으로 조회");
			System.out.println("4. 학년으로 조회");
			System.out.println("5. 수정");
			System.out.println("6. 삭제");
			System.out.println("0. 종료");
			System.out.print("번호 입력 : ");
			Scanner sc=new Scanner(System.in);
		int menu=sc.nextInt();
		switch(menu) {
			case 1 : System.out.println("개발중");break;
			case 2 : System.out.println("개발중");break;
			case 3 : System.out.println("개발중");break;
			case 4 : System.out.println("개발중");break;
			case 5 : System.out.println("개발중");break;
			case 6 : System.out.println("개발중");break;
			case 0 : System.out.println("프로그램을 종료합니다.");
			return; //호출한곳으로 되돌아감
		}
		}
	}

	}


