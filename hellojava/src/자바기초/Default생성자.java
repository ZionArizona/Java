package �ڹٱ���;

//�����Ϸ��� �ڵ� �߰����ִ� ������(�⺻������)
class E{
	int m;
	void work()
	{
		System.out.println(m); //0
	}
}

class F{
	int m;
	void work() {
		System.out.println(m); // 0
	}
	F(){ //�⺻ ������
		
	}
}

class G{
	int m;
	void work() {
		System.out.println(m); //�����ڷ� �Ѿ�� ��
	}
	G(int a){ //�������� �⺻���: ��ü ���� + �ʵ� �ʱ�ȭ
		m = a;
	}
}

public class Default������ {
	public static void main(String[] args) {
		//#1. Ŭ������ ��ü ����
		E e = new E();
		F f = new F();
		G g = new G(3);
		//G g = new G(); //�Ұ���
		
		//#2. �޼��� ȣ��
		e.work();  //0
		f.work(); //0
		g.work(); //3
		
	}
}
