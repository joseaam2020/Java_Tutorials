package Tutorial;

public class StringArrays{
	public void array(){
		String[] words = new String[3];

		words[0] = "Hello";
		words[1] = "It's me";
		words[2] = "I was wondering if after all this years you'd talk to me";

		for(String word: words){
			System.out.println(word);
		}
	}
}
