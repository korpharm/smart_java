class Ex16{ 
  public static void main(String[] args){ 
    
     //��������:&&(����, And)  ||(or, ����), !(������ not)
     //�� �������� ���(������ ����):boolean��, �񱳿���, ������
     //�� ������ ����� boolean��, �� ���ǽĿ� ���ȴ�

    //���� ||(OR)
    //- �־��� ������ �ϳ��� true�϶� ����� true
    //- �־��� ���ǵ� �� true�� ������ ����� true
    //- true�� ������ ���� ������ ���� ����
    

       int su1=10;
       int su2=7;
       boolean result=false;

       result=(su1>=7)||(su2>=5); // true=true||true
       System.out.println("���"+result);
    
       result=(su1>=7)||(su2<=5);
       System.out.println("���"+result);

      result=(su1<=7)||(su2>=5);
      System.out.println("���"+result);

     result=(su1<=7)||(su2<=5);
      System.out.println("���"+result);

   System.out.println("==============================");

      result=((su1=su1+2) >su2)||(su1==(su2=(su2+5)));
       System.out.println("���"+result);
        System.out.println("���"+su1);
        System.out.println("���"+su2);

 System.out.println("==============================");
      //OR��true�� ������ ����� true�̰� �� ������ �������� �ʴ´�
      result=((su1=su1+2) <su2)||(su1==(su2=(su2+5)));
       System.out.println("���"+result);
        System.out.println("���"+su1);

      result=((su1=su1+2) >su2)||(su1==(su2=(su2+5)));
       System.out.println("���"+result);
        System.out.println("���"+su1);
        System.out.println("���"+su2);
 
        System.out.println("���"+result);

      // NOT(!, ������)
      //�־��� ������ �ݴ�� �����
      //- true->false, false->true
     
         result=true;
         System.out.println(result);
         System.out.println(!result);
       
         System.out.println(!!result);
         System.out.println(!!!result);
     

      }

 }