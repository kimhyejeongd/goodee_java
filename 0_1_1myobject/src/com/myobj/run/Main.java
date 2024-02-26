package com.myobj.run;

import java.util.Scanner;

import com.myobj.vo.Board;
import com.myobj.vo.Employee;
import com.myobj.vo.Member;

public class Main {

	public static void main(String[] args) {
		Member admin=new Member();
		admin.name="admin";
		admin.num=1234;
		admin.email="admin@admin.com";
		admin.age=55;
		admin.hobby="운동,코딩";
		
		Member user01=new Member();
		user01.name="user01";
		user01.num=1111;
		user01.email="user01@user01";
		user01.age=33;
		System.out.println(admin.name+" "+admin.num+" "+admin.email+" "+admin.age+" "+admin.hobby);
		System.out.println(user01.name+" "+user01.num+" "+user01.email+" "+user01.age+" "+user01.hobby);
		
		Employee first=new Employee();
		first.name="첫번째 글";
		first.pro="나야나";
		first.so="글쓰다";
		first.date="23/03/10";
		
		Employee second=new Employee();
		second.name="두번째 글";
		second.pro="너야너";
		second.so="글쓰다";
		second.date="23/03/20";
		
		System.out.println(first.name+" "+first.pro+" "+first.so+" "+first.date);
		System.out.println(second.name+" "+second.pro+" "+second.so+" "+second.date);
		
		Scanner sc=new Scanner(System.in);
		String sum="";
		for(int i=0;i<5;i++ ) {
		Board bor=new Board();
		System.out.println("이름 : ");
		bor.name=sc.next();
		System.out.println("부서명 : ");
		bor.qntj=sc.next();
		System.out.println("급여 ; ");
		bor.sal=sc.nextInt();
		System.out.println("전화번호 :");
		bor.phone=sc.next();
		System.out.println("인센티브 :");
		bor.bonus=sc.nextDouble();
		sum+=bor.name+" "+bor.qntj+" "+bor.sal+" "+bor.phone+" "+bor.bonus;
		}
		System.out.println(sum);
	}

}
