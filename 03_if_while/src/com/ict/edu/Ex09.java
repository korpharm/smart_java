package com.ict.edu;

public class Ex09 {
public static void main(String[] args) {
	// do~while ��:while���� ���� �ݺ���
   // �ʱⰪ
    //do
    //���๮
    //������
	// }while(���ǽ�)
	
	// 1~10 ¦��
    int i=1;
	do {
		if(i%2==0) System.out.println(i);
		i++;
	} while (i<11);
	
	//1~10 ������
	i=1;
	int res=0;
	do {
		res=res+i;
		i++;
	} while (i<11);
	System.out.println(res);
	
	//������ 5��
	
	i=1;
	do {
		System.out.println("5*"+i+"="+5*i);
		i++;
	} while (i<10);
   
}
}
