package testcases;

import org.junit.Assert;

import com.java.string.getfirstnonrepeatedcharacterfromString.GetFirstNonRepeatedCharacterFromString;


public class FirstNonRepeatedCharacterFromStringTest {

	public static void main(String[] args) throws Exception {
		GetFirstNonRepeatedCharacterFromString obj = new GetFirstNonRepeatedCharacterFromString();
		Assert.assertEquals('M', obj.returnFirstNonRepeatedCharacterFromString("Morning"));
		Assert.assertNotEquals('i', obj.returnFirstNonRepeatedCharacterFromString("MMorning"));
		Assert.assertNotEquals('i', obj.returnFirstNonRepeatedCharacterFromString("MMoorrnniigg"));
	}

}
