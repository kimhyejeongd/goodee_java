package com.student.model.vo;

public class Student {
	private int studentNo;
	private String name;
	private int age;
	private int grade;
	private int classNumber;
	private char gender;
	private double height;
	private String address;
	private String phone;
	private static int studentCount;
	
	{
		this.studentNo=++Student.studentCount;
	}
	
	
	public Student() {}
	public Student(String name,int age, int grade,int classNumber, char gender, double height, String address, String phone) {
		this.name=name;
		this.age=age;
		this.grade=grade;
		this.classNumber=classNumber;
		this.gender=gender;
		this.height=height;
		this.address=address;
		this.phone=phone;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo=studentNo;
	}
	public int getstudentNo() {
		return this.studentNo;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return this.name;
	}
	public void setage(int age) {
		this.age=age;
	}
	public int getage() {
		return this.age;
	}
	public void setgrade(int grade) {
		this.grade=grade;
	}
	public int getgrade() {
		return this.grade;
	}
	public void setClassNumber(int classNumber) {
		this.classNumber=classNumber;
	}
	public int getclassNumber() {
		return this.classNumber;
	}
	public void setgender(char gender) {
		this.gender=gender;
	}
	public char getgender() {
		return this.gender;
	}
	public void sethight(double height) {
		this.height=height;
	}
	public double gethight() {
		return this.height;
	}
	public void setadress(String address) {
		this.address=address;
	}
	public String getaddress() {
		return this.address;
	}
	public void setphone(String phone) {
		this.phone=phone;
	}
	public String getphone() {
		return this.phone;
	}
	public String infoStudent() {
		return this.studentNo+" "+this.name+" "+this.age+" "+this.grade+" "+this.classNumber+" "+this.height+" "+this.address+" "+this.phone;
	}
	
}



