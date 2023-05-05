package ilu2;

import java.util.Iterator;
import java.util.Objects;

public class Welcome {
	
	public static String welcome(String input) {
		StringBuilder output= new StringBuilder();
		if ( input==null || input.trim().isEmpty()) {
			output.append("Hello, my friend");
		}else if (input.indexOf(",")==-1) {
			return welcomeSolo(input);
		}
		else {
			return welcomeMultiple(input);
		}
		return output.toString();
	}
	
	
	private static String welcomeSolo(String input) {
		StringBuilder output= new StringBuilder();

		if(Objects.equals(input, input.toUpperCase()))
			{
			output.append("HELLO, ");
			}
		else {
			output.append("Hello, ");
			}
		output.append(input.substring(0, 1).toUpperCase() + input.substring(1));
		
		return  output.toString();
	}

	private static String welcomeMultiple(String input) {
		StringBuilder output= new StringBuilder();
		StringBuilder nomMaj=new StringBuilder();
		String[] listnom=input.split(",");
		for (int i = 0; i < listnom.length; i++) {
			if(Objects.equals(listnom[i], listnom[i].toUpperCase())) {
				nomMaj.append(listnom[i]+", ");
			}else {
			output.append(listnom[i].substring(0,1).toUpperCase()+listnom[i].substring(1)+", ");
			}
		}
		output=traitementvirgule(output);
		
		if (!nomMaj.isEmpty()) {
			nomMaj.insert(0, ". AND HELLO ");
			nomMaj=traitementvirgule(nomMaj);
			nomMaj.append(" !");
			output.append(nomMaj);
		}

		return ("Hello, "+output.toString());
	} 
	
	private static StringBuilder traitementvirgule(StringBuilder input) {
		input.deleteCharAt(input.lastIndexOf(","));
		input.deleteCharAt(input.lastIndexOf(" "));
		return input;
		
	}
}
