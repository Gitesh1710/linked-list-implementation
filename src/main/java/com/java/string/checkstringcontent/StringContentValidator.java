package com.java.string.checkstringcontent;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class StringContentValidator {
	
	public boolean checkIfStringContainsOnlyDigits(String input) {
		boolean isConditionMet= true;
		List<Character> digitArray= new ArrayList<Character>();
		digitArray.add('0');
		digitArray.add('1');
		digitArray.add('2');
		digitArray.add('3');
		digitArray.add('4');
		digitArray.add('5');
		digitArray.add('6');
		digitArray.add('7');
		digitArray.add('8');
		digitArray.add('9');
		
		for(char ch: input.toCharArray()) {
			if(!(digitArray.contains(ch))) {
				isConditionMet=false;
				break;
			}				
		}
		
		return isConditionMet;
	}

	public boolean checkIfStringContainsOnlyDigitsWithRegEx(String input) {
		Pattern p = Pattern.compile(".*^[0-9]*.");
		return p.matcher(input).matches();
	}
}
