package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testAddNumbers() {
        App app = new App();
        int result = app.addNumbers(5, 3);
        assertEquals(8, result, "5 + 3 should equal 8");
    }
}
