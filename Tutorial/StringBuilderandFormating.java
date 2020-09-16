package Tutorial;

public class StringBuilderandFormating{

	public void inefficient(){
		String text = "";
		text += "Adding strings is inefficient";
		text += ", because we are creating a new string\n";
		text += "every time we add to the last string"; 
		System.out.println(text);
	}
	
	public void build(){
		StringBuilder text = new StringBuilder();
		text.append("StringBuilder class is more efficent")
		.append("You can also append in a continous way\n")
		.append("And if you are multithreading you should use StringBuffer\n");
		System.out.println(text.toString());
	}

	public void formating(){
		System.out.printf("This is formated text %2d\n", 1);
		System.out.println("%d is for int and %xd (where x is a number) is how much space the number takes\n");
		for(int i=2;i<20;i++){
			System.out.printf("This is formated text %2d\n", i); 
		}
		for(float i=1.0F;i < 20.0F;i++){
		    System.out.printf("It also works on floats %4.1f\n",i);
        }
		System.out.println("%f is for float and %y.xf (where y.x is a number)");
		System.out.println("y and x decide how much space each part of the number takes");
	}
}
