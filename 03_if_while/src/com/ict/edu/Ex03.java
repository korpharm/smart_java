package com.ict.edu;

public class Ex03 {
	public static void main(String[] args) {
		// ��ø if�� :if���� ������ ���
		// ����: if(���ǽ�1){
		// ���ǽ�1�� ���϶� ���๮
		// }else if(���ǽ�2){
		// ���ǽ�1�� �����̰� ���ǽ� 2�� ���϶� ���๮
		// }else {
		// ���ǽ� 1,2�̰� ��� �����϶� ���๮

		// int k1�� ������ 90�̻��̸� A

		int k1 = 95;
		String str = "";
		if (k1 >= 90) {
			str = "A����";
		} else if (k1 >= 80) {
			str = "B����";
		} else if (k1 >= 70) {
			str = "C����";
		} else {
			str = "F����";
		}
		System.out.println(str);

		// char k2 �� ��,�ҹ���, ���ڸ� �������� ��Ÿ��������

		char k2 = '9';
		if (k2 >= 'a' && k2 <= 'z') {
			str = "�ҹ���";
		} else if (k2 >= 'A' && k2 <= 'Z') {
			str = "�빮��";
		} else if (k2 >= '0' && k2 <= '9') {
			str = "����";
		} else {
			str = "��Ÿ����";
		}
		System.out.println(str);

		// char k3�� A,a �̸� ������ī B,b ����� C,c�� ĳ���� ������ �ѱ�

		char k3 = 'C';
		if (k3 == 'A' || k3 == 'a') {
			str = "Africa";
		} else if (k3 == 'B' || k3 == 'b') {
			str = "Brazil";
		} else if (k3 == 'C' || k3 == 'c') {
			str = "Canada";
		} else {
			str = "Korea";
		}
		System.out.println(str);

		// �޴��� 1�̸� ī���ī 3500 2�� ī����� 4000 3�� �Ƹ� 3000
		// 4�� �����꽺 3500 ģ���� 2���� �԰� 1������ �´� �ܵ� ���ϱ�
		// �ΰ��� 10%

		
		int menu = 1;
		if (menu == 1) {
			int dan = 3500;
			int su = 2;
			int total = dan * su;
			int vat = (int) (total * 0.1);
			int input = 10000;
			int output = 0;
			output = input - (total + vat);
			System.out.println(output);
		}

		else if (menu == 2) {
			int dan = 4000;
			int su = 2;
			int total = dan * su;
			int vat = (int) (total * 0.1);
			int input = 10000;
			int output = 0;
			output = input - (total + vat);
			System.out.println(output);
		}

		else if (menu == 3) {
			int dan = 3000;
			int su = 2;
			int total = dan * su;
			int vat = (int) (total * 0.1);
			int input = 10000;
			int output = 0;
			output = input - (total + vat);
			System.out.println(output);
		}

		else if (menu == 4) {
			int dan = 3500;
			int su = 2;
			int total = dan * su;
			int vat = (int) (total * 0.1);
			int input = 10000;
			int output = 0;
			output = input - (total + vat);
			System.out.println(output);
			
		//	����version
			
			int dan2=0;
			String drink2="";
			if (menu==1) {
				dan2=3500;
				drink2="ī���ī";
				
			}else if (menu==2) {
				dan2=4000;
				drink2="ī���";
				
			}else if (menu==3) {
				dan2=3000;
				drink2="�Ƹ޸�ī��";
				
			}else if (menu==4) {
				dan2=4000;
				drink2="�����꽺";
				
			
		}
			su = 2;
			total = dan * su;
			vat = (int) (total * 0.1);
			input = 10000;
			output = 0;
			output = input - (total + vat);
			System.out.println(output);
	}
	}}