class Ex04{ 
  public static void main(String[] args){ 
   // ����  ������(�Ҽ��� ����)  < �Ǽ���(�Ҽ��� ����)
   // ������: byte,short,int,long  ������ �⺻�� int

   // �Ǽ���: float,double  �⺻�� double

   // byte: ������ �� ���� ���� ����  -128~127 ������ ���ڸ� ���� ����

   byte b1=127;
   System.out.println(b1);

   // byte b2=15+120;
   //System.out.println(b2);

   //short: -32768~ 32767 ������ ���� ����
     short s1=-32768;
     System.out.println(s1);

     short s2=32767;
     System.out.println(s2);
   // int�� long�� ���� ������ �ܿ� �ʿ����
  // �Ϲ����� ������ int ���, ���� ū ������ ����Ҷ� long ���

   int su1=247;
   int su2=777777;
   System.out.println(su1);
   System.out.println(su2);

  //long: int���� �� ���� ����
  //�⺻������ ���� �ڿ� L Ȥ��l �� ���δ�

     long num1=124l;
     System.out.println(num1);
    
    //���� �ڷ����� ū �ڷ����� ����Ǵ� ���� �������� �ʴ´�
    long num2=124;
    System.out.println(num2);

    //���� su1�� long num3�� ����
    long num3=su1;
    System.out.println(num3);

    long num4=s1;
    System.out.println(num4);

    int su3=s1;
    System.out.println(su3);

    char su4='A';
    System.out.println(su4);
    
    int c1='��';
    System.out.println(c1);

      }

}