package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		// string 객체 생성

		String str1 = "abc";

		char data[] = { 'a', 'b', 'c' };
		String str2 = new String(data);

		byte[] data2 = { 97, 98, 99 };
		String str3 = new String(data2);

		String data3 = "ABC";
		String str4 = new String(data3);

		String str5 = new String("ABC");

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println("=====================");

		// 같다
		// char int double등 숫자를 저장하는 자료형은 '같다'라는 표현을 '=='을 사용
		// 그러나 문자열(String)은 '=='을 사용하면 안됨
		// String에서 '=='를 사용하면 숫자는 내용을 비교,문자열은 주소를 비교
		// 문자열에서 데이터가 같은가 비교하려면 equals(),equalsIgnoreCase()(:대소문자 구별안함) 메소드사용
		if (str1 == str2) {
			System.out.println("같다");
		} else
			System.out.println("다르다");

		if (str4 == str5) {
			System.out.println("같다");
		} else
			System.out.println("다르다");

		if (str1.equals(str2)) {
			System.out.println("같다");
		} else
			System.out.println("다르다");

		if (str3.equalsIgnoreCase(str4)) {
			System.out.println("같다");
		} else
			System.out.println("다르다");
	}

}
