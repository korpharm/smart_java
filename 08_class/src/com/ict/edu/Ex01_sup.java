package com.ict.edu;
//부모클래스
public class Ex01_sup {

	String name="홍길동";
	int age=27;
	String addr="서울";
	private String dog="댕댕이";
	static int car=1;
	boolean gender=true;
	
	public Ex01_sup() {
		System.out.println("부모클래스 생성자"+this);
	}
	public void prnl() {
		System.out.println("부모클래스 메소드");
	}
	public static void prn2() {
		System.out.println("부모클래스 메소드");
	}
}
