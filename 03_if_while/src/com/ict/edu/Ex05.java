package com.ict.edu;

public class Ex05 {
	public static void main(String[] args) {
		// for문:정해진 규칙에 따라 실행문을 반복처리하는 문
		// for(초기식;조건식;증감식) {
		// 조건식이 참일때 실행할 문장;
		// }
		// for문은 무조건 초기식부터 시작한다 이후 조건식으로 이동
		// 조건식은 boolean형
		// 조건식이 참이면 안쪽 블록을 실행한다 거짓이면 실행하지않는다
		// for문의 끝을 만나면 무조건 증감식으로 간다
		// 증감식은 초기식을 증가하거나 감소시키는 역할을 하고 다시 조건식으로 간다
		// 자바에서는 if문 switch문 for문 안에서 만든 변수는 밖에서는 쓸 수 없다

// 안녕하세요 10번 출력하기
		System.out.println("안녕하세요");// 10번

		for (int i = 1; i < 11; i++) {
			System.out.println(i + "=Hello");
		}
		System.out.println("==============");

		// 0-10까지 출력
		for (int i = 0; i < 11; i++) {
			System.out.println(i);

		}
		System.out.println("==============");
		// 0-10까지 짝수 출력
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
			i++;
		}

		for (int i = 0; i < 11; i = i + 2) {
			System.out.println(i);
		}
		// 홀수 출력
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		// 0~50까지 7의 배수
		for (int j = 0; j < 50; j++) {
			if (j % 7 == 0) {
				System.out.println(j);
			}

		}
		// a~g 출력

		for (char i = 'a'; i <= 'g'; i++) {
			System.out.print(i);
		}

		System.out.print("가나다라마바");
		System.out.println(); // 한줄 띄우기
		System.out.print("가나다라마바");
		// System.out.print(); error

		// System.out.print(i+"\t"); t는 tab
		// \n String안에서 사용, 한줄 띄우기
		System.out.print("가나다\n라마바");

		// System.out.print();
		// System.out.println(변수 나 데이터);출력후 줄바꾸기

		// 구구단 5단 출력
		for (int i = 1; i <= 9; i++) {
			int res;
			res = 5 * i;
			System.out.println("5*" + i + "=" + res);
		}
//
		for (int i = 0; i < 4; i++) {
			System.out.println("0000");
		}
		System.out.println();

		for (int i = 0; i < 4; i++) {
			System.out.print("0");
		}
		System.out.println();
		for (int j = 0; j < 4; j++) {
			System.out.print("0");
			System.out.println();
		}
		for (int i = 0; i < 17; i++) {
			System.out.print("0");
			if (i % 4 == 0) {
				System.out.println();
			}
		}

		// 누적합(합계)
		int j = 0;
		for (int i = 0; i <= 10; i++) {
			j = j + i;

		}
		System.out.println(j);

		// 0-10 홀수의 합계
		j = 0;
		for (int i = 0; i < 10; i++) {

			if (i % 2 == 1) {
				j = j + i;
			}

		}
		System.out.println(j);

		// 0-10 짝수의 합계
		j = 0;
		for (int i = 0; i < 11; i++) {

			if (i % 2 == 0) {
				j = j + i;
			}

		}
		System.out.println(j);

		// 0-10 홀수 짝수의 합계
		j = 0;
		int k = 0;
		for (int i = 0; i < 11; i++) {

			if (i % 2 == 0) {
				j = j + i;
			} else
				k = k + i;
		}
		System.out.println("짝수합은" + j);
		System.out.println("홀수합은" + k);

		// 7!(7*6*..*2*1)

		j = 1;
		int i;
		for (i = 1; i < 8; i++) {

			j = j * i;

		}
		System.out.println((i - 1) + "!=" + j);
	}
}
