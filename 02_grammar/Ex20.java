
public class Ex20 {
	public static void main(String[] args) {
		// 중첩 삼항 연산자: 삼항연산자가 중첩된 것
		// char k1 이 대문자,소문자,기타문자인지 판별
		char k1 = '%';
		String res = ((k1 >= 'A') && (k1 <= 'Z')) ? "대문자" : ((k1 >= 'a') && (k1 <= 'z')) ? "소문자" : "기타문자";
		System.out.println(res);

		// int k2가 90 이상이면 A학점 80이상이면 학점 나머지는 F학점

		int k2 = 75;
		String res2 = (k2 >= 90) ? "A학점" : (k2 >= 80) ? "B학점" : "F학점";
		System.out.println(res2);

		// int k3가 1,3이면 남자 2,4 이면 여자 기타는 외국인
		int k3 = 1;
		String res3 = (k3 == 1 ||k3== 3) ? "남자" : (k3 == 2 || k3==4) ? "여자" : "외국인";
		System.out.println(res3);
		
		// int k4가 1,3이면 남자 2,4 이면 여자 기타는 외국인
		// 1,2는 1900년대 3,4는 2000년대 출생
		int k4 = 8;
		String res4 = (k4 == 1 || k4==3) ? (k4==1)?"1900년대 출생 남자" :"2000년대 출생남자" : (k4 == 2 ||k4== 4) ? (k4==2)?"1900년대 출생 여자" :"2000년대 출생여자" : "외국인";
		System.out.println(res4);

	}
}
