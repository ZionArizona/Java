package 자바기초;

public class TypeCasting_1 {
	public static void main(String[] args) {
		//#1. 캐스팅 방법
		//1-1 캐스팅 방법1(데이터 타입)
		int value1 = (int)5.3;
		long value2 = 10;
		float value3 = (float)5.8;
		double value4 = 16;
	
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		//1-2 캐스팅 방법2 (L, F)
		long value5 = 10L;
		long value6 = 10l;
		float value7 = 5.8F;
		float value8 = 5.8f;
		
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		
	}
}
