package com.ict.edu;

import java.util.Scanner;

public class Ex_12 {
public static void main(String[] args) {
	

		//5명의 이름 국어 영어 수학 점수를 입력받아 이름 총점 평균 학점 순위를 구하고 정렬

				Scanner sc = new Scanner(System.in);
				int rank = 1;
				Ex12[] arr = new Ex12[5];
				Ex12[] temp = new Ex12[5];//임시저장 클래스로 만드는게 의미상 적합함

				for (int i = 0; i < 5; i++) {
					

					System.out.print("이름을 입력하세요");
					String name = sc.next();

					System.out.print("국어 점수를 입력하세요");
					int kor = sc.nextInt();

					System.out.print("영어 점수를 입력하세요");
					int eng = sc.nextInt();

					System.out.println("수학 점수를 입력하세요");
					int math = sc.nextInt();

					
					int sum = kor+eng+math;

					
					double avr =(int)(sum/3.0*10)/10.0;
                     
					String grad;
					
					if (avr>=90) grad="A";
					else if(avr>=80) grad="B";
					else if(avr>=70) grad="C";
					else grad="F";
						
					
					

					Ex12 e9 = new Ex12(name,sum,avr,grad,1);
					arr[i] = e9;

				}
				
				// 순위
				for (int j = 0; j < 5; j++) {
					
					for (int j2 = 0; j2 < 5; j2++) {

						if (arr[j].getSum() < arr[j2].getSum())
							rank++;
					
					arr[j].setRank(rank);
				}
				}
				
				// 정렬

						for (int j = 0; j < arr.length - 1; j++) {
							for (int j2 = j + 1; j2 < arr.length; j2++) {
				             if(arr[j].getRank()>arr[j2].getRank()) {
				            	 temp[j]=arr[j];
				            	 arr[j]=arr[j2];
				            	 arr[j2]=temp[j];
				             }
							}

						}
				
				
				

				for (int j = 0; j < arr.length; j++) {
					System.out.print("이름 " + arr[j].getName());
					System.out.print(" 총점 " + arr[j].getSum());
					System.out.print(" 평균 " + arr[j].getAvr());
					System.out.print(" 학점 " + arr[j].getGrad() + "학점  ");
					System.out.println(" 순위 " + arr[j].getRank() + "위");
				}

				
			
}
}
