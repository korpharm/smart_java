package com.ict.edu;

import java.util.Random;

public class Ex02_main {
public static void main(String[] args) {
	//static멤버필드 호출
	System.out.println(Ex02.com);//클래스이름.멤버필드
	System.out.println(Ex02.eng);
	
	
	//Ex02 클래스 객체 만들기
	//클래스이름 참조변수=new 생성자
	//Ex02에 생성자가 없으면 기본 생성자로 생성
	Ex02 test=new Ex02();
	System.out.println(test.kor);//참조변수.멤버필드
	System.out.println(test.eng);
	System.out.println(test.math);
	System.out.println(test.com);
	
	System.out.println(test);
	
	System.out.println("========================");
	
	//API를 이용해서 static 메소드와 인스턴스 메소드를 호출하기
	// API에서 제공하는 random클래스의 nextInt()메소드와 nextInt(int n) nextDouble을 사용하는 예
	
	//nextInt()메소드와 nextInt(int bound) nextDouble static 아니므로 클래스를 객체로 만들어서 사용
	
	// 클래스를 객체로 만드는 방법
	// 클래스 참조변수=new 생성자
	Random ran=new Random();
	//nextInt:int 범위
	int res=ran.nextInt();
	
		System.out.println(res+"\t"+ran);
	
	System.out.println("---------------");
	//nextInt(숫자):반환값이 0부터 숫자-1까지
	res=ran.nextInt(9);
	System.out.println(res);
	System.out.println("---------------");
	
	//정해지지않은 0.0이상~1.0 미만의 실수/자리수는 길다
	double res2=ran.nextDouble();
	System.out.println(res2);
	
	//0부터 5까지의 정수로 표현하자 a*10/2=a* 5 그러나 5가 안나옴 그러므로 a*6
	System.out.println((int)(res2*6));
	
	//API에서 제공하는 static메소드 사용하기
	//Math클래스의 메소드들은 객체 생성없이 사용가능
	//클래스이름.멤버필드, 클래스이름.멤버메소드
	System.out.println(Math.random());
	//원하는 정수까지로 정해지지 않은 수 지정
	System.out.println((int)(Math.random()*60000));
}
}
