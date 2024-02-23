package com.myobj.run;
import com.member.vo.Board;
import com.member.vo.Employee;
import com.member.vo.Member;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Member admin=new Member();
		admin.id="admin";
		admin.pw="1234";
		admin.email="admin@admin.com";
		admin.age=55;
		admin.hobby="운동,코딩";
		Member user01=new Member();
		user01.id="user01";
		user01.pw="1111";
		user01.email="user01@user01.com";
		user01.age=33;
		user01.hobby="코딩";
		System.out.println(admin.id+" "+admin.pw+" "+admin.email+" "+admin.age+" "+admin.hobby);
		System.out.println(user01.id+" "+user01.pw+" "+user01.email+" "+user01.age+" "+user01.hobby);


		Board first=new Board();
		first.wp="나야나";
		first.rmf="첫번째";
		first.so="글쓰다";
		first.skf="23/03/20";
		Board second=new Board();
		second.wp="너야너";
		second.rmf="두번째";
		second.so="글쓰다";
		second.skf="23/03/20";
		System.out.println("첫번째 글 "+first.wp+" "+first.rmf+" "+first.so+" "+first.skf);
		System.out.println("두번째 글 "+second.wp+" "+second.rmf+" "+second.so+" "+second.skf);
		
		Employee fir=new Employee();
		String totalEmp="";
		for(int i=0;i<5;i++) {
		Scanner sc=new Scanner(System.in);
		System.out.println("==== 사원등록 ====");
		System.out.print("이름 : ");
		fir.name=sc.next();
		sc.nextLine();
		System.out.print("부서명 : ");
		fir.qn=sc.next();
		System.out.print("급여 : ");
		fir.sal=sc.nextInt();
		System.out.print("전화번호 : ");
		fir.num=sc.next();
		System.out.print("인센티브 : ");
		fir.bonus=sc.nextDouble();
	
		totalEmp+=fir.name+" "+fir.qn+" "+fir.sal+" "+fir.num+" "+" "+fir.bonus+"\n";
	}
		System.out.println(totalEmp);
	}
}
