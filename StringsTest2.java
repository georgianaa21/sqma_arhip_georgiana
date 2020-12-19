import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringsTest2 {

    @Test
    public void testHello() {
        Strings object = new Strings();

        assertEquals("hello.", object.hello());
    }
}
