package 자바기초;

import java.util.Arrays;

public class String오브젝트 {
	public static void main(String[] args) {
		//#1. String 객체 생성1
		String str1 = new String("안녕");
		System.out.println(str1);
		
		//#1. String 객체 생성2
		String str2 = "안녕하셍";
		System.out.println(str2);
		
		//#2. 문자여려 수정(객체내의 내용변경 불가 --> 새로운 객체 생성)
		String str3 = new String("안녕");
		String str4 = str3;
		str3 = "안녕하세요"; //str3는 "안녕하세요" 객체를 가리킨다. 
		System.out.println(str3); //안녕하세요
		System.out.println(str4); //안녕
		
		//배열 참조자료형
		int[] array1 = new int[] {3,4,5};
		int[] array2 = array1; 
		array1[0] = 6;
		array1[1] = 7;
		array1[2] = 8;
		System.out.println(Arrays.toString(array1)); //6,7,8
		System.out.println(Arrays.toString(array2)); //6,7,8
		
		//#3.문자열 객체 공유(리터럴로 객체를 생성한 경우) new 키워드로 객체 생성한 경우(별도의 객체 생성).즉 객체 공유x
		String Str1 = new String("안녕");
		String Str2 = "안녕"; //Str1이 가리키는 "안녕"이랑 다른 "안녕"을 가리키고 있다. 
		String Str3 = "안녕"; //Str2이 가리키는 "안녕"가리키고 있다.
		String Str4 = new String("안녕");
		//총 세개의 "안녕"객체르 생성
		
		//Stack 메모리값 비교(==)
		System.out.println(Str1 == Str2); //false
		System.out.println(Str2 == Str3); //true
		System.out.println(Str3 == Str4); //false
		System.out.println(Str4 == Str1); //false
		
		//#4. 문자열 + 문자열
		String s1 = "안녕" + "하세요" + "!"; // 안녕, 하세요, !, 안녕하세요, 안녕하세요! 총 5개 객체 생성
		System.out.println(s1); //안녕하세요!
		
		String s2 = "반갑";
		s2 += "습니다";
		s2 += "!";
		System.out.println(s2);//반갑습니다!
		System.out.println();
		
		//#5. 문자열 + 기본자료형 // 기본자료형 + 문자열 
		String s3 = "안녕" + 1; //정수인 1은 문자열 "1"로 바껴 s3 는 안녕1이 된다. 
		String s4 = "안녕" + String.valueOf(1); //1을 String으로 바꿔라
		String s5 = "안녕" + "1";
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println();
		
		//#6. 문자열과 기본자료형 혼용
		System.out.println(1+"안녕"); //1안녕
		System.out.println(1+"안녕" + 2); //1안녕2
		System.out.println("안녕" + 1 + 2); //안녕12
		System.out.println(1 + 2 +"안녕"); //3안녕
		
		//#7. 문자열의 길이
		String S1 ="Hello Java!";
		String S2 = "안녕하세요! 반갑습니다.";
		System.out.println(S1.length()); //11
		System.out.println(S2.length()); //13
		
		//#8. 문자열 검색 (charAt(), indexOf(), lastIndex())
		//charAt()
		System.out.println(S1.charAt(1)); //인덱스 1번의 char-->e
		System.out.println(S2.charAt(1)); //인덱스 1번의 char-->녕
		System.out.println();
		
		//indexOf(), lastIndexOf()
		System.out.println(S1.indexOf('a')); //a가 있는 첫 번째 인덱스-->7
		System.out.println(S1.lastIndexOf('a')); //9
		System.out.println(S1.indexOf('a',8)); //9
		System.out.println(S1.lastIndexOf('a',8)); //7
		System.out.println(S1.indexOf("Java")); //6
		System.out.println(S1.lastIndexOf("Java")); //6
		System.out.println(S2.indexOf("하세요")); //2
		System.out.println(S2.indexOf("Bye")); //2
		System.out.println(S1.lastIndexOf("고맙습니다.")); //-1
		
		//#9.문자열 변환 및 연결(String.valueOf(), concat())
		//String.valueOf(기본자료형) 기본자료형->String
		String S3 = String.valueOf(2.3);
		String S4 = String.valueOf(false);
		System.out.println(S3);
		System.out.println(S4);
		
		//concat()
		String S5 = S3.concat(S4);
		System.out.println(S5); // 2.3false
		
		//String.valueOf() + concat() 
		String S6 = "안녕" + 3;//안녕3
		String S7 = "안녕".concat(String.valueOf(3));//안녕3
		
		//#10. 문자열-> byte[] (getBytes()), 문자열-> char[] (toCharArray())
		String S8 = "Hello Java!";
		String S9 = "안녕하세요";
		
		//getBytes() 문자열->byte()
		byte[] Array1 = S8.getBytes();
		byte[] Array2 = S9.getBytes();
		System.out.println(Arrays.toString(Array1)); //바이트 별로 아스키 코드로 저장
		System.out.println(Arrays.toString(Array2));
		
		//toCharArray() 문자열-> char[]
		char[] Array3 = S8.toCharArray();
		char[] Array4 = S9.toCharArray();
		System.out.println(Arrays.toString(Array3));
		System.out.println(Arrays.toString(Array4));
		
		
		//#11. 문자열 수정
		//toLowerCase(), toUpperCase()
		String St1 = "Java Study";
		System.out.println(St1.toLowerCase());
		System.out.println(St1.toUpperCase());
		
		//replace()
		System.out.println(St1.replace("Study", "공부"));
		
		//substring(,)
		System.out.println(St1.substring(0,5)); //0<= <5
		
		//split()
		String[] strArray = "abc/def-ghi hkl".split("/|-| ");
		System.out.println(Arrays.toString(strArray));
		
		//trim()
		System.out.println(" abc ".trim());
		//#12. 문자열의 내용 비교(equals(), equalsIgnoreCase())
		String St2 = new String ("Java");
		String St3 = new String("Java");
		String St4 = new String("java");
		
		//stack 메모리 비교(==)
		System.out.println(St2 == St3); //false
		System.out.println(St3 == St4); //false
		System.out.println(St4 == St2); //false
		
		//equals(), equalsIgnoreCase() : 내용비교
		System.out.println(St2.equals(St3)); //true
		System.out.println(St3.equals(St4)); //false
		System.out.println(St3.equalsIgnoreCase(St4)); //true
		}
}
