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
    public void testMickey1() {
        Hello hi = new Hello();
        String hello = hi.sayHello();

        assertEquals("Donald", "Donald");
                
    }
    
    @Test
    public void testMickey2() {
        Hello hi = new Hello();
        String hello = hi.sayHello();

        assertEquals("Minnie", "Minnie");
                
    }
    
    @Test
    public void testMickey3() {
        Hello hi = new Hello();
        String hello = hi.sayHello();

        assertEquals("Donald", "Donald");
                
    }

    @Test
    public void testMickey4() {
        Hello hi = new Hello();
        String hello = hi.sayHello();

        assertEquals("Elza", "Elza");
                
    }

     @Test
    public void testMickey5() {
        Hello hi = new Hello();
        String hello = hi.sayHello();

        assertEquals("Elza", "Elza");
                
    }

    
    
}
