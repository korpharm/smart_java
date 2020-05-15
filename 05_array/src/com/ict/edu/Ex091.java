package com.ict.edu;

import java.util.Scanner;

public class Ex091 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];

		Scanner sc = new Scanner(System.in);

		int[] name = new int[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		char[] grad = new char[5];
		int[] rank = { 1, 1, 1, 1, 1 };

		for (int i = 0; i < 5; i++) {

			System.out.print("번호를 입력하세요");
			name[i] = sc.nextInt();

			System.out.print("국어 점수를 입력하세요");
			kor[i] = sc.nextInt();

			System.out.print("영어 점수를 입력하세요");
			eng[i] = sc.nextInt();

			System.out.print("수학 점수를 입력하세요");
			math[i] = sc.nextInt();

		}
		int[] sum = new int[5];
		int[] avr = new int[5];

		for (int i = 0; i < avr.length; i++) {
			sum[i] = kor[i] + eng[i] + math[i];
			avr[i] = sum[i] / 3;
			if (avr[i] >= 90) {
				grad[i] = 'A';
			} else if (avr[i] >= 80) {
				grad[i] = 'B';
			} else if (avr[i] >= 70) {
				grad[i] = 'C';
			} else {
				grad[i] = 'F';
			}
		}
		for (int i = 0; i < avr.length; i++) {
			for (int j = 0; j < avr.length; j++) {
				if (sum[i] < sum[j]) {
					rank[i]++;
				}
			}

		}
//	for (int i = 0; i < avr.length; i++) {
//		System.out.print(name[i]);
//		System.out.print(sum[i]);
//		System.out.print(avr[i]);
//		System.out.print(grad[i]);
//		System.out.print(rank[i]);
//		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < avr.length; j++) {

				arr[j][i] = name[i];

				arr[j][i] = sum[i];

				arr[j][i] = avr[i];

				arr[j][i] = grad[i];

				arr[j][i] = rank[i];

			}
		}
		for (int i = 0; i < avr.length; i++) {
			for (int j = 0; j < avr.length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}
}
