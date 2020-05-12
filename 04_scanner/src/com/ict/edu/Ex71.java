package com.ict.edu;

import java.util.Scanner;

public class Ex71 {
public static void main(String[] args) {
	
	
		Scanner sc=new Scanner(System.in);
		
		
			
		
		System.out.print("메뉴를 선택하세요\n 1.커피음료 3천원 \n 2.이온음료 2천원 \n 3. 물 1천원 \n 4.과일음료 4천원 ");
		int menu=sc.nextInt();
		int dan=0;
			
				
		switch(menu) {
		case 1: dan=3000;break;
		case 2: dan=2000;break;
		case 3: dan=1000;break;
		case 4: dan=4000;break;
		default: System.out.println("잘못 입력했습니다"); 
		
		
		}
		
		System.out.println("잔 수를 입력하세요");
		int su=sc.nextInt();
		
		System.out.print("지불할 돈을 입력하세요");
		int input=sc.nextInt();
		
		int outpu=input-(int)(su*dan*1.1);
		
		if (outpu>0) {System.out.println("거스름 돈은");
		System.out.println(outpu+"원 입니다");}
		else {System.out.println((int)(su*dan*1.1)-input+"원을 더 내셔야 합니다");}
		
		
}
}
