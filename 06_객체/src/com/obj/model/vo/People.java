package com.obj.model.vo;

public class People {
	private String name;
	private int age;
	private char gender;
	private double height;
	private String personId;
	private static int count;
	
	public static void setCount(int count) {
		People.count=count;
	}
	public static int getCount() {
		return People.count;
	}
	public static void serPersonId(String personId) {
	 //People.personId=personId;
	}
	public String getPersonId() {
		return this.personId;
	}
	
	public void setPeopleName(String name) {
		this.name=name;
	}
	public String getPeopleName() {
		return this.name;
	}
	public void setPeopleAge(int age) {
		this.age=age;
	}
	public int getPeopleAge() {
		return this.age;
		
	}	public void setPeopleGender(char gender) {
		this.gender=gender;
	}
	public char getPeopleGender() {
		return this.gender;
		
	}	public void setPeopleHeight(double height) {

		this.height=height;
	}
	public double getPeopleHeight() {
		return this.height;
	}
	public String infoPeople() {
		return this.name+" "+this.age+" "+this.gender+" "+this.height;
	}
//	public void printPeople() {
//		System.out.println(this.name+" "+this.age+" "+this.gender+" "+this.height);
//	}
	
}
