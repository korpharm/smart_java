package com.ict.edu;

public class Ex02 {
public static void main(String[] args) {
	// �迭:���� �ڷ����� �����͵��� �� ���� ��Ƶ� ����
			// �ݵ�� ���� �ڷ����̾�߸� �Ѵ�
			// �����Ҷ� ũ�⸦ �����ϰ� ������ ũ��� ���� �Ұ�
			// �迭�� ����Ҷ��� �Ϲ������� for���� ����Ѵ�

			// �迭 ���� ����: ���� ->���� ->������ ����
	
	//����� ������ �ѹ���
	//char[] ch;
	//ch=new char[4];
	char[] ch=new char[4];
	
	ch[0]='j';
	ch[1]='a';
	ch[2]='v';
	ch[3]=65;//0~65535 ������ ���� char�� �� �ִ�
	
	 for (int i = 0; i < ch.length; i++) {
		System.out.println(ch[i]);
	}
	 
	 for (char k : ch) {
		 System.out.println(k);
	}
	System.out.println("=================");
	// ���� ���� ������ ������ �ѹ���
	char[] ch2= {'j','a','v','a' };
	int[] k2= {100,200,300,400};
	double[] d2= {3.14,71.0,42.1};
	String[] str= {"ȫ�浿","��浿","���浿","���浿"};
	
	
	
}
}
