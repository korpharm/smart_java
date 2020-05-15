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
		
		//8.lastIndexOf(int ch):int lastIndexOf(String str):int 마지막 해당 문자 찾기
		c = str10.lastIndexOf('d');
		c = str10.lastIndexOf("er");
		
		//9.length():int 해당문자열의 길이를 구한다. for문에 사용
		String str11="try now how long this is";
		int k=str11.length();
		System.out.println(k);
		
		//10.replace(char oldChar, char newChar):char -string도 같음
		//새로운 문자를 받아서 치환하기
		String str12="대한민국";
		String str13=str12.replace('대', '개');
		System.out.println(str13);
		
		String str14=str12.replace('대', "소머리");
		System.out.println(str13);
		
	}
}
