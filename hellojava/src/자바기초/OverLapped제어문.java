package 자바기초;

public class OverLapped제어문 {
	public static void main(String[] args) {
		//#1. if-if중복
		int value1 = 5;
		int value2 = 3;
		if(value1 > 5)
		{
			if(value2 < 2) {
				System.out.println("실행1");
			}
			else {
				System.out.println("실행2");
			}
		}
		else {
			System.out.println("실행3");
		}
		
		//#2. switch-for중복
		int value3 = 2;
		switch(value3) {
		case 1:
			for(int k = 0; k < 10; k++)
			{
				System.out.println(k + " ");
			}
			break;
		case 2:
			for(int k = 10; k > 0; k--)
			{
				System.out.println(k + " ");
			}
			break;
		}
		System.out.println();
		
		//#3.for-for-if중복
		for(int i =0; i < 3; i++)
		{//3바퀴 실행
			for(int j = 0; j < 5; j++)
			{//5바퀴 실행
				System.out.println(i + " " + j);
				if(i == j) {
					System.out.println("i=j");
				}
			}
		}
	}
}
