import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a number:");
		int numberGuessed = input.nextInt();
		if(numberGuessed == 7) {
			System.out.println("You won!");
		}
		else {
			System.out.println("You lost!");
		}
		input.close();
	}

}
