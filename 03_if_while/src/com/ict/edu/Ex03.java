package com.ict.edu;

public class Ex03 {
	public static void main(String[] args) {
		// 중첩 if문 :if문을 여러개 사용
		// 형식: if(조건식1){
		// 조건식1이 참일때 실행문
		// }else if(조건식2){
		// 조건식1이 거짓이고 조건식 2가 참일때 실행문
		// }else {
		// 조건식 1,2이가 모두 거짓일때 실행문

		// int k1의 점수가 90이상이면 A

		int k1 = 95;
		String str = "";
		if (k1 >= 90) {
			str = "A학점";
		} else if (k1 >= 80) {
			str = "B학점";
		} else if (k1 >= 70) {
			str = "C학점";
		} else {
			str = "F학점";
		}
		System.out.println(str);

		// char k2 가 대,소문자, 한자리 숫자인지 기타문자인지

		char k2 = '9';
		if (k2 >= 'a' && k2 <= 'z') {
			str = "소문자";
		} else if (k2 >= 'A' && k2 <= 'Z') {
			str = "대문자";
		} else if (k2 >= '0' && k2 <= '9') {
			str = "숫자";
		} else {
			str = "기타문자";
		}
		System.out.println(str);

		// char k3이 A,a 이면 아프리카 B,b 브라질 C,c는 캐나다 나머지 한국

		char k3 = 'C';
		if (k3 == 'A' || k3 == 'a') {
			str = "Africa";
		} else if (k3 == 'B' || k3 == 'b') {
			str = "Brazil";
		} else if (k3 == 'C' || k3 == 'c') {
			str = "Canada";
		} else {
			str = "Korea";
		}
		System.out.println(str);

		// 메뉴가 1이면 카페모카 3500 2는 카페라테 4000 3은 아메 3000
		// 4는 과일쥬스 3500 친구와 2잔을 먹고 1만원을 냈다 잔돈 구하기
		// 부가세 10%

		
		int menu = 1;
		if (menu == 1) {
			int dan = 3500;
			int su = 2;
			int total = dan * su;
			int vat = (int) (total * 0.1);
			int input = 10000;
			int output = 0;
			output = input - (total + vat);
			System.out.println(output);
		}

		else if (menu == 2) {
			int dan = 4000;
			int su = 2;
			int total = dan * su;
			int vat = (int) (total * 0.1);
			int input = 10000;
			int output = 0;
			output = input - (total + vat);
			System.out.println(output);
		}

		else if (menu == 3) {
			int dan = 3000;
			int su = 2;
			int total = dan * su;
			int vat = (int) (total * 0.1);
			int input = 10000;
			int output = 0;
			output = input - (total + vat);
			System.out.println(output);
		}

		else if (menu == 4) {
			int dan = 3500;
			int su = 2;
			int total = dan * su;
			int vat = (int) (total * 0.1);
			int input = 10000;
			int output = 0;
			output = input - (total + vat);
			System.out.println(output);
			
		//	정리version
			
			int dan2=0;
			String drink2="";
			if (menu==1) {
				dan2=3500;
				drink2="카페모카";
				
			}else if (menu==2) {
				dan2=4000;
				drink2="카페라떼";
				
			}else if (menu==3) {
				dan2=3000;
				drink2="아메리카노";
				
			}else if (menu==4) {
				dan2=4000;
				drink2="과일쥬스";
				
			
		}
			su = 2;
			total = dan * su;
			vat = (int) (total * 0.1);
			input = 10000;
			output = 0;
			output = input - (total + vat);
			System.out.println(output);
	}
	}}
