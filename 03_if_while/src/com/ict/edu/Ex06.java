package com.ict.edu;

public class Ex06 {
public static void main(String[] args) {
	//다중 for문:for문 안에 for문이 존재
	for (int i = 1; i <4; i++) {
		for (int j = 1; j <6; j++) {
			//System.out.print("i="+i);
			//System.out.println(",j="+j);
			System.out.println("i="+i+",j="+j);
			//System.out.println(+i+j);
			//System.out.print(i);
			//System.out.print(j);
		}
	}
	// 구구단
	for (int i = 2; i < 10; i++) {
		for (int j = 1; j <10; j++) {
			System.out.println(i+"*"+j+"="+i*j);
		}
	}
	//구구단 단별로 옆으로 출력
	
	for (int i = 2; i < 10; i++) {
		for (int j = 1; j <10; j++) {
			System.out.print(i+"*"+j+"="+i*j+"\t");
					}
		System.out.println();
	}
	
	for (int i = 1; i < 10; i++) {
		for (int j = 2; j <10; j++) {
			System.out.print(j+"*"+i+"="+i*j+"\t");
					}
		System.out.println();
	}
	//0000
	
	for (int i = 0; i <4 ; i++) {
		for (int j =0; j <4; j++) {
			System.out.print(0);
					}
		System.out.println();
	}
	
	
	for (int i = 0; i <4 ; i++) {
		
		for (int j =0; j <4; j++) {
			if(i==j) {System.out.print(1);}
			else System.out.print(0);
					}
		System.out.println();
	}
	
}
}
