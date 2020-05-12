package com.ict.edu;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		big: while (true) {
			int dan=0;
			
			small: while (true) {
				System.out.print("메뉴를 선택하세요\n 1.커피음료 3천원 \n 2.이온음료 2천원 \n 3. 물 1천원 \n 4.과일쥬스 4천원 ");
				int menu = sc.nextInt();
				
				switch (menu) {
				case 1:
					dan = 3000;
					break small;
				case 2:
					dan = 2000;
					break small;
				case 3:
					dan = 1000;
					break small;
				case 4:
					dan = 4000;
					break small;
				default:
					System.out.println("잘못 입력했습니다");
					continue small;
				}
			}

			System.out.println("잔 수를 입력하세요");
			int su = sc.nextInt();

			System.out.print("지불할 돈을 입력하세요");
			int input = sc.nextInt();

			
			int output = input - ((int) (su * dan * 1.1));

			if (output > 0) {
				System.out.println("거스름 돈은");
				System.out.println(output + "원 입니다");
			}
			 else {System.out.println((int)(su*dan*1.1)-input+"원을 더 내셔야 합니다");}

			again: while (true) {
				System.out.println("계속할까요? 계속할려면 1 중단하려면 2를 입력");
				int k = sc.nextInt();
				if (k == 1)
					continue big;
				else if (k == 2)
					break big;
				else
					System.out.println("잘못 입력하셨습니다");
				continue again;
			}

		}

	}
}
