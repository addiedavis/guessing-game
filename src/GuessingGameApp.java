import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) throws InterruptedException {

		Scanner input = new Scanner(System.in);
		int secretNumber = (int)(Math.random() * 10 + 1);

		System.out.println("Hello, who are you?");
		String name = input.next();
		
		System.out.println("Welcome " + name + " to the Gussing Game!");
		
		int trys = 3;
		System.out.println("Guss a number between 1 and 10.");
		System.out.println("Enter 0 for a hint.\nEnter -1 to exit.");

		while (trys > 0) {

			int numberGuessed = input.nextInt();

			while (numberGuessed == 0) {

				Thread.sleep(2000);
				System.out.println("Hmm... a hint?");
				if (secretNumber % 2 == 0) {
					Thread.sleep(2000);
					System.out.println("The Secret Number is even.");
				} else {
					Thread.sleep(2000);
					System.out.println("The Secret Number is odd.");
				}
				Thread.sleep(2000);
				System.out.println("Please Guess a number.");
				numberGuessed = input.nextInt();
			}

			if (numberGuessed == -1) {
				System.out.println("Goodbye " + name + ".");
				System.exit(0);
			}

			trys --;
			if (secretNumber == numberGuessed) {
				Thread.sleep(2000);
				System.out.println("You guessed it, congrats!");
				trys = 0;
			} else {
				Thread.sleep(2000);
				if (secretNumber > numberGuessed) {
					System.out.println("The number you gussed is a bit low.");
				} else {
					System.out.println("The number you gussed is a bit high.");
				}
				System.out.println("Sorry, you have " + trys + " left.");
			}
		}

		input.close();
		System.out.println("Goodbye, thanks for playing!");
		System.exit(0);
	}

}
