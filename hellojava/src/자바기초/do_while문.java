package �ڹٱ���;

public class do_while�� {
	public static void main(String[] args) {
		//#1. �ݺ�ȸ���� 0�� ��� do-while�� ��
		int a;
		a = 0;
		while(a < 0) {
			System.out.print(a + " ");
			a++;
		}//����ȸ��: 0��
		
		do {
			System.out.print(a + " ");
			a++;
		}while(a < 0); //����ȸ��: 1��
		System.out.println();
		
		//#2. �ݺ�ȸ���� 1�� ��� do-while�� ��
		a = 0;
		while(a < 1) {
			System.out.println(a + " ");
			a++;
		}//����ȸ��: 1��
		a = 0;
		do {
			System.out.println(a + " ");
			a++;
		}while(a < 1);  //����ȸ��: 1��
		System.out.println();
		
		//#3. �ݺ�ȸ���� 10�� ��� do-while�� ��
		a = 0;
		while(a < 10) {
			System.out.println(a + " ");
			a++;
		}//����ȸ��: 10��
		
		a = 0;
		do {
			System.out.println(a + " ");
			a++;
		}while(a < 10);  //����ȸ��: 10��
	}
}
