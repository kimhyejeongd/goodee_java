package com.myobj.run;

import com.myobj.vo.Product;

public class ProductMain {

	public static void main(String[] args) {
		Product pd=new Product("맥북",590,"그레이",0.2);
		System.out.println(pd.num+pd.name+pd.price+pd.color+pd.sale);
		Product pd2=new Product("갤럭시24",180,"검정",0.1);
		System.out.println(pd2.num+pd2.name+pd2.price+pd2.color+pd2.sale);
		Product pd3=new Product("아파트34평",40000,"핫핑크",0);
		System.out.println(pd3.num+pd3.name+pd3.price+pd3.color+pd3.sale);

		Product pd4=new Product("책상",200);
		Product pd5=new Product("이어폰",30,"갈색");

	}

}
