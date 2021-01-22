package testcases;

import org.junit.Assert;
import org.junit.Test;

import com.java.string.checkstringcontent.StringContentValidator;

public class StringContentVaidatorTest {

	StringContentValidator obj = new StringContentValidator();
	@Test
	public void checkStringContainsOnlyDigits() {
		Assert.assertTrue(obj.checkIfStringContainsOnlyDigits("112211"));
	}
	
	@Test
	public void checkStringContainsOnlyDigitsWithRegEx() {
		Assert.assertTrue(obj.checkIfStringContainsOnlyDigitsWithRegEx("1112211"));		
	}
}
