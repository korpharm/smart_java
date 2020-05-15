package com.ict.edu;

public class Ex_06 {
public static void main(String[] args) {
	Ex06 e6=new Ex06();
	System.out.println(e6.name);
	
	String s=e6.s_name();
	System.out.println(s);
	
	int s1=e6.s_age();
	
	//weight이 private이기 때문에 바로 접근 할 수 없다
	//double w1=e6.s_weight();
	//메소드를 이용해서 접근한다
	
	//이름을 둘리로 변경
	e6.re_name("둘리");	System.out.println(e6.name);
	s=e6.s_name();
	e6.re_age(5000);
	s1=e6.s_age();
	System.out.println(s1);
	
	//weight 를 1000으로 변경
	e6.re_weight(100.0);
	s2=e6.s_weight();
	
}
}
