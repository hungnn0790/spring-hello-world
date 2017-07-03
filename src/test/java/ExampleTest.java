package test.java;

import static org.junit.Assert.*;
import main.java.Example;

/**
 * Created by root on 04/07/2017.
 */
public class ExampleTest {
    @org.junit.Test
    public void home() throws Exception {
        Example example = new Example();
        assertEquals(example.home(), "Hello World");
    }

}