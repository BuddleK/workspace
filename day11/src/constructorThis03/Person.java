package constructorThis03;
//6번 : this()	자기자신의 생성자 호출
public class Person {
	//필드
	String name;
	int age;
	String job;
	// 생성자
	// 기본생성자부터
	public Person() {
	}
	
	//이름을 매개변수로 받는 생성자
	public Person(String name) {
		this.name = name;
	}
	
	//이름과 나일르 매개변수로 받는 생성자
	public Person(String name, int age) {
		this(name);
		this.age = age;
	}
	
	// 이름과 직업을 매개변수로 받는 생성자
	public Person(String name, String job) {
		this(name);
		this.job = job;
	}
	
	//이름과 나이와 직업을 매개변수로 받는 생성자
	public Person(String name, int age, String job) {
		this(name, job);
		this.age = age;
	}
	
	
	
	//메소드
	// printInfo() 정보 출력
	void printInfo() {
		System.out.printf("이름 : %s, 나이 : %d, 직업 : %s\n", this.name, this.age, this.job);
		greet();
	}
	
	// great() 000님 안녕하세요
	void greet() {
		System.out.println(this.name+"님 안녕하세요.");
	}
	
	
}
