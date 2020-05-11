package com.ict.edu;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int even = 0;
		int odd = 0;
		int total = 0;
		while (true) {
			System.out.print("숫자를 입력하세요");
			int su = sc.nextInt();
			if (su % 2 == 0) {
				System.out.println("입력하신 숫자는 짝수입니다");
				even++;
			} else {
				System.out.println("입력하신 숫자는 홀수입니다");
				odd++;
			}
			System.out.print("계속할까요? 계속은 1, 중단은 2를 입력");
			int su2 = sc.nextInt();
			if (su2 == 2)
				break;
		}
		System.out.println("수고하셨습니다");
		total = even + odd;
		System.out.println("짝수는 " + even + "번 입니다");
		System.out.println("홀수는 " + odd + "번 입니다");
		System.out.println("총 횟수는 " + total + "번 입니다");
	}
}
