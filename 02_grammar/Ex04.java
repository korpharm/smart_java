class Ex04{ 
  public static void main(String[] args){ 
   // 숫자  정수형(소숫점 없음)  < 실수형(소숫점 있음)
   // 정수형: byte,short,int,long  정수형 기본은 int

   // 실수형: float,double  기본은 double

   // byte: 정수형 중 가장 작은 단위  -128~127 사이의 숫자만 저장 가능

   byte b1=127;
   System.out.println(b1);

   // byte b2=15+120;
   //System.out.println(b2);

   //short: -32768~ 32767 사이의 값만 저장
     short s1=-32768;
     System.out.println(s1);

     short s2=32767;
     System.out.println(s2);
   // int와 long은 숫자 범위를 외울 필요없다
  // 일반적인 정수는 int 사용, 아주 큰 정수를 사용할때 long 사용

   int su1=247;
   int su2=777777;
   System.out.println(su1);
   System.out.println(su2);

  //long: int보다 더 넓은 범위
  //기본적으로 수자 뒤에 L 혹은l 을 붙인다

     long num1=124l;
     System.out.println(num1);
    
    //작은 자료형이 큰 자료형에 저장되는 것은 오류나지 않는다
    long num2=124;
    System.out.println(num2);

    //정수 su1을 long num3에 저장
    long num3=su1;
    System.out.println(num3);

    long num4=s1;
    System.out.println(num4);

    int su3=s1;
    System.out.println(su3);

    char su4='A';
    System.out.println(su4);
    
    int c1='가';
    System.out.println(c1);

      }

}