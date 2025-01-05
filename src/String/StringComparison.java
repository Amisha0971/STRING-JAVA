package String;

public class StringComparison {

	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "Java version";
		String s3 = new String("Java");

		System.out.println(s1 == s2);       //  (same memory reference in String Pool)
		System.out.println(s1 == s3);       //  (different objects)
		System.out.println(s1.equals(s3));  //  (same content)

	}

}
