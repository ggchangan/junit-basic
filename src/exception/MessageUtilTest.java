package exception;

import static org.junit.Assert.*;

import org.junit.Test;

public class MessageUtilTest {

	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);

	//测试此方法是否抛出指定异常，抛出则返回true,否则测试通不过返回false
	@Test(expected = ArithmeticException.class)
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		messageUtil.printMessage();
	}

	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Robert";
		assertEquals(message, messageUtil.salutationMessage());
	}

}
