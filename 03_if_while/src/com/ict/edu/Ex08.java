package com.ict.edu;

public class Ex08 {
public static void main(String[] args) {
	//��ø while��
	//���� for���� ����
	
	for (int i = 1; i < 4; i++) {
		for (int j = 1; j <6; j++) {
			System.out.println("i="+i+",j="+j+"");
		}
		System.out.println();
	}
	int k1=1;
	while (k1>4) {
		int g1=1;
		while (g1>6) {
			System.out.println("k1="+k1+",g1="+g1+"");
			g1++;
		}
		
		k1++;
	}
	//������
	int i=2; 
	while (i<10) {
		int j=1;
		while (j<10) {
			System.out.println(i+"*"+j+"="+i*j);
			j++;
		}
		
		i++;
	}
	System.out.println();
	
	//������ ������ ���
	i=2; 
	while (i<10) {
		int j=1;
		while (j<10) {
			System.out.print(i+"*"+j+"="+i*j+" ");
			j++;
					}
		System.out.println();
		i++;
	}
	System.out.println();
	
	// ������ ������
	i=1; 
	while (i<10) {
		int j=2;
		while (j<10) {
			System.out.print(j+"*"+i+"="+i*j+" ");
			j++;
					}
		System.out.println();
		i++;
	}
	
	
}
}
