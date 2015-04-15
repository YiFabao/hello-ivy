package example;

import org.junit.runners.Suite;

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
	}

	
	public static Test suite(){
		TestSuite suite = new TestSuite();
		suite.addTestSuite(HelloWorldTest.class);
		
		return suite;
	}
	
}
