package 자바기초;

public class while문 {
	public static void main(String[] args) {
		//#1. while에 기본문법구조
		int a = 0;
		while(a < 10)
		{
			System.out.println(a + " ");
			a++; 
		}//0,1,2....,9
		
		int b = 10;
		while(b > 0) {
			System.out.println(b + " ");
			b--;
		}//10,9,8....,1
		//#2. while의 특수한 형태(무한루프)
		/*
		while(true)
		{
			System.out.println("무한루프");
		} */
		System.out.println();
		
		//#3. 무한루프 탈출하기
		int c = 0;
		while(true) {
			if(c > 10) {
				break;
			}
			System.out.println(c + " ");
			c++;	
		}//0,1,2...10
		
	}
}
