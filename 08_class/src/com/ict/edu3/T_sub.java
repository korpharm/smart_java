package com.ict.edu3;

public class T_sub extends T_sup {

	
	String addr;
	int car;
	
	public T_sub(){
		this("���� ȫ���Ա�");
		System.out.println("�ڽĻ�����1");
	}
	
	public T_sub(String addr) {
		this.addr=addr;
		System.out.println("�ڽĻ�����2");
	}
	
	public T_sub(int car){
		this.car=car;
			}
	public T_sub(String addr,int car) {
		this.addr=addr;
		this.car=car;
	}
	
}
