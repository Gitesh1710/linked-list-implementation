package com.java.string.getfirstnonrepeatedcharacterfromString;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class GetFirstNonRepeatedCharacterFromString {
	
	public char returnFirstNonRepeatedCharacterFromString(String input) throws Exception {
		char resultantChar = '\0';
		Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
		for(char ch: input.toCharArray()) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}else {
				charMap.put(ch, 1);
			}
		}
		
		Set<Character> charSet = new LinkedHashSet<Character>();
		charSet = charMap.keySet();
		for(char ch: charSet) {
			if(charMap.get(ch)==1) {
				resultantChar=ch;
				break;
			}
		}
		
		if(resultantChar=='\0') {
			throw new Exception("No such character found");
		}
		return resultantChar;
	}
}
