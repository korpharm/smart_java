package com.ict.edu;

public class Ex05 {
public static void main(String[] args) {
	//for��:������ ��Ģ�� ���� ���๮�� �ݺ�ó���ϴ� ��
	// for(�ʱ��;���ǽ�;������) {
		// ���ǽ��� ���϶� ������ ����;
	//}
	//for���� ������ �ʱ�ĺ��� �����Ѵ� ���� ���ǽ����� �̵�
	//���ǽ��� boolean��
	//���ǽ��� ���̸� ���� ������ �����Ѵ� �����̸� ���������ʴ´�
	//for���� ���� ������ ������ ���������� ����
	//�������� �ʱ���� �����ϰų� ���ҽ�Ű�� ������ �ϰ� �ٽ� ���ǽ����� ����
	//�ڹٿ����� if�� switch�� for�� �ȿ��� ���� ������ �ۿ����� �� �� ����
	
// �ȳ��ϼ��� 10�� ����ϱ�
	System.out.println("�ȳ��ϼ���");//10��
	
	for (int i = 1; i <11; i++) {
		System.out.println(i+"=Hello");
	}
	System.out.println("==============");
	
	//0-10���� ���
	for (int i = 0; i < 11; i++) {
		System.out.println(i);
		
	}
	System.out.println("==============");
	//0-10���� ¦�� ���
	for (int i = 0; i < 11; i++) {
		System.out.println(i);
		i++;
	}
	
	for (int i = 0; i <11; i=i+2) {
		System.out.println(i);
	}
	
	for (int i = 0; i <11; i++) {
		if(i%2==1) {
			System.out.println(i);
	}
	
}

}
}
