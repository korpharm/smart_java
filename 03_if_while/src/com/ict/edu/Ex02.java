package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		// if~else~:조건식이 참일때와 거짓일때 각각 나눠서 처리
		// 형식: if(조건식){
		// 조건식이 참일때 실행문장
		// 조건식이 참일때 실행문장
		// } elseif(조건식){
		// 조건식이 거짓일때 실행문장}

		// int k2 이 60 이상이면 합격 60 미만이면 불합격

		int k2 = 67;
		String str = "";
		if (k2 >= 60) {
			str = "합격";
		} else {
			str = "불합격";
		}
		System.out.println(str);

		// 홀수 짝수 판별
		k2 = 12;
		if (k2 % 2 == 0) {
			str = "짝수";
		} else {
			str = "홀수";
		}
		System.out.println(str);

		// 대 소문자 판별문제
		char k3 = '#';
		str = "기타문자";
		if (k3 >= 'A' && k3 <= 'Z') {
			str = "대문자";
		} else if (k3 >= 'a' && k3 <= 'z') {
			str = "소문자";
		}
		System.out.println(str);

		// 1또는 3이면 남자 아니면 여자
		int k4 = 7;
		str = "남자 여자 아닌 제3의 성";
		if (k4 == 1 || k4 == 3) {
			str = "남자";
		} else if (k4 == 2 || k4 == 4) {
			str = "여자";
		}
		System.out.println(str);

		// 근무시간 10시간
		int time = 10;
		int dan = 8590;
		int pay;
		if (time > 8) {
			pay = 8 * 8950 + (int) ((time - 8) * dan * 1.5);
		} else {
			pay = time * dan;
		}
		System.out.println(pay);


	// 두수 중 큰값을 출력
	int k5 = 42;
	int k6 = 32;
	int result=0;
	if(k5>=k6)
	{
		result = k5;
	}else
	{
		result = k6;
	}
	System.out.println(result);

}

}
