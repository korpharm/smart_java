package com.ict.edu;

import java.util.Random;

public class Ex03 {
public static void main(String[] args) {
	//random: Math,Next.random(), Random클래스
	//1.Random클래스
	
	Random ran=new Random(); //각종 자료형을 난수로 발생:자료형 범위안에서 난수 발생
	System.out.println("boolean  "+ran.nextBoolean());
	System.out.println("Int  "+ran.nextInt());
	System.out.println("long  "+ran.nextLong());
	System.out.println("float  "+ran.nextFloat()); //0이상 1미만
	System.out.println("Double "+ran.nextDouble());//0이상 1미만
	
	//특정범위를 지정하는 방법:1. nextInt(범위) 0부터 범위전까지 수에서 난수발생
	System.out.println("Int  "+ran.nextInt(7));
	//2.nextDouble()*범위
	System.out.println("Double "+(int)(ran.nextDouble()*7));
	
	//2.Math 클래스; 전체 메소드가 static이므로 객체생성없이 호출가능
	System.out.println(Math.random());//random의 double과 같음 0이상 1미만
	
	//특정범위를 지정할 수 있다
	System.out.println((int)(Math.random()*7));
	
	//3.abs:절대값 추출
	System.out.println(Math.abs(100));
	System.out.println(Math.abs(-100));
	
	//4.ceil  round  floor
	System.out.println(Math.ceil(3.45));
	System.out.println(Math.ceil(3.54));
	System.out.println(Math.round(3.44));
	System.out.println(Math.round(3.54));
	System.out.println(Math.floor(3.54));
	System.out.println(Math.floor(3.44));
	
	//5 max(자료형 a,자료형 b)  min(자료형 a,자료형 b)
	System.out.println(Math.max(45.6, 45));
	System.out.println(Math.min(45.6, 45));
	
	//6 pow(double a,double a)
	System.out.println(Math.pow(2,3.5));
}
}
