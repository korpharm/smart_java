package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		// if~else~:���Ǳ��� ���϶��� �����϶� ���� ������ ó��
		// ����: if(���ǽ�){
		// ���ǽ��� ���϶� ���๮��
		// ���ǽ��� ���϶� ���๮��
		// } elseif(���ǽ�){
		// ���ǽ��� �����϶� ���๮��}

		// int k2 �� 60 �̻��̸� �հ� 60 �̸��̸� ���հ�

		int k2 = 67;
		String str = "";
		if (k2 >= 60) {
			str = "�հ�";
		} else {
			str = "���հ�";
		}
		System.out.println(str);

		// Ȧ�� ¦�� �Ǻ�
		k2 = 12;
		if (k2 % 2 == 0) {
			str = "¦��";
		} else {
			str = "Ȧ��";
		}
		System.out.println(str);

		// �� �ҹ��� �Ǻ�����
		char k3 = '#';
		str = "��Ÿ����";
		if (k3 >= 'A' && k3 <= 'Z') {
			str = "�빮��";
		} else if (k3 >= 'a' && k3 <= 'z') {
			str = "�ҹ���";
		}
		System.out.println(str);

		// 1�Ǵ� 3�̸� ���� �ƴϸ� ����
		int k4 = 7;
		str = "���� ���� �ƴ� ��3�� ��";
		if (k4 == 1 || k4 == 3) {
			str = "����";
		} else if (k4 == 2 || k4 == 4) {
			str = "����";
		}
		System.out.println(str);

		// �ٹ��ð� 10�ð�
		int time = 10;
		int dan = 8590;
		int pay;
		if (time > 8) {
			pay = 8 * 8950 + (int) ((time - 8) * dan * 1.5);
		} else {
			pay = time * dan;
		}
		System.out.println(pay);


	// �μ� �� ū���� ���
	int k5 = 42;
	int k6 = 32;
	int result=0;
	if(k5>=k6)
	{
		result = k5;
	}else
	{
		result = k6;
	}
	System.out.println(result);

}

}