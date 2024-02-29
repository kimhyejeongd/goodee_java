package com.bs.example.practice.run;
import com.bs.example.practice.model.vo.Stringmethod;
import com.bs.example.practice.model.vo.Stringsame;
import com.bs.example.practice.model.vo.Stringtruemethod;
import com.bs.example.practice.model.vo.intmethod;

public class Run {

	public static void main(String[] args) {
		Stringmethod sm=new Stringmethod();
		System.out.println(sm.sum("안녕","하세요"));
		
		intmethod im=new intmethod();
		System.out.println(im.sumInt(6, 4));
		
		Stringtruemethod st=new Stringtruemethod();
		System.out.println(st.trueTest('r'));
		
		Stringsame ss=new Stringsame();
		System.out.println(ss.sameName("안녕","안녕히"));
	}
}
