package �ڹٱ���;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		//#1. �迭�� ���� ��� #1
		int[] array1 = new int[3];
		int[] array2;
		array2 = new int[3];
		
		//#2. �迭�� ���� ���#2
		int array3[] = new int[3];
		int array4[];
		array4 = new int [3];
		
		//#3. �پ��� �迭 ����( �⺻�ڷ��� �迭, �����ڷ��� �迭)
		boolean[] array5 = new boolean[3];
		int[] array6 = new int[5]; //int �����ڷ��� �迭
		double[] array7 = new double[7]; //double �����ڷ��� �迭
		String[] array8 = new String[9]; //String �����ڷ��� �迭
		
		
		//#1.�迭 ���Ұ� ���� ���1
		int[] Array1 = new int[3];
		Array1[0] =3;
		Array1[1] =4;
		Array1[2] =5;
		
		System.out.println(Array1[0] + " " + Array1[1] + " " + Array1[2]);
		
		//#2.�迭 ���Ұ� ���� ���2
		int[] Array2 = new int[]  {4,5,6};// �ڵ����� �迭 ũ�Ⱑ 3���� �ȴ�. 
		System.out.println(Array2[0] + " " + Array2[1] + " " + Array2[2]);
		
		int[] Array3;
		Array3 = new int[] {5,6,7};
		System.out.println(Array3[0] + " " + Array3[1] + " " + Array3[2]);
		
		//#3. �迭 ���Ұ� ���� ���3
		int[] Array4 = {6,7,8};
		System.out.println(Array4[0] + " " + Array4[1] + " " + Array4[2]);
		/*
		 int[] Array4;
		 Array4 = {6,7,8}; ������ �Ұ���.
		 */
		
		
		//�迭 �ʱ�ȭ
		//#1/ stack �޸𸮰�(�����ʱ�ȭ ���� ����)
		/*
		int value1;
		System.out.println(value1); //����		 
		int[] value2;
		System.out.println(value2); //����
		 */
		int value3 = 0;
		System.out.println(value3);
		
		int[] value4 = null; //������ �ڷ��ε� ����Ű�°� ������ null�� �ʱ�ȭ
		System.out.println(value4);//null
		
		//#2.heap �޸� �ʱⰪ(�����ʱ�ȭ)
		//�⺻�ڷ���
		boolean[] bArray1 = new boolean[3];
		for(int i =0; i < 3; i++)
		{
			System.out.print(bArray1[i] + " ");
		} // false false false
		System.out.println();
		
		int[] bArray2 = new int[3];
		for(int i =0; i < 3; i++)
		{
			System.out.print(bArray2[i] + " ");
		} 
		System.out.println();
		
		double[] bArray3 = new double[3];
		for(int i =0; i < 3; i++)
		{
			System.out.print(bArray3[i] + " ");
		} 
		System.out.println();
		
		String[] bArray4 = new String[3];
		for(int i =0; i < 3; i++)
		{
			System.out.print(bArray4[i] + " ");
		}//null null null
		System.out.println();
		//Tip �迭�� ���� ����� �� �ִ� ���
		System.out.println(Arrays.toString(bArray1));
		System.out.println(Arrays.toString(bArray2));
		System.out.println(Arrays.toString(bArray3));
		System.out.println(Arrays.toString(bArray4));
		
		//#1. �迭�� ���� ���ϱ�
		int[] array = new int[] {3,4,5,6,7};
		System.out.println(array.length); //5
		System.out.println();
		//#2. ����ϱ� 1:
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		System.out.println();
		//#2. ����ϱ� 2:
		for(int i = 0 ; i < 4; i++)
		{
			System.out.println(array[i]);
		}
		System.out.println();
		//#2. ����ϱ� 3:
		//for(���� �ϳ��� ���Ҹ� ������ �� �ִ� ���� ; ���հ�ü) {} for each����
		for(int k : array) {
			System.out.println(k);
		}
		
		//#2. ����ϱ� 4:
		System.out.println(Arrays.toString(array));
		
	}
}
