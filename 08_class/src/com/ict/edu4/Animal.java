package com.ict.edu4;
//final:final 클래스는 상속안됨  final 메소드는 오버라이딩 안됨, final 변수는 값변경 안됨->상수

public class Animal {
	
int eyes=2;
int legs=4;

public void Like() { 
	System.out.println("잠자기");
	
}


public void sound() {
	System.out.println("울음소리내기");
}

public final void sleep()
{
	System.out.println("6시간만 잠을 잔다");
}

}
