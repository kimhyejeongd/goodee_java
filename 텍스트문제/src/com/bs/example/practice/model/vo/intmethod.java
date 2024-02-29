package com.bs.example.practice.model.vo;

public class intmethod {
	private int num1;
	private int num2;
	
	public intmethod() {
	}

	public intmethod(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	/*정수 두개를 전달받아 첫번째수부터 
	두번째수까지 합을 리턴해주는 매소드
	만들기 
	단, 무조건 첫번째수가 커야함.
	만약 첫번째수가 작으면 
	계산할 수 없습니다 출력후 
	0을 반환!*/
	public int sumInt(int num1,int num2) {
		int result=0;
		if(num1<num2) {
			System.out.println("계산할 수 없습니다");
			return 0;
		}
		for(int i=num1;i>=num2;i--) {
			
			result +=i;
		}
		return result;
	}
}
