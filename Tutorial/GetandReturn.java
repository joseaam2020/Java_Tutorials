package Tutorial;

public class GetandReturn{
	
	public int value1;
	public int value2;
	
	public int returns_sum(int num1, int num2){
		this.value1 = num1;
		this.value2 = num2;
		return num1 + num2;
	}

	public int[] get_values(){
		int[] values = {this.value1, this.value2};
		return values;
	}
}
