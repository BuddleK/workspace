package ex01_강버들;

public abstract class Person {
	
	//필드
	private String name;
	private int age;

	//생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//getter
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	//추상메소드
	public abstract void score();
}
