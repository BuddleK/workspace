package ex05_강버들;

public class Student extends Person {
	
	//필드
	int javaScore;
	int dbmsScore;
	int htmlScore;
	Major major;
	
	//생성자
	public Student(String name, int javaScore, int dbmsScore, int htmlScore, Major major) {
		super(name);
		this.javaScore = javaScore;
		this.dbmsScore = dbmsScore;
		this.htmlScore = htmlScore;
		this.major = major;
	}

	//메소드 (총점 반환)
	int getTotalScore() {
		return javaScore + dbmsScore + htmlScore;
	}
	
	//메소드 (평균 반환)
	int getAverageScore() {
		return (javaScore + dbmsScore + htmlScore) / 3;
	}
	
	//메소드(전공 한국이름 반환)
	String getMajor() {
		return this.major.getKoreanName();
	}
	
	
	
}
