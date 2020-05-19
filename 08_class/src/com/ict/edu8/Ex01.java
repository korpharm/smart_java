package com.ict.edu8;
//인터페이스:서비스 목록을 제공하는 것을 말한다
//         상수와 추상메소드들로 이루어졌다
//          생성자없다(객체생성 안됨)
//          유일하게 다중 상속이 가능
//          **인터페이스가 같다라는 말은 대체가 가능하다,호환이 가능하다

public interface Ex01 {
	//아래 수 모두 static final
	int su1=10; 
	static int su2=20;
	final int su3=30;
	static final int su4=40;
	
	public void play();//abstract 안써도 오류안남
	
	public abstract void play2();
	
	public void sound();
}
