package com.ict.edu;

import java.util.Scanner;

public class Ex_08 {
public static void main(String[] args) {
		
	Ex08 coffee=new Ex08();
	coffee.setName("Ŀ������");
	coffee.setPrice(1000);
	
	Ex08 ion=new Ex08();
	ion.setName("�̿�����");
	ion.setPrice(1500);
	
	Ex08 cola=new Ex08();
	cola.setName("�ݶ�");
	cola.setPrice(1200);
	
	Ex08 juice=new Ex08();
	juice.setName("�꽺");
	juice.setPrice(2000);
		
//	Ex08[] menu=new Ex08[4];
//	menu[0]=coffee;
//	menu[1]=ion;
//	menu[2]=cola;
//	menu[3]=juice;
	
	Ex08[] menu= {coffee,ion,cola,juice};
	
	Scanner sc=new Scanner(System.in);
	System.out.print("�Աݾ��� �Է��ϼ���");
	int input=sc.nextInt();
	
			
		if(input<1000)
			{System.out.println("�ݾ׺���");
			}else {System.out.println("Ŀ��\t �̿�\t ����\t �꽺\t");
			for (int i = 0; i < menu.length; i++) {
				if(menu[i].getPrice()<=input) {
					System.out.print("o");
				}else System.out.print("x");
			}
			}
	System.out.print("�����ϼ���");
	String drink=sc.next();
	int output=0;
	switch(drink){
		case "Ŀ��":output=input-menu[0].getPrice();break;
		case "�̿�":output=input-menu[1].getPrice();break;
		case "����":output=input-menu[2].getPrice();break;
		case "�꽺":output=input-menu[3].getPrice();break;
	}
	System.out.println("�ܵ�  "+output);
}
}
