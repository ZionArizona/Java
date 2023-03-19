package 자바기초;

public class 연산자2 {
	public static void main(String[] args) {
		//#0. 자바코드로 진법 변환
		int data = 13;
		System.out.println(Integer.toBinaryString(data));  //13이 이진수인 1101로 변환
		System.out.println(Integer.toOctalString(data));  //8진수
		System.out.println(Integer.toHexString(data));   //16진수
		System.out.println();
		
		System.out.println(Integer.parseInt("1101",2));  //2진수를 10진수로
		System.out.println(Integer.parseInt("15",8)); //13
		System.out.println(Integer.parseInt("0D",16));  //13
		
		//#1. 다양한 진법 표현
		System.out.println(13);
		System.out.println(0b1101);  //이진법
		System.out.println(015);  //8진수
		System.out.println(0x0D);  //16진수
		
  		//#2.OR 비트연산자
		System.out.println(3&10);
		System.out.println(0b0011 & 0b1010);
		System.out.println(0x03 & 0x0A);
		
		//#2. XOR 비트연산자
		System.out.println(3^10);
		System.out.println(0b0011 ^ 0b1010);
		System.out.println(0x03 ^ 0x0A);
		
		//#2. NOT 비트연산자
				System.out.println(~3);
				System.out.println(~0b0011);
				System.out.println(~0x03);
	}
}
