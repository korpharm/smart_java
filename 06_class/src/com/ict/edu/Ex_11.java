package com.ict.edu;

public class Ex_11 {
public static void main(String[] args) {
	//객체생성
	Ex11 t1=new Ex11("둘리");
	System.out.println(t1.getName());
	System.out.println(t1.getAge());
	System.out.println(t1.getAddr());
	System.out.println("====================");
	
	//t1데이터를 변경
	//둘리 5000 남극
	
	t1.setName("둘리");
	t1.setAge(5000);
	t1.setAddr("남극");
	
	System.out.println(t1.getName());
	System.out.println(t1.getAge());
	System.out.println(t1.getAddr());
	System.out.println("====================");
	
	Ex11 t2=new Ex11();
	System.out.println(t2.getName());
	System.out.println(t2.getAge());
	System.out.println(t2.getAddr());
	System.out.println("====================");
	
	Ex11 t3= new Ex11("장길산", 37, "함경도");
	System.out.println(t3.getName());
	System.out.println(t3.getAge());
	System.out.println(t3.getAddr());
	System.out.println("====================");
	
}
	
	
}
