package com.ict.edu;

import java.util.Random;

public class Ex02_main {
public static void main(String[] args) {
	//static����ʵ� ȣ��
	System.out.println(Ex02.com);//Ŭ�����̸�.����ʵ�
	System.out.println(Ex02.eng);
	
	
	//Ex02 Ŭ���� ��ü �����
	//Ŭ�����̸� ��������=new ������
	//Ex02�� �����ڰ� ������ �⺻ �����ڷ� ����
	Ex02 test=new Ex02();
	System.out.println(test.kor);//��������.����ʵ�
	System.out.println(test.eng);
	System.out.println(test.math);
	System.out.println(test.com);
	
	System.out.println(test);
	
	System.out.println("========================");
	
	//API�� �̿��ؼ� static �޼ҵ�� �ν��Ͻ� �޼ҵ带 ȣ���ϱ�
	// API���� �����ϴ� randomŬ������ nextInt()�޼ҵ�� nextInt(int n) nextDouble�� ����ϴ� ��
	
	//nextInt()�޼ҵ�� nextInt(int bound) nextDouble static �ƴϹǷ� Ŭ������ ��ü�� ���� ���
	
	// Ŭ������ ��ü�� ����� ���
	// Ŭ���� ��������=new ������
	Random ran=new Random();
	//nextInt:int ����
	int res=ran.nextInt();
	
		System.out.println(res+"\t"+ran);
	
	System.out.println("---------------");
	//nextInt(����):��ȯ���� 0���� ����-1����
	res=ran.nextInt(9);
	System.out.println(res);
	System.out.println("---------------");
	
	//������������ 0.0�̻�~1.0 �̸��� �Ǽ�/�ڸ����� ���
	double res2=ran.nextDouble();
	System.out.println(res2);
	
	//0���� 5������ ������ ǥ������ a*10/2=a* 5 �׷��� 5�� �ȳ��� �׷��Ƿ� a*6
	System.out.println((int)(res2*6));
	
	//API���� �����ϴ� static�޼ҵ� ����ϱ�
	//MathŬ������ �޼ҵ���� ��ü �������� ��밡��
	//Ŭ�����̸�.����ʵ�, Ŭ�����̸�.����޼ҵ�
	System.out.println(Math.random());
	//���ϴ� ���������� �������� ���� �� ����
	System.out.println((int)(Math.random()*60000));
}
}
