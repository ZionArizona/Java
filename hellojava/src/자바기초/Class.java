package �ڹٱ���;

//#1. Ŭ������ ����(����): �ؾ ���
class A{
	int m = 3;
	void print() {
		System.out.println("��ü ���� �� Ȱ��");
	}
}


public class Class {
	public static void main(String[] args) {
		
		//#2. Ŭ������ ���� ��ü ����: �ؾ
		A a = new A();
		
		
		//#3. Ŭ���� ��� Ȱ��(�ʵ� Ȱ��: �ʵ忡 ���� �б�/����, �޼��带 Ȱ��): �ؾ�� �Ա�
		a.m = 5;
		System.out.println(a.m); //5
		
		a.print(); //��ü ���� �� Ȱ��
	}
}
