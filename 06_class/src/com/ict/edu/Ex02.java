package com.ict.edu;

public class Ex02 {
   //멤버필드:상태값, 속성, 특징
	//instance필드:객체 생성할때 같이 생성되는 필드
	//static필드:객체 생성과 상관없이 먼저 생성되는 필드 static표시
	int kor=80;                 //instance변수
	static int eng=85;          //static변수
	final int math=90;          //final:상수 의미, 인스턴스 상수
	final static int com=96;    //static 상수
	
	//변수와 상수의 차이
	//메소드:기능, 동작
	//메소드 구성: 접근제한자  메소드종류 반환형 메소드이름(인자)
	//void는 되돌아갈때 결과가 없다
	public void prn() {
		//변수는 변경 가능
		kor=kor+10;
		eng=eng+10;
		//상수는 변경하면 오류발생
		//math=math+10;
		//com=com+10;
	}
	
}
