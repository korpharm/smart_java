package com.ict.edu;

public class Ex01 {
//상속관계:자식클래스가 부모클래스의 멤버 필드,멤버메소드를 객체생성없이 마음대로 사용할 수 있는 클래스간의 관계를 말한다
//자식클래스가 부모클래스와 관계를 맺는 정보를 입력한다  자식클래스extends부모클래스
//자바에서는 다중 상속을 할 수 없다. 즉 부모클래스가 하나만 존재한다.
	//모든 클래스는 object라는 클래스를 상속받고있다
	public static void main(String[] args) {
		Ex01_sub test=new Ex01_sub();
		System.out.println(test);
		test.play();
		
		//부모클래스의 매소드 사용가능
		test.prnl();
		
		//static은 상속과 상관없이 사용가능
		System.out.println(Ex01_sup.car);
		Ex01_sup.prn2();
	}
}
