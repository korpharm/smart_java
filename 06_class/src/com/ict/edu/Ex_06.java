package com.ict.edu;

public class Ex_06 {
public static void main(String[] args) {
	Ex06 e6=new Ex06();
	System.out.println(e6.name);
	
	String s=e6.s_name();
	System.out.println(s);
	
	int s1=e6.s_age();
	
	//weight�� private�̱� ������ �ٷ� ���� �� �� ����
	//double w1=e6.s_weight();
	//�޼ҵ带 �̿��ؼ� �����Ѵ�
	
	//�̸��� �Ѹ��� ����
	e6.re_name("�Ѹ�");	System.out.println(e6.name);
	s=e6.s_name();
	e6.re_age(5000);
	s1=e6.s_age();
	System.out.println(s1);
	
	//weight �� 1000���� ����
	e6.re_weight(100.0);
	s2=e6.s_weight();
	
}
}
