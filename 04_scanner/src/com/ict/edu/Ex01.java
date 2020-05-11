package com.ict.edu;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// Scanner 클래스:키보드 정보를 입력받아 처리하는 클래스
		// java.lang처럼 패키지안에 존재하는 클래스는 아무 제약없이 사용 가능
		// 다른 곳에 존재하는 클래스는 import를 해야한다
		// import방법:해당 클래스 글자뒤에서 ctrl+space bar or ctrl+shift+o

		Scanner sc = new Scanner(System.in);

		System.out.print("당신의 이름:");

		// 입력한 내용이 String일 경우 처리하는 방법
		String name = sc.next();
		System.out.println("입력한 이름:" + name);

		// 입력한 내용이 숫자(정수)인 경우 처리하는 방법
		System.out.print("당신의 나이:");
		int age = sc.nextInt();
		System.out.println("입력한 나이:" + age);

		// 입력한 내용이 숫자(실수)인 경우 처리하는 방법
		System.out.print("당신의 키:");
		double height = sc.nextDouble();
		System.out.println("입력한 키:" + height);

		// 입력한 내용이 boolean형 인 경우 처리하는 방법
		System.out.print("당신은 남성입니까:");
		boolean gender = sc.nextBoolean();
		if (gender) {
			System.out.println("당신은 남성입니다");
		} else {
			System.out.println("당신은 여성입니다");
		}
		System.out.println("=============");

		// sc에는 char 처리는 없다 String에서 char 처리하는 방법 사용

	}
}
