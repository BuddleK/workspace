package ex05_강버들;

public enum Major {
	
	// 상수
	COMPUTER_SCIENCE("컴퓨터공학"), CYBER_SECURITY("정보보안학"), ARTIFICIAL_INTELLIGENCE("인공지능학");
	
	//필드
	private final String koreanName;
	
	
	//생성자
	Major(String koreanName) {
		this.koreanName = koreanName;
	}
	
	//메소드
	String getKoreanName() {
		return koreanName;
	}
}
