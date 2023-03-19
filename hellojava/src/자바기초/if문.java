package 자바기초;

public class if문 {
	public static void main(String[] args) {
	
		//#1. Type1: if
		
		int value1 = 5;
		
		if(value1 >3) {
			System.out.println("실행1");
		}
		if(value1 < 5) {
			System.out.println("실행2");
		}
		
		boolean bool1 = true;
		boolean bool2  = false;
		if(bool1) {
			System.out.println("실행3");
		}
		if(bool2) {
			System.out.println("실행4");
		}
		
		//#2. Type2: if-else
		
		int value2 = 5;
		if(value2 > 3) {
			System.out.println("실행5");
		}
		else {
			System.out.println("실행6");
		}
		
		
		//삼항연산자와 변환 가능
		System.out.println((value2>3)? "실행5": "실행6");
		
		//#3. Type3 : if - else if - else if- ... -else 
		int value3 = 85;
		if(value3 >= 90) {
			System.out.println("A학점");
		}
		else if(value3 >= 80) {
			System.out.println("B");
		}
		else if(value3 >= 70) {
			System.out.println("C");
		}
		else {
			System.out.println("F");
		}
		
		
		
		if(value3 >= 90) {
			System.out.println("A학점");
		}
		else if(value3 >= 80 && value3 <90) {
			System.out.println("B");
		}
		else if(value3 >= 70 && value3 <80) {
			System.out.println("C");
		}
		else {
			System.out.println("F");
		}
		
		
		
		
		
		
	}
}
