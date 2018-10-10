package it.unical.mavenFirstTest;
import org.junit.*;

public class performanceTest {
	
	@Test(timeout=1000)
	public void performanceTest1() {
		
		myMath math = new myMath();
		System.out.println(myMath.fibonacci(10));
	}
	

}
