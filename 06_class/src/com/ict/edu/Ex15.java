package com.ict.edu;

public class Ex15 {
  //static 초기화
	// static{내용:  }
	int s1=100;
	static int s2=200;
	
	//static초기화
	static { 
		s2=1000;
		s3=2000;
		s4=3000;
	}
	static int s3=10;
	
	static int s4;     //선언을 나중에 해도 오류가 아니다
	
	public static void main(String[] args) {
		//System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
	
}
