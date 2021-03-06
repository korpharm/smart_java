package com.ict.edu;

public class Ex07 {
	public static void main(String[] args) {
		// while문:for문과 같은 반복문
		// 형식1:
		// 초기식
		// while(조건식){
		// 조건식 참일때 실행문;
		// 증감식
		// }
		// while문 끝을 만나면 무조건 조건식으로 간다

		// 형식2:
		// 초기식
		// while(true){
		// if(빠져나갈 조건) break;
		// 조건식 참일때 실행문;
		// 증감식
		// }
		// while문 끝을 만나면 무조건 조건식으로 간다

		// 0~10까지 출력

		int i = 0;
		while (i < 11) {
			System.out.print(i);
			i++;
		}
		System.out.println();

		for (int j = 0; j < 11; j++) {
			System.out.print(j);
		}
		System.out.println();

		int k2 = 0;
		while (true) {
			System.out.print(k2);
			k2++;
			if (k2 > 10)
				break;
		}

		
		System.out.println();
		
		// 1~10까지 출력

		i = 1;
		while (i < 11) {
			System.out.print(i);
			i++;
		}
		System.out.println();

		// 1~10 까지 짝수 출력

		i = 1;
		while (i < 11) {
			if (i % 2 == 0) {
				System.out.print(i);
			}
			i++;
		}
		System.out.println();

// 1~10 까지 홀수 출력

		i = 1;
		while (i < 11) {
			if (i % 2 == 1) {
				System.out.print(i);
			}
			i++;
		}
		System.out.println();

		// 0~50까지 7의 배수

		i = 0;

		while (i <= 50) {
			if (i % 7 == 0) {
				System.out.print(i + "\t");
			}
			i++;
		}

		System.out.println();

		// a~g 출력

		char q1 = 'a';
		while (q1 < 'h') {
			System.out.print(q1);
			q1++;
		}
		System.out.println();

		// 구구단 5단 출력

		i = 1;

		while (i < 10) {
			System.out.println("5*" + i + "=" + 5 * i);
			i++;
		}
		
				
		System.out.println();
		
		i=1;
		while (i<17) {
			System.out.print(0);
			if(i%4==0) {
				System.out.println();
			}
			i++;
		}
		
		
		
		//1~10누적합
		i=1;
		int res=0;
		while (i<11) {
			res=res+i;
			System.out.println(res);
			i++;
		}
		
		//홀수합
		
		i=1;
		res=0;
		while (i<11) {
			if(i%2==1) {res=res+i;}
			System.out.println(res);
			i++;
		}
		
		//짝수합
		i=1;
		res=0;
		while (i<11) {
			if(i%2==0) {res=res+i;}
			System.out.println(res);
			i++;
		}
		
		//홀수 짝수합
		i=1;
		int even=0;
		int odd=0;
		while (i<11) {
			if(i%2==0) {even=even+i;
			}
			else odd=odd+i;
			}
	i++;
		System.out.println(even);
		System.out.println(odd);
		
		
		//7!
		
		i=1;
		res=0;
		while (i<7) {
			res=res*i;
			i++;
		}
		

	}
}
