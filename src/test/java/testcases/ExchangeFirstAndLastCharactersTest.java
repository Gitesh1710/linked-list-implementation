package testcases;

import org.junit.Test;

import com.java.string.exchange.characters.ExchangeFirstAndLastCharacters;

public class ExchangeFirstAndLastCharactersTest {
	ExchangeFirstAndLastCharacters obj = new ExchangeFirstAndLastCharacters();
	
	@Test
	public void testExchangeFirstAndLastCharacters() {
		System.out.println(obj.returnModifiedString("This is America"));
	}
}
