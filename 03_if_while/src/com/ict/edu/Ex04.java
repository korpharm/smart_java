package com.ict.edu;

public class Ex04 {
public static void main(String[] args) {
	
	//switch-case��:if���� ���� ���ǽ�
	//if���� ���ǽ��� boolean ��-�� �񱳿��� �������� boolean�� ���
    //switch���� ���ڰ��� byte,short,int,char,String ���
	//switch(���ڰ�){
	// case ���ǰ�1:���ڰ��� ���ǰ�1�� ������ ���๮;break;
	// case ���ǰ�2:���ڰ��� ���ǰ�2�� ������ ���๮;break;
	// case ���ǰ�3:���ڰ��� ���ǰ�3�� ������ ���๮;break;
    // default: ���ǰ� 1,2,3�� ��� ���� ������ ���๮;
	//}
	//break���� ������ break ���ö����� ����
	//break������ ���� �����ϰ� �ִ� ������ ����� ����
	
	
    //char k1�� A ������ī B����� C ĳ���� ������ �ѱ�
	char k1='C';
	String str="";
	switch(k1){
		case('A'):str="������ī";break;
		case('B'):str="�����";break;
		case('C'):str="ĳ����";break;
		default:str="�ѱ�";
			
		//break���� ������ break ���ö����� ����
		
		//case('A'):System.out.println("������ī");
		//case('B'):System.out.println("�����");
		//case('C'):System.out.println("ĳ����");
		//default:str="�ѱ�";
		
	
	}
	System.out.println(str);
	
	//int k2�� 1,3 ����  2,4 ����
	
	int k2=7;
	switch(k2) {
	   case(1):
	   case(3):str="����";break;
	   case(2):
	   case(4):str="����";break;
	   default:str="��3�� ��";
	}
	System.out.println(str);
	
	//String k3 �� �ѱ��̸� ����, �߱��̸� �ϰ�,�Ϻ��̸� ����, �̱��̸� ������

      String k3="�Ϻ�";
      switch(k3) {
      case("�߱�"):str="�ϰ�";break;
      case("�̱�"):str="������";break;
      case("�Ϻ�"):str="����";break;
      case("�ѱ�"):str="����";break;
      }
      System.out.println(str);
      
      char k7='b';
      switch(k7) {
      case('A'):str="Africa";break;
      case('a'):str="Africa";break;
      case('B'):str="Brazil";break;
      case('b'):str="Brazil";break;
      case('C'):str="Canada";break;
      case('c'):str="Canada";break;
      default:str="korea";
      }
      
      System.out.println(str);
      
      
      switch(k7) {
      case('A'):
      case('a'):str="Africa";break;
      case('B'):
      case('b'):str="Brazil";break;
      case('C'):
      case('c'):str="Canada";break;
      default:str="korea";
      }
      
      
      System.out.println(str);
      //switch���� ������ �о����� ������� ����
      //int k6�� ������ 90�̸� A
      int k6=54;
      int k9=(int)(k6/10.0);
      switch(k9) {
      case(10):str="A����";break;
      case(9):str="A����";break;
      case(8):str="B����";break;
      case(7):str="C����";break;
      default:str="F����";break;
      }
      System.out.println(str);
}
}

