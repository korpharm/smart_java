package com.ict.edu;

import java.util.Scanner;

public class Ex61 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		esc: while (true) {
			System.out.print("이름을 입력하세요");
			String name = sc.next();

			System.out.print("국어 점수를 입력하세요");
			int kor = sc.nextInt();

			System.out.print("수학 점수를 입력하세요");
			int math = sc.nextInt();

			System.out.print("영어 점수를 입력하세요");
			int eng = sc.nextInt();

			int total = kor + math + eng;
			int avr1 = (int) ((total / 3) * 10);
			double avr = avr1 / 10;

			String grad = "";

			if (avr >= 90) {
				grad = "A학점";
			} else if (avr >= 80) {
				grad = "B학점";
			} else if (avr >= 70) {
				grad = "C학점";
			} else {
				grad = "F학점";
			}

			System.out.println("성명 " + name + "  " + "총점  " + total + " " + "평균 " + avr + " " + grad);
			again: while (true) {
				System.out.println("계속할까요? 계속할려면 1 중단하려면 2를 입력");
				int k = sc.nextInt();
				if (k == 1)
					continue esc;
				else if (k == 2)
					{System.out.println("수고하셨습니다");
				break esc;}
				else System.out.println("잘못 입력하셨습니다");
				continue again;
			}

		}

	}
}
