package com.ict.edu6;

public class Teacher extends Person{
private String Subject;

public Teacher(String name, int age, String subject) {
	super(name, age);
	Subject = subject;
}

public String getSubject() {
	return Subject;
}

public void setSubject(String subject) {
	Subject = subject;
}

public void print() {
	System.out.println("이름 "+super.getName()+"나이 "+getAge());
	System.out.println("과목 "+Subject);
}
}
