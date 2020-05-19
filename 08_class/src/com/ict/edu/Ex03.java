package com.ict.edu;

import java.util.Random;

//Random클래스를 상속받아서 사용
public class Ex03 extends Random{
public static void main(String[] args) {
	

//play()를 사용하기위해서는 현재 클래스를 객체로 만들어야한다
Ex03 e3=new Ex03();
e3.play();
}

public void play() {
	int num=nextInt(10)+1;
	System.out.println(num);
}

}
