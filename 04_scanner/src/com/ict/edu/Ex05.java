package com.ict.edu;

import java.util.Scanner;

public class Ex05 {
public static void main(String[] args) {
	
	
		Scanner sc = new Scanner(System.in);
		int even = 0;
		int odd = 0;
		int total = 0;
		esc:while (true) {
			System.out.print("���ڸ� �Է��ϼ���");
			int su = sc.nextInt();
			if (su % 2 == 0) {
				System.out.println("�Է��Ͻ� ���ڴ� ¦���Դϴ�");
				even++;
			} else {
				System.out.println("�Է��Ͻ� ���ڴ� Ȧ���Դϴ�");
				odd++;
			}
			alarm:while(true) {System.out.print("����ұ��? ����� 1, �ߴ��� 2�� �Է�");
			int su2 = sc.nextInt();
			if (su2 == 2)
				break esc;
			else if(su==1) continue esc;
			if(su2!=1 && su2!=2) System.out.println("�߸� �Է��߳׿�");continue alarm;}
		
		}
		System.out.println("�����ϼ̽��ϴ�");
		total = even + odd;
		System.out.println("¦���� " + even + "�� �Դϴ�");
		System.out.println("Ȧ���� " + odd + "�� �Դϴ�");
		System.out.println("�� Ƚ���� " + total + "�� �Դϴ�");
		}
}

