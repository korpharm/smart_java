package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		// string ��ü ����

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

		// ����
		// char int double�� ���ڸ� �����ϴ� �ڷ����� '����'��� ǥ���� '=='�� ���
		// �׷��� ���ڿ�(String)�� '=='�� ����ϸ� �ȵ�
		// String���� '=='�� ����ϸ� ���ڴ� ������ ��,���ڿ��� �ּҸ� ��
		// ���ڿ����� �����Ͱ� ������ ���Ϸ��� equals(),equalsIgnoreCase()(:��ҹ��� ��������) �޼ҵ���
		if (str1 == str2) {
			System.out.println("����");
		} else
			System.out.println("�ٸ���");

		if (str4 == str5) {
			System.out.println("����");
		} else
			System.out.println("�ٸ���");

		if (str1.equals(str2)) {
			System.out.println("����");
		} else
			System.out.println("�ٸ���");

		if (str3.equalsIgnoreCase(str4)) {
			System.out.println("����");
		} else
			System.out.println("�ٸ���");
	}

}
