package com.ict.edu;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {

		// �迭 �����ϱ�

		int[] su = { 9, 3, 10, 2, 5, 4, 8, 1, 6, 7 };
		int temp = 0;

		for (int i = 0; i < 9; i++) {

			for (int j = i + 1; j < 10; j++) {

				// > ��������, < ��������

				if (su[i] > su[j]) {
					temp = su[i];
					su[i] = su[j];
					su[j] = temp;

				}

			}

		}
		for (int k : su) {
			System.out.println(k);
		}

		System.out.println("==============================");

		int[] su2 = { 9, 3, 10, 2, 5, 4, 8, 1, 6, 7 };
		
		//Arrays Ŭ������ �迭 ���� ���� list�� ��ȯ
		
		Arrays.sort(su2);
		
		for (int i : su2) {
			System.out.println(i);
		}
		System.out.println();
		
		

	}
}
