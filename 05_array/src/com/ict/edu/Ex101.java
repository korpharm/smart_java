package com.ict.edu;

import java.util.Scanner;

public class Ex101 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int sum;
	int avr;
	int grad;
	int rank=1;
	int[][] arr=new int[5][5];
	int[] temp=new int[5];
	
	for (int i = 0; i < arr.length; i++) {
		 System.out.print("��ȣ�� �Է��ϼ���");
		 int no=sc.nextInt();
		 
		 System.out.print("���� ������ �Է��ϼ���");
		 int kor=sc.nextInt();
		 
		 System.out.print("���� ������ �Է��ϼ���");
		 int eng=sc.nextInt();
		 
		 System.out.print("���� ������ �Է��ϼ���");
		 int math=sc.nextInt();
		 
		 sum=kor+eng+math;
		 avr=sum/3;
		 
		 if(avr>=90)  grad='A'; 
		 else if(avr>=80) grad='B';
		 else if(avr>=70) grad='C';
		 else grad='F';
		 
		 arr[i][0]=no;
		 arr[i][1]=sum;
		 arr[i][2]=avr;
		 arr[i][3]=grad;
		 arr[i][4]=rank;
	
}
	//����
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			
		if(arr[i][1]<arr[j][1]) arr[i][4]++;
	}
	}
	
	//����
	
	for (int i = 0; i < arr.length-1; i++) {
		for (int j =i+1; j < arr.length; j++) {
			if(arr[i][4]>arr[j][4]) {  
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	//���
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			if(j==3) System.out.print((char)(arr[i][j])+"\t");
			else System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
	}
	
}

}