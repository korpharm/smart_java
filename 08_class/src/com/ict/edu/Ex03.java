package com.ict.edu;

import java.util.Random;

//RandomŬ������ ��ӹ޾Ƽ� ���
public class Ex03 extends Random{
public static void main(String[] args) {
	

//play()�� ����ϱ����ؼ��� ���� Ŭ������ ��ü�� �������Ѵ�
Ex03 e3=new Ex03();
e3.play();
}

public void play() {
	int num=nextInt(10)+1;
	System.out.println(num);
}

}
