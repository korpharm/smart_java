package com.ict.edu;

public class Ex05 {
public static void main(String[] args) {
	//for문:정해진 규칙에 따라 실행문을 반복처리하는 문
	// for(초기식;조건식;증감식) {
		// 조건식이 참일때 실행할 문장;
	//}
	//for문은 무조건 초기식부터 시작한다 이후 조건식으로 이동
	//조건식은 boolean형
	//조건식이 참이면 안쪽 블록을 실행한다 거짓이면 실행하지않는다
	//for문의 끝을 만나면 무조건 증감식으로 간다
	//증감식은 초기식을 증가하거나 감소시키는 역할을 하고 다시 조건식으로 간다
	//자바에서는 if문 switch문 for문 안에서 만든 변수는 밖에서는 쓸 수 없다
	
// 안녕하세요 10번 출력하기
	System.out.println("안녕하세요");//10번
	
	for (int i = 1; i <11; i++) {
		System.out.println(i+"=Hello");
	}
	System.out.println("==============");
	
	//0-10까지 출력
	for (int i = 0; i < 11; i++) {
		System.out.println(i);
		
	}
	System.out.println("==============");
	//0-10까지 짝수 출력
	for (int i = 0; i < 11; i++) {
		System.out.println(i);
		i++;
	}
	
	for (int i = 0; i <11; i=i+2) {
		System.out.println(i);
	}
	
	for (int i = 0; i <11; i++) {
		if(i%2==1) {
			System.out.println(i);
	}
	
}

}
}

