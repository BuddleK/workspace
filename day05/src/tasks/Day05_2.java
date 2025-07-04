package tasks;

import java.util.Scanner;

// 2. 이름과 나이를 입력받아 내년 나이를 출력하기(nextInt() 사용금지)
public class Day05_2 {
	public static void main(String[] args) {
		//로직 구성
		//)스캐너 선언 임포트
		//)이름 입력 메시지
		//)이름 입력
		//)나이 입력 메시지
		//)나이 입력(next()로 입력받아 정수형으로 형변환)
		//)내년 나이 출력
		//)만 나이 출력
		//)스캐너 닫아주기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.next());
		System.out.println(name + "님의 내년 나이는" + (age + 1) + "입니다.");
		System.out.println("만 나이는 " + (age - 1) + "입니다.");
		sc.close();
	}
}
