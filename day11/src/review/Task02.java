package review;

class Animal {
	String name;
	int age;
	String spieces;
	
	void feed(String food) {
		System.out.printf("%s가 %s를 먹습니다.\n", name, food);
	}
	
	void sleep(String place) {
		System.out.println(name + "이 " + place + "에서 잠을 잡니다.");
	}
	
	void celebrate() {
		System.out.printf("%s의 %d번째 생일을 축하합니다.\n", name, age);
	}
}

public class Task02 {
	public static void main(String[] args) {
		
		Animal dog = new Animal();
		System.out.println(dog);
		System.out.println(dog.name); //null
		dog.name = "멍멍이";
		dog.age = 1;
		dog.spieces = "시츄";
		System.out.println(dog.name);
		dog.celebrate();
		
		Animal cat = new Animal();
		System.out.println(cat.name); //null
		cat.name = "빵빵이";
		cat.age = 3;
		cat.spieces = "코숏";
		System.out.println(cat.name);
		System.out.println(cat.age);
		dog.feed("츄르");
		
	}
}
