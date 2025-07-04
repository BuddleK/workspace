package switchTest;
//14번 : switch문
public class SwitchTest01 {// 클래스 시작
	public static void main(String[] args) {// main 시작
		
		String animal = "햄스터";
		
//		switch ("강아지") {
//		case "햄스터":
//			System.out.println("선택한 동물은 햄스터입니다");
//			break;
//		case "강아지":
//			System.out.println("선택한 동물은 강아지입니다");
//			break;
//		case "코알라":
//			System.out.println("선택한 동물은 코알라입니다");
//			break;
//		default:
//			System.out.println("선택한 동물이 없습니다");
//			break;
//		}
		
		switch(30) {								// 케이스와 대조할 값 : 30
		case 10:									// 10의 경우
			System.out.println("10입니다");			// 10입니다 출력하기
			break;									// 스위치문 끝내기
		case 100:									// 100의 경우
			System.out.println("100입니다");			// 100입니다 출력하기
			break;									// 스위치문 끝내기
		case 50:									// 50의 경우
			System.out.println("50입니다");			// 50입니다 출력하기
			break;									// 스위치문 끝내기
		default:									// 일치하는 case가 없으면 여기를 본다
			System.out.println("case에 값이 없습니다");	// case에 값이 없습니다 출력하기
			break;									// 스위치문 끝내기
		}
		
		
		
	}// main 끝
}// 클래스 끝
