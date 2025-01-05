package String;

import java.io.PrintStream;

public class StringBuilderExample {

	public static void main(String[] args) {

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < 5; i++) {
		    result.append(i).append(" ");
		}
		System.out.println(result.toString());

	}

	

}
