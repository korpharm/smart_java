package com.ict.edu3;

public class Person {
private String name;
private int age;


//<<create>>~Person(name:String,age:int)
//���� ����ʵ� ��ü�� ���ڷ� ���
public Person(String name, int age) {
	super();
	this.name = name;
	this.age = age;
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

public void print() {
	System.out.print(name);
	System.out.print(age);
}


}