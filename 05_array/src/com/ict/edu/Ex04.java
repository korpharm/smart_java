package com.ict.edu;

public class Ex04 {
public static void main(String[] args) {
	//���� ���ϱ�
	//1.��� ������� ������ 1������ �ʱⰪ �ο�
	//2.��� ������ ���ؾߵȴ�
	//3. ��(i)���� ��(j)�� ũ�� �� ���� ������Ŵ
	
	int[] su= {90,85,70,90,96,80};
	int temp=1;
	int[] rank= {1,1,1,1,1,1};
	
	for (int i = 0; i < su.length; i++) {
		for (int j = 0; j < su.length; j++) {
			if(su[i]<su[j]) {
				rank[i]++;
			}
		}
	}
	
	for (int i : rank) {
		System.out.print(i);
	}
	
}
}
