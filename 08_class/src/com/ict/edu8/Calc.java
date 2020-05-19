package com.ict.edu8;

public class Calc implements Add,Sub{
@Override
public double plus(double s1, double s2) {
	
	return s1+s2;
}

@Override
public double Minus(double s1, double s2) {
	
	return s1-s2;
}
}
