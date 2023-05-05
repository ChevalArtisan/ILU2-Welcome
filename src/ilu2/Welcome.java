package ilu2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

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
				nomMaj.append(listnom[i].trim()+", ");
			}else {
			output.append(listnom[i].trim().substring(0,1).toUpperCase()+listnom[i].trim().substring(1)+", ");
			}
		}
		
		
		output=ajoutAnd(traitementvirgule(output), true);
		
		if (!nomMaj.isEmpty()) {
			nomMaj.insert(0, ". AND HELLO ");
			nomMaj=ajoutAnd(traitementvirgule(nomMaj), false);
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
	
	private static StringBuilder ajoutAnd(StringBuilder input,boolean min) {
		int indice=input.lastIndexOf(",");
		if(indice!=-1) {
		if(min) {
			return input.replace(indice, indice+1, " and");
		}else {
			return input.replace(indice, indice+1, " AND");
		}
		}else {
			return input;
		}
		
	}
	
	}
	
