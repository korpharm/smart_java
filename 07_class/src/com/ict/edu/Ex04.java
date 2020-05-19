package com.ict.edu;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Ex04 {
public static void main(String[] args) {
	//��¥ ���� Ŭ����:DateŬ����(deprecate:�������� ������ ���� �� �ִ�) calendarŬ����
	
	Date date=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat();
	System.out.println(sdf.format(date));
	System.out.println(date.getYear()+1900);
	System.out.println(date.getMonth()+1);//�ڹٿ��� ���� 0~11
	System.out.println(date.getDate());
	System.out.println(date.getHours());
	System.out.println(date.getMinutes());
	System.out.println(date.getSeconds());
	
	int k1=date.getDay();
	switch(k1) {
	case 0:System.out.println("�Ͽ���");break;
	case 1:System.out.println("������");break;
	case 2:System.out.println("ȭ����");break;
	case 3:System.out.println("������");break;
	case 4:System.out.println("�����");break;
	case 5:System.out.println("�ݿ���");break;
	}
	
	//calendarŬ������ new����� ����������� get(�������� �ʵ�,Calendar�ʵ�)
	Calendar now=Calendar.getInstance();
	System.out.println(now.get(Calendar.YEAR));
	System.out.println(now.get(Calendar.MONTH)+1);
	System.out.println(now.get(Calendar.DATE));
	
	System.out.println(now.get(Calendar.HOUR));//12 am=0 pm=1
	System.out.println(now.get(Calendar.HOUR_OF_DAY));//24
	
	int res=now.get(Calendar.AM_PM);
	if(res==1) {
		System.out.println("AM"+now.get(Calendar.HOUR));
	}else {
		System.out.println("PM"+now.get(Calendar.HOUR));
	}
	System.out.println(now.get(Calendar.MINUTE));
	System.out.println(now.get(Calendar.SECOND));
	
	int res1=now.get(Calendar.DAY_OF_WEEK); //1:�Ͽ���  7:�����
	switch(res1) {
	case 1:System.out.println("�Ͽ���");break;
	case 2:System.out.println("������");break;
	case 3:System.out.println("ȭ����");break;
	case 4:System.out.println("������");break;
	case 5:System.out.println("�����");break;
	case 6:System.out.println("�ݿ���");break;
	case 7:System.out.println("�����");break;
	}
	
	//Ȧ¦ ,ī�� ������ : ������ �߻�
	//���� ���� ��  ����� �� 9��
}


}
