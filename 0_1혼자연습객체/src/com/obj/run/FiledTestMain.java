
package com.obj.run;

import com.obj.model.vo.BasicObject;
import com.obj.model.vo.FiledTest;

public class FiledTestMain {

	public static void main(String[] args) {
		//이요할 FiledTest 클래스 생서하기
		FiledTest ft=new FiledTest();
		//import = ctrl+shift+o
		//생성된 객체의 필드(멤버변수)에 접근하려면 접근연산자를 이용해서 접근
		//public으로 선언된 변수는 직접접근이 가능
		System.out.println(ft.price);
		ft.price=10000;
		System.out.println(ft.price);
		//default로 선언된 변수
		//System.out.println(ft.name); //not visible -> 못보게돼있다
		//private로 선언된 변수
		//System.out.println(ft.height);
		//final String CLASS_NAME;
		System.out.println(ft.CLASS_NAME);
		//ft.CLASS_NAME="GDJ71"; -> 상수이기때문에 수정이 불가능
		//ft.numbers=new int[3];
		if(ft.numbers==null)ft.numbers=new int[2]; //if는 명령어가 한줄일떄 중괄호를 생략할 수 있음.
		for(int i=0;i<ft.numbers.length;i++) {
			System.out.println(ft.numbers[i]); //=> 컴파일러는 변수가 있는지 없는지만 확인하기 때문에 오류는 안나지만 실행해보면 오류가 발생함
		}
		if(ft.obj==null) ft.obj=new BasicObject();
		ft.obj.age=20;
	}
		} 


