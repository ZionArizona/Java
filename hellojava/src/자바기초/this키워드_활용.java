package 자바기초;

class Y{
	int m1,m2,m3,m4;
	Y(){
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	Y(int a){
		m1 = a;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	Y(int a, int b){
		//this(2) 가능
		m1 = a;
		m2 = b;
		m3 = 3;
		m4 = 4;
	}
	void print() {
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
}


class Z{
	int m1,m2,m3,m4;
	Z(){
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	Z(int a){
		this();
		m1 = a;
	}
	Z(int a, int b){
		this(2); 
		m2 = b;
	}
	void print() {
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
}

public class this키워드_활용 {
	public static void main(String[] args) {
		//#1. 세가지 객채 생성(this() 미사용)
		Y a1 = new Y();
		Y a2 = new Y(10);
		Y a3 = new Y(10,20);
		
		a1.print();
		a2.print();
		a3.print();
		
		
		//#2. 세가지 객체 생성(this() 생성)
		Z b1 = new Z();
		Z b2 = new Z(30);
		Z b3 = new Z(30,40);
	}
	
	

}
