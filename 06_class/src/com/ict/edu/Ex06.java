package com.ict.edu;

public class Ex06 {
     //getter:ȣ���ϴ� ���忡�� �޼ҵ带 �̿��ؼ� �������� �����Ҷ�
	 //setter:ȣ���ϴ� ���忡�� �޼ҵ带 �̿��ؼ� �������� �����Ҷ�
	public String name="ȫ�浿";
	int age=24;
	private double weight=70.4;
	private double s_weight;
	
	public String s_name(){ 
		 return name;
	}
	
	public int s_age() {
		return age;
	}
	
	private double s_weight() { 
		return weight;
	}
	
	public void re_name(String s){ 
		  name=s;
	}
	
	public void re_age(int k) {
		age=k;
	}
	
	void re_weight(double i) { 
		 weight=i;
	}
}
