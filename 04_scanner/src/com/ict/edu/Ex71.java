package com.ict.edu;

import java.util.Scanner;

public class Ex71 {
public static void main(String[] args) {
	
	
		Scanner sc=new Scanner(System.in);
		
		
			
		
		System.out.print("�޴��� �����ϼ���\n 1.Ŀ������ 3õ�� \n 2.�̿����� 2õ�� \n 3. �� 1õ�� \n 4.�������� 4õ�� ");
		int menu=sc.nextInt();
		int dan=0;
			
				
		switch(menu) {
		case 1: dan=3000;break;
		case 2: dan=2000;break;
		case 3: dan=1000;break;
		case 4: dan=4000;break;
		default: System.out.println("�߸� �Է��߽��ϴ�"); 
		
		
		}
		
		System.out.println("�� ���� �Է��ϼ���");
		int su=sc.nextInt();
		
		System.out.print("������ ���� �Է��ϼ���");
		int input=sc.nextInt();
		
		int outpu=input-(int)(su*dan*1.1);
		
		if (outpu>0) {System.out.println("�Ž��� ����");
		System.out.println(outpu+"�� �Դϴ�");}
		else {System.out.println((int)(su*dan*1.1)-input+"���� �� ���ž� �մϴ�");}
		
		
}
}
