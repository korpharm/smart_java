package com.ict.edu;

public class Ex12 {
	public static void main(String[] args) {
		// break label, continue label
		// break label:label이 지정한 블록을 탈출
		// contine label:label 이 지정한 블록 수행문을 포기하고 다음 회차를 수행
		// label지정방법은 레이블 이름: 뒤나 밑에는 반복문만 올 수 있다

		for (int i = 1; i < 11; i++) {
			if (i == 6)
				break;
			System.out.print(i + " ");

		}
		System.out.println();

	//for문이 하나일때는 break와 break label은 같은 결과
		//for문이 하나일때는 break label을 사용할 필요 없음(continue문도 마찬가지)
		esc: for (int i = 1; i < 11; i++) {
			if (i == 6)
				break esc;
			System.out.print(i + " ");

		}
		System.out.println();

		
		for (int i = 1; i < 11; i++) {
			if (i == 6)
				continue ;
			System.out.print(i + " ");

		}
		System.out.println();

		
		esc2: for (int i = 1; i < 11; i++) {
			if (i == 6)
				continue esc2;
			System.out.print(i + " ");

		}
		System.out.println("================");
		
		for (int i = 1; i <4; i++) {
			for (int j = 1; j <6; j++) {
				System.out.println(i+","+j);
			}
			
		}
		System.out.println("================");

		
		//j가 3일때 break
System.out.println("================");
		
		for (int i = 1; i <4; i++) {
			for (int j = 1; j <6; j++) {
				if(j==3) break;
				System.out.println(i+","+j);
			}
			
		}
		System.out.println("================");
		
		//j=3일때 break label
		esc3:for (int i = 1; i <4; i++) {
			for (int j = 1; j <6; j++) {
				if(j==3) break esc3;
				System.out.println(i+","+j);
			}
			
		}
		System.out.println("================");
		
		
		for (int i = 1; i <4; i++) {
			for (int j = 1; j <6; j++) {
				if(j==3) continue ;
				System.out.println(i+","+j);
			}
			
		}
		System.out.println("================");
		
		
		esc4:for (int i = 1; i <4; i++) {
			for (int j = 1; j <6; j++) {
				if(j==3) continue esc4;
				System.out.println(i+","+j);
			}
			
		}
		System.out.println("================");
		
		
	}
}
