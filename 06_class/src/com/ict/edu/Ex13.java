package com.ict.edu;

public class Ex13 {
	
	//this�� this()
	//this:��ü���ο��� ��ü�ڽ��� ����Ű�� �����
	//     ���������� ���������� ���� �̸��� ������ ���������� this�� �ٿ��� ������������ ��Ÿ����
	//this():��ü�� �����ڸ� ��Ī�ϴ� �����, �ݵ�� �������� ù�ٿ� �;��Ѵ�. �����ڿ��� �ٸ� �����ڸ� ȣ���Ҷ� ���
	
	String name="��浿";
	int age=37;
	
public Ex13() {
	//System.out.println("�⺻������"+this);
		this("������",24);
}

public Ex13(String name) { 
	this.name=name;
}

public Ex13(int age) { 
	this.age=age;
}

public Ex13(String name,int age) { 
	this.name=name;
	this.age=age;
}

//getter setter
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
}
