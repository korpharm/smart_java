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
		
		//21. toCharArray():char[]-�ش繮�ڿ��� char[]�� ��ȯ ������Ҷ� ��� ��� ���� ����
		str8 = "java �ڹ� �������� 20";
		
		byte[] b1 = str8.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println(b1[i]);
		}
		char[] b2 = str8.toCharArray();
		for (int i = 0; i < b.length; i++) {
			System.out.println(b2[i]);
		}
		
		
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

		// 8.lastIndexOf(int ch):int lastIndexOf(String str):int ������ �ش� ���� ã��
		c = str10.lastIndexOf('d');
		c = str10.lastIndexOf("er");

		// 9.length():int �ش繮�ڿ��� ���̸� ���Ѵ�. for���� ���
		String str11 = "try now how long this is";
		int k = str11.length();
		System.out.println(k);

		// 10.replace(char oldChar, char newChar):char -string�� ����
		// ���ο� ���ڸ� �޾Ƽ� ġȯ�ϱ�
		String str12 = "���ѹα�";
		String str13 = str12.replace('��', '��');
		System.out.println(str13);

		String str14 = str12.replace("��", "�ҸӸ�");
		System.out.println(str14);

		// 11.contains(CharSequence s):boolean ���ڿ� char�Է��ϸ� ����
		// ���ڷ� ���� ���ڿ��� �ش� ���ڿ��� �����ϸ� true,�������� ������ false, ��ҹ��� ����
		String str15 = "KOREA & ���ѹα�";
		boolean b1 = str15.contains("��");
		System.out.println(b1);

		// 12. isEmpty():boolean �ش� ���ڿ��� ��������� true ������ ������ false
		String str16 = "";
		b1 = str16.isEmpty();
		System.out.println(b1);

		str16 = "*";
		b1 = str16.isEmpty();
		System.out.println(b1);

		// 13. split(String regex):String regex:������(���� ����)
		// split(String regex, int limit):String int limit:���� �迭�� ũ��
		String str17 = "���,����,����  ������,���ξ���,�θ���";
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

		// 14. substring(int beginIndex):String begin���� ������
		// substring(int beginIndex, int endIndex):String begin���� endIndex ������

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

		// 010-7777-9999�� 010-7777-XXXX �� ����
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

		// 15.toLowerCase() ��� �빮�ڸ� �ҹ��ڷ� ����
		// 16.toUpperCase()
		str15 = "KOREA & ���ѹα�&19";
		msg = str15.toLowerCase();
		System.out.println(msg);

		msg = str15.toUpperCase();
		System.out.println(msg);

		msg = str15.toLowerCase();
		msg = str15.substring(0, 1).toUpperCase() + str15.substring(1).toLowerCase();
		System.out.println(msg);
		// 17.toString() :���ڿ� ��ü�� ��ȯ
		// Object�� toString():��� ��ü�� ��밡��, ��ü�� ������ �ִ� ������ ������ ���ڿ���
		// ����� �����ϴ� �޼ҵ�(�������̵�)

		str17 = "010-7777-9999";
		msg = str17.toString();

		// 18.trim():String
		// �ش繮�ڿ��� ��,�� �������� ,�߰��� ������ �������� ���Ѵ�
		str17 = "  010-  7777- 9999  ";
		msg = str17.trim();
		System.out.println(msg);

		// 19.valueOf(�ڷ���):static String � �ڷ����̵� String�� ����
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

		System.out.println(bo1 + ""); // ���� String���� ��ȯ
		System.out.println(num1 + "");
		System.out.println(num2 + "");
		System.out.println(num3 + "");
		System.out.println(num4 + "");

		// 20.Wrapper class: ���� String�� �� �ڷ������� ��ȯ ,������ �⺻ �ڷ����� ��ü�� ���鶧 ����ϴ� Ŭ�����̳� �� ������
		// ���� �ڵ����� �������
		// 20-1.���ڿ��� boolean������ ����:Boolean.parseBoolean()
		String message = "True";
		boolean m1 = Boolean.parseBoolean(message);
		if (m1) {
			System.out.println("���漺��");
		} else {
			System.out.println("�������");
		}

		// 20-2.���ڿ��� int������ ����:Integer.parseInt()
		message = "241";
		int m3 = Integer.parseInt(message);
		System.out.println(message + 10);
		System.out.println(m3 + 10);

		// 20-3.���ڿ��� long������ ����:Long.parseLong()
		message = "241"; // L���ԵǸ� err
		long m4 = Long.parseLong(message);
		System.out.println(message + 10);
		System.out.println(m4 + 10);

		// 20-4.���ڿ��� Float������ ����:Float.parseFloat()
		message = "3.14";
		float m5 = Float.parseFloat(message);
		System.out.println(message + 10);
		System.out.println(m5 + 10);

		// 20-5.���ڿ��� Double������ ����:Double.parseDouble()
		message = "3.14";
		double m6 = Double.parseDouble(message);
		System.out.println(message + 10);
		System.out.println(m6 + 10);

		// 20-6. ���ڿ��� char�� �����ϴ� ���� String.charAt()���
		message = "A";
		char m7 = message.charAt(0);
		
		

	}
}
