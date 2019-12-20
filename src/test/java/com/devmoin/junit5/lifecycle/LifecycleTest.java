package com.devmoin.junit5.lifecycle;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

/**
 * Created by moin
 * on December, 2019
 **/
public class LifecycleTest {
    @BeforeAll
    static void beforAll() {
        System.out.println("Inside Before All Method...");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Inside Before Each Method...");
    }

    @Test
    void someTest() {
        System.out.println("Running some test...");
        assertTrue(true);
    }

    @Test
    void otherTest() {
        assumeTrue(true);
        System.out.println("Running another test...");
    }

    @Test
    @Disabled
    void disabledTest() {
        System.exit(1);
    }

    @Test
    @DisabledOnOs(OS.MAC)
    void disabledonMacTest() {
        fail("Runs on non-mac os machines...");
    }

    @AfterEach
    void afterEach() {
        System.out.println("Inside After Each...");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Inside After All...");
    }
}
