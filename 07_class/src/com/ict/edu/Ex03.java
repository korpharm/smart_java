package com.ict.edu;

import java.util.Random;

public class Ex03 {
public static void main(String[] args) {
	//random: Math,Next.random(), RandomŬ����
	//1.RandomŬ����
	
	Random ran=new Random(); //���� �ڷ����� ������ �߻�:�ڷ��� �����ȿ��� ���� �߻�
	System.out.println("boolean  "+ran.nextBoolean());
	System.out.println("Int  "+ran.nextInt());
	System.out.println("long  "+ran.nextLong());
	System.out.println("float  "+ran.nextFloat()); //0�̻� 1�̸�
	System.out.println("Double "+ran.nextDouble());//0�̻� 1�̸�
	
	//Ư�������� �����ϴ� ���:1. nextInt(����) 0���� ���������� ������ �����߻�
	System.out.println("Int  "+ran.nextInt(7));
	//2.nextDouble()*����
	System.out.println("Double "+(int)(ran.nextDouble()*7));
	
	//2.Math Ŭ����; ��ü �޼ҵ尡 static�̹Ƿ� ��ü�������� ȣ�Ⱑ��
	System.out.println(Math.random());//random�� double�� ���� 0�̻� 1�̸�
	
	//Ư�������� ������ �� �ִ�
	System.out.println((int)(Math.random()*7));
	
	//3.abs:���밪 ����
	System.out.println(Math.abs(100));
	System.out.println(Math.abs(-100));
	
	//4.ceil  round  floor
	System.out.println(Math.ceil(3.45));
	System.out.println(Math.ceil(3.54));
	System.out.println(Math.round(3.44));
	System.out.println(Math.round(3.54));
	System.out.println(Math.floor(3.54));
	System.out.println(Math.floor(3.44));
	
	//5 max(�ڷ��� a,�ڷ��� b)  min(�ڷ��� a,�ڷ��� b)
	System.out.println(Math.max(45.6, 45));
	System.out.println(Math.min(45.6, 45));
	
	//6 pow(double a,double a)
	System.out.println(Math.pow(2,3.5));
}
}
