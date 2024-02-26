package com.obj.run;

import com.obj.model.vo.Animal;

public class GetterSetterMain {

	public static void main(String[] args) {
		//푸바오 등록
		Animal pubao=new Animal();
		//pubao.name="푸바오";
		//System.out.println(pubao.name);
		pubao.setName("푸바오");
		System.out.println(pubao.getName());
		//4, 100, 초식, 자이언트판다
		pubao.setWeight(100);
		System.out.println(pubao.getWeight());
		pubao.setFood("초식");
		System.out.println(pubao.getFood());
		pubao.setType("자이언트판다");
		System.out.println(pubao.getType());
		

	}

}
