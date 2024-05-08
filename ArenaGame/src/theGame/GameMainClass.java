package theGame;

import java.util.Scanner;

public class GameMainClass {

	public static void main(String[] args) throws InterruptedException {
		try (Scanner sc = new Scanner(System.in)) {
			char player1='A';
			char player2='B';
//Getting input from Player 1
			System.out.println("\t\t\t\tPlayer A \n\nPlease Enter the Health");
			int Health1=sc.nextInt();
			System.out.println("\nPlease Enter the Strength");
			int Strength1=sc.nextInt();
			System.out.println("\nPlease Enter the Attack power");
			int Attack1=sc.nextInt(); 
			
//Getting input from Player 2
			
			System.out.println("\t\t\t\tPlayer B \n\nPlease Enter the Health");
			int Health2=sc.nextInt();
			System.out.println("\nPlease Enter the Strength");
			int Strength2=sc.nextInt();
			System.out.println("\nPlease Enter the Attack power");
			int Attack2=sc.nextInt(); 
			
			
			PlayerClass A=new PlayerClass(player1,Health1, Strength1, Attack1);
			PlayerClass B=new PlayerClass(player2,Health2, Strength2, Attack2);
//Instance of Arena class
			
			ArenaClass game1=new ArenaClass(A, B);
			
//Start Game
			
			game1.play();
		}

	}

}
