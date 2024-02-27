package com.student.comtroller;

import com.student.model.dao.StudentDao;
import com.student.model.vo.Student;
import com.student.view.MainView;

public class StudentController {
	private final StudentDao dao=new StudentDao();

	//메인화면을 출력해주는 기능
	public void mainView() {
		new MainView().mainMenu();
	}
	
	//학생등록 구현
	public void enrollStudent() {
		//클라이언트가 학생정보를 입력할 수 있는 화면을 출력
		Student s=new MainView().inputStudentView();
		//System.out.println(s.infoStudent());
		//클라이언트가 입력한 정보를 저장소에 저장
		boolean result=dao.insertStudent(s);
		//System.out.println(result);
		new MainView().printMsg(result?"학생등록성공":"학생등록실패");
		
	}
	//저장된 학생 전체조회 구현
	public void searchStudent() {
		String result=dao.searchStudent();
		System.out.println(result);
		new MainView().printStudent(result);
	}
	//학생 이름으로 조회 구현
	public void searchStudentByName() {
		//사용자가 원하는 이름 받아오기
		String searchName=new MainView().inputName();
		String result=dao.searchName(searchName);
		new MainView().printStudent(result);
	}
	//학생 번호로 학년,반,주소,전화번호 수정하기
	public void updateStudent() {
		//수정할 번호 받아오기
		searchStudent();
		Student s=new MainView().updateStudentData();
		boolean result=dao.updateStudent(s);
		new MainView().printMsg(result?"수정성공":"수정실패");
	}
}
