package �ڹٱ���;

//�ʵ�� ���������� ����//

//#1. Ŭ������ ����
class B{
	int m = 3; //�ʵ�
	int n = 4; //�ʵ� 
	
	void work1() {
		//���������� �ݵ�� �ʱ�ȭ �Ǿ�� �Ѵ�.
		int k = 5; //��������
		System.out.println(k); //5 �������� ���
		work2(3);
	}
	
	void work2(int i) { 
		//int i�� ���� ���� ���� //��������
		//i = �ܺο��� ���޵� ��
		int j = 4;//��������
		System.out.println(i+j); //7
	}
}


public class Ŭ����_���α������ {
	public static void main(String[] args) {
		//#2. Ŭ������ Ȱ���Ͽ� ��ü ����
		B a = new B();
		
		//#3.�ʵ尪 ���
		System.out.println(a.m); //3
		System.out.println(a.n); //4
		
		//#3-2 �޼��� ȣ��
		a.work1(); // 3 7
	}
}
