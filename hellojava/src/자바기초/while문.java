package �ڹٱ���;

public class while�� {
	public static void main(String[] args) {
		//#1. while�� �⺻��������
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
		//#2. while�� Ư���� ����(���ѷ���)
		/*
		while(true)
		{
			System.out.println("���ѷ���");
		} */
		System.out.println();
		
		//#3. ���ѷ��� Ż���ϱ�
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
