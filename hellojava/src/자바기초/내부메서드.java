package 자바기초;

import java.util.Arrays;

public class 내부메서드 {
	public static void main(String[] args) {
		//같은 클래스 안에 있는 내부 메서드 호출
		print();
		
		int a = twice(3);
		System.out.println(a);//6
		
		double b = sum(a,5.8);
		System.out.println(b); //11.8
		
		//배열을 매개변수로 가지는 메서드 호출
		printArray(new int[] {1,2,3});
		//printArray({1,2,3}); //오류
		
		//#가변길이 메서드
		method1(1,2);
		method1(1,2,3);
		method1();
		
		
		method2("안녕");
		method2("안녕", "방가방가");
		method2();
		
	}
	
	public static void print() {
		System.out.println("안녕");
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
	
	public static void method1(int...values) { //가변길이 배열
		System.out.println("배열의 길이: " + values.length);
		
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
	
	public static void method2(String...values) { //가변길이 배열
		System.out.println("배열의 길이: " + values.length);
		
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
