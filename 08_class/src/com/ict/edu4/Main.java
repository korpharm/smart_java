package com.ict.edu4;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	//�����ε�:�� Ŭ�����ȿ��� ���� �̸��� �޼ҵ尡 ������ �����ϴ� ��
	//       ������ �ڷ����̳� ������ �ٸ���
	
	//�������̵�:��Ӱ��迡�� �θ�޼ҵ�� �ڽĸ޼ҵ尡 ������
	//         �ڽ�Ŭ������ �θ�޼ҵ带 ���پ��� ��꿡 ������ �ڱ⿡ �°� �����ؼ� ����ϴ� ��
    //         �������̵��� �θ�޼ҵ尡 ��������(@Override��� ���� ���еȴ�)
	//         ���� �޼ҵ带 ȣ���ص� �ٸ� ������ �����Ѵ�.
	
	
Animal d=new Dog();
Animal c=new Cat();
System.out.println(d.eyes);
System.out.println(d.legs);
d.Like();
d.sound();

System.out.println(c.eyes);
System.out.println(c.legs);
c.Like();
c.sound();

Scanner sc=new Scanner(System.in);
System.out.println("�����ϼ���  1�� ����� 2�� ������");
int su=sc.nextInt();
if(su==1) { 
	Cat cat=new Cat();
	cat.sound();
	cat.Like();
	cat.hobby();
	
}else { 
	Dog dog=new Dog();
	dog.sound();
	dog.Like();
	dog.hobby();
}
Animal a=null;
if(su==1) { 
	a=new Cat();
	
	
}else { 
	a=new Dog();
	
	
}
 a.sound();
 a.Like();
 //a.hobby(); �θ�Ŭ�������� ���� ������ ����
}
}
