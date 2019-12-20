package com.devmoin.junit5.testinstance;

import org.junit.jupiter.api.*;

/**
 * Created by moin
 * on December, 2019
 **/
@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
public class TestInstanceDemo {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Inside Before all...");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Inside Before Each...");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Inside After all...");
    }

    @AfterEach
    void afterEach() {
        System.out.println("Inside After Each...");
    }

    @Test
    void nullValues() {
        System.out.println("Inside null values method...");
    }

    @Test
    void emptyValues() {
        System.out.println("Inside empty values method...");
    }

    @Test
    void validValues() {
        System.out.println("Inside valid values method...");
    }
}