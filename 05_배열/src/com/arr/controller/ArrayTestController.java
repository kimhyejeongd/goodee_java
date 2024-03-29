package com.arr.controller;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class ArrayTestController {
   
   public void basicArray() {
      

         //초기화: ('='으로 변수에 적당값을 할당)
         //메모장 내용도 저장하기
         //지역변수: 특정범위 내에서만 유효한 변수
         //메소드(기능)에 대해..
         //void 부분 차이
      

      
      
      //기본배열 활용하기
      //배열은 기본으로 제공되는 저장공간으로 생성해서 사용을 한다.
      //배열의 저장구조는 선형구조
      //저장순서가 있고, 저장소에 지칭하는 번호를 가진다(인덱스)
      //지칭하는 번호는 0부터 시작을 함
      
      //배열  사용해보기
      //배열변수를 선언
      // 자료형[] 배열명;
      char[] alpha;//선언. 배열저장소의 주소 * 참조형자료형
      //char[] alpha='a' 바로 사용못함
      //반드시 선언된 변수에 배열을 할당해서 사용한다.
      // new 자료형[길이];
      //한번 할당된 배열은 길이를 변경할 수 없다..
      alpha=new char[3]; //할당.
      int[] intArr=new int[5]; //선언과 동시에 할당이 가능
      
      //new연산자로 생성된 배열저장소는 heap영역에 초기값(디폴드값)이 설정된다.
      //정수형(byte,short,int,long) : 0
      //실수형(float,double) : 0.0
      //문자형(char) : ' '(한칸 띄어쓰기)
      //문자열(String) : null
      
      //할당된 배열저장소 이용하기
      System.out.println(alpha);
      System.out.println(intArr); 
      //배열저장소에 접근하려면 변수명과 인덱스번호를 같이 사용
      System.out.println(alpha[0]);
      System.out.println(alpha[1]);
      System.out.println(alpha[2]);
      
      System.out.println(intArr[0]);
      System.out.println(intArr[1]);
      System.out.println(intArr[2]);
      
      //alpha배열 3개
      //0~2 -> 3-1
      //인덱스범위를 초과해서 설정을 하면?
      // ->java.lang.ArrayIndexOutOfBoundsException 에러발생.
      //System.out.println(alpha[3]);
      
      //alpha배열의 각 저장소에 A B C 순차적으로 저장
      alpha[0]='A';
      alpha[1]='B';
      alpha[2]='C';
      
      System.out.println(alpha[0]);
      System.out.println(alpha[1]);
      System.out.println(alpha[2]);
      
      //intArr 저장소 본인스터디 친구들의 나이를 저장하고 출력하기
      intArr[0]=24;
      intArr[1]=29;
      intArr[2]=28;
      intArr[3]=23;
      intArr[4]=28;
      
      //System.out.println(intArr[0]);
      //System.out.println(intArr[1]);
      //System.out.println(intArr[2]);
      //System.out.println(intArr[3]);
      //System.out.println(intArr[4]);
      
      
      //for문과 같이 반복문 출력하기
      //배열에 저장된 데이터 출력하기      
      for(int i=0;i<5;i++) {
         System.out.println(intArr[i]);
         
      }
      //intArr변수에 1~5까지 값을 저장
      //(비추.인덱스 +-될수 있으므로 추상화 추천->아래에 설명->.length)
      for(int i=0;i<5;i++) {
         intArr[i]=i+1;
      }
      for(int i=0;i<5;i++) {
         System.out.println(intArr[i]);
      }
      
      intArr[0]=200; //값은 다시 선언?저장? 초기화인듯. 가능(후에 중괄호는불가)
      System.out.println(intArr[0]);
      
      
      //배열의 저장소의 갯수(길이) 알려주는 변수
      //배열명.length ->괄호안씀. 
      System.out.println(intArr.length);
      System.out.println(alpha.length);
      String name="유병승";
      name.length();
      
      
      for(int i=0;i<intArr.length;i++) {
         System.out.println(intArr[i]);
      }
      
      //int형 배열 10개를 할당하고,
      // 각 저장소에 10~19까지 저장하기
      
      
      //본인 작성 중
      //int[] num;
      //num=new int[10];
      //for(int i=0;i<=9;i++) {
      //   num[i]=i+10;
      //}   
         
      //쌤 정답
      int[] su=new int[10];
      for(int i=0;i<su.length;i++) {
         su[i]=i+10;
      }
      for(int i=0;i<su.length;i++) {
         System.out.println(su[i]);
      }
      
      
      //학생 5명의 키를 입력받아 저장하는 기능 구현하기
      //저장후 출력
      
      Scanner sc=new Scanner(System.in);
      System.out.println("=== 학생 키 정보 ===");
      double[] stHeight=new double[5];
      for(int i=0;i<stHeight.length;i++) {
         System.out.print(i+1+".학생키: ");
         stHeight[i]=sc.nextDouble();
      }
      for(int i=0;i<stHeight.length;i++) {
         System.out.println(stHeight[i]);
      }
      
      
      //배열을 선언할때 배열에 저장될 값이 정해져있다면
      //배열을 선언과 동시에 초기화
      char[] chArr= {'가','나','다','라'};
      for(int i=0;i<chArr.length;i++) {
         System.out.println(chArr[i]);
      }
      
      //chArr= {'A','B','C'}; 중괄호 생성후는 새 값 설정불가
      //배열변수가 선언된 이후에 새로운 값으로 설정하려면
      // new 자료형[]{값,값,값}으로 대입해야한다.
      chArr=new char[] {'A','B','C'};
      
      for(int i=0;i<chArr.length;i++) {
         System.out.println(chArr);
      }
      chArr[0]='유';
      for(int i=0;i<chArr.length;i++) {
         System.out.println(chArr[i]);
      }
      //한번선언된 배열의 길이는 변경되지 않는다!
      String[] names=new String[] {"유병승","유지희","유승주","유선정","손지연"};
      //names[5]="김주환"; -> 새로추가 불가. 에러발생
      
      //데이터 조회, 필터(원하는 값을 찾기)
      
      int[] numbers2= {10,20,30,40,50,60,70,80};
      
      //저장된 정수 중 50보다 큰값의 갯수는?
      int count=0;
      for(int i=0;i<numbers2.length;i++) {
         if(numbers2[i]>=50) {
            count++; //갯수세기? 증가시킴(++)
         }
      }
      System.out.println("50보다 큰 값의 개수: "+count);
      
      //int su=10,su1=20,su2=30....;
      /* 비추방법
      count=0;
      if(su>=50) {
         count++;
      }
      if(su2>=50) {
         count++;
      }...반복
      */
      
      
      //저장된 학생이름 중 김씨 학생의 수를 구하는 기능 +이름까지 출력해보기.
      String[] studentName= {"김솔민","김보미","김명준","고재현","강요한","박종혁","박진형","유지희","유승주","윤상빈","이기수","이성록"};
      int count1=0;
      char lastName=' ';
      for(int i=0;i<studentName.length;i++) {
         if(studentName[i].charAt(0)=='김') {
            count1++;
         }
      }
      System.out.print("김씨 학생의 수: "+count);
      
            
      //사용자가 원하는 성씨의 학생 수 구하기
      /* 써치스튜던트 어딨?
      int count2=0;
      System.out.print("검색을 원하는 성씨: ");
      char firstName=sc.next().charAt(0);
      for(int i=0;i<studentName.length;i++) {
         if(studentName[i].charAt(0)==firstName) {
            count2++; 
            searchStudent+=studentName[i]+" ";
         }
      }
      System.out.print(firstName+"씨 성을 가진 학생 수 "); 
      System.out.print("검색된학생");
      System.out.print(searchStudent);   
      */
      
      
      //정수 10개를 랜덤(1~100)으로 저장하는 기능 만들기(배열의 각 인덱스값에 하나씩 넣기)
      //값 하나하나 접근할때 쓰는->for문
      int[] rndNum=new int[10];
      Random rnd=new Random();
      for(int i=0;i<rndNum.length;i++) { //rndNum[i]xxxx
         rndNum[i]=(int)(Math.random()*100+1);//math앞괄호묶기 단항연산보다 비교?연산? 이 우위?
         // 내가하던거... int rn=rnd.nextInt(100)+1;
         // rn=rndNum[i];
      }
      for(int i=0;i<rndNum.length;i++) {
         System.out.print(rndNum[i]+" ");
      }
      System.out.println();
      //저장된 10개의 정수에서 최대값, 최소값을 출력하기
      int max=rndNum[0]; //max=0;(x)
      int min=rndNum[0]; //min=0;(x)
      for(int i=0;i<rndNum.length;i++) {
         if(rndNum[i]>max) {
            max=rndNum[i];
         }
         if(rndNum[i]<min) {
            min=rndNum[i];
         }
      }
      System.out.println("최대값: "+max+" 최소값: "+min);
      
      // 배열은 선형구조 -> 데이터에 순서가 있음
      // 0번인덱스 첫번째, 변수명.length-1번인덱스 마지막
      // 정렬할 수 있다. 오름차순, 내림차순
      
      int[] testArr= {4,3,6,2,7,5,1};
      //0번 인덱스의 값을 1번인덱스의 값과 바꾸기
      int temp=testArr[0];
      testArr[0]=testArr[1];
      testArr[1]=temp;
      for(int i=0;i<testArr.length;i++) {
    	  System.out.print(testArr[i]+" ");
      }
      System.out.println();
      
      // 오름차순으로 정렬하기
      for(int i=0;i<testArr.length;i++) {
    	  //int next=testArr[i];
    	  for(int j=0;j<i;j++) {
    			  //int prev=testArr[j];
    			  if(testArr[j]<testArr[i]) {
    				  int t=testArr[j];
    				  testArr[j]=testArr[i];
    				  testArr[i]=t;
    			  }
    	  		}
    		  }
    		  for(int i=0;i<testArr.length;i++) {
    			  System.out.print(testArr[i]+" ");
    		
    		  System.out.println();
    	  }
    		
    		  }
   public void arrayCopyTest() {
		  // 배열의 복사를 알아보자.
		  //배열을 복사
		  //1. 얕은복사 : 원본값을 공유하는 방식 * 주소값만 복사
		  //2. 깊은복사 : 별도의 조장공간을 확보하고 데이터를 복사 * 사본
	   	  //얇은복사
	   int[] num= {1,2,3,4,5};
	   System.out.println(num);
	   int[] copyNum=num;
	   System.out.println(copyNum);
	   num[2]=200; // num뿐만아니라 copynum도 바뀐다
	   for(int i=0;i<num.length;i++) {
		   System.out.print(num[i]+" ");
	   }
	   System.out.println();
	   for(int i=0;i<copyNum.length;i++) {
		   System.out.print(num[i]+" ");
	   }
	   //깊은복사
	   //1. for문으로 직접복사
	   int[] deepCopyArr=new int[num.length];
	   for(int i=0;i<num.length;i++) {
		   deepCopyArr[i]=num[i];
	   }
	   System.out.println();
	   num[1]=500;
	   System.out.println("num : "+Arrays.toString(num));
	   System.out.println("deepCopyArr : "+Arrays.toString(deepCopyArr));
	   //2. System.arraycopy() 기능 이용
	   //()안에 다섯개의 값을 설정
	   //()안에 다섯개의 값을 설정
	   //첫번째 : 원본배열명
	   //두번째 : 원본배열 시작 인덱스번호
	   //세번째 : 복살될 배열명
	   //네번재 : 복사될배열의 시작 인덱스번호
	   //다섯번째 : 길이 								
	   String[] names= {"유병승","홍길동","김유신"};
	   String[] copyName=new String[5];
	   System.arraycopy(names, 0, copyName, 0,names.length);
	   System.out.println("names : "+Arrays.toString(copyName));
	   //3. Arrays.copyof()기능 이용
	   String[] copyName2=Arrays.copyOf(names,3);
	   System.out.println("copyName2 : "+Arrays.toString(copyName2));
	   
	   //4. colne() 기능 이용
	   String[] copyName3=names.clone();
	   System.out.println("copyName3 : ;"+Arrays.toString(copyName2));
      }
   public void doubleArray() {
	   //2차원배열에 대해 알아보자
	   //배열저장소 두개가 연결되어있는 저장구조
	   //바둑판식의 저장구조를 갖고있음
	   int[][] intArr;
	   intArr=new int[3][3];
	   System.out.println(intArr);
	   System.out.println(intArr[0]);
	   System.out.println(intArr[1]);
	   System.out.println(intArr[0][0]);
	   System.out.println(intArr[0][1]);
	   System.out.println(intArr[0][2]);
	   System.out.println(intArr[1][0]);
	   System.out.println(intArr[1][1]);
	   System.out.println(intArr[1][2]);

	   for(int i=0;i<intArr.length;i++) {
		   for(int j=0;j<intArr[i].length;j++) {
			   System.out.print(intArr[i][j]);
		   }
		   System.out.println();
	   }

	   // 이차원배열에 값 대입하기
	   intArr[0][0]=100;
	   intArr[1][0]=200;
	   //intArr[1]=200;
	   for(int i=0;i<intArr.length;i++) {
		   for(int j=0;j<intArr[i].length;j++) {
			   System.out.print(intArr[i][j]);
		   }
		   System.out.println();
	   }
	   //5*5 int형 배열을 생성하고 
	   //12345
	   //12345
	   //12345
	   //12345
	   //12345
	   int[][] numbers=new int[5][5];
	   for(int i=0;i<numbers.length;i++) {
		   for(int j=0;j<numbers[i].length;j++) {
			   numbers[i][j]=j+1;
		   }
	   }
	   for(int i=0;i<numbers.length;i++) {
		   for(int j=0;j<numbers[i].length;j++) {
			   System.out.print(numbers[i][j]);
		   }
		   System.out.println();
	   }
	   /*1 2 3 4 
	     5 6 7 8
	     9 10 11 12 */
	   int[][] number2=new int[3][4];
	 /*  int value=1;
	   for(int i=0;i<number2.length;i++) {
		   for(int j=0;number2[i].length;j++) {
			   number2[i][j]=value++;		 
			   }
	   }
	   for(int i=0;i<number2.length;i++) {
		   for(int j=0;j<number2[i].length;j++) {
			   if(num2[i][j]<10) {
			   System.out.println(number2[i][j]+" ");
			   }else {
				   System.out.println(num[i][j]+" ");
			   }
		   }*/
		 
		   //선언과 동시에 초기화
	   String[][] test= {{"가","나","다"},
			   {"A","B","C"},{"a","b","c"}};
	   //행만 설정할 수 있음
	   String[][] category=new String[3][];
	   category[0]= new String[]{"짜장면","짬뽕","탕수육"};
	   category[1]=new String[5];
	   category[2]=new String[2];
	   
	   for(int i=0;i<category.length;i++) {
		   for(int j=0;j<category[i].length;j++) {
			   System.out.println(category[i][j]);
		   }
		   System.out.println();
	   }
	   String[][] study= {
			   {"손지연","김동훈","김해진","김지연","유선정","유승주","유지희"},
			   {"강요한","김혜정","최헌수","이성록","윤상빈","최선웅"},
			   {"이기수","김명준","김주환","전승우","임성욱","김보미"},
			   {"박진형","김건민","김솔민","박진형","서보민","이우석"},
			   {"고재현","박종혁"}
	   			};
	   // 1. 고재현님의 저장위치를 출력하고 같은 조원의 수를 출력하기
	   // 출력 고재현님은 0번째 행, 0번 열에 있습니다.
	   // 2. 이름을 입력받아 그 사람의 위치와 같은 조원 수를 출력
	   //    없으면 없는사람입니다. 를 출력
	   Scanner sc=new Scanner(System.in);
	   System.out.println("검색할 학생이름 : ");
	   String name=sc.next();
	   boolean isExist=false;
	   t:for(int i=0;i<study.length;i++) {
		   for(int j=0;j<study[i].length;j++){
			   //if(study[i][j].equals("고재현")){
			   if(study[i][j].equals(name)) {
				   System.out.println(name+(i+1)+"번째 행, "+(j+1)+"번째 열에 있습니다");
				   //System.out.println("고재현님은 "+i+"번째 행, "+j+"번째 열에 있습니다");
				   System.out.println("조원은 "+study[i].length+"명입니다");
				   isExist=true;
				   break t;
		   }
		 }
		   //System.out.println();
	   }
	   if(!isExist) {
	   System.out.println("없는사람입니다.");
	   }
	   }
   //배열에 저장된 데이터를 순회하기
   public void extraTest() {
	   int[] intArr= {1,2,3,4,5};
	   for(int i=0;i<intArr.length;i++) {
		   System.out.print(intArr[i]+" ");
	   }
	   System.out.println();
	   // forEach문을 이용해서 데이터 순회하기
	   // for(변수선언 : 배열명) { }
	   for(int v : intArr) {
		   if(v>=3) {
		   System.out.print(v+" ");
		   }
	   }
	   System.out.println();
	   
	   //intArr값에서 4인값을 100으로 변경하기
	   for(int v: intArr) {
		   if(v==4) {
			   v=100;
		   }
	   }for(int i=0;i<intArr.length;i++) {
		   if(intArr[i]==4) {
			   intArr[i]=100;
		   }
	   }
	   System.out.println(Arrays.toString(intArr));
	   
	   //정수를 5개 저장할 수 있는 배열에 1~10까지의 랜덤값을 저장
	   //*중복값 없이 저장하기
	   Random rnd=new Random();
	   int[] intArr2=new int[5];
	   for(int i=0;i<intArr2.length;i++) { 
	         intArr2[i]=(int)(Math.random()*10+1);
	         for(int j=0;j<i;j++) {
	        	 if(intArr2[i]==intArr2[j]) {
	        		 i--;
	        		 break;
	        	 }
	         }
	         
	   }
	   System.out.println(Arrays.toString(intArr2));
	   
	   // 로또 만들기
	   //1~45 번 랜덤값을 지정
	   //중복값없이, 오름차순으로 정렬
	   //로또번호 출력
	   Random rnd2=new Random();
	   int[] lo=new int[6];
	   for(int i=0;i<lo.length;i++) {
		   lo[i]=(int)(Math.random()*45)+1;
		   for(int j=0;j<i;j++) {
			   if(lo[i]==lo[j]) {
				   i--;
			   }
			   if(lo[i]<lo[j]) {
				   int temp=lo[i];
				   lo[i]=lo[j];
				   lo[j]=temp;
						   
			   }
		   }
	   }
	   System.out.println(Arrays.toString(lo));
	   
	   //up&down게임 만들기
	   //랜덤으로 1~50까지 수 한개를 저장하고
	   //사용자가 입력하는 값과 비교해서 크면 up, 작으면 다운 출력
	   //맞출때까지 반복 맞추면 정답, 00회만에 맞췄습니다 출력
	   
   }
	   }
   
   
   


      
      
      
      
   

