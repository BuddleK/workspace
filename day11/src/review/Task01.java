package review;

import java.util.Scanner;

//메소드 문제
public class Task01 {
	
	public static void main(String[] args) {
		//객체명.메소드명 호출
		Task01 t1 = new Task01();
		
		
		//1. 매개변수 o 리턴값 o => syso(객체명.메소드명(인수));
		System.out.println(t1.countWord(null));
		System.out.println(t1.countWord("    울랄라 뽕!  "));
		
		//2. 매개변수 o 리턴값 o => syso(객체면.메소드명(인수));
		System.out.println(t1.getGender1("250625-0"));
		System.out.println(t1.getGender2("250625-0"));
		
		//3. 매개변수 o 리턴값 o => syso(객체명.메소드명(인수));
		Scanner sc = new Scanner(System.in);
		int[][] scores = t1.inputScore(3, 3, sc);
		System.out.println(scores);
		
		System.out.println("------학점결과------");
		for(int i = 0; i < scores.length;i++) {
			String grade = t1.getGrade(scores[i][0], scores[i][1], scores[i][2]);
			System.out.println((i + 1) + "번 학생의 학점 : " + grade);
		}
		
	}
	
	//1. 문자열 속의 단어를 공백 기준으로 세기
	//메소드명 : countWord
	//매개변수 : String str
	//ex) I Love java	=> 3개
	//ex) 안녕하세요 저는 김영선입니다 java 공부 중입니다 => 6개
	
	//1) 리턴타입 => void
	//2) 메소드명 => countWord
	//3) 매개변수 => String str
	//4) 구현부
	//	조건문(if문) str이 null과 같다면	str == null
	//      return 0;
	//   변수 2개(정수형1, 논리형2)
	//    반복문 초기식 int i = 0;
	//        조건식 i < str.length();
	//        증감식 i++
	//      문자형변수3 = str.charAt(i);
	//      조건문if(변수3 != ' ' && !변수2)
	//         변수2 = true
	//         변수1++;
	//      조건문 else if(변수3 == ' ')
	//         변수2 = false
	//   return 변수1;
	int countWord(String str) {
		if(str == null) {
			return 0;
		}
		
		int count = 0;
		boolean word = false;
		
		for(int i = 0;i<str.length();i++) {
			char c = str.charAt(i);
			
			//문장를 만나면 단어 시작
			if(c != ' ' && !word) {
				word = true;
				count++;
			}else if(c == ' ') {
				//공백을 만나면 단어 끝
				word = false;
			}
			//공백을 만나면 단어 끝
		}
		return count;
	}
	
	//2. 주민등록번호로 성별 판단하기
	//메소드명 : getGender
	//1, 3 => 남자 2, 4 => 여자
	//방법1) if문
	//리턴타입 => void
	//메소드명 => getGender
	//매개변수 => String ssn
	//구현부 => 조건문 (null || .length() < 8 || .charAt(6) != '-')
	//	return "잘못된 입력입니다."
	//문자형 변수 => ssn.charAt(7)
	//if	변수 == '1' || 변수 == '3'
	//	return "남자"
	//else if 변수 == '2' || 변수 == '4'
	//	return "여자"
	//else
	//	return "알 수 없습니다"
	
	//방법1) if문
	String getGender1(String ssn) {
		if(ssn == null || ssn.length() < 8 || ssn.charAt(6) != '-') {
			return "잘못된 입력입니다.";
		}
		
		char code = ssn.charAt(7);
		if(code == '1' || code == '3') {
			return "남자";
		}else if(code == '2' || code == 4) {
			return "여자";
		}else {
			return "잘못된 입력입니다";
		}
	}
	
	//방법2) switch문
	String getGender2(String ssn) {
		if(ssn == null || ssn.length() < 8 || ssn.charAt(6) != '-') {
			return "잘못된 입력입니다.";
		}
		
		char code = ssn.charAt(7);
		switch(code) {
		case '1', '3':
			return "남자";
		case '2', '4':
			return "여자";
		default:
			return "알 수 없음";
		}
	}
	
