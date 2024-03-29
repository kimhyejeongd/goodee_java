
public class CastingTest {

	public static void main(String[] args) {
		// 형변환에 대해 알아보자
		// 특정연산을 실행할때는 피연산자의 타입이 동일해야한다. -> 자동형변환발생
		int num = 10;
		double num2=10.5;
		System.out.println(num+num2);
		// int result=num+num2;
		num2=num;
		System.out.println(num2);
		
		//강제형 변환
		// (자료형) 리터럴값 또는 변수명
		long salary=1000;
		num=(int)salary;
		
		double weight=65.5;
		num=(int)weight;
		System.out.println(num);
		
		// 계산결과를 출력할 때
		// 국어, 영어, 수학, 코딩 점수 평균값 구하기
		int kor=80,math=70,eng=70,coding=30;
		System.out.println((kor+math+eng+coding)/4.0);
		
		// 문자열 형변환
		// char
		char alpha='A';
		int numA1=alpha;
		System.out.println(alpha);
		System.out.println((char)numA1);
		
		numA1=98;
		System.out.println(numA1);
		System.out.println((char)numA1);
		numA1='가';
		
		
		System.out.println('A'>'B');

		
		
		

	}

}
