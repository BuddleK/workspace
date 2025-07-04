package task01;

public class Person {
	// 필드
	// 이름, 나이
	String name;
	int age;

	// 생성자
	// 기본생성자
	// 매개변수 2개 있는 생성자
	public Person() {
		this("이름 없음", 0);
		System.out.println("Person 기본 생성자 호출");
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("Person 매개변수 있는 생성자 호출");
	}

	// 메소드
	// introduce 메소드 : 이름, 나이 출력
	// sleep 메소드 : 이름은 몇 시에 잠을 잡니다 출력
	void introduce() {
		System.out.printf("이름 : %s, 나이 : %d\n", this.name, this.age);
	}

	void sleep(int time) {
		System.out.printf("%s은 %d시에 잠을 잡니다.\n", this.name, time);
	}


}
