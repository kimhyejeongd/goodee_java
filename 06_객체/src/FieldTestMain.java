import com.obj.model.vo.FieldTest;

public class FieldTestMain {

	public static void main(String[] args) {
		// 이용할 FieldTest 클래스 생성하기
		FieldTest ft=new FieldTest();
		//ctrl+shift+o
		// 생성된 객체의 필드(멤버변수)에 접근하려면 접근연산자를 이용해서 접근
		// public 으로 선언된 변수는 직접접근이 가능
		System.out.println(ft.price);
		ft.price=10000;
		System.out.println(ft.price);
		// default 로 선언된 변수
		//System.out.println(ft.name); // 있지만 볼 수 없음
		// private로 선언된 변수
		//System.out.println(ft.height);
		
		

	}

}
