package �ڹٱ���;

public class ������2 {
	public static void main(String[] args) {
		//#0. �ڹ��ڵ�� ���� ��ȯ
		int data = 13;
		System.out.println(Integer.toBinaryString(data));  //13�� �������� 1101�� ��ȯ
		System.out.println(Integer.toOctalString(data));  //8����
		System.out.println(Integer.toHexString(data));   //16����
		System.out.println();
		
		System.out.println(Integer.parseInt("1101",2));  //2������ 10������
		System.out.println(Integer.parseInt("15",8)); //13
		System.out.println(Integer.parseInt("0D",16));  //13
		
		//#1. �پ��� ���� ǥ��
		System.out.println(13);
		System.out.println(0b1101);  //������
		System.out.println(015);  //8����
		System.out.println(0x0D);  //16����
		
  		//#2.OR ��Ʈ������
		System.out.println(3&10);
		System.out.println(0b0011 & 0b1010);
		System.out.println(0x03 & 0x0A);
		
		//#2. XOR ��Ʈ������
		System.out.println(3^10);
		System.out.println(0b0011 ^ 0b1010);
		System.out.println(0x03 ^ 0x0A);
		
		//#2. NOT ��Ʈ������
				System.out.println(~3);
				System.out.println(~0b0011);
				System.out.println(~0x03);
	}
}
