
public class StringTest {

	public static void main(String[] args) {
		// 문자열 자료형 이용하기
		String name="유병승";
		System.out.println(name);
		
		String name2=new String("김동훈");
		System.out.println(name2);
		
		
		// + 연산자이용을 하면 문자열 결합연산을 실행함.
		String msg;
		msg="자바 선생님 "+"유병승";
		System.out.println(msg);
		msg="학생 "+name2;
		System.out.println(msg);
		int age=19,age2=20;
		int result=age+age2;
		System.out.println(result);
		
		// 문자열타입 + 다른타입 연산 !
		msg="나의 나이는 "+19;
		System.out.println(msg);
		
		msg="이름 "+name+"나이 "+age;
		System.out.println(msg);
		msg=20+24+"년도 화이팅!!";
		System.out.println(msg);
		
		// 본인 이름, 나이, 성별(M,F) 주소, 전화번호 를 
		// 각 변수를 생성해서 저장하고 한개 문자열로 합쳐서 한번에 
		// 출력하기	
		// 출력문 : 나의 이름은 ㅇㅇㅇ이고 나의 나이는 ㅇㅇ살이고 키는 ㅇㅇㅇ.ㅇ 주소는 ㅇㅇㅇ ㅇㅇㅇ, 성별은 ㅇ, 전화번호는 ㅇㅇㅇ-ㅇㅇㅇ-ㅇㅇㅇㅇ이다.
		// * 각 데이터에 맞는 자료형을 선택해서 리터럴값을 대입할 것.
		String name3="김혜정";
		int aage=26;
		int ki= 171;
		String wnth="평택시";
		char gender='여';
		String num= "010-8731-3865";
		System.out.println("나의 이름은 "+name3+"이고 나이는 " +aage+"이고 주소는 "+wnth+","+" 성별은 "+gender+", "+"전화번호는 "+num+"이다.");
		
		// String은 클래스로 유용한 기능(메소드)을 제공을함
		// 1. String 변수에 저장된 문자열의 길이를 알려주는 기능(메소드)
		// length()
		System.out.println("길이 알려줘".length());
		System.out.println(name.length());
		int length="길이알려줘".length();
		length=name.length();
		
		// 2. 문자열 변수에 저장된 특정문자한개만 가져오는 기능(메소드) 제공
		//charAt(원하는 문자위치값)
		System.out.println("ABC".charAt(0));
		System.out.println("ABC".charAt(1));
			
		System.out.println(msg.charAt(0));
		System.out.println(msg.length());
		
		char a=msg.charAt(10);

	}

}
