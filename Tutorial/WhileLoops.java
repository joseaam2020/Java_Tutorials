package Tutorial;

public class WhileLoops{
	byte value = 2;
	boolean condition = value < 10;

	public void loop(){
		while(condition){
			System.out.println("It's lower"+value);
			value += 1;
			condition = value < 10;
		}
	}
}
