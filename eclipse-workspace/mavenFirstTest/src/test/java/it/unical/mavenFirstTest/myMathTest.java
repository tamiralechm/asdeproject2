package it.unical.mavenFirstTest;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class myMathTest {
	
	@Before
public void executedBefore() {
		System.out.println("Before");
	}
	@Test
	public void fibonacciTest() {
		myMath math=new myMath();
		
		assertEquals(8,myMath.fibonacci(5));
		System.out.println("test1");
		
	}
	
}
