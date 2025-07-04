package task;
//메소드 문제
public class Task01 {
	//1. 문자열 속의 단어를 공백 기준으로 세기
	//메소드명 : countWord
	//매개변수 : String str
	//ex) I Love java	=> 3개
	//ex) 안녕하세요 저는 김영선입니다 java 공부 중입니다 => 6개
	
	//2. 주민등록번호로 성별 판단하기
	//메소드명 : getGender
	//1, 3 => 남자
	//2, 4 => 여자
	
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
	
	int countWord(String str) {
		
		int count = 0;
		
		for(int i = 0 ; i < str.length();i++) {
			if(str.charAt(i) == ' ') {
				count ++;
			}
		}
		
		return count + 1;
	}
	
	String getGender(String id) {
		String gender = "";
		
		switch((id.charAt(id.length() - 7))) {
		case '1':
		case '3':
			gender = "남자";
			break;
		case '2':
		case '4':
			gender = "여자";
			break;
		default:
			gender = "주민번호 오류";
			break;
		}
		
		return gender;
	}
	
	String getGrade(int m, int k, int e) {
		int avg = (m + k + e) / 3;
		String grade = "";
		
		if((m + k + e) > 300 || (m + k + e) < 0) {
			grade = "범위 초과";
		}else {
			
			switch(avg / 5) {
			case 20:
			case 19:
				grade = "A+";
				break;
			case 18:
				grade = "A";
				break;
			case 17:
				grade = "B+";
				break;
			case 16:
				grade = "B";
				break;
			case 15:
				grade = "C+";
				break;
			case 14:
				grade = "C";
				break;
			default:
				grade = "F";
				break;
			}
			
		}
		
		return grade;
	}
	
	
	
}