	//3. 학생 3명의 수학점수, 국어점수, 영어점수를 받아 평균을 구하여(정수형)
	//		각 학생별 학점 구하기
	//메소드명 : getGrade
	// 95점 이상 A+
	// 90점 이상 A
	// 85점 이상 B+
	// 80점 이상 B
	// 75점 이상 C+
	// 70점 이상 C
	// 69점 이하 F
	
	//방법1) if~else if~else문 이용
	//리턴타입 => void => String
	//메소드명 => getGrade
	//매개변수 => 정수형 3개
	//구현부 =>
	//	정수형 변수 선언 = 매개변수3 합하고 / 3
	//	조건문 if~else if~else문
	
	String getGrade(int math, int korean, int english) {
		int avg = (math + korean + english) / 3;
		
		if(avg >= 95) {
			return "A+";
		}else if(avg >= 90) {
			return "A";
		}else if(avg >= 85) {
			return "B+";
		}else if(avg >= 80) {
			return "B";
		}else if(avg >= 75) {
			return "C+";
		}else if(avg >= 70) {
			return "C";
		}else {
			return "F";
		}
	}
	
	//방법2) 2차원 배열이용
	//1) 점수 입력 받는 메소드
	// 리턴 타입 => void => 배열[][]
	// 메소드명 => inputScore
	// 매개변수 => 정수형 학생수, 정수형 과목수, 입력클래스
	// 정수형2차원배열 배열명 = new int[학생수][과목수];
	// 반복문(for 초기식 int i = 0;
	//			조건식 i < 학생수;
	//			증감식 i++
		//n번 학생의 점수를 입력하세요 출력
		//반복문 int j = 0; j < 과목수 ; 증감식 j++
			//문자열변수 subject = "";
			//if(j == 0) { subject = "수학"; }
			//else if(j == 1) { subject = "영어"; }
			//else if(j == 2) { subject = "국어"; }
			//출력메시지 subject + "점수 입력 : ";
			//배열[i][j] = sc.nextInt();
		//return 배열명;
		//반복문 끝
	// 반복문 끝
	
	int[][] inputScore(int studentCnt, int subjectCnt, Scanner sc){
		int[][] scores = new int[studentCnt][subjectCnt];
		
		for(int i = 0; i < studentCnt; i++) {
			System.out.println((i + 1) + "번 학생의 점수를 입력하세요!");
			for(int j = 0;j<subjectCnt; j++) {
				System.out.println(i + " " + j);
				String subject = "";
				if(j == 0) {
					subject = "수학";
				}else if(j == 1) {
					subject = "국어";
				}else if(j == 2) {
					subject = "영어";
				}
				
				System.out.print(subject = " 점수 입력 : ");
				scores[i][j] = sc.nextInt();
			}
		}
		return scores;
	}
	
	//2) 학접 계산 메소드
	
	
	
	
//	int countWord(String str) {
//		
//		int count = 0;
//		
//		for(int i = 0 ; i < str.length();i++) {
//			if(str.charAt(i) == ' ') {
//				count ++;
//			}
//		}
//		
//		return count + 1;
//	}
//	
//	String getGender(String id) {
//		String gender = "";
//		
//		switch((id.charAt(id.length() - 7))) {
//		case '1':
//		case '3':
//			gender = "남자";
//			break;
//		case '2':
//		case '4':
//			gender = "여자";
//			break;
//		default:
//			gender = "주민번호 오류";
//			break;
//		}
//		
//		return gender;
//	}
//	
//	String getGrade(int m, int k, int e) {
//		int avg = (m + k + e) / 3;
//		String grade = "";
//		
//		if((m + k + e) > 300 || (m + k + e) < 0) {
//			grade = "범위 초과";
//		}else {
//			
//			switch(avg / 5) {
//			case 20:
//			case 19:
//				grade = "A+";
//				break;
//			case 18:
//				grade = "A";
//				break;
//			case 17:
//				grade = "B+";
//				break;
//			case 16:
//				grade = "B";
//				break;
//			case 15:
//				grade = "C+";
//				break;
//			case 14:
//				grade = "C";
//				break;
//			default:
//				grade = "F";
//				break;
//			}
//			
//		}
//		
//		return grade;
//	}
	
	
	
}
