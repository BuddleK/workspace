package gameTask;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String cMsg = "[생성할 캐릭터를 선택하세요]\n1. 마법사\n2. 전사\n3. 로그\n 선택입력 : ";
		int choiceC = 0;
		String mMsg = "\n[메뉴를 선택하세요]\n1. 기본공격\n2. 스킬공격\n3. 특수공격\n4. 종료\n 선택입력 : ";
		String mMsgW = "\n[메뉴를 선택하세요]\n1. 스킬공격\n2. 특수공격\n3. 전사고유공격\n4. 종료\n 선택입력 : ";
		int choiceM = 0;
		
		
		
		Wizard wi = null;
		Warrior wa = null;
		Rogue ro = null;
		
		
		while(!(choiceC > 0 && choiceC <4)) {
			System.out.print(cMsg);
			choiceC = sc.nextInt();
			sc.nextLine();
			if(!(choiceC > 0 && choiceC <4)) {
				System.out.println("잘못 입력했습니다. 다시 입력해 주세요.\n");
			}
		}
		
		switch(choiceC) {
		case 1:
			wi = new Wizard();
			System.out.println(wi.name + "이(가) 생성되었습니다.");
			break;
		case 2:
			wa = new Warrior();
			System.out.println(wa.name + "이(가) 생성되었습니다.");
			break;
		case 3:
			ro = new Rogue();
			System.out.println(ro.name + "이(가) 생성되었습니다.");
			break;
		}
	
		
		while(true) {
			if(choiceC != 2) {			
				System.out.print(mMsg);//전사가 아니면 기본 메뉴
			}else {						
				System.out.print(mMsgW);//전사일 땐 전사 선용 메뉴
			}
			choiceM = sc.nextInt();
			sc.nextLine();
			if(!(choiceM > 0 && choiceM <5)) {
				System.out.println("잘못 입력했습니다. 다시 입력해 주세요.\n");
				continue;
			}else if(choiceM == 4){
				System.out.println("\n[게임을 종료합니다]");
				break;
			}
			
			System.out.println();
			
			if(choiceC == 1) {
				
				switch(choiceM) {
				case 1:
					wi.normalAttack();
					break;
				case 2:
					wi.skillAttack();
					break;
				case 3:
					wi.specialAttack();
					break;
				}
				wi.revive();
			
			}else if(choiceC == 2) {
				
				switch(choiceM) {
				case 1:
					wa.skillAttack();
					break;
				case 2:
					wa.specialAttack();
					break;
				case 3:
					wa.onlyWarrior();
					break;
				}
				wa.revive();
				
			}else if(choiceC == 3) {
				
				switch(choiceM) {
				case 1:
					ro.normalAttack();
					break;
				case 2:
					ro.skillAttack();
					break;
				case 3:
					ro.specialAttack();
					break;
				}
				ro.revive();
				
			}
			
			
			
		}
		
		sc.close();
	}
}


//package gameTask;
//
//import java.util.Scanner;
//
//public class Main {
//   public static void main(String[] args) {
////      사용자에게 캐릭터를 선택하게 하고 1. 마법사, 2. 전사, 3. 로그
////      선택한 캐릭터로 반복적으로 메뉴 실행
////      1. 기본공격, 2. 스킬공격, 3. 특수공격, 4. 종료
//
//      //1) 입력클래스 import
//      Scanner sc = new Scanner(System.in);
//      //2) Wizard 객체 생성 마법사, 전사, 로그 = null;
//      Character character = null;
//      Wizard wizard = null;
//      Warrior warrior = null;
//      Rogue rogue = null;
//      //3) 반복문(while (true))
//      while(true) {
//         //   3-1) 캐릭터 선택 메시지 출력
//         //   syso(1. 마법사);
//         //   ...syso(선택 : );
//         System.out.println("캐릭터를 선택하세요.\n" 
//               + "1. 마법사\n"
//               + "2. 전사\n"
//               + "3. 로그\n"
//               + "입력 : ");
//         //   3-2) int choice = sc.nextInt();
//         int choice = sc.nextInt(); //지역변수(인스턴스 변수)
//         //   3-3) sc.nextLine(); 버퍼지우기
//         sc.nextLine();
//         //   3-4) switch or if문
//         //      객체명 = new 생성자();
//         if(choice == 1) {
//            wizard = new Wizard();
//            break;
//         }else if(choice == 2) {
//            warrior = new Warrior();
//         }else if(choice == 3) {
//            rogue = new Rogue();
//         }else {
//            System.out.println("번호를 다시 입력하세요");
//         }
//      }
//
//      //4) String 변수 = 메뉴 출력 메시지
//      String msg = "\n1. 일반공격\n2. 스킬공격\n3. 특수공격\n4. 종료\n번호입력 : ";
////      System.out.println(msg);
//      //5) 반복문(while (true))
//      while (true) {
//         //   5-1) 메뉴 출력
//         System.out.println(msg);
//         //   5-2) choice = sc.nextInt();
//         int choice = sc.nextInt(); //지역변수(인스턴스 변수)
//         //   5-3) switch (choice)
//         switch(choice) {
//         //   5-4) case 1:
//         //   5-5) 객체명.normalAttack;
//         //    5-6) break;
//         //   ...    case 4:
//         //         syso("게임종료);
//         //         sc.close();
//         //         return;
//         //
//         case 1:
//            wizard.normalAttack();
//            break;
//         case 2:
//            wizard.skillAttack();
//            break;
//         case 3:
//            wizard.specialAttack();
//            break;
//         case 4:
//            System.out.println("게임종료");
//            sc.close();
//            return;
//         default:
//            System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
//            
//         }
//
//      }
//
//      
//   }
//}