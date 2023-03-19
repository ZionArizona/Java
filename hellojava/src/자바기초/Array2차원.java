package 자바기초;

public class Array2차원 {
	public static void main(String[] args) {
		//#1. 배열의 선언 방법1
		int[][] array1 = new int[3][4];
		int[][] array2;
		array2 = new int[3][4];
		
		//#2. 배열의 선언 방법2
		int array3[][] = new int[3][4];
		int array4[][];
		array4 = new int[3][4];
		
		//#3. 다양한 배열 선언(기본자료형, 참조자료형 배열)
		boolean[][] array5 = new boolean[3][4];
		int[][] array6 = new int[2][4];
		double[][] array7 = new double[3][4];
		String[][] array8 = new String[3][4]; //참조 자료형 배열

		//배열의 원소값 대입(방법1)
		int[][] Array1 = new int[2][3];
		Array1[0][0] = 1;
		Array1[0][1] = 2;
		Array1[0][2] = 3;
		Array1[1][0] = 4;
		Array1[1][1] = 5;
		Array1[1][2] = 6;
		
		System.out.println(Array1[0][0] + " " + Array1[0][1] + " " + Array1[0][2] + " ");
		System.out.println(Array1[1][0] + " " + Array1[1][1] + " " + Array1[1][2] + " ");
		
		//배열의 원소값 대입(방법2)
		int[][] Array2 = new int[][] {{1,2,3},{4,5,6}};
		System.out.println(Array2[0][0] + " " + Array2[0][1] + " " + Array2[0][2] + " ");
		System.out.println(Array2[1][0] + " " + Array2[1][1] + " " + Array2[1][2] + " ");
		
		
		//비정방행렬의 선언 및 값 대입 방법1
		int[][] barray1 = new int[2][];
		barray1[0] = new int[2];
		barray1[0][0] = 1;
		barray1[0][1] = 2;
		barray1[1] = new int[3];
		barray1[1][0] = 3;
		barray1[1][1] = 4;
		barray1[1][2] = 5;
		System.out.println(barray1[0][0] + " " + barray1[0][1]);
		System.out.println(barray1[1][0] + " " + barray1[1][1] + " " + barray1[1][2] + " ");
		System.out.println();
		
		int[][] barray2 = new int[2][];
		barray2[0] = new int[] {1,2};
		barray2[1] = new int[] {3,4,5};
		barray2[0][0] = 1;
		barray2[0][1] = 2;
		barray2[1][0] = 3;
		barray2[1][1] = 4;
		barray2[1][2] = 5;
		System.out.println(barray2[0][0] + " " + barray2[0][1]);
		System.out.println(barray2[1][0] + " " + barray2[1][1] + " " + barray2[1][2]);
		System.out.println();
		
		//비정방행렬의 선언 및 값 대입 방법2
		int[][] barray3 = new int[][] {{1,2},{3,4,5}};
		System.out.println(barray3[0][0] + " " + barray3[0][1]);
		System.out.println(barray3[1][0] + " " + barray3[1][1] + " " + barray3[1][2]);
		
		//#1. 2차원 배열의 길이
		int[][] bArray1 = new int[2][3];
		System.out.println(bArray1.length); //2
		System.out.println(bArray1[0].length); //3 첫번째 행이 가리키는 1차원 배열의 개수
		System.out.println(bArray1[1].length); //3 두번째 행이 가리키는 1차원 배열의 개수
		System.out.println();
		
		int[][] bArray2 = new int[][] {{1,2},{3,4,5}};
		System.out.println(bArray2.length); //2
		System.out.println(bArray2[0].length); //2 첫번째 행이 가리키는 1차원 배열의 개수
		System.out.println(bArray2[0].length); //3 두번째 행이 가리키는 1차원 배열의 개수
		System.out.println();
		
		//#2. 2차원 배열 출력 방법
		for(int i = 0; i < bArray2.length; i++)
		{
			for(int j = 0; j < bArray2[i].length; j++)
			{
				System.out.println(bArray2[i][j]); //1,2,3,4,5
			}
		}
		System.out.println();
		
		//for(하나의 원소를 꺼냈을때 저장할 변수: 집합객체)
		for(int[] array: bArray2) {
			for(int k: array) {
				System.out.println(k);
			}
		}
		System.out.println();
			
		//args 배열의 길이 구하기
		System.out.println(args.length);//0
	}
}
