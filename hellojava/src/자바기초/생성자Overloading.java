package �ڹٱ���;

class H{
	H(){
		System.out.println("ù��° ������");
	}
	H(int a){
		System.out.println("�ι�° ������");
	}
	H(int a, int b){
		System.out.println("����° ������");
	}
}

public class ������Overloading {
	public static void main(String[] args) {
		
		//#1.������ �����ڸ� �̿��� ��ü ����
		H a1 = new H();  //ù��° ������ ȣ��
		H a2 = new H(3); //�ι�° ������ ȣ��
		H a3 = new H(3,5);  //����° ������ ȣ��
		
		
		
	}
}
