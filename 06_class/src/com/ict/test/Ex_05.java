package com.ict.test;

import com.ict.edu.Ex05;

public class Ex_05 {
public static void main(String[] args) {
	//package달라도 import를 하면 public은 사용가능 , 나머지는 다 사용 불가능
	System.out.println(Ex05.k1);
	System.out.println(Ex05.k2);
	System.out.println(Ex05.k3);
	//System.out.println(Ex05.k4); private
	
	Ex05 e5=new Ex05();
	System.out.println(e5.s1);
	System.out.println(e5.s2);
	System.out.println(e5.s3);
	//System.out.println(e5.s4); private
	
}
}
