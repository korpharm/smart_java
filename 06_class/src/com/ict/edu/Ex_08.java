package com.ict.edu;

import java.util.Scanner;

public class Ex_08 {
public static void main(String[] args) {
		
	Ex08 coffee=new Ex08();
	coffee.setName("커피음료");
	coffee.setPrice(1000);
	
	Ex08 ion=new Ex08();
	ion.setName("이온음료");
	ion.setPrice(1500);
	
	Ex08 cola=new Ex08();
	cola.setName("콜라");
	cola.setPrice(1200);
	
	Ex08 juice=new Ex08();
	juice.setName("쥬스");
	juice.setPrice(2000);
		
//	Ex08[] menu=new Ex08[4];
//	menu[0]=coffee;
//	menu[1]=ion;
//	menu[2]=cola;
//	menu[3]=juice;
	
	Ex08[] menu= {coffee,ion,cola,juice};
	
	Scanner sc=new Scanner(System.in);
	System.out.print("입금액을 입력하세요");
	int input=sc.nextInt();
	
			
		if(input<1000)
			{System.out.println("금액부족");
			}else {System.out.println("커피\t 이온\t 과일\t 쥬스\t");
			for (int i = 0; i < menu.length; i++) {
				if(menu[i].getPrice()<=input) {
					System.out.print("o");
				}else System.out.print("x");
			}
			}
	System.out.print("선택하세요");
	String drink=sc.next();
	int output=0;
	switch(drink){
		case "커피":output=input-menu[0].getPrice();break;
		case "이온":output=input-menu[1].getPrice();break;
		case "과일":output=input-menu[2].getPrice();break;
		case "쥬스":output=input-menu[3].getPrice();break;
	}
	System.out.println("잔돈  "+output);
}
}
