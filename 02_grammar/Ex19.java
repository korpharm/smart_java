
public class Ex19 {
	public static void main(String[] args) {
		//삼항 연산자 예제
		
		//int k1 이 홀수 인지 짝수 인지 판별
		int k1=7;
		String res=(k1%2==0)?"짝수":"홀수";
		System.out.println("k1은"+res);
		
		//int k2가 60 이상이면 합격 아니면 불합격
		int k2=76;
		String res2=(k2>=60)?"합격":"불합격";
		System.out.println("k2은"+res2);
		
		// char k3 이 대문자인지 아닌지
		char k3='a';
        String res3=((k3>='A')&&(k3<='Z'))?"대문자":"소문자";
        System.out.println("k3은"+res3);
        	
        //8시간 근무시 시간당 임금 8000원
        //8시간 초과한 시간은 1.5배 지급
        //전체 근무 시간이 10시간 일때 임금은
		int h=10;
		int pay=(h-8)>0?(int)((8*8590+(h-8)*8590*1.5)):h*8590;
		System.out.println(h+"시간 근무시 임금은"+pay);
	}

}
