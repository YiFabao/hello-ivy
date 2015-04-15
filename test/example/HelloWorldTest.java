package example;

import junit.framework.TestCase;

public class HelloWorldTest extends TestCase {

    public HelloWorldTest(String name) {
		super(name);
	}

	public static void testSayHello() {
        HelloWorld world = new HelloWorld();
        assertEquals(world.sayHello(),"helloworld");

    }
}
