package 자바기초;

public class 연산자 {
	public static void main(String[] args) {
		//#1. 산술연산자
		System.out.println(2+3);
		System.out.println(8-5);
		System.out.println(7*2);
		System.out.println(7/2);
		System.out.println(8%5);
		
		//#2. 증감연산자- case1
		int value1 = 3;
		value1++;
		System.out.println(value1);
		
		int value2 = 3;
		++value2;
		System.out.println(value2);
		
		//#3. 증감연산자f- case2
		int value3 = 3;
		int value4 = value3++;  //value4 = 3
		System.out.println(value3);
		System.out.println(value4);
		
		int value5 = 3;
		int value6 = ++value5; // value6 = 4
		System.out.println(value5);
		System.out.println(value6);
		
		
		//#3. 증감연산자- case3
		int value7 = 3;
		int value8 = 4;
		int value9 = 2 + value7-- + ++value8;
		System.out.println(value9);
		
		
		
		
		
		
		
	}
}
