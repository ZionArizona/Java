package �ڹٱ���;

import java.util.Arrays;

public class ���θ޼��� {
	public static void main(String[] args) {
		//���� Ŭ���� �ȿ� �ִ� ���� �޼��� ȣ��
		print();
		
		int a = twice(3);
		System.out.println(a);//6
		
		double b = sum(a,5.8);
		System.out.println(b); //11.8
		
		//�迭�� �Ű������� ������ �޼��� ȣ��
		printArray(new int[] {1,2,3});
		//printArray({1,2,3}); //����
		
		//#�������� �޼���
		method1(1,2);
		method1(1,2,3);
		method1();
		
		
		method2("�ȳ�");
		method2("�ȳ�", "�氡�氡");
		method2();
		
	}
	
	public static void print() {
		System.out.println("�ȳ�");
	}
	public static void print(int a) {
		System.out.println(a);
	}
	public static void print(double a) {
		System.out.println(a);
	}
	public static void print(int a, int b) {
		System.out.println("a: " + a + "b: " + b);
	}
	
	public static int twice(int k) {
		return k*2;
	}
	public static double sum(int m, double n) {
		return m+n;
	}
	public static void printArray(int[] a) {
		//int[] a;
		//a = new int[] {1,2,3};
		System.out.println(Arrays.toString(a));
	}
	
	public static void method1(int...values) { //�������� �迭
		System.out.println("�迭�� ����: " + values.length);
		
		for(int i = 0; i < values.length; i++) {
			System.out.println(values[i] + " ");
		}
		/*
		 for(int k : values){
		 	System.out.println(k + " ");
		 }
		 */
		System.out.println(Arrays.toString(values));
		System.out.println();
	}
	
	public static void method2(String...values) { //�������� �迭
		System.out.println("�迭�� ����: " + values.length);
		
		for(int i = 0; i < values.length; i++) {
			System.out.println(values[i] + " ");
		}
		/*
		 for(String k : values){
		 	System.out.println(k + " ");
		 }
		 */
		System.out.println(Arrays.toString(values));
		System.out.println();
	}
	
}
