package �ڹٱ���;

public class break_continueŰ���� {
	public static void main(String[] args) {
		//break
		//#1. ���� loop breakŻ��
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
		
		//#2. ����(����) loop break Ż��
		//case1 �ϳ��� �ݺ����� Ż���ϴ� ���
		for(int i =0; i < 5; i++){
			for(int j = 0; j < 5; j++)
			{
				if(j == 2) {
					break;
				}//���ǹ� ������ �� ��° for�� Ż��
				System.out.println(i +", " +j);
			}//0,0 0,1 1,0 1,1 .... 4,0 4,1
		}
		System.out.println();
		
		//case2 ���� �ݺ����� �ѹ��� Ż���ϴ� ���(break LABLE)
		POS1: for(int i =0; i < 5; i++){
			for(int j = 0; j < 5; j++)
			{
				if(j == 2) {
					break POS1;
				}//���ǹ� ������ �� ��° for�� Ż��
				System.out.println(i +", " +j);
			}
		}//0,0 0,1
		System.out.println();
		
		//continue
		//#1. ���� ���������� continue
		for(int i = 0; i < 10; i++)
		{
			if(i == 5) {
				continue;
			}
			System.out.print(i + " ");
		}//0,1,2,3,4 ,6,7,8,9
		
		System.out.println();
		//#2. ����(���� ���������� continue)
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
