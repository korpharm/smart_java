package com.ict.edu;
//자식클래스에서 부모클래스와 상속관계를 맺는다
public class Ex01_sub extends Ex01_sup {
String name="홍반장";
int age=17;

public Ex01_sub() {
	System.out.println("자식클래스 생성자"+this);
}
public void play() {
	System.out.println(name);
	String name="홍두깨";
	System.out.println(name);
	//addr은 지역에도 없고 전역에도 없으나
	System.out.println(addr);
	System.out.println(this.addr);
	
	int age=3;
	System.out.println(age);
	System.out.println(this.age);
	System.out.println(super.age);
}
	public void play2(){
		System.out.println(car);
	}
	
}	
	

