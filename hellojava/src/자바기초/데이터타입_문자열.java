package �ڹٱ���;

public class ������Ÿ��_���ڿ� {
	public static void main(String[] args) {
		
		//#4. ����(char) : ����, ����
		//#4-1. ���ڷ� �����ϴ� ���
		char value1 = 'A';
		char value2 = '��';
		char value3 = '3';
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		//#4-2. ������ �����ϴ� ���
		
		
		char value4 = 65;
		char value5 = 0xac00;
		char value6 = 51;
		
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		
		//#4-3. �����ڵ�� ���� �Է�
		char value7 = '\u0041';  //16���� �����ڵ� :A
 		char value8 = '\uac00';  //16���� �����ڵ� : �� 
		char value9 = '\u0033';  //16���� �����ڵ� : 3
		
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		
	}
}
