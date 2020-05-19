package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		String str = "ICT인재개발원 2강의장";
		// 1.charAt(int index):char -위치정보가 숫자로 들어오면 해당위치의 글자를 반환
		char c1 = str.charAt(5);
		System.out.println(c1);

		char c2 = str.charAt(8);
		System.out.println(c2);

		// 대문자와 소문자의 차이는 32
		String str2 = "대한민국 I love you 123";
		for (int i = 0; i < str2.length(); i++) {
			char c3 = str2.charAt(i);
			if (c3 >= 'a' && c3 <= 'z') {
				c3 = (char) (c3 - 32);
			}
			System.out.print(c3);
		}
		System.out.println("==================");
		// 2.concat(String str):String-들어온 문자열을 현재 문자열과 합친다
		String str3 = "대한민국";
		String str4 = "대한민";
		String res = str3.concat(str4);
		System.out.println(res);
		System.out.println("==================");
		// 3.equals(Object anObject):boolean 대소문자 구별
		// 4.equalsIgnoreCase(String anotherString):boolean 대소문자 구별안함
		// 5.format(String format, Object... args) 형식을 지정하고 형식에 맞춰 생성

		String str7 = "ICT인재개발원 2강의장";
		String res1 = String.format("%s", str7);

		// 남은 자리는 비우고 모자른 자리는 상관하지 않는다.
		res1 = String.format("%20s", str7);
		System.out.println(res1);
		System.out.println("==================");

		// 6.getBytes():byte[] -해당문자열을 byte[]로 변환 입출력할때 사용 영문자만 가능
		String str8 = "java";
		byte[] b = str8.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		// 반대로 해당 byte[]를 문자열로
		String str9 = new String(b);
		System.out.println(str9);
		
		//21. toCharArray():char[]-해당문자열을 char[]로 변환 입출력할때 사용 모든 문자 가능
		str8 = "java 자바 大韓民國 20";
		
		byte[] b1 = str8.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println(b1[i]);
		}
		char[] b2 = str8.toCharArray();
		for (int i = 0; i < b.length; i++) {
			System.out.println(b2[i]);
		}
		
		
		// 7.indexOf(int ch):int- char나 string이 들어오면 해당 문자의 위치값을 알려준다
		String str10 = "BufferedReader";
		int c = str10.indexOf('e');
		System.out.println(c);

		c = str10.indexOf('T');// 해당 사항이 없으면 -1 출력
		System.out.println(c);

		c = str10.indexOf("Re");
		System.out.println(c);

		// 7-1. indexOf(int ch, int fromIndex):int int fromIndex:시작위치, 2번째 3번째 글자찾기에 사용
		// "BufferedReader" 2번째 r찾기
		c = str10.indexOf('r', str10.indexOf('r') + 1);
		System.out.println(c);

		// "BufferedReader" 2번째 er찾기
		c = str10.indexOf("er", str10.indexOf("er") + 1);
		System.out.println(c);

		// 8.lastIndexOf(int ch):int lastIndexOf(String str):int 마지막 해당 문자 찾기
		c = str10.lastIndexOf('d');
		c = str10.lastIndexOf("er");

		// 9.length():int 해당문자열의 길이를 구한다. for문에 사용
		String str11 = "try now how long this is";
		int k = str11.length();
		System.out.println(k);

		// 10.replace(char oldChar, char newChar):char -string도 같음
		// 새로운 문자를 받아서 치환하기
		String str12 = "대한민국";
		String str13 = str12.replace('대', '개');
		System.out.println(str13);

		String str14 = str12.replace("대", "소머리");
		System.out.println(str14);

		// 11.contains(CharSequence s):boolean 인자에 char입력하면 오류
		// 인자로 들어온 문자열이 해당 문자열에 존재하면 true,존재하지 않으면 false, 대소문자 구별
		String str15 = "KOREA & 대한민국";
		boolean b1 = str15.contains("한");
		System.out.println(b1);

		// 12. isEmpty():boolean 해당 문자열이 비어있으면 true 내용이 있으면 false
		String str16 = "";
		b1 = str16.isEmpty();
		System.out.println(b1);

		str16 = "*";
		b1 = str16.isEmpty();
		System.out.println(b1);

		// 13. split(String regex):String regex:구분자(나눌 기준)
		// split(String regex, int limit):String int limit:나눌 배열의 크기
		String str17 = "사과,딸기,망고  오렌지,파인애플,두리안";
		String[] arr1 = str17.split(",");
		for (int i = 0; i < arr1.length; i++) {
			String k3 = arr1[i];
			System.out.println(k3);
		}
		// String[] arr2=str17.split(",",3);
		// for (int i = 0; i < arr1.length; i++) {
		// String k3=arr2[i];
		// System.out.println(k3);
		// }

		// 14. substring(int beginIndex):String begin부터 끝까지
		// substring(int beginIndex, int endIndex):String begin부터 endIndex 전까지

		String str18 = "010-9500-8939";
		String msg = str18.substring(4);
		System.out.println(msg);

		msg = str18.substring(4, 6);
		System.out.println(msg);

		msg = str18.substring(0, 3);
		System.out.println(msg);

		str18 = "770707-1";
		msg = str18.substring(7, 8);
		System.out.println(msg);

		msg = str18.substring(str18.indexOf('-') + 1, str18.indexOf('-') + 2);
		System.out.println(msg);

		// 010-7777-9999를 010-7777-XXXX 로 변경
		str17 = "010-7777-9999";
		arr1 = str17.split("-");
		for (int i = 0; i < arr1.length; i++) {
			String k3 = arr1[i];
			System.out.println(k3);
		}
		arr1[arr1.length - 1] = "xxxx";
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		// 15.toLowerCase() 모든 대문자를 소문자로 변경
		// 16.toUpperCase()
		str15 = "KOREA & 대한민국&19";
		msg = str15.toLowerCase();
		System.out.println(msg);

		msg = str15.toUpperCase();
		System.out.println(msg);

		msg = str15.toLowerCase();
		msg = str15.substring(0, 1).toUpperCase() + str15.substring(1).toLowerCase();
		System.out.println(msg);
		// 17.toString() :문자열 자체를 반환
		// Object의 toString():모든 객체에 사용가능, 객체가 가지고 있는 정보나 값등을 문자열로
		// 만들어 리턴하는 메소드(오버라이딩)

		str17 = "010-7777-9999";
		msg = str17.toString();

		// 18.trim():String
		// 해당문자열의 앞,뒤 공백제거 ,중간의 공백은 제거하지 못한다
		str17 = "  010-  7777- 9999  ";
		msg = str17.trim();
		System.out.println(msg);

		// 19.valueOf(자료형):static String 어떤 자료형이든 String로 변경
		boolean bo1 = true;
		char ch1 = 'A';
		int num1 = 34;
		long num2 = 58L;
		float num3 = 3.14f;
		double num4 = 342.12;
		System.out.println(bo1);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);

		// System.out.println(bo1+1);
		System.out.println(num1 + 1);
		System.out.println(num2 + 1);
		System.out.println(num3 + 1);
		System.out.println(num4 + 1);

		System.out.println(String.valueOf(bo1) + 1);
		System.out.println(String.valueOf(num1) + 1);
		System.out.println(String.valueOf(num2) + 1);
		System.out.println(String.valueOf(num3) + 1);
		System.out.println(String.valueOf(num4) + 1);

		System.out.println(bo1 + ""); // 전부 String으로 변환
		System.out.println(num1 + "");
		System.out.println(num2 + "");
		System.out.println(num3 + "");
		System.out.println(num4 + "");

		// 20.Wrapper class: 각종 String을 원 자료형으로 변환 ,원래는 기본 자료형을 객체로 만들때 사용하는 클래스이나 이 동작은
		// 이제 자동으로 만들어짐
		// 20-1.문자열을 boolean형으로 변경:Boolean.parseBoolean()
		String message = "True";
		boolean m1 = Boolean.parseBoolean(message);
		if (m1) {
			System.out.println("변경성공");
		} else {
			System.out.println("변경실패");
		}

		// 20-2.문자열을 int형으로 변경:Integer.parseInt()
		message = "241";
		int m3 = Integer.parseInt(message);
		System.out.println(message + 10);
		System.out.println(m3 + 10);

		// 20-3.문자열을 long형으로 변경:Long.parseLong()
		message = "241"; // L삽입되면 err
		long m4 = Long.parseLong(message);
		System.out.println(message + 10);
		System.out.println(m4 + 10);

		// 20-4.문자열을 Float형으로 변경:Float.parseFloat()
		message = "3.14";
		float m5 = Float.parseFloat(message);
		System.out.println(message + 10);
		System.out.println(m5 + 10);

		// 20-5.문자열을 Double형으로 변경:Double.parseDouble()
		message = "3.14";
		double m6 = Double.parseDouble(message);
		System.out.println(message + 10);
		System.out.println(m6 + 10);

		// 20-6. 문자열을 char로 변경하는 것은 String.charAt()사용
		message = "A";
		char m7 = message.charAt(0);
		
		

	}
}
