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
		 System.out.print("번호를 입력하세요");
		 int no=sc.nextInt();
		 
		 System.out.print("국어 점수를 입력하세요");
		 int kor=sc.nextInt();
		 
		 System.out.print("영어 점수를 입력하세요");
		 int eng=sc.nextInt();
		 
		 System.out.print("수학 점수를 입력하세요");
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
	//순위
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			
		if(arr[i][1]<arr[j][1]) arr[i][4]++;
	}
	}
	
	//정렬
	
	for (int i = 0; i < arr.length-1; i++) {
		for (int j =i+1; j < arr.length; j++) {
			if(arr[i][4]>arr[j][4]) {  
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	//출력
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			if(j==3) System.out.print((char)(arr[i][j])+"\t");
			else System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
	}
	
}

}