package com.ict.edu5;

public abstract class Main {
	public static void main(String[] args) {
		 Animal a1=new Cat();
		 Cat.Like();
		 
		 Animal a2=new Dog();
		 Dog.Like();
	}
	
	
//�߻�Ŭ����:�߻�޼ҵ带 �������ִ� Ŭ����
//         �Ϲ����� ����ʵ�� �޼ҵ��ʵ带 ������ ���� �� �ִ�.
	//�߻�޼ҵ�:body�� ���� �޼ҵ�(�� ���೻���� ���� �޼ҵ�)�� �߻�޼ҵ��� �Ѵ�
	//        �ݵ�� Abstract��� ���� ����ؾ��Ѵ�.
	int su1=10;           //�ν��Ͻ� ����
	static int su2=20;    //static����
	final int su3=30;     //�ν��Ͻ� ���
	static final int su4=40; //static���
	
	public void play() {
		su1++;
		su2++;
	}
	
	//static�޼ҵ�� ������������ static�� ��밡��
	public static void prn() {
		int k1=100;
		//System.out.println(su1);
		System.out.println(su2);
		//System.out.println(su3);
		System.out.println(su4);
		
	}
	//�߻�޼ҵ�,�߻�޼ҵ�� �ݵ�� Abstract�� �ٿ����Ѵ�
	//�׸��� �ݵ�� Ŭ��������  Abstract�� �ٿ����Ѵ�
	public abstract void Like();
	
	
	
}
