package typeCasting;
//3번 : 문자열 자료형 -> 다른 기본 자료형으로
public class TypeCasting02 {// 클래스 중괄호 영역 시작
	public static void main(String[] args) { // main 메소드 중괄호영역 시작
		//기본자료형 -> 문자열 자료형
		String str1 = 3 + ""; // 정수 + 문자열 = 문자열
		String str2 = 6.17 + ""; // 실수 + 문자열 = 문자열
		String str3 = 'a' + ""; // 문자! + 문자열 = 문자열
		String str4 = true + ""; // 논리형 + 문자열 = 문자열
		
		System.out.println(str1); //문자열 3
		System.out.println(str2); //문자열 6.17
		System.out.println(str3); //문자열 a
		System.out.println(str4); //문자열 true
		
		//문자열 -> 기본자료형
		int number1 = Integer.parseInt(str1); // 정수형 값 3으로 변환
		System.out.println(number1); //3 출력
		double number2 = Double.parseDouble(str2); // 실수형 값 6.17으로 변환
		System.out.println(number2); //6.17 출력
		boolean isTrue2 = Boolean.parseBoolean(str4); // 논리형 값 true으로 변환
		System.out.println(!isTrue2); //true를 반전시켜 false를 출력
		char ch = "hello".charAt(0); // "hello"의 0번째 문자 h를 문자형 변수에 대입
		System.out.println(ch); // 문자 a 출력
	} // main 메소드 중괄호 영역 끝
} // 클래스 중괄호 영역 끝
