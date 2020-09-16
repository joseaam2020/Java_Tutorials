package Tutorial;

import java.util.Scanner;

public class SwitchStatement{
	public void statement(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a text:");
		String text = input.nextLine();

		switch(text){
		case "start":
			System.out.println("Machine Started");
			break;
		case "stop":
			System.out.println("Machine Stopped");
			break;
		default:
			System.out.println("Okay");
		}
	}
}
