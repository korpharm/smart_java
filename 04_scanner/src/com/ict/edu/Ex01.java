package com.ict.edu;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// Scanner Ŭ����:Ű���� ������ �Է¹޾� ó���ϴ� Ŭ����
		// java.langó�� ��Ű���ȿ� �����ϴ� Ŭ������ �ƹ� ������� ��� ����
		// �ٸ� ���� �����ϴ� Ŭ������ import�� �ؾ��Ѵ�
		// import���:�ش� Ŭ���� ���ڵڿ��� ctrl+space bar or ctrl+shift+o

		Scanner sc = new Scanner(System.in);

		System.out.print("����� �̸�:");

		// �Է��� ������ String�� ��� ó���ϴ� ���
		String name = sc.next();
		System.out.println("�Է��� �̸�:" + name);

		// �Է��� ������ ����(����)�� ��� ó���ϴ� ���
		System.out.print("����� ����:");
		int age = sc.nextInt();
		System.out.println("�Է��� ����:" + age);

		// �Է��� ������ ����(�Ǽ�)�� ��� ó���ϴ� ���
		System.out.print("����� Ű:");
		double height = sc.nextDouble();
		System.out.println("�Է��� Ű:" + height);

		// �Է��� ������ boolean�� �� ��� ó���ϴ� ���
		System.out.print("����� �����Դϱ�:");
		boolean gender = sc.nextBoolean();
		if (gender) {
			System.out.println("����� �����Դϴ�");
		} else {
			System.out.println("����� �����Դϴ�");
		}
		System.out.println("=============");

		// sc���� char ó���� ���� String���� char ó���ϴ� ��� ���

	}
}
