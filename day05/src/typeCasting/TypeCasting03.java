package typeCasting;
//4번 : 문자열과 다른 자료형과의 형변환
public class TypeCasting03 {// 클래스 중괄호 영역 시작
	public static void main(String[] args) { // main 메소드 중괄호영역 시작
		String data1 = "10"; // 문자열 10 저장
		String data2 = "abc"; // 문자열 abc 저장
		
		System.out.println(data1 + 1); // 문자열 + 1 => 연결
		System.out.println(data2); //문자열 abc 출력
		
		char alpha = data2.charAt(1); //abc의 1번째 문자 b 대입
		System.out.println(alpha); //문자형 b 출력
//		"True"
		boolean result1 = Boolean.parseBoolean("False"); // 문자열 "False"를 논리형으로 변환
		System.out.println(result1);
		//문자열이 TRUE(대소문자 무관)이면 true를 반환하고, 그렇지 않으면 flase를 반환
		
	} // main 메소드 중괄호 영역 끝
} // 클래스 중괄호 영역 끝
