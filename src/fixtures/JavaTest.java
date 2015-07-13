package fixtures;

import org.junit.Test;

import junit.framework.TestCase;

public class JavaTest extends TestCase{
	protected int value2;
	protected int value1;

	protected void setUp(){
		value1 = 3;
		value2 = 3;
	}
	
	@Test
	public void testAdd(){
		double result = value1 + value2;
		assertTrue(result == 6);
	}
}
