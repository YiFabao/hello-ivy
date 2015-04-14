package example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * TestSuit that
 * @author fabao.yi
 */
public class AllJUnitTests extends TestCase {

	public AllJUnitTests(String name) {
		super(name);
		System.out.println(name);
	}

	
	public static Test suit(){
		TestSuite suite = new TestSuite();
		suite.addTestSuite(HelloWorldTest.class);//测试helloWorld
		return suite;
	}
	
}
