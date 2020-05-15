package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		String str = "ICT���簳�߿� 2������";
		// 1.charAt(int index):char -��ġ������ ���ڷ� ������ �ش���ġ�� ���ڸ� ��ȯ
		char c1 = str.charAt(5);
		System.out.println(c1);

		char c2 = str.charAt(8);
		System.out.println(c2);

		// �빮�ڿ� �ҹ����� ���̴� 32
		String str2 = "���ѹα� I love you 123";
		for (int i = 0; i < str2.length(); i++) {
			char c3 = str2.charAt(i);
			if (c3 >= 'a' && c3 <= 'z') {
				c3 = (char) (c3 - 32);
			}
			System.out.print(c3);
		}
		System.out.println("==================");
		// 2.concat(String str):String-���� ���ڿ��� ���� ���ڿ��� ��ģ��
		String str3 = "���ѹα�";
		String str4 = "���ѹ�";
		String res = str3.concat(str4);
		System.out.println(res);
		System.out.println("==================");
		// 3.equals(Object anObject):boolean ��ҹ��� ����
		// 4.equalsIgnoreCase(String anotherString):boolean ��ҹ��� ��������
		// 5.format(String format, Object... args) ������ �����ϰ� ���Ŀ� ���� ����

		String str7 = "ICT���簳�߿� 2������";
		String res1 = String.format("%s", str7);

		// ���� �ڸ��� ���� ���ڸ� �ڸ��� ������� �ʴ´�.
		res1 = String.format("%20s", str7);
		System.out.println(res1);
		System.out.println("==================");

		// 6.getBytes():byte[] -�ش繮�ڿ��� byte[]�� ��ȯ ������Ҷ� ��� �����ڸ� ����
		String str8 = "java";
		byte[] b = str8.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		// �ݴ�� �ش� byte[]�� ���ڿ���
		String str9 = new String(b);
		System.out.println(str9);

		// 7.indexOf(int ch):int- char�� string�� ������ �ش� ������ ��ġ���� �˷��ش�
		String str10 = "BufferedReader";
		int c = str10.indexOf('e');
		System.out.println(c);

		c = str10.indexOf('T');// �ش� ������ ������ -1 ���
		System.out.println(c);

		c = str10.indexOf("Re");
		System.out.println(c);

		// 7-1. indexOf(int ch, int fromIndex):int int fromIndex:������ġ, 2��° 3��° ����ã�⿡ ���
		// "BufferedReader" 2��° rã��
		c = str10.indexOf('r', str10.indexOf('r') + 1);
		System.out.println(c);

		// "BufferedReader" 2��° erã��
		c = str10.indexOf("er", str10.indexOf("er") + 1);
		System.out.println(c);
		
		//8.lastIndexOf(int ch):int lastIndexOf(String str):int ������ �ش� ���� ã��
		c = str10.lastIndexOf('d');
		c = str10.lastIndexOf("er");
		
		//9.length():int �ش繮�ڿ��� ���̸� ���Ѵ�. for���� ���
		String str11="try now how long this is";
		int k=str11.length();
		System.out.println(k);
		
		//10.replace(char oldChar, char newChar):char -string�� ����
		//���ο� ���ڸ� �޾Ƽ� ġȯ�ϱ�
		String str12="���ѹα�";
		String str13=str12.replace('��', '��');
		System.out.println(str13);
		
		String str14=str12.replace('��', "�ҸӸ�");
		System.out.println(str13);
		
	}
}
