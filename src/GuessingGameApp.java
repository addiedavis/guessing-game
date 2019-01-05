import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int secretNumber = 5;

		System.out.println("Welcome to the Gussing Game!");

		int trys = 3;

		while (trys > 0) {
			
			System.out.println("Guss a number between 1 and 10.");
			int numberGuessed = input.nextInt();
			trys = (trys - 1);
			if (secretNumber == numberGuessed) {
				System.out.println("You guessed it, congrats!");
				trys = 0;
			} else {
				System.out.println("Sorry, you have " + trys + " left.");
			}

		}

		input.close();
	}

}
