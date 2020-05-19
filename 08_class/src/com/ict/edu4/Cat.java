package com.ict.edu4;

public class Cat extends Animal{
	String name="나비";
	int age=10;
	
	public void hobby() {
		System.out.println("쥐잡이");
	}
	@Override//부모클래스와 자식클래스 메소드가 같은 것,자식클래스가 자신에 맞게 변경
	public void sound() {
		System.out.println("야옹");
	}
	
	//public void sleep() {
	//	부모클래스에서 final 처리
	//}
	
	
}
