package com.ict.edu;

public class Ex_04 {

	int k1=10;
	String str="";
	
	//인자(매개변수);외부에서 정보를 받아서 사용
	//메소드 이름은 같으나 자료형이 다르면 오류 안생김
	public void add() { 
		k1++;
	}
	
	public void add(int a) { 
		k1=k1+a;
	}
	
	public void add(int a1, int a2) { 
		k1=a1+a2;
	}
	
	public void add(String s) { 
		str=s;
	}
	
	public void plus(int s) {
	k1=k1+s;
	}
	
	public void calc(int s1,int s2) {
		k1=s1+s2;
		}
	
	public void s_add(String s) {
		str=s;
		}
}
