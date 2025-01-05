package String;

public class StringImmutability {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		s1.concat(" World");
		System.out.println(s1); 
		
		String s2 = s1.concat(" World");
		System.out.println(s2);


	}

}
