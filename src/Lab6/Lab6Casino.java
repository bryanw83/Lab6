package Lab6;

import java.util.Random;
import java.util.Scanner;

public class Lab6Casino {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userDice;
		int dieRoll1;
		int dieRoll2;
		String userChoice;
		String userName;

		System.out.println("Hello! Welcome to the Grand Circus Casino!");
		System.out.println();
		System.out.println("What's your name?");
		userName = scnr.nextLine();
		System.out.println();
		System.out.println("Well, " + userName + ", it's time to roll the dice!!!");

		do {
			System.out.print("How many sides will the dice have?: ");
			userDice = scnr.nextInt();
			dieRoll1 = casinoDice(userDice);
			dieRoll2 = casinoDice(userDice);
			System.out.println();
			System.out.print("Ok, so rolling two " + userDice + "-sided dice gives you: ");
				System.out.println(dieRoll1 + " and " + dieRoll2);
				if (dieRoll1 == 1 && dieRoll2 == 1) {
					System.out.println("Ooooo...Snake Eyes!");
				}else if(dieRoll1 == 6 && dieRoll2 == 6) {
					System.out.println("You got Boxcars!!!");
				}else if((dieRoll1 == 1 && dieRoll2 == 2) || (dieRoll1 == 2 && dieRoll2 ==1 )) {
					System.out.println("Awww, sorry. That's known in the biz as, 'Crapping Out'. I know...appealing.");
				}else {
					System.out.println("That roll gets you a point in 'Craps'!");
				}
			System.out.println();
			System.out.println("Would you like to roll again? (y/n)");
			userChoice = scnr.next();

		} while (userChoice.equalsIgnoreCase("y"));

		System.out.println("Ok, thanks for playing!");
		scnr.close();
		
	}

	public static int casinoDice(int num) {
		Random ranNum = new Random();
		int diceRoll;
		diceRoll = ranNum.nextInt(num) + 1;
		return diceRoll;
	}
	
}
