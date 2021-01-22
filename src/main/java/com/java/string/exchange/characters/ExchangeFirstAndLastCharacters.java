package com.java.string.exchange.characters;

public class ExchangeFirstAndLastCharacters {
	public String returnModifiedString(String inputString) {
		
		if(inputString.length()<2) {
			return inputString;
		}
		char[] charArray = inputString.toCharArray();
		char temp = charArray[inputString.length()-1];
		charArray[inputString.length()-1] = charArray[0]; 
		charArray[0] = temp;
		
		return String.valueOf(charArray);
	}
}
