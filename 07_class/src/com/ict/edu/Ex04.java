package com.ict.edu;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Ex04 {
public static void main(String[] args) {
	//날짜 관련 클래스:Date클래스(deprecate:언제든지 지원을 끊을 수 있다) calendar클래스
	
	Date date=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat();
	System.out.println(sdf.format(date));
	System.out.println(date.getYear()+1900);
	System.out.println(date.getMonth()+1);//자바에서 월은 0~11
	System.out.println(date.getDate());
	System.out.println(date.getHours());
	System.out.println(date.getMinutes());
	System.out.println(date.getSeconds());
	
	int k1=date.getDay();
	switch(k1) {
	case 0:System.out.println("일요일");break;
	case 1:System.out.println("월요일");break;
	case 2:System.out.println("화요일");break;
	case 3:System.out.println("수요일");break;
	case 4:System.out.println("목요일");break;
	case 5:System.out.println("금요일");break;
	}
	
	//calendar클래스는 new예약어 사용하지않음 get(참조변수 필드,Calendar필드)
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
	
	int res1=now.get(Calendar.DAY_OF_WEEK); //1:일요일  7:토요일
	switch(res1) {
	case 1:System.out.println("일요일");break;
	case 2:System.out.println("월요일");break;
	case 3:System.out.println("화요일");break;
	case 4:System.out.println("수요일");break;
	case 5:System.out.println("목요일");break;
	case 6:System.out.println("금요일");break;
	case 7:System.out.println("토요일");break;
	}
	
	//홀짝 ,카드 높낮이 : 랜덤수 발생
	//가위 바위 보  경우의 수 9개
}


}
