class Ex11{ 

   public static void main(String[] args){
    // 이름 홍길동
    // 국어 90 영어 80 수학 80
    // 총점과 평균 구하기 
    // 출력은 이름 총점 평균 출력 (평균은 소수점 첫째짜리 구하기)
    // 1. 데이터 저장
       String name="홍길동";
       int kor=90;
       int eng=80;
       int math=80;

    // 2. 데이터 처리(비즈니스 로직): 저장된 정보를 활용해서 원하는 정보구하기
       int sum=kor+eng+math;
       double avr=(int)(sum/3.0*10)/10.0;
       
       System.out.println("이름"+name);
       System.out.println("총점"+sum );
        System.out.println("평균"+avr );


    // 카페모카 6500원  친구와 둘이서 15000원을 내고 주문했다
    // 잔돈은 얼마 남았나(부가세 포함해서 계산하기)

      String caff="카페모카";
      int dan=6500;
      int su=2;
      int total=dan*su;
      
      int input=15000;
      int vat=(int)(total*0.1);
      int output=input-(total+vat);
      System.out.println(caff+"잔돈"+output);

 }

 }