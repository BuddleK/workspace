package variable;
// 5번 : 변수와 상수의 차이
public class Variable04 {

	public static void main(String[] args) {
		// 변수 선언
		// 자료형 변수명 = 값;
		
		//상수 선언
		//final 자료형 변수명 = 값;
		
		// student라는 변수에 20이라는 값을 저장한다.
		int student = 20;
		
		// MAX_STUDENTS라는 상수에 25라는 값을 저장한다
		final int MAX_STUDENTS = 25;
		
		
		// 출력
		System.out.println(student);
		System.out.println(MAX_STUDENTS);
		
		// 변수에 저장되어 있는 값 변경
		student = 25;
		System.out.println(student);
		
		// 상수에 저장되어 있는 값 변경
		// MAX_STUDENTS = 20;

	}

}
