import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int secretNumber = 5;

		System.out.println("Welcome to the Gussing Game!");

		int trys = 3;
		System.out.println("Guss a number between 1 and 10.");
		System.out.println("Enter 0 for a hint.\nEnter -1 to exit.");

		while (trys > 0) {

			int numberGuessed = input.nextInt();

			if (numberGuessed == 0) {
				if (secretNumber % 2 == 0) {
					System.out.println("The Secret Number is even.");
				} else {
					System.out.println("The Secret Number is odd.");
				}
				numberGuessed = input.nextInt();
				System.out.println("Please Guess a number.");
			}

			if (numberGuessed == -1) {
				System.out.println("Goodbye.");
				System.exit(0);
			}

			trys = (trys - 1);
			if (secretNumber == numberGuessed) {
				System.out.println("You guessed it, congrats!");
				trys = 0;
			} else {
				if (secretNumber > numberGuessed) {
					System.out.println("The number you gussed is a bit low.");
				} else {
					System.out.println("The number you gussed is a bit high.");
				}
				System.out.println("Sorry, you have " + trys + " left.");
			}
		}

		System.exit(0);
		input.close();
	}

}
