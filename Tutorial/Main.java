package Tutorial;

import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		HelloWorld HW = new HelloWorld();
		HW.helloworld();
		Strings string = new Strings();
		string.print();
		WhileLoops WL = new WhileLoops();
		WL.loop();
		ForLoops FL = new ForLoops();
		FL.loop();
		IfStatements IS = new IfStatements();
		IS.statement();
		UserInput US = new UserInput();
		US.scan();
		DoWhileLoop DW = new DoWhileLoop();
		DW.loop();
		SwitchStatement SS = new SwitchStatement();
		SS.statement();
		Arrays_ A = new Arrays_();
		A.array();
		StringArrays SA = new StringArrays();
		SA.array();
		MultiDimensionArrays MA = new MultiDimensionArrays();
		MA.array();
		Person John = new Person("John",33);
		John.print();
		GetandReturn GR = new GetandReturn();
		System.out.println(GR.returns_sum(1,2));
		System.out.println(Arrays.toString(GR.get_values()));
		John.speak("Hello I am "+John.get_name());
		John.set_name("John Mclane");
		John.speak("Hello I am "+John.get_name());
		Person.show_static();
		StringBuilderandFormating SBF = new StringBuilderandFormating();
		SBF.inefficient();
		SBF.build();
		SBF.formating();
	}
}
