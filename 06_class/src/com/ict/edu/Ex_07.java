package com.ict.edu;

public class Ex_07 {
public static void main(String[] args) {
	Ex07 t1=new Ex07();
	String name=t1.getName();
	int price=t1.getPrice();
	System.out.println(name);
	System.out.println(price);
	
	t1.setName("�������");
	name=t1.getName();
	System.out.println(name);
	
	Ex07 t2=new Ex07();
	name=t2.getName();
	System.out.println(name);
}
}
