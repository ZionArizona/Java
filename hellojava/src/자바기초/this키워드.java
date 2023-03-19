package 자바기초;

//#1. 클래스의 저의 클래스 내부에서 필드, 메서드에 앞에 붙는 자동으로 붙는 this 키워드
class P{
	int m;
	int n;
	void init(int a, int b) {
		m = a; //this.m 
		n = b; //this.n
	}
	void work() {
		init(2,3);
	}
	
}

class X{
	int m;
	int n;
	void init(int m, int n) {
		this.m = m;
		this.n = n;
	}
}




//자신이 속한 클래스의 다른 생성자 호출
class W{
	W(){
		System.out.println("첫번째 생성자");
	}
	W(int a){
		this(); //생성자의 첫줄에만 올수 있다. 
		System.out.println("두번째 생성자");
		//this(); //오류
	}
}


public class this키워드 {
	public static void main(String[] args) {
		//#2. 클래스 객체 생성
		P a = new P();
		
		//#3. 메서드 호출/ 필드값 활용
		a.work();
		System.out.println(a.m); // 2
		System.out.println(a.n); // 3
		
	
		//필드명과 지역변수 명이 같은 경우(this 키워드를 사용하지 않은 경우)
		X b = new X();
		b.init(4,5);
		System.out.println(b.m);
		System.out.println(b.n);
		
		
		//
		W w1 = new W(); //첫번째 생성자
		W w2 = new W(3); // 첫번째 생성자 -> 두번째 생성자
		
	}
}
