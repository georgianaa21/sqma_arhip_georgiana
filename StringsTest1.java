import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringsTest1 {

    @Test
    public void testConcatenate() {
        Strings object = new Strings();
        String one = "one";
        String two = "two";

        assertEquals("onetwo", object.concatenate(one, two));
    }
}
