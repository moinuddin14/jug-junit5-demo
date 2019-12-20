package com.devmoin.junit5.nested;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

/**
 * Created by moin
 * on December, 2019
 **/
@DisplayName("Nested Test Demo")
public class NestedTest {
    @Nested
    @DisplayName("Inside Class Tests")
    public class InsideClass {
        @Test
        @DisplayName("Inside Class Test 1")
        public void insideTest1() {
            System.out.println("Inside Test 1...");
        }

        @Test
        @DisplayName("Inside Class Test 2")
        public void insideTest2() {
            System.out.println("Inside Test 2...");
        }
    }

    @DisplayName("Not a Nested Test")
    public class NotNestedTest {
        @Test
        @DisplayName("Inside Class Test 1")
        public void insideTest11() {
            System.out.println("Inside Test 1...");
        }
    }
}
