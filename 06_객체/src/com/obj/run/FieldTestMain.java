package com.obj.run;

import com.obj.model.vo.FieldTest;
import com.obj.model.vo.BasicObject;
public class FieldTestMain {
   
   public static void main(String[] args) {
      //이용할 FieldTest클래스 생성하기
      FieldTest ft=new FieldTest();
      //ctrl+shith+o
      //생성된 객체의 필드(멤버변수)에 접근하려면 접근연산자를 이용해서 접근
//      public으로 선언된 변수는 직접접근이 가능
      System.out.println(ft.price); //System.out.println(ft);->주소를 가져오므로 x
      ft.price=10000;
      System.out.println(ft.price);
//      default로 선언된 변수
//      System.out.println(ft.name);
//      private로 선언된 변수
//      System.out.println(ft.height);

      //final String CLASS_NAME;
      //System.out.println(ft.CLASS_NAME);
     // ft.CLASS_NAME="GDJ71";
      // ft.numbers=new int[3];
      if(ft.numbers==null) ft.numbers=new int[2];
      for(int i=0;i<ft.numbers.length;i++) {
    	  System.out.println(ft.numbers[i]);
      }
      if(ft.obj==null) ft.obj=new BasicObject();
      ft.obj.age=20;
   }
}
      
