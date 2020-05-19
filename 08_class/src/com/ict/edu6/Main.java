package com.ict.edu6;

public class Main {
public static void main(String[] args) {
	//super, super() : this, this()
	//this:객체내부에서 자기 자신을 지칭하는 예약어, 전역변수와 지역변수의 이름이 같을때 전역변수앞에 this를 사용해서 전역변수임을 알 수 있다
    //this():객체 자신의 생성자를 지칭하는 예약어, 생성자에서 다른 생성자를 호출할때 사용, 반드시 생성자 첫줄에 존재해야 한다
	
	//super:부모클래스의 멤버필드를 지칭하는 예약어,자식클래스의 전역변수와 이름이 같을때 부모클래스 멤버필드 앞에 사용
	//super():부모의 생성자를 지칭하는 예약어,부모 생성자를 호출할 때 사용,반드시 생성자 첫둘에 존재해야한다, this() super()를 같이 사용할 수 없다
    //        첫줄에 없으면 생략된 것
	
	Person s=new Student("홍길동학생",24,2500);
	Person t=new Teacher("고길동강사",42,"자바");
	Person e=new Employee("둘리 관리자",54,"교무과");
	s.print();
	t.print();
	e.print();
	
}
}