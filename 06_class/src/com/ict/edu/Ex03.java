package com.ict.edu;

public class Ex03 {
	//멤버메소드:기능
	//반환형:실행 후 되돌아갈때 결과를 가지고 갈때 결과에 대한 자료형을 말한다. 만약 결과를 가지고 가지않으면 void 예약어 사용
	//      메소드를 호출하면 해당 메소드가 실행한후 호출한 곳으로 되돌아간다
	int sound=10;
	double sound2=10.0;
	
	public void add() { 
		System.out.println("add.1");
		sound++;
		System.out.println("add.2");
	}

	public void sub() {
		sound--;
		return;                 //void형은 return을 써도 되고 안써도 됨
	}
	
	public int mul() {
		System.out.println("mul.3");
		return sound*10;         //비void형은 꼭 return을 써야함
			}
	
	public double plus() {
	    return sound2;
}
	public double plus2() {
	    return sound;
}
}