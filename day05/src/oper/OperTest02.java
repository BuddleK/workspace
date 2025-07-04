package oper;
// 14번 : 증감연산자
public class OperTest02 {// 클래스 중괄호 영역 시작
	public static void main(String[] args) { // main 메소드 중괄호영역 시작
		
		int num = 1; // 정수형 변수 선언 및 초기화
		System.out.println("num의 값 : " + num); // 1출력
//		System.out.println("num + 10의 값 : " + (num + 10));
		
		System.out.println("=====증감연산자(전위형)====="); //구분 메시지 출력
		System.out.println("기존 num의 값 : " + num); //1
		System.out.println("전위증감연산자를 사용한 num의 값 : " + ++num); //2
		System.out.println("현재 num의 값 : " + num); //2
		
		System.out.println("\n======증감연산자(후위형)======"); //구분 메시지 출력
		int num2 = 1;
		System.out.println("기존 num2의 값 : " + num2); //1
		System.out.println("후위증감연산자를 사용한 num2의 값 : " + num2++); //1
		System.out.println("현재 num2의 값 : " + num2); //2
		
		System.out.println(); //줄바꿈
		int num3 = 7, num4 = 7; // 두 정수형 변수를 7이라는 값으로 초기화
		int result1 = 0, result2 = 0; // 두 변수를 0으로 초기화
		
		result1 = --num3 + 4; // 7 -> 6, 6 + 4
		System.out.println(result1); //10
		
//		result2 = num4++ -4;
		result2 = (num4++); // 후위연산자는 소괄호를 친다고 해도 결과가 대입연산자보다 먼저 적용되지 않는다.
		System.out.println(result2); // 7
		System.out.println(num4); // 8
		
		
	} // main 메소드 중괄호 영역 끝
} // 클래스 중괄호 영역 끝
