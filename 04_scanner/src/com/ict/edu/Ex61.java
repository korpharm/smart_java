package com.ict.edu;

import java.util.Scanner;

public class Ex61 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		esc: while (true) {
			System.out.print("�̸��� �Է��ϼ���");
			String name = sc.next();

			System.out.print("���� ������ �Է��ϼ���");
			int kor = sc.nextInt();

			System.out.print("���� ������ �Է��ϼ���");
			int math = sc.nextInt();

			System.out.print("���� ������ �Է��ϼ���");
			int eng = sc.nextInt();

			int total = kor + math + eng;
			int avr1 = (int) ((total / 3) * 10);
			double avr = avr1 / 10;

			String grad = "";

			if (avr >= 90) {
				grad = "A����";
			} else if (avr >= 80) {
				grad = "B����";
			} else if (avr >= 70) {
				grad = "C����";
			} else {
				grad = "F����";
			}

			System.out.println("���� " + name + "  " + "����  " + total + " " + "��� " + avr + " " + grad);
			again: while (true) {
				System.out.println("����ұ��? ����ҷ��� 1 �ߴ��Ϸ��� 2�� �Է�");
				int k = sc.nextInt();
				if (k == 1)
					continue esc;
				else if (k == 2)
					{System.out.println("�����ϼ̽��ϴ�");
				break esc;}
				else System.out.println("�߸� �Է��ϼ̽��ϴ�");
				continue again;
			}

		}

	}
}
