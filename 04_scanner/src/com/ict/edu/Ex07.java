package com.ict.edu;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		big: while (true) {
			int dan=0;
			
			small: while (true) {
				System.out.print("�޴��� �����ϼ���\n 1.Ŀ������ 3õ�� \n 2.�̿����� 2õ�� \n 3. �� 1õ�� \n 4.�����꽺 4õ�� ");
				int menu = sc.nextInt();
				
				switch (menu) {
				case 1:
					dan = 3000;
					break small;
				case 2:
					dan = 2000;
					break small;
				case 3:
					dan = 1000;
					break small;
				case 4:
					dan = 4000;
					break small;
				default:
					System.out.println("�߸� �Է��߽��ϴ�");
					continue small;
				}
			}

			System.out.println("�� ���� �Է��ϼ���");
			int su = sc.nextInt();

			System.out.print("������ ���� �Է��ϼ���");
			int input = sc.nextInt();

			
			int output = input - ((int) (su * dan * 1.1));

			if (output > 0) {
				System.out.println("�Ž��� ����");
				System.out.println(output + "�� �Դϴ�");
			}
			 else {System.out.println((int)(su*dan*1.1)-input+"���� �� ���ž� �մϴ�");}

			again: while (true) {
				System.out.println("����ұ��? ����ҷ��� 1 �ߴ��Ϸ��� 2�� �Է�");
				int k = sc.nextInt();
				if (k == 1)
					continue big;
				else if (k == 2)
					break big;
				else
					System.out.println("�߸� �Է��ϼ̽��ϴ�");
				continue again;
			}

		}

	}
}
