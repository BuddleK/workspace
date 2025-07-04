package homework08;
 // 1) 단별로 세로로 출력하기
public class Gugudan01 {
	public static void main(String[] args) {
		
		// 1) 단별로 세로로 출력하기
		// 로직구성
		//for(int i = 2, i <= 9, i++){ 바깥 for문 시작
			// 현재 단 알려주기
			//for(int j = 1 ; j <= 9;j++){ 안쪽 for문 시작
				// i x j = i*j 출력
			//} 안쪽 for문 끝
			// 줄바꿈 충분히 해주기
		//} 바깥 for문 끝
		

		for(int i = 2; i <= 9; i++) {
			System.out.printf("%d 단\n", i);
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
			System.out.println();
		}
		
	}
}
