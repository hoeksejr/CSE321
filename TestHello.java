import junit.framework.TestCase;

public class TestHello extends TestCase {

    public void testHello()
    {
        Hello h = new Hello();
        assertTrue(h.greet(), "Hello, world");
    }
}
