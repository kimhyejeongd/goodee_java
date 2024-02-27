package com.student.view;

import java.util.Scanner;

import com.student.comtroller.StudentController;
import com.student.model.vo.Student;

public class MainView {
	private final StudentController controller=new StudentController();
	public void mainMenu() { 
		while(true){
		 System.out.println("==== 학생관리 프로그램 ====");
		 System.out.println("1. 등록");
		 System.out.println("2. 전체조회");
		 System.out.println("3. 이름으로 조회");
		 System.out.println("4. 학년으로 조회");
		 System.out.println("5. 수정(학년,반,주소,전화번호)");
		 System.out.println("6. 삭제");
		 System.out.println("0. 종료");
		 System.out.println("입력 : ");
		 Scanner sc=new Scanner(System.in);
		 int menu=sc.nextInt();
		 
		 switch(menu) {
		 	case 1 : controller.enrollStudent();break;
		 	case 2 : controller.searchStudent();break;
		 	case 3 : controller.searchStudentByName();break;
		 	case 4 : System.out.println("개발중.....");break;
		 	case 5 : controller.updateStudent();break;
		 	case 6 : System.out.println("개발중.....");break;
		 	case 7 : System.out.println("프로그램이 종료합니다.");
		 	return;
		 	default:System.out.println("잘못된 값을 입력했습니다 다시 입력하세요!");
		 }
	   }
	}
	public Student inputStudentView() {
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		System.out.println("==== 학생 등록 ====");
		System.out.println("이름 : ");
		String name=sc.nextLine();
		s.setname(name);
		System.out.println("나이 : ");
		int age=sc.nextInt();
		s.setage(age);
		System.out.println("학년 : ");
		int grade=sc.nextInt();
		s.setgrade(grade);;
		System.out.println("반 : ");
		int classNumber=sc.nextInt();
		s.setClassNumber(classNumber);
		System.out.println("성별 : ");
		char gender=sc.next().charAt(0);
		s.setgender(gender);
		System.out.println("키 : ");
		double height=sc.nextDouble();
		s.sethight(height);
		sc.nextLine();
		System.out.println("주소 : ");
		String address=sc.nextLine();
		s.setadress(address);
		System.out.println("전화번호 : ");
		String phone=sc.next();
		s.setphone(phone);
	//	Student s=new Student(name,age,grade,classNumber,gender,height,address,phone);
		return s;
	}
	public void printStudent(String students) {
		System.out.println("=== 학생조회결과 ===");
		System.out.println(students);
		System.out.println("================");
	}
	public void printMsg(String msg) {
		System.out.println("=== 시스템 알림 ===");
		System.out.println(msg);
		System.out.println("================");
	}
	public String inputName() {
		Scanner sc=new Scanner(System.in);
		System.out.println("=== 학생 이름으로 조회 ===");
		System.out.println("검색할 학생이름 : ");
		return sc.nextLine();
	}
	public int inputNum() { 
		Scanner sc=new Scanner(System.in);
		System.out.println("=== 수정할 학생 번호 입력 ===");
		return sc.nextInt();
	}
	public Student updateStudentData() {
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		System.out.println("=== 학 생 수 정 ===");
		System.out.print("수정할 학생 번호 : ");
		s.setStudentNo(sc.nextInt());
		System.out.print("수정할 학년 : ");
		s.setgrade(sc.nextInt());
		System.out.print("수정할 반 : ");
		s.setClassNumber(sc.nextInt());
		sc.nextLine();
		System.out.print("수정할 주소 : ");
		s.setadress(sc.nextLine());
		System.out.print("수정할 전화번호 : ");
		s.setphone(sc.nextLine());
		return s;
	}
	
		
}

