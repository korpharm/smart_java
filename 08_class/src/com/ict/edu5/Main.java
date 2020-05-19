package com.ict.edu5;

public abstract class Main {
	public static void main(String[] args) {
		 Animal a1=new Cat();
		 Cat.Like();
		 
		 Animal a2=new Dog();
		 Dog.Like();
	}
	
	
//추상클래스:추상메소드를 가지고있는 클래스
//         일반적인 멤버필드와 메소드필드를 가지고 있을 수 있다.
	//추상메소드:body가 없는 메소드(즉 실행내용이 없는 메소드)를 추상메소드라고 한다
	//        반드시 Abstract라는 예약어를 사용해야한다.
	int su1=10;           //인스턴스 변수
	static int su2=20;    //static변수
	final int su3=30;     //인스턴스 상수
	static final int su4=40; //static상수
	
	public void play() {
		su1++;
		su2++;
	}
	
	//static메소드는 전역변수에서 static만 사용가능
	public static void prn() {
		int k1=100;
		//System.out.println(su1);
		System.out.println(su2);
		//System.out.println(su3);
		System.out.println(su4);
		
	}
	//추상메소드,추상메소드는 반드시 Abstract를 붙여야한다
	//그리고 반드시 클래스에도  Abstract를 붙여야한다
	public abstract void Like();
	
	
	
}
