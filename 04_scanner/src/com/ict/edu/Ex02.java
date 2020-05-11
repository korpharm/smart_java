package com.ict.edu;

import java.util.Scanner;

public class Ex02 {
public static void main(String[] args) {
	//숫자를 받아서 홀수 짝수를 구분하기
	Scanner sc=new Scanner(System.in);
	System.out.print("숫자 입력:");
	int su=sc.nextInt();
	String result="";
	
	if(su%2==0) {result="짝수";
	}else {result="홀수";}
	System.out.println("결과는  "+result);
	System.out.println("====================");
	//근무시간을 입력받아서 임금 산정
	
	System.out.print("근무시간 입력:");
	int h=sc.nextInt();
	int pay=0;
	int dan=8590;
	if(h>8) {pay=h*dan+(int)((h-8)*dan*1.5);}
	else {pay=h*dan;}
	System.out.println(h+"시간 근무 임금은 "+pay);
	
	System.out.println("====================");
	// 1 카페모카 3500  2 카페라떼 4000  3 아메리카노 30000   4  과일쥬스  3500
	
	System.out.println("1 카페모카 3500 \n  2 카페라떼 4000 ");
	System.out.println("3 아메리카노 3000 \n 4  과일쥬스  3500");
	System.out.print("메뉴를 선택하세요. 메뉴 번호를 입력하세요");
	int menu=sc.nextInt();
	int input=10000;
	int output=0;
	su=2;
	dan=0;
	int price=(int)(su*dan*1.1);
	String str="";
	
	switch(menu) { 
	case 1:str="카페모카";break;
	case 2:str="카페라떼";break;
	case 3:str="아메리카노";break;
	case 4:str="과일쥬스";break;
	default: str="해당사항 없음";
	}
	
	switch(dan) { 
	case 1:dan=3500;break;
	case 2:dan=4000;break;
	case 3:dan=3000;break;
	case 4:dan=3500;break;
	
	}
	
	switch(menu) {
	case 1:output=input-price;System.out.println("선택하신 메뉴는 "+str);break;
	case 2:output=input-price;System.out.println("선택하신 메뉴는 "+str);break;
	case 3:output=input-price;System.out.println("선택하신 메뉴는 "+str);break;
	case 4:output=input-price;System.out.println("선택하신 메뉴는 "+str);break;}
	System.out.println("잔돈은 "+output);
	System.out.println("====================");
	
	
	System.out.println("한국   , 미국  , 중국  ,  일본 ");
	System.out.print("나라를 선택하세요. 나라를 직접입력하세요");
	String country=sc.next();
	String res="";
	
	switch(country)
	 {
	case "한국":res="서울";break;
	case "미국":res="워싱턴";break;
	case "중국":res="북경";break;
	case "일본":res="동경";break;
    default: str="해당사항 없음";
    }
	
	switch(country)
	 {
	case "한국":System.out.println("선택하신 나라는 "+country+" 수도는"+res);break;
	case "미국":System.out.println("선택하신 나라는 "+country+" 수도는"+res);break;
	case "중국":System.out.println("선택하신 나라는 "+country+" 수도는"+res);break;
	case "일본":System.out.println("선택하신 나라는 "+country+" 수도는"+res);break;
	default: str="해당사항 없음";
	 }
	

	
	
	}
}

