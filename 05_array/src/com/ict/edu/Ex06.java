package com.ict.edu;

import java.util.Scanner;

public class Ex06 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	String[] name;
	name=new String[5];
	
	int[] kor;
	kor=new int[5];
	
	int[] eng;
	eng=new int[5];
	
	int[] math;
	math=new int[5];
	
	int[] total;
	total=new int[5];
	
	double[] avr;
	avr=new double[5];
	
	String[] grad;
	grad=new String[5];
	
	int[] rank= {1,1,1,1,1};
	
	for (int i = 0; i < 5; i++) {
		
	
	System.out.print("�̸��� �Է��ϼ���");
	name[i]=sc.next();
	
	
	System.out.print("���������� �Է��ϼ���");
	kor[i]=sc.nextInt();
	
	
	System.out.print("���������� �Է��ϼ���");
	eng[i]=sc.nextInt();
	
	
	System.out.print("���������� �Է��ϼ���");
	math[i]=sc.nextInt();
	
	
	total[i]=kor[i]+eng[i]+math[i];
	
	System.out.println(total[i]);
	
	avr[i]=(int)(total[i]/3.0);
	
	if(avr[i]>=90) grad[i]="A����";
	else if(avr[i]>=80) grad[i]="B����";
	else if(avr[i]>=70) grad[i]="C����";
	else grad[i]="F����";
	
	}
	
	
	
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j <5; j++) {
			if(total[i]<total[j]) {rank[i]++;}
		}
	}
	
	System.out.println("�̸�"+"\t"+"����"+"\t"+"���"+"\t"+"����"+"\t"+"����");
	for (int i = 0; i < 5; i++) {
			
	System.out.print(name[i]);
	System.out.print(total[i]);
	System.out.print(avr[i]);
	System.out.print(grad[i]);
	System.out.println(rank[i]);
	
	}
}
}
