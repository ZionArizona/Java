package 자바기초;

public class break_continue키워드 {
	public static void main(String[] args) {
		//break
		//#1. 단일 loop break탈출
		for(int i = 0 ; i< 10; i++)
		{
			System.out.println(i);
			break;
		}//0
		
		for(int i = 0 ; i< 10; i++)
		{
			if( i == 5) {
				break;				
			}
			System.out.print(i + " ");
		}//0,1,2,3,4
		
		System.out.println();
		System.out.println();
		
		//#2. 다중(이중) loop break 탈출
		//case1 하나의 반복문만 탈출하는 경우
		for(int i =0; i < 5; i++){
			for(int j = 0; j < 5; j++)
			{
				if(j == 2) {
					break;
				}//조건문 충족시 두 번째 for문 탈출
				System.out.println(i +", " +j);
			}//0,0 0,1 1,0 1,1 .... 4,0 4,1
		}
		System.out.println();
		
		//case2 다중 반복문을 한번에 탈출하는 방법(break LABLE)
		POS1: for(int i =0; i < 5; i++){
			for(int j = 0; j < 5; j++)
			{
				if(j == 2) {
					break POS1;
				}//조건문 충족시 두 번째 for문 탈출
				System.out.println(i +", " +j);
			}
		}//0,0 0,1
		System.out.println();
		
		//continue
		//#1. 단일 루프에서의 continue
		for(int i = 0; i < 10; i++)
		{
			if(i == 5) {
				continue;
			}
			System.out.print(i + " ");
		}//0,1,2,3,4 ,6,7,8,9
		
		System.out.println();
		//#2. 다중(이중 루프에서의 continue)
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				if(j == 3) {
					continue;
				}
				System.out.print(i + ", " + j);				
			}
		}//0,0 0,1 0,2 0,4 0,5 ......
		System.out.println();
		
		POS1:for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				if(j == 3) {
					continue POS1;
				}
				System.out.print(i + ", " + j);				
			}
		}//0,1 0,1 0,2 1,0 1,1....
	}
}
