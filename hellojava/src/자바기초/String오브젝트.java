package �ڹٱ���;

import java.util.Arrays;

public class String������Ʈ {
	public static void main(String[] args) {
		//#1. String ��ü ����1
		String str1 = new String("�ȳ�");
		System.out.println(str1);
		
		//#1. String ��ü ����2
		String str2 = "�ȳ��ϼ�";
		System.out.println(str2);
		
		//#2. ���ڿ��� ����(��ü���� ���뺯�� �Ұ� --> ���ο� ��ü ����)
		String str3 = new String("�ȳ�");
		String str4 = str3;
		str3 = "�ȳ��ϼ���"; //str3�� "�ȳ��ϼ���" ��ü�� ����Ų��. 
		System.out.println(str3); //�ȳ��ϼ���
		System.out.println(str4); //�ȳ�
		
		//�迭 �����ڷ���
		int[] array1 = new int[] {3,4,5};
		int[] array2 = array1; 
		array1[0] = 6;
		array1[1] = 7;
		array1[2] = 8;
		System.out.println(Arrays.toString(array1)); //6,7,8
		System.out.println(Arrays.toString(array2)); //6,7,8
		
		//#3.���ڿ� ��ü ����(���ͷ��� ��ü�� ������ ���) new Ű����� ��ü ������ ���(������ ��ü ����).�� ��ü ����x
		String Str1 = new String("�ȳ�");
		String Str2 = "�ȳ�"; //Str1�� ����Ű�� "�ȳ�"�̶� �ٸ� "�ȳ�"�� ����Ű�� �ִ�. 
		String Str3 = "�ȳ�"; //Str2�� ����Ű�� "�ȳ�"����Ű�� �ִ�.
		String Str4 = new String("�ȳ�");
		//�� ������ "�ȳ�"��ü�� ����
		
		//Stack �޸𸮰� ��(==)
		System.out.println(Str1 == Str2); //false
		System.out.println(Str2 == Str3); //true
		System.out.println(Str3 == Str4); //false
		System.out.println(Str4 == Str1); //false
		
		//#4. ���ڿ� + ���ڿ�
		String s1 = "�ȳ�" + "�ϼ���" + "!"; // �ȳ�, �ϼ���, !, �ȳ��ϼ���, �ȳ��ϼ���! �� 5�� ��ü ����
		System.out.println(s1); //�ȳ��ϼ���!
		
		String s2 = "�ݰ�";
		s2 += "���ϴ�";
		s2 += "!";
		System.out.println(s2);//�ݰ����ϴ�!
		System.out.println();
		
		//#5. ���ڿ� + �⺻�ڷ��� // �⺻�ڷ��� + ���ڿ� 
		String s3 = "�ȳ�" + 1; //������ 1�� ���ڿ� "1"�� �ٲ� s3 �� �ȳ�1�� �ȴ�. 
		String s4 = "�ȳ�" + String.valueOf(1); //1�� String���� �ٲ��
		String s5 = "�ȳ�" + "1";
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println();
		
		//#6. ���ڿ��� �⺻�ڷ��� ȥ��
		System.out.println(1+"�ȳ�"); //1�ȳ�
		System.out.println(1+"�ȳ�" + 2); //1�ȳ�2
		System.out.println("�ȳ�" + 1 + 2); //�ȳ�12
		System.out.println(1 + 2 +"�ȳ�"); //3�ȳ�
		
		//#7. ���ڿ��� ����
		String S1 ="Hello Java!";
		String S2 = "�ȳ��ϼ���! �ݰ����ϴ�.";
		System.out.println(S1.length()); //11
		System.out.println(S2.length()); //13
		
		//#8. ���ڿ� �˻� (charAt(), indexOf(), lastIndex())
		//charAt()
		System.out.println(S1.charAt(1)); //�ε��� 1���� char-->e
		System.out.println(S2.charAt(1)); //�ε��� 1���� char-->��
		System.out.println();
		
		//indexOf(), lastIndexOf()
		System.out.println(S1.indexOf('a')); //a�� �ִ� ù ��° �ε���-->7
		System.out.println(S1.lastIndexOf('a')); //9
		System.out.println(S1.indexOf('a',8)); //9
		System.out.println(S1.lastIndexOf('a',8)); //7
		System.out.println(S1.indexOf("Java")); //6
		System.out.println(S1.lastIndexOf("Java")); //6
		System.out.println(S2.indexOf("�ϼ���")); //2
		System.out.println(S2.indexOf("Bye")); //2
		System.out.println(S1.lastIndexOf("�����ϴ�.")); //-1
		
		//#9.���ڿ� ��ȯ �� ����(String.valueOf(), concat())
		//String.valueOf(�⺻�ڷ���) �⺻�ڷ���->String
		String S3 = String.valueOf(2.3);
		String S4 = String.valueOf(false);
		System.out.println(S3);
		System.out.println(S4);
		
		//concat()
		String S5 = S3.concat(S4);
		System.out.println(S5); // 2.3false
		
		//String.valueOf() + concat() 
		String S6 = "�ȳ�" + 3;//�ȳ�3
		String S7 = "�ȳ�".concat(String.valueOf(3));//�ȳ�3
		
		//#10. ���ڿ�-> byte[] (getBytes()), ���ڿ�-> char[] (toCharArray())
		String S8 = "Hello Java!";
		String S9 = "�ȳ��ϼ���";
		
		//getBytes() ���ڿ�->byte()
		byte[] Array1 = S8.getBytes();
		byte[] Array2 = S9.getBytes();
		System.out.println(Arrays.toString(Array1)); //����Ʈ ���� �ƽ�Ű �ڵ�� ����
		System.out.println(Arrays.toString(Array2));
		
		//toCharArray() ���ڿ�-> char[]
		char[] Array3 = S8.toCharArray();
		char[] Array4 = S9.toCharArray();
		System.out.println(Arrays.toString(Array3));
		System.out.println(Arrays.toString(Array4));
		
		
		//#11. ���ڿ� ����
		//toLowerCase(), toUpperCase()
		String St1 = "Java Study";
		System.out.println(St1.toLowerCase());
		System.out.println(St1.toUpperCase());
		
		//replace()
		System.out.println(St1.replace("Study", "����"));
		
		//substring(,)
		System.out.println(St1.substring(0,5)); //0<= <5
		
		//split()
		String[] strArray = "abc/def-ghi hkl".split("/|-| ");
		System.out.println(Arrays.toString(strArray));
		
		//trim()
		System.out.println(" abc ".trim());
		//#12. ���ڿ��� ���� ��(equals(), equalsIgnoreCase())
		String St2 = new String ("Java");
		String St3 = new String("Java");
		String St4 = new String("java");
		
		//stack �޸� ��(==)
		System.out.println(St2 == St3); //false
		System.out.println(St3 == St4); //false
		System.out.println(St4 == St2); //false
		
		//equals(), equalsIgnoreCase() : �����
		System.out.println(St2.equals(St3)); //true
		System.out.println(St3.equals(St4)); //false
		System.out.println(St3.equalsIgnoreCase(St4)); //true
		}
}
