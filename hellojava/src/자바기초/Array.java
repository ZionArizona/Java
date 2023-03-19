package 자바기초;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		//#1. 배열의 선언 방법 #1
		int[] array1 = new int[3];
		int[] array2;
		array2 = new int[3];
		
		//#2. 배열의 선언 방법#2
		int array3[] = new int[3];
		int array4[];
		array4 = new int [3];
		
		//#3. 다양한 배열 선언( 기본자료형 배열, 참조자료형 배열)
		boolean[] array5 = new boolean[3];
		int[] array6 = new int[5]; //int 참조자료형 배열
		double[] array7 = new double[7]; //double 참조자료형 배열
		String[] array8 = new String[9]; //String 참조자료형 배열
		
		
		//#1.배열 원소값 대입 방법1
		int[] Array1 = new int[3];
		Array1[0] =3;
		Array1[1] =4;
		Array1[2] =5;
		
		System.out.println(Array1[0] + " " + Array1[1] + " " + Array1[2]);
		
		//#2.배열 원소값 대입 방법2
		int[] Array2 = new int[]  {4,5,6};// 자동으로 배열 크기가 3개로 된다. 
		System.out.println(Array2[0] + " " + Array2[1] + " " + Array2[2]);
		
		int[] Array3;
		Array3 = new int[] {5,6,7};
		System.out.println(Array3[0] + " " + Array3[1] + " " + Array3[2]);
		
		//#3. 배열 원소값 대입 방법3
		int[] Array4 = {6,7,8};
		System.out.println(Array4[0] + " " + Array4[1] + " " + Array4[2]);
		/*
		 int[] Array4;
		 Array4 = {6,7,8}; 선언은 불가능.
		 */
		
		
		//배열 초기화
		//#1/ stack 메모리값(강제초기화 되지 않음)
		/*
		int value1;
		System.out.println(value1); //오류		 
		int[] value2;
		System.out.println(value2); //오류
		 */
		int value3 = 0;
		System.out.println(value3);
		
		int[] value4 = null; //참조형 자료인데 가리키는게 없으면 null로 초기화
		System.out.println(value4);//null
		
		//#2.heap 메모리 초기값(강제초기화)
		//기본자료형
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
		//Tip 배열을 쉽게 출력할 수 있는 방법
		System.out.println(Arrays.toString(bArray1));
		System.out.println(Arrays.toString(bArray2));
		System.out.println(Arrays.toString(bArray3));
		System.out.println(Arrays.toString(bArray4));
		
		//#1. 배열의 길이 구하기
		int[] array = new int[] {3,4,5,6,7};
		System.out.println(array.length); //5
		System.out.println();
		//#2. 출력하기 1:
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		System.out.println();
		//#2. 출력하기 2:
		for(int i = 0 ; i < 4; i++)
		{
			System.out.println(array[i]);
		}
		System.out.println();
		//#2. 출력하기 3:
		//for(꺼낸 하나의 원소를 저장할 수 있는 변수 ; 집합객체) {} for each구문
		for(int k : array) {
			System.out.println(k);
		}
		
		//#2. 출력하기 4:
		System.out.println(Arrays.toString(array));
		
	}
}
