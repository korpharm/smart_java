package com.ict.edu;

public class Ex04 {
public static void main(String[] args) {
	
	//switch-case문:if문과 같은 조건식
	//if문은 조건식이 boolean 형-즉 비교연산 논리연산 boolean형 사용
    //switch문은 인자값이 byte,short,int,char,String 사용
	//switch(인자값){
	// case 조건값1:인자값과 조건값1이 같을때 수행문;break;
	// case 조건값2:인자값과 조건값2이 같을때 수행문;break;
	// case 조건값3:인자값과 조건값3이 같을때 수행문;break;
    // default: 조건값 1,2,3과 모두 같지 않을때 수행문;
	//}
	//break문이 없으면 break 나올때까지 실행
	//break역할은 현재 실행하고 있는 범위를 벗어나는 역할
	
	
    //char k1이 A 아프리카 B브라질 C 캐나다 나머지 한국
	char k1='C';
	String str="";
	switch(k1){
		case('A'):str="아프리카";break;
		case('B'):str="브라질";break;
		case('C'):str="캐나다";break;
		default:str="한국";
			
		//break문이 없으면 break 나올때까지 실행
		
		//case('A'):System.out.println("아프리카");
		//case('B'):System.out.println("브라질");
		//case('C'):System.out.println("캐나다");
		//default:str="한국";
		
	
	}
	System.out.println(str);
	
	//int k2가 1,3 남자  2,4 여자
	
	int k2=7;
	switch(k2) {
	   case(1):
	   case(3):str="남자";break;
	   case(2):
	   case(4):str="여자";break;
	   default:str="제3의 성";
	}
	System.out.println(str);
	
	//String k3 이 한국이면 서울, 중국이면 북경,일본이면 동경, 미국이면 워싱턴

      String k3="일본";
      switch(k3) {
      case("중국"):str="북경";break;
      case("미국"):str="워싱턴";break;
      case("일본"):str="동경";break;
      case("한국"):str="서울";break;
      }
      System.out.println(str);
      
      char k7='b';
      switch(k7) {
      case('A'):str="Africa";break;
      case('a'):str="Africa";break;
      case('B'):str="Brazil";break;
      case('b'):str="Brazil";break;
      case('C'):str="Canada";break;
      case('c'):str="Canada";break;
      default:str="korea";
      }
      
      System.out.println(str);
      
      
      switch(k7) {
      case('A'):
      case('a'):str="Africa";break;
      case('B'):
      case('b'):str="Brazil";break;
      case('C'):
      case('c'):str="Canada";break;
      default:str="korea";
      }
      
      
      System.out.println(str);
      //switch문은 범위가 넓어지면 사용하지 말자
      //int k6의 점수가 90이면 A
      int k6=54;
      int k9=(int)(k6/10.0);
      switch(k9) {
      case(10):str="A학점";break;
      case(9):str="A학점";break;
      case(8):str="B학점";break;
      case(7):str="C학점";break;
      default:str="F학점";break;
      }
      System.out.println(str);
}
}


