package com.ict.edu;

public class Ex02 {
   //����ʵ�:���°�, �Ӽ�, Ư¡
	//instance�ʵ�:��ü �����Ҷ� ���� �����Ǵ� �ʵ�
	//static�ʵ�:��ü ������ ������� ���� �����Ǵ� �ʵ� staticǥ��
	int kor=80;                 //instance����
	static int eng=85;          //static����
	final int math=90;          //final:��� �ǹ�, �ν��Ͻ� ���
	final static int com=96;    //static ���
	
	//������ ����� ����
	//�޼ҵ�:���, ����
	//�޼ҵ� ����: ����������  �޼ҵ����� ��ȯ�� �޼ҵ��̸�(����)
	//void�� �ǵ��ư��� ����� ����
	public void prn() {
		//������ ���� ����
		kor=kor+10;
		eng=eng+10;
		//����� �����ϸ� �����߻�
		//math=math+10;
		//com=com+10;
	}
	
}
