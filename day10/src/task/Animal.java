package task;

public class Animal {
	String name;
	int age;
	String spieces;
	
	void feed(String food) {
		System.out.printf("%s가 %s를 먹습니다.\n", name, food);
	}
	
	void sleep() {
		System.out.println(name + "이 잠을 잡니다.");
	}
	
	void celebrate() {
		System.out.printf("%s의 %d번째 생일을 축하합니다.\n", name, age);
	}
}
