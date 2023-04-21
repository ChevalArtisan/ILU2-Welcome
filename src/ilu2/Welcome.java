package ilu2;

public class Welcome {
	
	public static String welcome(String input) {
		StringBuilder output= new StringBuilder();
		if ( input==null || input.trim().isEmpty()) {
			output.append("Hello, my friend");
		}
		else { if(input==input.toUpperCase())
		{
		output.append("HELLO, ");
		}
		else {
		output.append("Hello, ");
		}
		output.append(input.substring(0, 1).toUpperCase() + input.substring(1));
		}
		return  output.toString();
	}
}
