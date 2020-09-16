package Tutorial;

public class Person{
	private String my_name;
	private int my_age;
	private static String info = "This is a Person";
	//Static variables are accesible to static and non-static methods
	//Non-Static variables aren't accesible by static methods
	private static final int personNumber = 4;
	//final variables cannot be changed

	public Person(String name, int age){
		this.my_age = age;
		this.my_name = name;
	}

	public void print(){
		System.out.println("Name:"+this.my_name);
		System.out.println("Age:"+this.my_age);
	}

	public void speak(String text){
		System.out.println(text);
	}

	public void set_name(String newName){
		this.my_name = newName;
	}

	public String get_name(){
		return this.my_name;
	}

	public static void show_static(){
		System.out.println("Static functions belong to the class, not instances");
		System.out.println("Person number: "+Person.personNumber);
	}
}
