package com.ict.edu;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int even = 0;
		int odd = 0;
		int total = 0;
		while (true) {
			System.out.print("���ڸ� �Է��ϼ���");
			int su = sc.nextInt();
			if (su % 2 == 0) {
				System.out.println("�Է��Ͻ� ���ڴ� ¦���Դϴ�");
				even++;
			} else {
				System.out.println("�Է��Ͻ� ���ڴ� Ȧ���Դϴ�");
				odd++;
			}
			System.out.print("����ұ��? ����� 1, �ߴ��� 2�� �Է�");
			int su2 = sc.nextInt();
			if (su2 == 2)
				break;
		}
		System.out.println("�����ϼ̽��ϴ�");
		total = even + odd;
		System.out.println("¦���� " + even + "�� �Դϴ�");
		System.out.println("Ȧ���� " + odd + "�� �Դϴ�");
		System.out.println("�� Ƚ���� " + total + "�� �Դϴ�");
	}
}
