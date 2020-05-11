package com.ict.edu;

public class Ex10 {
public static void main(String[] args) {
	//break, continue
	//break:현재 위치의 블록을 탈출할때 사용하는 예약어
	//continue:continue 이하 수행문을 포기하고 다음 회차로 진행하는 예약어
	//continue:continue 이하 수행문을 포기하고 바로 증감식으로 간다
	// break continue는 보통 if문과 함께 사용된다
	
	// 1~10 출력
	
	for (int i = 1; i <11; i++) {
		System.out.print(i+" ");
		
	}
	System.out.println();
	
	// i가 6일때 break
	
	for (int i = 1; i <11; i++) {
		if(i==6) break;
		System.out.print(i+" ");
		
	}
	System.out.println();
	
	
	// i가 6일때 continue
	
	for (int i = 1; i <11; i++) {
		if (i==6) continue;
		System.out.print(i+" ");
		
	}
	System.out.println();
	
	//0-10까지 짝수 출력
	
	for (int i = 0; i <11; i++) {
		if(i%2==1) continue;
		System.out.print(i+" ");
		
	}
	System.out.println();
	
	
		
		
	
}    
}
