package com.ict.edu4;

public class Cat extends Animal{
	String name="����";
	int age=10;
	
	public void hobby() {
		System.out.println("������");
	}
	@Override//�θ�Ŭ������ �ڽ�Ŭ���� �޼ҵ尡 ���� ��,�ڽ�Ŭ������ �ڽſ� �°� ����
	public void sound() {
		System.out.println("�߿�");
	}
	
	//public void sleep() {
	//	�θ�Ŭ�������� final ó��
	//}
	
	
}
