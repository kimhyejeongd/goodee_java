package com.obj.run;
import com.obj.model.vo.BasicObject;
//import com.obj.model.vo.DefaultObject;
import com.obj.model.vo.SubMain;
public class Main {

	public static void main(String[] args) {
		//public 으로 선언한 클래스 생성하기(객체화)--heap 저장공간 생성
		new BasicObject();
		//default로 선언한 클래스 생성하기
		//new DefaultObject();
		
		//선언한 클래스는 프로젝트에서 하나의 참조형자료형이 된다. 
		BasicObject bo;
		bo=new BasicObject();
		// bo=new SubMain(); 
		//Scanner sc; //Scanner 도 클래스의 하나
		
		//필드 활용하기
		
	}

}
