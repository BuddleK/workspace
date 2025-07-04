package test;

import java.util.Scanner;

public class GameRewriteMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GameRewrite game = new GameRewrite();
		game.setLevel(sc);
		game.getStart(sc);
		
		
		sc.close();
	}
}
