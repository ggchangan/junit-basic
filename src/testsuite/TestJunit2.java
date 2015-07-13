package testsuite;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit2 {
	String message = "Robert";

	// MessageFormat messageUtil = new MessageFormat(message);

	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi! Robert";
		assertEquals(message, "Robert");
	}
}
