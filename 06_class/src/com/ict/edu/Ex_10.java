package com.ict.edu;

import java.util.Scanner;

public class Ex_10 {
	public static void main(String[] args) {

//5���� �̸� ���� ���� ���� ������ �Է¹޾� �̸� ���� ��� ���� ������ ���ϰ� ����

		Scanner sc = new Scanner(System.in);
		int rank = 1;
		Ex10[] arr = new Ex10[5];
		Ex10[] temp = new Ex10[5];//�ӽ����� Ŭ������ ����°� �ǹ̻� ������

		for (int i = 0; i < 5; i++) {
			Ex10 e9 = new Ex10();

			System.out.print("�̸��� �Է��ϼ���");
			String name = sc.next();

			System.out.print("���� ������ �Է��ϼ���");
			int kor = sc.nextInt();

			System.out.print("���� ������ �Է��ϼ���");
			int eng = sc.nextInt();

			System.out.println("���� ������ �Է��ϼ���");
			int math = sc.nextInt();

			e9.s_sum(kor, eng, math);
			//int sum = e9.getSum();

			e9.s_avr();
			//double avr = e9.getAvr();

			e9.s_grad();
			//String grad = e9.getGrad();

			e9.setName(name);

			//e9.setSum(sum);

			//e9.setAvr(avr);

			//e9.setGrad(grad);
			
			e9.setRank(1);

			arr[i] = e9;

		}
		
		// ����
		for (int j = 0; j < 5; j++) {
			
			for (int j2 = 0; j2 < 5; j2++) {

				if (arr[j].getSum() < arr[j2].getSum())
					rank++;
			
			arr[j].setRank(rank);
		}
		}
		
		// ����

				for (int j = 0; j < arr.length - 1; j++) {
					for (int j2 = j + 1; j2 < arr.length; j2++) {
		             if(arr[j].getRank()>arr[j2].getRank()) {
		            	 temp[j]=arr[j];
		            	 arr[j]=arr[j2];
		            	 arr[j2]=temp[j];
		             }
					}

				}
		
		
		

		for (int j = 0; j < arr.length; j++) {
			System.out.print("�̸� " + arr[j].getName());
			System.out.print(" ���� " + arr[j].getSum());
			System.out.print(" ��� " + arr[j].getAvr());
			System.out.print(" ���� " + arr[j].getGrad() + "����  ");
			System.out.println(" ���� " + arr[j].getRank() + "��");
		}

		
	}
}
