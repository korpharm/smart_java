package com.ict.edu8;
//인터페이스 상속
//1. 일반클래스가 상속 받으면 반드시 오버라이딩 해야한다
class Ex03 implements Ex01 {

	@Override
	public void play() {		
	}

	@Override
	public void play2() {				
	}

	@Override
	public void sound() {				
	}

}
//2.추상클래스가 상속받으면 오버라이딩 할 필요가 없다
abstract class Ex04 implements Ex01{
	int k1=10;//인스턴스 변수
	public abstract void leftSound();
	
}
//3.interface가 상속받으면 오버라이딩 할 필요가 없다
interface Ex06 extends Ex01{
	int k1=10;//static final
}

class Ex07 extends Ex04{
	public void play2() {				
	}
	public void sound() {				
	}
}