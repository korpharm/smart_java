package com.ict.edu;
//�ڽ�Ŭ�������� �θ�Ŭ������ ��Ӱ��踦 �δ´�
public class Ex01_sub extends Ex01_sup {
String name="ȫ����";
int age=17;

public Ex01_sub() {
	System.out.println("�ڽ�Ŭ���� ������"+this);
}
public void play() {
	System.out.println(name);
	String name="ȫ�α�";
	System.out.println(name);
	//addr�� �������� ���� �������� ������
	System.out.println(addr);
	System.out.println(this.addr);
	
	int age=3;
	System.out.println(age);
	System.out.println(this.age);
	System.out.println(super.age);
}
	public void play2(){
		System.out.println(car);
	}
	
}	
	

