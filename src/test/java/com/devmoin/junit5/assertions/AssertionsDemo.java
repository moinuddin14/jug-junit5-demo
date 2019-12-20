package com.devmoin.junit5.assertions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static java.time.Duration.*;
import static java.time.temporal.ChronoUnit.MILLIS;
import java.util.LinkedList;
import java.util.List;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by moin
 * on December, 2019
 **/
public class AssertionsDemo {
    @Test
    @DisplayName("Assert with Boolean Pass")
    void assertBoolean() {
        assertTrue(true);
        assertTrue(this::returnTrue);

        assertFalse(false, () -> "Really " + "expensive " + "message" + ".");
    }

    private boolean returnTrue() {
        return true;
    }

    @Test
    @DisplayName("Assert Equals and Assert Not Same")
    void assertEqualsNotSame() {
        List<String> expected = asList("element");
        List<String> actual = new LinkedList<>(expected);

        assertEquals(expected, actual);
        assertEquals(expected, actual, "Different 'List' implementations should be equal.");
        assertEquals(expected, actual, () -> "Different " + "'List' implementations " + "should be equal.");

        assertNotSame(expected, actual, "Obviously not the same instance.");
    }

    @Test
    @DisplayName("Fail Test...")
    void failTest() {
        fail("abcdef...");
    }

    @Test
    @DisplayName("Assert all demo...")
    void assertAllTest() {
        Address address = new Address("Hyderabad", "Kondapur", "No");

        assertAll("address",
                () -> assertEquals("Neustadt", address.city),
                () -> assertEquals("Irgendeinestraße", address.street),
                () -> assertEquals("Nr", address.number)
        );
    }

    static class Address {

        final String city;
        final String street;
        final String number;

        private Address(String city, String street, String number) {
            this.city = city;
            this.street = street;
            this.number = number;
        }
    }

    @Test
    @DisplayName("Assert Exceptions Pass")
    void assertException() {
        Exception exception = assertThrows(Exception.class, this::throwing);
        assertEquals("I'm failing on purpose.", exception.getMessage());
    }

    private void throwing() {
        throw new IndexOutOfBoundsException("I'm failing on purpose.");
    }

    @Test
    @DisplayName("Assert Timeout Demo Test...")
    void assertTimeoutTest() {
        assertTimeout(of(1000, MILLIS), () -> {
            sleepUninterrupted(2500);
            // you will see this message
            System.out.println("Woke up");
        });
    }

    @Test
    void assertTimeoutPreemptively_runsLate_failsAndAborted() {
        assertTimeoutPreemptively(of(1000, MILLIS), () -> {
            sleepUninterrupted(2500);
            // you will NOT see this message
            System.out.println("Woke up");
        });
    }

    private static void sleepUninterrupted(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ex) { }
    }
}

