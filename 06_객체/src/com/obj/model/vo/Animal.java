package com.obj.model.vo;

public class Animal {
	private String name;
	private String type;
	private double weight;
	private int age;
	private String food; 
	
	//필드와 매핑되는 getter,setter메소드를 선언한다.
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}
	public double getWeight() {
		return this.weight;
	}
	public void setFood(String food) {
		this.food=food;
	}
	public String getFood() {
		return this.food;
	}
	public void setType(String type) {
		this.type=type;
	}
	public String getType() {
		return this.type;
	}
	
}
