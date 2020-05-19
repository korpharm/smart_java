package com.ict.edu;

import java.util.Random;
import java.util.Scanner;
//승율
public class test01 {
public static void main(String[] args) {
	Random k= new Random();
	
	
	while(true) {
	Scanner sc=new Scanner(System.in);
	int k1=k.nextInt();
	int k2=k1%2;
	if (k2<0) k2=-k2;
	System.out.println("홀짝 중 선택하세요  홀수는 1, 짝수는 2");
	int choice=sc.nextInt();
	
	System.out.println(k1);
	System.out.println(k2);
	
	if(k2==0 && choice==2)
	{ System.out.println("높음");}
	else if(k2==1 && choice==1)
	{ System.out.println("낮음");}
	else{ System.out.println("틀렸음다");}
	System.out.println("계속할까요? 1.계속 2.중단");
	int choice1=sc.nextInt();
	if(choice1==2) {break;}
	}
	
	//카드
	
	while(true) {
		Scanner sc=new Scanner(System.in);
		int k1=k.nextInt();
		int k2=k1%13;
		if (k2<0) k2=-k2;
		
		while(k2==0) {k2=k1%3;
		if(k2!=0)break;
		}
		
		System.out.println("1~13 숫자 중 선택하세요 ");
		int choice=sc.nextInt();
		
		System.out.println(k1);
		System.out.println(k2);
		
		if(k2==choice && choice>7)
		{ System.out.println("높음");}
		else if(k2==choice && choice<1)
		{ System.out.println("낮음");}
		else if(k2==choice && choice==7)
		{ System.out.println("비김");}
		else{ System.out.println("틀렸음다");}
		System.out.println("계속할까요? 1.계속 2.중단");
		int choice1=sc.nextInt();
		if(choice1==2) {break;}
		}
	//가위 바위 보
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
		
		System.out.println("가위:1 바위:2 보:3  중 선택하세요 ");
		int choice=sc.nextInt();
		
		System.out.println(k1);
		System.out.println(k2);
		
		if(k2==choice)
		{ System.out.println("비겼삼");}
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
		else{ System.out.println("틀렸음다");}
		
		System.out.println("계속할까요? 1.계속 2.중단");
		int choice1=sc.nextInt();
		if(choice1==2) {break;}
		
		}
	System.out.println("승률은 "+(j/i)*100+"% 임다");
}
}
