package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		// �ܼ� if:������ ���϶��� ���� ,�����϶��� if�� ����
		// ���ǽ�:boolean �񱳿��� ��������
		// ����:if(���ǽ�){
		// ���ǽ��� ���϶� ���๮��
		// }
		// �� ���๮���� �� ���϶��� {} ��������

		// int k1 �� 60 �̻��̸� �հ�

		int k1 = 59;
		String str = "�ʱⰪ";
		if (k1 >= 60) {
			str = "�հ�";
		}
		System.out.println("���" + str);
		System.out.println("�����ϼ̽��ϴ�");

		// int k2 �� 60 �̻��̸� �հ� 60 �̸��̸� ���հ�

		int k2 = 59;
		str = "�ʱⰪ";
		if (k2 >= 60) {
			str = "�հ�";
		}
		if (k2 < 60) {
			str = "���հ�";
		}
		System.out.println("���" + str);

		// int k3 �� 60 �̻��̸� �հ� 60 �̸��̸� ���հ�

		int k3 = 59;
		str = "���հ�";
		if (k3 >= 60) {
			str = "�հ�";
		}

		System.out.println("���" + str);

		// Ȧ�� ¦�� �Ǻ�
		int k4 = 8;
		str = "Ȧ��";
		if (k4 % 2 == 0) {
			str = "¦��";
		}
		System.out.println(k4 + "��" + str);

		// �� �ҹ��� �Ǻ�����
		char k5 = 'Q';
		str = "�빮��";
		if ((k5 >= 'a') && (k5 <= 'z')) {
			str = "�ҹ���";
		}
		System.out.println(k5 + "��" + str);

		// 1�Ǵ� 3�̸� ���� �ƴϸ� ����
		int k6 = 3;
		str = "����";
		if (k6 == 1 || k6 == 3) {
			str = "����";
		}
		System.out.println(str);

		// �ٹ��ð� 10�ð�
		int time = 14;
		int dan = 8590;
		int pay;
		pay = time * dan;
		if (time > 8) {
			pay = 8 * dan + (int) ((time - 8) * dan * 1.5);
		}

		System.out.println(pay);

		// �μ� �� ū���� ���
		k2 = 15;
		k3 = 20;
		int res10 = k3;
		if (k2 > k3) {
			res10 = k2;
		}
		System.out.println(res10);
		
		int k7 = 30;
		int k8 = 15;
		int out = k7;
		if (k7 < k8) {
			out = k8;
		}
		System.out.println(out);
	}
}