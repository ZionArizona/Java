package �ڹٱ���;

//#1. Ŭ������ ���� Ŭ���� ���ο��� �ʵ�, �޼��忡 �տ� �ٴ� �ڵ����� �ٴ� this Ű����
class P{
	int m;
	int n;
	void init(int a, int b) {
		m = a; //this.m 
		n = b; //this.n
	}
	void work() {
		init(2,3);
	}
	
}

class X{
	int m;
	int n;
	void init(int m, int n) {
		this.m = m;
		this.n = n;
	}
}




//�ڽ��� ���� Ŭ������ �ٸ� ������ ȣ��
class W{
	W(){
		System.out.println("ù��° ������");
	}
	W(int a){
		this(); //�������� ù�ٿ��� �ü� �ִ�. 
		System.out.println("�ι�° ������");
		//this(); //����
	}
}


public class thisŰ���� {
	public static void main(String[] args) {
		//#2. Ŭ���� ��ü ����
		P a = new P();
		
		//#3. �޼��� ȣ��/ �ʵ尪 Ȱ��
		a.work();
		System.out.println(a.m); // 2
		System.out.println(a.n); // 3
		
	
		//�ʵ��� �������� ���� ���� ���(this Ű���带 ������� ���� ���)
		X b = new X();
		b.init(4,5);
		System.out.println(b.m);
		System.out.println(b.n);
		
		
		//
		W w1 = new W(); //ù��° ������
		W w2 = new W(3); // ù��° ������ -> �ι�° ������
		
	}
}
