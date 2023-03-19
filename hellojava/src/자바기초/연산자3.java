package 자바기초;

public class 연산자3 {
	public static void main(String[] args) {
		//#1. 산술쉬프트(부호변화가 없으 * 2, /2효과)
		//<< left shift-곲하기 2의 제곱승
		System.out.println(3<<1);
		System.out.println(-3<<1);
		System.out.println(3<<2);
		System.out.println(-3<<2);
		
		
		
		// Right shift-나누기 2의 제곱승
		System.out.println(5>>1);
		System.out.println(-5>>1);
		System.out.println(5>>2);
		System.out.println(-5>>2);
		System.out.println();
	
		//#2. 논리쉬프트(>>>)
		System.out.println(3>>>1);  //000.....0011 = 1
		System.out.println(-3>>>31);  //1111....1101 = 1
	
		
		if(3>5)
			System.out.println("안녕");
		
		
		
		
	}
}
