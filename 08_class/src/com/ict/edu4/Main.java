package com.ict.edu4;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	//오버로딩:한 클래스안에서 같은 이름의 메소드가 여러개 존재하는 것
	//       인자의 자료형이나 개수가 다르다
	
	//오버라이딩:상속관계에서 부모메소드와 자식메소드가 같은것
	//         자식클래스가 부모메소드를 갖다쓰는 대산에 내용은 자기에 맞게 변경해서 사용하는 것
    //         오버라이딩은 부모메소드가 없어진다(@Override라고 쓰면 은닉된다)
	//         같은 메소드를 호출해도 다른 내용을 실행한다.
	
	
Animal d=new Dog();
Animal c=new Cat();
System.out.println(d.eyes);
System.out.println(d.legs);
d.Like();
d.sound();

System.out.println(c.eyes);
System.out.println(c.legs);
c.Like();
c.sound();

Scanner sc=new Scanner(System.in);
System.out.println("선택하세요  1번 고양이 2번 강아지");
int su=sc.nextInt();
if(su==1) { 
	Cat cat=new Cat();
	cat.sound();
	cat.Like();
	cat.hobby();
	
}else { 
	Dog dog=new Dog();
	dog.sound();
	dog.Like();
	dog.hobby();
}
Animal a=null;
if(su==1) { 
	a=new Cat();
	
	
}else { 
	a=new Dog();
	
	
}
 a.sound();
 a.Like();
 //a.hobby(); 부모클래스에서 없기 때문에 에러
}
}
