package Tutorial; 

public class IfStatements{
	public void statement(){
		byte num1 = 9;
		byte num2 = 10;

		if(num1 > num2){
			System.out.printf("The higher number is:%d \n",num1);
		} else if(num2 == 10){
			System.out.print("num2 is 10\n");
		} else{
			System.out.printf("The higher number is:%d \n",num2);
		}
	}
}
