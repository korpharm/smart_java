class Ex16{ 
  public static void main(String[] args){ 
    
     //논리연산자:&&(논리곱, And)  ||(or, 논리합), !(논리부정 not)
     //논리 연산자의 대상(들어오는 정보):boolean형, 비교연산, 논리연산
     //논리 연산의 결과는 boolean형, 즉 조건식에 사용된다

    //논리합 ||(OR)
    //- 주어진 조전이 하나라도 true일때 결과는 true
    //- 주어진 조건들 중 true를 만나면 결과는 true
    //- true를 만나면 이후 연산을 하지 않음
    

       int su1=10;
       int su2=7;
       boolean result=false;

       result=(su1>=7)||(su2>=5); // true=true||true
       System.out.println("결과"+result);
    
       result=(su1>=7)||(su2<=5);
       System.out.println("결과"+result);

      result=(su1<=7)||(su2>=5);
      System.out.println("결과"+result);

     result=(su1<=7)||(su2<=5);
      System.out.println("결과"+result);

   System.out.println("==============================");

      result=((su1=su1+2) >su2)||(su1==(su2=(su2+5)));
       System.out.println("결과"+result);
        System.out.println("결과"+su1);
        System.out.println("결과"+su2);

 System.out.println("==============================");
      //OR는true를 만나면 결과는 true이고 뒤 조건은 연산하지 않는다
      result=((su1=su1+2) <su2)||(su1==(su2=(su2+5)));
       System.out.println("결과"+result);
        System.out.println("결과"+su1);

      result=((su1=su1+2) >su2)||(su1==(su2=(su2+5)));
       System.out.println("결과"+result);
        System.out.println("결과"+su1);
        System.out.println("결과"+su2);
 
        System.out.println("결과"+result);

      // NOT(!, 논리부정)
      //주어진 논리값을 반대로 출력함
      //- true->false, false->true
     
         result=true;
         System.out.println(result);
         System.out.println(!result);
       
         System.out.println(!!result);
         System.out.println(!!!result);
     

      }

 }