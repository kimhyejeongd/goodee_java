package com.obj.model.vo;

public class MethodController {
	
	private int age;
	
	public int age() {
		return this.age;
	}
	
	public void increaAge() {
		this.age++;
	}
	public void inputAge(int age) {
		this.age=age;
	}
   //메소드 활용하기
   //클래스의 역할에 따른 기능을 설정할때 사용
   //메소드 선언방식
   //접근제한자 [예약어] 메소드명([매개변수,매개변수,...]){ 기능수행로직 }
   
   //유형에 따라 메소드를 선언해보자
   //1. 반환형 없고, 매개변수 없는 메소드 선언하기
   public void printMsg() {
      System.out.println("오늘은 활기찬 월요일이네요!");
   }
   
   //2. 반환형이 있고, 매개변수가 없는 메소드 선언하기
   // 반환형이 있는 경우 반환형 자리에 타입(기본,배열,클래스명)을 선언
   // 반드시 메소드{}안에 return 예약어를 이용해서 반환될 값을 설정해야함.
   // return 반환할값; 리터럴,변수명
   
   //더하기 계산결과를 반환해주는 기능
   public int plus() {
      int a=10;
      int b=10;
      //return 20;
      return a+b;}

	
	//3. 반환형이 없고 매개변수가 있는 메소드 선언
	//매개변수 : 기능을 구현할 때 필요한 데이터를 외부(호출하는 곳)에서 전달받을 때 사용하는 변수
   
   //전달받은 데이터를 출력해주는 기능
   public void printSendMsg(String msg) {
	   System.out.println("전달받은 메세지 : "+msg);
   }
   //4. 반환형이 있고 매개변수 있는 메소드 선언
   //두수를 전달받아 곱하기연산의 결과를 반환해주는 메소드
   public int complexNumber(int su, int su2) {
	   return su*su2;
   }
   
   //배열 생성해서 반환하기
   public int[] creaIntArr() {
	   int[] newArr=new int[3];
	   return newArr;}
   //전달받은 int형배열의 데이터를 랜덤으로 채워주는 기능
   public void changeRandomData(int[] intArr) {
	   for(int i=0;i<intArr.length;i++) {
		   intArr[i]=(int)(Math.random()*100)+1;
	   }
   }
   public String changeString(String data) {
	   data="배고프다 꼬르륵";
	   return data;
   }
   public FieldTest createFieldTest() {
	   return new FieldTest();
   }
	public void fieldTestUpdate(FieldTest ft,int price) {
		ft.price=price;
	}
	public int[] createArr(int length) {
		return new int[length];
	}
	
	//static 메소드 활용하기 -> 객체를 생성하지 않고 이용할 수 있는 공용의 기능
	// 접근제한자 static 반환형 메소드명([매개변수,매개변수...]) {}
	
	public static void printStatic() {
		System.out.println("staticprint메소드");
	}
	public static String codeError(String code) {
		String message="";
		switch(code) {
		case "404":message="페이지를 찾을 수 없습니다!";break;
		case "403":message="페이지를 이용할 권한이 없습니다";break;
		case "500":message="서버를 실행할 수 없습니다";break;
		}
		return message;
	}
	
}
