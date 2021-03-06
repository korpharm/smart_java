package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		// 단순 if:조건이 참일때만 실행 ,거짓일때는 if문 무시
		// 조건식:boolean 비교연산 논리연삭
		// 형식:if(조건식){
		// 조건식이 참일때 실행문장
		// }
		// 단 실행문장이 한 줄일때는 {} 생략가능

		// int k1 이 60 이상이면 합격

		int k1 = 59;
		String str = "초기값";
		if (k1 >= 60) {
			str = "합격";
		}
		System.out.println("결과" + str);
		System.out.println("수고하셨습니다");

		// int k2 이 60 이상이면 합격 60 미만이면 불합격

		int k2 = 59;
		str = "초기값";
		if (k2 >= 60) {
			str = "합격";
		}
		if (k2 < 60) {
			str = "불합격";
		}
		System.out.println("결과" + str);

		// int k3 이 60 이상이면 합격 60 미만이면 불합격

		int k3 = 59;
		str = "불합격";
		if (k3 >= 60) {
			str = "합격";
		}

		System.out.println("결과" + str);

		// 홀수 짝수 판별
		int k4 = 8;
		str = "홀수";
		if (k4 % 2 == 0) {
			str = "짝수";
		}
		System.out.println(k4 + "는" + str);

		// 대 소문자 판별문제
		char k5 = 'Q';
		str = "대문자";
		if ((k5 >= 'a') && (k5 <= 'z')) {
			str = "소문자";
		}
		System.out.println(k5 + "는" + str);

		// 1또는 3이면 남자 아니면 여자
		int k6 = 3;
		str = "여자";
		if (k6 == 1 || k6 == 3) {
			str = "남자";
		}
		System.out.println(str);

		// 근무시간 10시간
		int time = 14;
		int dan = 8590;
		int pay;
		pay = time * dan;
		if (time > 8) {
			pay = 8 * dan + (int) ((time - 8) * dan * 1.5);
		}

		System.out.println(pay);

		// 두수 중 큰값을 출력
		k2 = 15;
		k3 = 20;
		int res10 = k3;
		if (k2 > k3) {
			res10 = k2;
		}
		System.out.println(res10);
		
		int k7 = 30;
		int k8 = 15;
		int out = k7;
		if (k7 < k8) {
			out = k8;
		}
		System.out.println(out);
	}
}
