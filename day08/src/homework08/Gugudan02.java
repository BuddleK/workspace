package homework08;

public class Gugudan02 {
	public static void main(String[] args) {
		
		// 2) 단별로 가로로 출력하기
		// 로직구성
		//for(int i = 0; i <= 9 ; i++){ 바깥 for문 시작
			//for(int j = 2; j <= 9;j++){ 안쪽 for문 끝
				// if( i == 0 ){
					// i단 출력
				// } else (i가 0이 아닐 때)
					// j x i == j*i 출력
				// }
			//} 안쪽 for문 끝
			// 줄바꿈
		//} 바깥 for문 끝
		
		
		for(int i = 0; i <= 9; i++) {
			for(int j = 2;j<=9;j++) {
//				if(i == 0) {
//					System.out.printf("%d단 \t\t", j);
//				}else {
//					System.out.printf("%d x %d = %d\t", j, i, j * i);
//				}
				
				System.out.print(i == 0? j + "단 \t\t" : j + " x " + i + " = " + (j * i) + "\t");
			}
			System.out.println();
		}
	}
}
