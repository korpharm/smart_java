package com.ict.edu;

import java.util.Random;
import java.util.Scanner;
//����
public class test01 {
public static void main(String[] args) {
	Random k= new Random();
	
	
	while(true) {
	Scanner sc=new Scanner(System.in);
	int k1=k.nextInt();
	int k2=k1%2;
	if (k2<0) k2=-k2;
	System.out.println("Ȧ¦ �� �����ϼ���  Ȧ���� 1, ¦���� 2");
	int choice=sc.nextInt();
	
	System.out.println(k1);
	System.out.println(k2);
	
	if(k2==0 && choice==2)
	{ System.out.println("����");}
	else if(k2==1 && choice==1)
	{ System.out.println("����");}
	else{ System.out.println("Ʋ������");}
	System.out.println("����ұ��? 1.��� 2.�ߴ�");
	int choice1=sc.nextInt();
	if(choice1==2) {break;}
	}
	
	//ī��
	
	while(true) {
		Scanner sc=new Scanner(System.in);
		int k1=k.nextInt();
		int k2=k1%13;
		if (k2<0) k2=-k2;
		
		while(k2==0) {k2=k1%3;
		if(k2!=0)break;
		}
		
		System.out.println("1~13 ���� �� �����ϼ��� ");
		int choice=sc.nextInt();
		
		System.out.println(k1);
		System.out.println(k2);
		
		if(k2==choice && choice>7)
		{ System.out.println("����");}
		else if(k2==choice && choice<1)
		{ System.out.println("����");}
		else if(k2==choice && choice==7)
		{ System.out.println("���");}
		else{ System.out.println("Ʋ������");}
		System.out.println("����ұ��? 1.��� 2.�ߴ�");
		int choice1=sc.nextInt();
		if(choice1==2) {break;}
		}
	//���� ���� ��
	int i=0;
	int j=0;
	while(true) {
		Scanner sc=new Scanner(System.in);
		int k1=k.nextInt();
		
		int k2=k1%3;
		if (k2<0) k2=-k2;
		
		while(k2==0) {k2=k1%3;
		if(k2!=0)break;
		}
		
		System.out.println("����:1 ����:2 ��:3  �� �����ϼ��� ");
		int choice=sc.nextInt();
		
		System.out.println(k1);
		System.out.println(k2);
		
		if(k2==choice)
		{ System.out.println("����");}
		else if(k2==1 && choice==2)
		{ System.out.println("You Winner"); i++;j++;}
		else if(k2==1 && choice==3)
		{ System.out.println("You Looser");i++;}
		else if(k2==2 && choice==1)
		{ System.out.println("You Looser");i++;}
		else if(k2==2 && choice==3)
		{ System.out.println("You Winner");i++;j++;}
		else if(k2==3 && choice==1)
		{ System.out.println("You Winner");i++;j++;}
		else if(k2==3 && choice==2)
		{ System.out.println("You Looser");i++;}
		else{ System.out.println("Ʋ������");}
		
		System.out.println("����ұ��? 1.��� 2.�ߴ�");
		int choice1=sc.nextInt();
		if(choice1==2) {break;}
		
		}
	System.out.println("�·��� "+(j/i)*100+"% �Ӵ�");
}
}
