package com.ict.edu;

public class Ex_11 {
public static void main(String[] args) {
	//��ü����
	Ex11 t1=new Ex11("�Ѹ�");
	System.out.println(t1.getName());
	System.out.println(t1.getAge());
	System.out.println(t1.getAddr());
	System.out.println("====================");
	
	//t1�����͸� ����
	//�Ѹ� 5000 ����
	
	t1.setName("�Ѹ�");
	t1.setAge(5000);
	t1.setAddr("����");
	
	System.out.println(t1.getName());
	System.out.println(t1.getAge());
	System.out.println(t1.getAddr());
	System.out.println("====================");
	
	Ex11 t2=new Ex11();
	System.out.println(t2.getName());
	System.out.println(t2.getAge());
	System.out.println(t2.getAddr());
	System.out.println("====================");
	
	Ex11 t3= new Ex11("����", 37, "�԰浵");
	System.out.println(t3.getName());
	System.out.println(t3.getAge());
	System.out.println(t3.getAddr());
	System.out.println("====================");
	
}
	
	
}
