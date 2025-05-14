package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testAdd() {
        assertEquals(5, App.add(2, 3));
    }

    @Test
    public void testHelloOutput() {
        // Optional: Test stdout if needed
        App.main(new String[]{});
    }
}
