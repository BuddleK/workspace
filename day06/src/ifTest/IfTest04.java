package ifTest;

import javax.swing.plaf.synth.SynthOptionPaneUI;

//13번 : if~if문, if~else if문 차이 / if문 중첩
public class IfTest04 { // 클래스 시작
	public static void main(String[] args) { // main 시작
		//if~if문 : 위의 조건이 true라도 아래 if문의 조건식을 확인한다
		int num = 10, grade = 100; 							// 정수형 num에 10, grade에 100 넣어주기
		if(num > 5) { 										// num이 5보다 클 때
			System.out.println("num은 5보다 큽니다");			// 5보다 크다고 알려 주기
		}
		if(num > 3) {										// 3보다 클 때
			System.out.println("num은 3보다 큽니다");			// 3보다 크다고 알려주기 (위의 5보다 크다는 정보랑 같이 출력)
		}
		
		//if~else if문 : 위의 조건식 true면 아래 있는 조건식은 무시된다
		if(num > 5) {										// 5보다 클 때
			System.out.println("num은 5보다 큽니다");			// 5보다 크다고 알려 주기
		}else if(num > 3) {									// 5보다 크지 않았을  때, 3보다 큰지 확인하기
			System.out.println("num은 3보다 큽니다");			// 3보다 크다고 알려주기
		}
		
		//if문 중첩
		//90점 이상은 A, 100점은 만점으로 A 출력
//		if(grade == 100) {
//			System.out.println("만점으로 A");
//		}else if(grade >= 90) {
//			System.out.println("A");
//		}
		
		if(grade >= 90) {									// grade가 90이랑 같거나 90보다 큰지 확인하기
			if(grade == 100) {								// grade가 100점인지 확인하기
				System.out.println("만점으로 A");				// 100점이라 만점이라고 알려주기
			}else {
				System.out.println("A");					// 100점은 아니지만 A라고 알려주기
			}
		}
		
	} // main 끝
} // 클래스 끝
