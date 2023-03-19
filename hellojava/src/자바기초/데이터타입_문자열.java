package 자바기초;

public class 데이터타입_문자열 {
	public static void main(String[] args) {
		
		//#4. 문자(char) : 문자, 정수
		//#4-1. 문자로 저장하는 방법
		char value1 = 'A';
		char value2 = '가';
		char value3 = '3';
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		//#4-2. 정수로 저장하는 방법
		
		
		char value4 = 65;
		char value5 = 0xac00;
		char value6 = 51;
		
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		
		//#4-3. 유니코드로 직접 입력
		char value7 = '\u0041';  //16진수 유니코드 :A
 		char value8 = '\uac00';  //16진수 유니코드 : 가 
		char value9 = '\u0033';  //16진수 유니코드 : 3
		
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		
	}
}
