class Ex11{ 

   public static void main(String[] args){
    // �̸� ȫ�浿
    // ���� 90 ���� 80 ���� 80
    // ������ ��� ���ϱ� 
    // ����� �̸� ���� ��� ��� (����� �Ҽ��� ù°¥�� ���ϱ�)
    // 1. ������ ����
       String name="ȫ�浿";
       int kor=90;
       int eng=80;
       int math=80;

    // 2. ������ ó��(����Ͻ� ����): ����� ������ Ȱ���ؼ� ���ϴ� �������ϱ�
       int sum=kor+eng+math;
       double avr=(int)(sum/3.0*10)/10.0;
       
       System.out.println("�̸�"+name);
       System.out.println("����"+sum );
        System.out.println("���"+avr );


    // ī���ī 6500��  ģ���� ���̼� 15000���� ���� �ֹ��ߴ�
    // �ܵ��� �� ���ҳ�(�ΰ��� �����ؼ� ����ϱ�)

      String caff="ī���ī";
      int dan=6500;
      int su=2;
      int total=dan*su;
      
      int input=15000;
      int vat=(int)(total*0.1);
      int output=input-(total+vat);
      System.out.println(caff+"�ܵ�"+output);

 }

 }