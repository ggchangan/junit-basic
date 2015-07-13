package usage;

import static org.junit.Assert.*;

import org.junit.Test;

public class MessageUtilTest {

	String message = "Hello World!";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testPrintMessage() {
		message = "New Word";
		assertEquals(message,messageUtil.printMessage());
	}

}
