package �ڹٱ���;

public class for�� {
	public static void main(String[] args) {
		//#1.for�� �⺻��������
		int a;
		for(a = 0; a <3; a++)
		{
			System.out.print(a + " ");
		}
		
		System.out.println();
		
		for(int i = 0 ; i < 3; i++)
		{
			System.out.print(i + " ");  //����� ���� ����.
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
		
		//#2.for���� Ư���� ����(���� ����)
		/*for(int i =0 ; ; i++)
		{
			System.out.print(i + " ");  
		}
		
		System.out.println();
		
		for(;;)
		{
			System.out.print("���ѷ���");
		}
		*/
		System.out.println();
		
		//#3.���� ���� Ż��(break)
		for(int i =0;; i++)
		{
			if(i > 10)
				break;  //i�� 10���� Ŭ�� for�� Ż��
			System.out.println(i+" "); //0~10: 11�� ���
		}
		System.out.println("���ѷ��� Ż��");
	}
}
