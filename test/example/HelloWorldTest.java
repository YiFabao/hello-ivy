package example;

import junit.framework.TestCase;

public class HelloWorldTest extends TestCase {

    public HelloWorldTest(String name) {
		super(name);
	}

	public void testSayHello() {
        HelloWorld world = new HelloWorld();
        //assert( world!=null );
        //assertEquals("Hello World",  world.sayHello() );
        System.out.println(world.sayHello());

    }
}
