package ex02_강버들;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {
		
		//로직 구성
		//) 스캐너 임포트
		//) 계좌 객체 생성(잔액 : 1000원)
		//) try{ 출금 메소드 호출(인수:스캐너) } catch (예외 형식 3개) { 예외출력 }
		//) try{ 입금 메소드 호출(인수:스캐너) } catch (예외 형식 2개) { 예외출력 }
		//) 스캐너 해제

		Scanner sc = new Scanner(System.in);
		Account p1 = new Account(1000);

		try {
			p1.withdraw(sc);
		} catch (NumberFormatException | InputMismatchException | OverWithdrawException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			p1.deposit(sc);
		} catch (NumberFormatException | InputMismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sc.close();
	}
}
