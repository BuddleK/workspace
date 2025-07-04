package homework08;

public class Gugudan04 {
	public static void main(String[] args) {
//		4) while문만 이용 구구단 출력(단별로 가로로 출력하기)
		
		
		
		// 정수 2개 선언
		// 반복문 1 시작 ( i : 0~9 )
			// j를 2로 초기화(2단 부터 9단까지 한 줄 마다 반복해야 하기 때문에
			// 반복문 2 시작 ( j : 2~9 )
				// 삼항연산자 출력 ( i가 0인 경우 | 참 : "j 단" 출력 | 거짓 : " j x i = j*i " 출력)
				// j++
			// 반복문 2 끝
			// 줄바꿈
			// i++
		// 반복문 1끝
		
		
		
		
		int i = 0;
		int j;
		
		while(i <= 9) {
			j = 2;
			while(j <= 9) {
				System.out.print(i == 0 ? j + "단\t\t" : j + " x " + i + " = " + j * i + "\t");
//				System.out.printf("%d x %d = %d\t", i, j, i*j);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
