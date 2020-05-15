package com.ict.edu;

public class Ex10 {

	private String name;
	private int sum;
	private double avr;
	private String grad;
	private int rank;

//합계
public int s_sum(int kor, int eng, int math) {
    return sum=kor+eng+math;}
//평균
public double s_avr() {
	  return avr=(int)(sum/3.0*10)/10.0;
}

//학점
	public String s_grad() {
		if (avr>=90) grad="A";
	else if(avr>=80) grad="B";
	else if(avr>=70) grad="C";
	else grad="F";
		return grad;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvr() {
		return avr;
	}
	public void setAvr(double avr) {
		this.avr = avr;
	}
	public String getGrad() {
		return grad;
	}
	public void setGrad(String grad) {
		this.grad = grad;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
	
	
}
