package com.ict.edu;

import java.util.Scanner;

public class Ex02 {
public static void main(String[] args) {
	//���ڸ� �޾Ƽ� Ȧ�� ¦���� �����ϱ�
	Scanner sc=new Scanner(System.in);
	System.out.print("���� �Է�:");
	int su=sc.nextInt();
	String result="";
	
	if(su%2==0) {result="¦��";
	}else {result="Ȧ��";}
	System.out.println("�����  "+result);
	System.out.println("====================");
	//�ٹ��ð��� �Է¹޾Ƽ� �ӱ� ����
	
	System.out.print("�ٹ��ð� �Է�:");
	int h=sc.nextInt();
	int pay=0;
	int dan=8590;
	if(h>8) {pay=h*dan+(int)((h-8)*dan*1.5);}
	else {pay=h*dan;}
	System.out.println(h+"�ð� �ٹ� �ӱ��� "+pay);
	
	System.out.println("====================");
	// 1 ī���ī 3500  2 ī��� 4000  3 �Ƹ޸�ī�� 30000   4  �����꽺  3500
	
	System.out.println("1 ī���ī 3500 \n  2 ī��� 4000 ");
	System.out.println("3 �Ƹ޸�ī�� 3000 \n 4  �����꽺  3500");
	System.out.print("�޴��� �����ϼ���. �޴� ��ȣ�� �Է��ϼ���");
	int menu=sc.nextInt();
	int input=10000;
	int output=0;
	su=2;
	dan=0;
	int price=(int)(su*dan*1.1);
	String str="";
	
	switch(menu) { 
	case 1:str="ī���ī";break;
	case 2:str="ī���";break;
	case 3:str="�Ƹ޸�ī��";break;
	case 4:str="�����꽺";break;
	default: str="�ش���� ����";
	}
	
	switch(dan) { 
	case 1:dan=3500;break;
	case 2:dan=4000;break;
	case 3:dan=3000;break;
	case 4:dan=3500;break;
	
	}
	
	switch(menu) {
	case 1:output=input-price;System.out.println("�����Ͻ� �޴��� "+str);break;
	case 2:output=input-price;System.out.println("�����Ͻ� �޴��� "+str);break;
	case 3:output=input-price;System.out.println("�����Ͻ� �޴��� "+str);break;
	case 4:output=input-price;System.out.println("�����Ͻ� �޴��� "+str);break;}
	System.out.println("�ܵ��� "+output);
	System.out.println("====================");
	
	
	System.out.println("�ѱ�   , �̱�  , �߱�  ,  �Ϻ� ");
	System.out.print("���� �����ϼ���. ���� �����Է��ϼ���");
	String country=sc.next();
	String res="";
	
	switch(country)
	 {
	case "�ѱ�":res="����";break;
	case "�̱�":res="������";break;
	case "�߱�":res="�ϰ�";break;
	case "�Ϻ�":res="����";break;
    default: str="�ش���� ����";
    }
	
	switch(country)
	 {
	case "�ѱ�":System.out.println("�����Ͻ� ����� "+country+" ������"+res);break;
	case "�̱�":System.out.println("�����Ͻ� ����� "+country+" ������"+res);break;
	case "�߱�":System.out.println("�����Ͻ� ����� "+country+" ������"+res);break;
	case "�Ϻ�":System.out.println("�����Ͻ� ����� "+country+" ������"+res);break;
	default: str="�ش���� ����";
	 }
	

	
	
	}
}

