package com.devmoin.junit5.test;

/**
 * Created by moin
 * on December, 2019
 **/
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HelloWorldJUnit5 {
    private final Example example = new Example();

    @Test
    void welcomeToJunit5() {
        assertEquals(2, example.add(1, 1));
    }
}
