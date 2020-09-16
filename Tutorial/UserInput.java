package Tutorial;

import java.util.Scanner;

public class UserInput{
	public void scan(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a line of text:");
		String line = input.nextLine();
		System.out.println("You entered:" + line);
	}
}
