package com.sample.java;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Unit test for Hello.
 * <p/>
 * A unit test aims to test all code and code paths of a specific class.
*/ 
public class HelloTest {

    @Test
    public void testSayHello() {
        Hello hi = new Hello();
        String hello = hi.sayHello();

        assertNotEquals(hello, "Hello");
        assertEquals("1", "1");
                
    }
    
    @Test
    public void testMickey() {
        Hello hi = new Hello();
        String hello = hi.sayHello();

        assertEquals("Mickey", "Mickey");
                
    }
    
    @Test
    public void testMickey() {
        Hello hi = new Hello();
        String hello = hi.sayHello();

        assertEquals("Donald", "Donald");
                
    }
    
    
}
