package �ڹٱ���;

//Ŭ������ �ܺο��� �޼��� ȣ��
class C{
	//1. ����Ÿ��: void + �Ű����� : ����
	void print() {
		System.out.println("�ȳ�");
	}
	//2. ����Ÿ��: int + �Ű����� : ����
	int data() {
		return 3;
	}
	//3. ����Ÿ��: double + �Ű����� : 2��
	double sum(int a, double b) {
		return a+b;
	}
	//4. ����Ÿ��: void + ���ο� ���� ����(�Լ��� �����Ѵٴ� �ǹ�)
	void printMonth(int m) {
		if(m<0 || m >12) {
			System.out.println("�߸��� �Է�");
			return;
		}
		System.out.println(m + "���Դϴ�.");
	}
}

public class �ܺθ޼��� {
	public static void main(String[] args) {
		//#2.��ü ����
		C a = new C();
		
		//#3.�޼��� ȣ��(���Ȱ��)
		a.print(); //"�ȳ�"
		
		int k = a.data();
		System.out.println(k); //3
		
		double result = a.sum(3, 5.2);
		System.out.println(result); //8.2
		
		a.printMonth(5); //5���Դϴ�.
		a.printMonth(15); // �߸��� �Է�
		
		
	}
}
