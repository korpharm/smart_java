
public class Ex19 {
	public static void main(String[] args) {
		//���� ������ ����
		
		//int k1 �� Ȧ�� ���� ¦�� ���� �Ǻ�
		int k1=7;
		String res=(k1%2==0)?"¦��":"Ȧ��";
		System.out.println("k1��"+res);
		
		//int k2�� 60 �̻��̸� �հ� �ƴϸ� ���հ�
		int k2=76;
		String res2=(k2>=60)?"�հ�":"���հ�";
		System.out.println("k2��"+res2);
		
		// char k3 �� �빮������ �ƴ���
		char k3='a';
        String res3=((k3>='A')&&(k3<='Z'))?"�빮��":"�ҹ���";
        System.out.println("k3��"+res3);
        	
        //8�ð� �ٹ��� �ð��� �ӱ� 8000��
        //8�ð� �ʰ��� �ð��� 1.5�� ����
        //��ü �ٹ� �ð��� 10�ð� �϶� �ӱ���
		int h=10;
		int pay=(h-8)>0?(int)((8*8590+(h-8)*8590*1.5)):h*8590;
		System.out.println(h+"�ð� �ٹ��� �ӱ���"+pay);
	}

}