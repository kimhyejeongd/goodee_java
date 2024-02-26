package com.obj.run;

import com.obj.controller.MyMethod;
import com.obj.model.vo.FieldTest;
import com.obj.model.vo.MethodController;

public class MethodTestMain {

	public static void main(String[] args) {
		MethodController mc=new MethodController();
		//선언된 메소드를이용하려면 클래스를 생성 후 이용할 수 있다.
		//생성된 객체의 주소로 접근해서 메소드명([값,값..]);
		//예) obj.testMethod();
		//예) obj.testMethod(1,2,3);
		mc.printMsg();
		int result=mc.plus();
		System.out.println(result);
		System.out.println(mc.plus());
		mc.printSendMsg("여러분 힘내요! 재미있잖아요!????");
//		mc.printSendMsg(10); -> 매개변수 타입이 달라서 에러 발생함
		mc.printSendMsg("10");
		
		result=new MethodController().complexNumber(3, 5);
		System.out.println(result);
		
		//1.점심 메뉴 뭐먹지? 출력하는 기능
		MyMethod myMethod=new MyMethod();
		myMethod.printLunch();
		//2.1부터 10까지 출력하는 기능
		myMethod.printOneToTen();
		//3.1부터 사용자가 원하는 수(전달받아서)까지 출력하는 기능
		myMethod.printOneToInputNum(3);
		//4.1부터 5까지 더한수를 반환하는 기능
		int result3=myMethod.sumOneToFive();
		System.out.println(result3);
		//5.사용자에게 5번 메세지를 입력받고 입력받은 메세지를 반환하는 기능
		String totlaMsg=myMethod.inputMsg();
		System.out.println(totlaMsg);
		//6.숫자두개, 연산자를 전달받아 계산한결과를 반환해주는 기능
		double calcResult=myMethod.calculator(20, 30, '+');
		System.out.println(calcResult);
		//7.문자열을 전달받아 문자열의 중복값여부를 반환하는 기능
		boolean flag=myMethod.checkString("banana");
		if(flag) {
			System.out.println("문자열에 중복문자가 있습니다");
		}else {
			System.out.println("문자열에 중복문자가 없습니다");
		}
		
		//특정배열을 만들어주는 기능
		int[] intArr=mc.creaIntArr();
		for(int v:intArr) {
			System.out.println(v);
		}
		//배열을 전달하면 배열에 랜덤값을 채워주는 기능
		mc.changeRandomData(intArr);
		for(int v : intArr) {
			System.out.println(v+" ");
		}
		System.out.println();	
		
		String str="메소드 너무 재미있다!";
		System.out.println(str);
		mc.changeString(str);
		System.out.println(str);
		
		FieldTest ft=mc.createFieldTest();
		System.out.println(ft.price);
		
		mc.fieldTestUpdate(new FieldTest(), 100);
		System.out.println(ft.price);
		
		//원하는 크기의 배열을 생성해주는 기능
		
		//필드값 메소드로 가져오기
		int age=mc.age();
		System.out.println("mc.age= "+age);
		mc.increaAge();
		mc.increaAge();
		mc.increaAge();

		System.out.println("mc.age : "+mc.age());
		
		//static 메소드 선언 및 이용하기
		//클래스명.메소드명() ;
		MethodController.printStatic();
		System.out.println(MethodController.codeError("404"));
		
	}

	}


