package com.ict.edu2;

public class Main {
public static void main(String[] args) {
	DCaPhone dca=new DCaPhone();
	dca.call();
	dca.sms();
	dca.dca();
	System.out.println("==========");
	
	MP3Phone mp3=new MP3Phone();
	mp3.call();
	mp3.sms();
	mp3.sound();
	System.out.println("==========");
	
	//자식클래스= 자식클래스
	GamePhone gp=new GamePhone();
	gp.call();
	gp.sms();
	gp.play();
	System.out.println("==========");
	
	//부모클래스= 자식클래스
	Phone p1=new DCaPhone();
	p1.call();
	p1.sms();
	//p1.dca();
	System.out.println("==========");
	
}
}
