package com.ict.edu;

public class Ex05 {
	public static void main(String[] args) {
		String[] name = { "ȫ", "��", "��", "��", "��" };
		int[] kor = { 80, 90, 88, 70, 100 };
		int[] eng = { 80, 95, 80, 70, 100 };
		int[] math = { 100, 100, 100, 100, 100 };

		int[] sum = new int[5];
		double[] avr = new double[5];
		String[] grad = new String[5];
		int[] rank = { 1, 1, 1, 1, 1 };

		// ����, ���, ����

		for (int i = 0; i < 5; i++) {
			sum[i] = kor[i] + eng[i] + math[i];

			avr[i] = sum[i] / 3;
			
			if (avr[i] >= 90.0) {
				grad[i] = "A����";
			} else if (avr[i] >= 80.0) {
				grad[i] = "B����";
			} else if (avr[i] >= 70.0) {
				grad[i] = "C����";
			} else {
				grad[i] = "F����";
			}
		}

		// rank
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (sum[i] < sum[j])
					rank[i]++;
			}
		}
		
		// ���
		for (int i = 0; i < 5; i++) {
			System.out
					.println("�̸�  " + name[i] + "  ����  " + sum[i] + "  ���  " + avr[i] + " " + grad[i] + " ���� " + rank[i]);
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("�̸�  "+"\t"+ "���� " +"\t"+ "��� " + "\t"+ " ���� ");
			System.out.println();
			
		}
		
	}
}
