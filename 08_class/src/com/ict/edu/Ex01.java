package com.ict.edu;

public class Ex01 {
//��Ӱ���:�ڽ�Ŭ������ �θ�Ŭ������ ��� �ʵ�,����޼ҵ带 ��ü�������� ������� ����� �� �ִ� Ŭ�������� ���踦 ���Ѵ�
//�ڽ�Ŭ������ �θ�Ŭ������ ���踦 �δ� ������ �Է��Ѵ�  �ڽ�Ŭ����extends�θ�Ŭ����
//�ڹٿ����� ���� ����� �� �� ����. �� �θ�Ŭ������ �ϳ��� �����Ѵ�.
	//��� Ŭ������ object��� Ŭ������ ��ӹް��ִ�
	public static void main(String[] args) {
		Ex01_sub test=new Ex01_sub();
		System.out.println(test);
		test.play();
		
		//�θ�Ŭ������ �żҵ� ��밡��
		test.prnl();
		
		//static�� ��Ӱ� ������� ��밡��
		System.out.println(Ex01_sup.car);
		Ex01_sup.prn2();
	}
}
