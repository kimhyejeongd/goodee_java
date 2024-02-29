package com.bs.example.practice7.run;

import com.bs.example.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		Employee em= new Employee(100,"홍길동","영업부","과장",25,'남',2500000,0.05,"010-1234-5678","서울시 강남구");
		System.out.println(em.result()); 

	}

}
