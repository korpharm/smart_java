package com.ict.edu;

public class Ex02 {
public static void main(String[] args) {
	// 배열:같은 자료형의 데이터들을 한 곳에 모아둔 묶음
			// 반드시 같은 자료형이어야만 한다
			// 생성할때 크기를 지정하고 지정된 크기는 변경 불가
			// 배열을 출력할때는 일반적으로 for문을 사용한다

			// 배열 생성 순서: 선언 ->생성 ->데이터 저장
	
	//선언과 생성을 한번에
	//char[] ch;
	//ch=new char[4];
	char[] ch=new char[4];
	
	ch[0]='j';
	ch[1]='a';
	ch[2]='v';
	ch[3]=65;//0~65535 사이의 수는 char들어갈 수 있다
	
	 for (int i = 0; i < ch.length; i++) {
		System.out.println(ch[i]);
	}
	 
	 for (char k : ch) {
		 System.out.println(k);
	}
	System.out.println("=================");
	// 선언 생성 데이터 저장을 한번에
	char[] ch2= {'j','a','v','a' };
	int[] k2= {100,200,300,400};
	double[] d2= {3.14,71.0,42.1};
	String[] str= {"홍길동","김길동","성길동","마길동"};
	
	
	
}
}
