package 자바기초;

//컴파일러가 자동 추가해주는 생성자(기본생성자)
class E{
	int m;
	void work()
	{
		System.out.println(m); //0
	}
}

class F{
	int m;
	void work() {
		System.out.println(m); // 0
	}
	F(){ //기본 생성자
		
	}
}

class G{
	int m;
	void work() {
		System.out.println(m); //생성자로 넘어온 값
	}
	G(int a){ //생성자의 기본기능: 객체 생성 + 필드 초기화
		m = a;
	}
}

public class Default생성자 {
	public static void main(String[] args) {
		//#1. 클래스의 객체 생성
		E e = new E();
		F f = new F();
		G g = new G(3);
		//G g = new G(); //불가능
		
		//#2. 메서드 호출
		e.work();  //0
		f.work(); //0
		g.work(); //3
		
	}
}
