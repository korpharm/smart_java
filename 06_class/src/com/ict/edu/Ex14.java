package com.ict.edu;

public class Ex14 {
     //static:��ü������ ������� �̸� ��������� �ʵ�� �޼ҵ�
	//        Ŭ������ ������������ ����� �� ����
	//static������ ��������,��� ��ü�� ����� �� �ִ�.
	//static �����̶�� ���� �����ϰ� �������
	
	int su=10;//�ν��Ͻ�����
	static int num=10; //static����
	
	public Ex14() {
		su++;
		num++;
	}
	
	public void sum(int k1,int k2) { }
	
	//static �޼ҵ�:static ������ �������� ���
	
	public static void add(int k1,int k2) {
		//su=k1+k2; //static������ ���������� ����� �� ����
		num=k1+k2;
	
	}
}
