package testsuite;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit1 {
	String message = "Robert";
	//MessageFormat messageUtil = new MessageFormat(message);
	
	@Test
	public void testPrintMessage(){
		System.out.println("Inside testPrintMessage()");
		
		assertEquals(message,"Robert");
	}
}
