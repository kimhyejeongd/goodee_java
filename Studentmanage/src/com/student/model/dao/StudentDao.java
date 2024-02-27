package com.student.model.dao;

import com.student.model.vo.Student;

public class StudentDao {
	private Student s,s1,s2;
	
	public boolean insertStudent(Student s) {
		if(this.s==null) {
			this.s=s;
		}else if(this.s1==null) {
			this.s1=s;
		}
		else if(this.s2==null) {
			this.s2=s;
		}
		else {
			return false;
		}
		return true;
	}
	public String searchStudent() {
		String searchStudent="";
		if(s!=null) {
			searchStudent+=this.s.infoStudent()+"\n";
		}if(s1!=null) {
			searchStudent+=this.s1.infoStudent()+"\n";
		}if(s2!=null) {
			searchStudent+=this.s2.infoStudent()+"\n";
		}
		return searchStudent;
	}
	public String searchName(String target) {
		String searchResult="";
		if(s!=null&&s.getname().equals(target)) {
			searchResult+=s.infoStudent();
		}if(s1!=null&&s1.getname().equals(target)) {
			searchResult+=s1.infoStudent();
		}
		if(s2!=null&&s2.getname().equals(target)) {
			searchResult+=s2.infoStudent();
		}
		return searchResult;}
	

	public boolean updateStudent(Student updateData) {
		if(s!=null&&s.getstudentNo()==updateData.getstudentNo()) {
			s.setgrade(updateData.getgrade());
			s.setClassNumber(updateData.getclassNumber());
			s.setadress(updateData.getaddress());
			s.setphone(updateData.getphone());
		}else if(s1!=null&&s.getstudentNo()==updateData.getstudentNo()) {
			s1.setgrade(updateData.getgrade());
			s1.setClassNumber(updateData.getclassNumber());
			s1.setadress(updateData.getaddress());
			s1.setphone(updateData.getphone());
		}else if(s2!=null&&s.getstudentNo()==updateData.getstudentNo()) {
			s2.setgrade(updateData.getgrade());
			s2.setClassNumber(updateData.getclassNumber());
			s2.setadress(updateData.getaddress());
			s2.setphone(updateData.getphone());
		}else {
			return false;
		}return true;
	}
}

