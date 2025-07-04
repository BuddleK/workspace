package homework08;

public class Gugudan03 {
	public static void main(String[] args) {
		// 3) 3단씩 출력하기 Gugudan03
		
		// 로직구성
		//for(int z = 1; z <= 7;z += 3) { (z는 1, 4, 7로만 존재함)
			//for(int i = z; i <= z + 2; i++) { (z가 1인경우에 세 번, 4인 경우에 세 번, 7인 경우에 세 번 돌아간다.)
				//i 단 출력
			//}
			//줄바꿈
			//for(int j = 1; j <= 9; j++) {
				//for(int i = z; i <= z + 2; i++) {
						//i x j = i * j 출력 
					//}
				//}
				//줄바꿈
			//}
			//줄바꿈
		//}
		
		for(int z = 1; z <= 7; z += 3) {
			for(int i = z; i <= z + 2; i++) { // 단 제목 출력
				System.out.printf("%d단\t\t", i);
			}
			System.out.println();
			for(int j = 1; j <= 9; j++) { // 곱셈 계산 결과
				for(int i = z; i <= z + 2; i++) {
					System.out.printf("%d x %d  = %d\t", i, j , i * j);
				}
				System.out.println();
			}
			System.out.println();
		}
		
		// 로직구성
		//for(int z = 1; z <= 7;z += 3) {
			//for(int i = 0; i <= 9; i++) {
				//for(int j = z;j<z + 3;j++) {
					//if(i == 0) {
						//j 단 출력
					//}else {
						//j x i = j*i 출력 
					//}
				//}
				//줄바꿈
			//}
			//줄바꿈
		//}
		
//		for(int z = 1; z <= 7;z += 3) {
//			for(int i = 0; i <= 9; i++) {
//				for(int j = z;j<z + 3;j++) {
//					if(i == 0) {
//						System.out.printf("%d단 \t\t", j);
//					}else {
//						System.out.printf("%d x %d = %d\t", j, i, j * i);
//					}
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}
	}
}
