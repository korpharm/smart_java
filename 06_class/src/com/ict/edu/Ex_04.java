package com.ict.edu;

public class Ex_04 {

	int k1=10;
	String str="";
	
	//����(�Ű�����);�ܺο��� ������ �޾Ƽ� ���
	//�޼ҵ� �̸��� ������ �ڷ����� �ٸ��� ���� �Ȼ���
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
