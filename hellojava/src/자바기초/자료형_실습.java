package 자바기초;

public class 자료형_실습 {
	public static void main(String[] args) {
		//#1. Float의 정밀도
		float f1 = 1.0000001f;
		System.out.println(f1);
		
		
		float f2 = 1.00000001f;   //오차 발생
		System.out.println(f2);
		
		//float는 대략 소수 7자리까지 출력 가능
		
		
		//#2. double이 정밀도
		double d1 = 1.000000000000001;
		System.out.println(d1);
		
		double d2 = 1.0000000000000001;
		System.out.println(d2);
		
		//double은 대략 소수 15자리 까지 출력가능
		
		
	}
}
