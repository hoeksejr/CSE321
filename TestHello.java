import junit.framework.TestCase;

public class TestHello extends TestCase {

    public void testHello()
    {
        Hello h = new Hello();
        assertEquals(h.greet(), "Hello, world");
    }
}