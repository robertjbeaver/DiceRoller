import java.util.InputMismatchException;
import java.util.Scanner;

public class DiceRoller {

	public static void main(String[] args) {
		System.out.println("Welcome to the Dice Roller\n");
		Scanner sc = new Scanner(System.in);
		String choice = askToContinue(sc, "Would you like to roll the dice?");
		while(choice.equalsIgnoreCase("y")) {
			diceRoll();
			choice = askToContinue(sc, "\nRoll again?");
		}
		System.out.println("Roll again soon!");
		

	}
	public static void diceRoll() {
		int d1 = (int)(Math.random()*6)+1;
		int d2 = (int)(Math.random()*6)+1;
		int total = d1+d2;
		String result = "Die 1: " + d1 + "\nDie 2: "+ d2 + "\nTotal: "+ total;
		System.out.println(result);
		if(d1 == 1 && d2 == 1) {
			System.out.println("Snake eyes!");
		} else if(d1 == 6 && d2 == 6) {
			System.out.println("Boxcar!"); 
		}
			
	}
	
	public static String askToContinue(Scanner sc, String message) {
		System.out.print(message+"(Y/N):  ");
        String choice = sc.next();
        sc.nextLine();  // discard any other data entered on the line
        System.out.println();
        return choice;
	}
}
