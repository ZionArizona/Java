package �ڹٱ���;

public class ������3 {
	public static void main(String[] args) {
		//#1. �������Ʈ(��ȣ��ȭ�� ���� * 2, /2ȿ��)
		//<< left shift-���ϱ� 2�� ������
		System.out.println(3<<1);
		System.out.println(-3<<1);
		System.out.println(3<<2);
		System.out.println(-3<<2);
		
		
		
		// Right shift-������ 2�� ������
		System.out.println(5>>1);
		System.out.println(-5>>1);
		System.out.println(5>>2);
		System.out.println(-5>>2);
		System.out.println();
	
		//#2. ������Ʈ(>>>)
		System.out.println(3>>>1);  //000.....0011 = 1
		System.out.println(-3>>>31);  //1111....1101 = 1
	
		
		if(3>5)
			System.out.println("�ȳ�");
		
		
		
		
	}
}
