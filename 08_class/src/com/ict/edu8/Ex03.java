package com.ict.edu8;
//�������̽� ���
//1. �Ϲ�Ŭ������ ��� ������ �ݵ�� �������̵� �ؾ��Ѵ�
class Ex03 implements Ex01 {

	@Override
	public void play() {		
	}

	@Override
	public void play2() {				
	}

	@Override
	public void sound() {				
	}

}
//2.�߻�Ŭ������ ��ӹ����� �������̵� �� �ʿ䰡 ����
abstract class Ex04 implements Ex01{
	int k1=10;//�ν��Ͻ� ����
	public abstract void leftSound();
	
}
//3.interface�� ��ӹ����� �������̵� �� �ʿ䰡 ����
interface Ex06 extends Ex01{
	int k1=10;//static final
}

class Ex07 extends Ex04{
	public void play2() {				
	}
	public void sound() {				
	}
}