package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		// 배열:같은 자료형의 데이터들을 한 곳에 모아둔 묶음
		// 반드시 같은 자료형이어야만 한다
		// 생성할때 크기를 지정하고 지정된 크기는 변경 불가
		// 배열을 출력할때는 일반적으로 for문을 사용한다

		// 배열 생성 순서: 선언 ->생성 ->데이터 저장
		// 1. 선언:자료형[] 이름;
		// 자료형 이름[];
		int[] su;

		// 2.생성: 이름=new 자료형[배열의 크기=방의 수, 1부터 시작]
		// new는 예약어, 메모리에 데이터를 저장할 공간을 만들라는 뜻=인스턴스,객체생성
		su = new int[4];
		// 3.데이터저장: 이름[방번호,index,0부터 시작]=저장할 데이터
		// 이때 자료형은 같아야한다. 작은 자료형은 큰 자료형에 들어간다
		su[0] = 100;
		su[1] = 200;
		su[2] = 'a';
		su[3] = 300;
		su[1] = 100;// 데이터 중복 가능,현재 데이터가 있어도 저장 가능
		// su[4]=500; 방 크기 벗어남 실행시 오류발생 //su[2]=3.14;자료형 틀림

		System.out.println(su);// 배열의 주소 생성id가 출력됨

		// 배열안에 있는 데이터 출력
		System.out.println(su[0]);
		System.out.println(su[1]);
		System.out.println(su[2]);
		System.out.println(su[3]);

		System.out.println("============");

		  //for문에서 i<4의 숫자는 배열의 크기
		for (int i = 0; i < 4; i++) {
			System.out.println(su[i]);
		}
		
		// su.length=>su 배열의 길이 크기
		for (int i = 0; i < su.length; i++) {
			if(i==2) {System.out.println((char)(su[2]));
			}else {System.out.println(su[i]);}
		}
		
       //개선된 for문: 주로 배열이나 컬랙션에 사용
		//           배열 전체에 대해서 정보 가공을 할 수 있으나 개별로는 가공할 수 없다
		for (int k : su) {
			System.out.println(k);
		}
	}
}
