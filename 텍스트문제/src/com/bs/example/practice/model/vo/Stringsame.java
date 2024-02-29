package com.bs.example.practice.model.vo;

public class Stringsame {
	private String name1;
	private String name2;
	public Stringsame() {
	}
	public Stringsame(String name1, String name2) {
		super();
		this.name1 = name1;
		this.name2 = name2;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	/*문자열 두개를 입력받아 두개의 값이 같은지
	확인해주는 매소드 만들기 
	같으면 true/ 다르면 false 반환
*/
	public boolean sameName(String name1,String name2) {
		boolean tr=false;
		if(name1.equals(name2)) {
			tr=true;
		}
		return tr;
	}
	
}
