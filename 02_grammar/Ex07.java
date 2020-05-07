class Ex07{ 
   public static void main(String[] args) {
    byte su1=20;
    short su2=25;
    int su3=30;
    long su4=35;

   float su5=34.1f;
   double su6=247.12;

  // byte(short)+byte=int
    int res1=su1+su1;
    System.out.println(res1);
  // byte(short)+short=int
   int res2=su1+su2;
  //byte(short)+int=int
  //byte(short)+float=float
  //byte(short)+double=double

  // int+int=int
  // int+long=long
  // int+float=float
  // int+double=double

  //long+long=long
  //long+int=long
  //int+float=float
  //int+double=double

   //long+long=long
   //long+int=long
   //long+float=float
   //float+double=double

   //소숫점 첫째짜리까지 구하기

   double num1=83.5555;
   int num2=(int)(num1*10);
   System.out.println(num2);

   double num3=num2/10.0;
  System.out.println(num3);

   //1의 자리 절사
     int num4=12758;
     int num5=num4/10;
     System.out.println(num5);
     int num6=num5*10;
     System.out.println(num6);
    
  }

}