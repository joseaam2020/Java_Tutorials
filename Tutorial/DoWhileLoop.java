package Tutorial;

import java.util.Scanner;

public class DoWhileLoop{
	public void loop(){
		Scanner input = new Scanner(System.in);

		/*
		System.out.println("Enter a number:");
		int value = scanner.nextInt();

		while(value != 5){
			System.out.println("Enter a number:");
			int value = scanner.nextInt();
		}*/

		int value = 0;
		do{
			System.out.println("Enter a number(*Hint* five):");
			value = input.nextInt();
		} while(value != 5);
	}
}
