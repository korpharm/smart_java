package com.ict.edu;

public class Ex03 {
	//����޼ҵ�:���
	//��ȯ��:���� �� �ǵ��ư��� ����� ������ ���� ����� ���� �ڷ����� ���Ѵ�. ���� ����� ������ ���������� void ����� ���
	//      �޼ҵ带 ȣ���ϸ� �ش� �޼ҵ尡 �������� ȣ���� ������ �ǵ��ư���
	int sound=10;
	double sound2=10.0;
	
	public void add() { 
		System.out.println("add.1");
		sound++;
		System.out.println("add.2");
	}

	public void sub() {
		sound--;
		return;                 //void���� return�� �ᵵ �ǰ� �Ƚᵵ ��
	}
	
	public int mul() {
		System.out.println("mul.3");
		return sound*10;         //��void���� �� return�� �����
			}
	
	public double plus() {
	    return sound2;
}
	public double plus2() {
	    return sound;
}
}