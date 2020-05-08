package com.ict.edu;

public class Ex09 {
public static void main(String[] args) {
	// do~while 문:while문과 같은 반복문
   // 초기값
    //do
    //실행문
    //증감식
	// }while(조건식)
	
	// 1~10 짝수
    int i=1;
	do {
		if(i%2==0) System.out.println(i);
		i++;
	} while (i<11);
	
	//1~10 누적합
	i=1;
	int res=0;
	do {
		res=res+i;
		i++;
	} while (i<11);
	System.out.println(res);
	
	//구구단 5단
	
	i=1;
	do {
		System.out.println("5*"+i+"="+5*i);
		i++;
	} while (i<10);
   
}
}
