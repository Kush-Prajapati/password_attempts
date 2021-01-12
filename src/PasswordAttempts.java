import java.util.Scanner;

public class PasswordAttempts {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program will show the number of attempts required to brute force hack a pin consisting of the characters 0-9");
		System.out.println("Enter the number of characters in the password.");
		
		int length = input.nextInt();
		
		int attempts = Attempts.getAttempts(length);
		
		System.out.println("The number of attempts required to brute force hack this password would be " + attempts);
		
		input.close();

	}

}
