package task;

public class Task02 {
	public static void main(String[] args) {
		
		
		Task01 ts = new Task01();
		
		System.out.println("=================================");
		System.out.println(ts.countWord("I love java"));
		System.out.println("=================================");
		System.out.println(ts.getGender("1000000"));
		System.out.println(ts.getGender("010309-4000000"));
		System.out.println("=================================");
		System.out.println("첫번째 학생 : " + ts.getGrade(50, 50, 50));
		System.out.println("두번째 학생 : " + ts.getGrade(70, 80, 93));
		System.out.println("세번째 학생 : " + ts.getGrade(40, 50, 88));
		System.out.println("세번째 학생 : " + ts.getGrade(200, 200, 200));
		System.out.println("=================================");
		
		//Animal 클래스 => 3개 객체만들기
		
		//필드 : 동물이름, 나이, 종
		//메소드
		// 동물이 먹이를 먹는 메소드 매개변수 1개
		// => 동물이름이 00을 먹습니다
		
		// 동물이 잠을 잡니다 출력하는 메소드
		// => 동물이름이 잠을 잡니다
		
		// 동물의 생일 축하하는 메소드
		// => 동물이름의 나이 생일을 축하합니다 출력
		
		Animal an1 = new Animal();
		
		an1.name = "다롱이";
		an1.age = 5;
		an1.spieces = "강아지";
		
		an1.feed("쿠키");
		an1.sleep();
		an1.celebrate();
		
		System.out.println();
		
		Animal an2 = new Animal();
		an2.name = "아롱이";
		an2.age = 2;
		an2.spieces = "햄스터";
		
		an2.feed("해바라기 씨");
		an2.sleep();
		an2.celebrate();
		
		System.out.println();
		
		Animal an3 = new Animal();
		an3.name = "Derpy";
		an3.age = 999;
		an3.spieces = "호랑이";
		
		an3.feed("감자칩");
		an3.sleep();
		an3.celebrate();
		
	}
}
