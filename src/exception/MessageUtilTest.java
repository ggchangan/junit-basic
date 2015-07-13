package exception;

import static org.junit.Assert.*;

import org.junit.Test;

public class MessageUtilTest {

	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);

	//���Դ˷����Ƿ��׳�ָ���쳣���׳��򷵻�true,�������ͨ��������false
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