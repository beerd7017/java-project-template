import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    private static final String helloWorld = "HelloWorld!";

    @Test
    public void checkText(){
        assertEquals(helloWorld, "HelloWorld!");
    }
}
