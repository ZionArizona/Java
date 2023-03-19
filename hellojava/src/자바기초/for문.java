package 자바기초;

public class for문 {
	public static void main(String[] args) {
		//#1.for문 기본문법구조
		int a;
		for(a = 0; a <3; a++)
		{
			System.out.print(a + " ");
		}
		
		System.out.println();
		
		for(int i = 0 ; i < 3; i++)
		{
			System.out.print(i + " ");  //결과는 위와 동일.
		}

		for(int i =0; i < 100; i++)
		{
			
			System.out.println(i + " ");
			//0~99
			
		}
		for(int i =10; i > 0 ; i--)
		{
			System.out.print(i + " ");  //10,9,8.....1
		}
		System.out.println();
		
		for(int i =0 , j = 0; i < 10 ; i++,j++)
		{
			System.out.print(i + j+ " ");  //0,2,4,...,18
		}
		
		System.out.println();
		
		//#2.for문의 특수한 형태(무한 루프)
		/*for(int i =0 ; ; i++)
		{
			System.out.print(i + " ");  
		}
		
		System.out.println();
		
		for(;;)
		{
			System.out.print("무한루프");
		}
		*/
		System.out.println();
		
		//#3.무한 루프 탈출(break)
		for(int i =0;; i++)
		{
			if(i > 10)
				break;  //i가 10보다 클때 for문 탈출
			System.out.println(i+" "); //0~10: 11개 출력
		}
		System.out.println("무한루프 탈출");
	}
}
