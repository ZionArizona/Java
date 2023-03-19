package 자바기초;

class H{
	H(){
		System.out.println("첫번째 생성자");
	}
	H(int a){
		System.out.println("두번째 생성자");
	}
	H(int a, int b){
		System.out.println("세번째 생성자");
	}
}

public class 생성자Overloading {
	public static void main(String[] args) {
		
		//#1.세가지 생성자를 이용한 객체 생성
		H a1 = new H();  //첫번째 생성자 호출
		H a2 = new H(3); //두번째 생성자 호출
		H a3 = new H(3,5);  //세번째 생성자 호출
		
		
		
	}
}
