package com.devmoin.junit5.parameterized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by moin
 * on December, 2019
 **/
public class MethodSourceTest {
    @ParameterizedTest(name = "Test Case {index} with argument as {arguments}")
    @MethodSource("stringProvider")
    void testWithExplicitLocalMethodSource(String argument) {
        assertNotNull(argument);
    }

    static Stream<String> stringProvider() {
        return Stream.of("apple", "banana", null);
    }

    // Example with no method name in @ParameterizedTest
    @ParameterizedTest
    @MethodSource
    void testWithDefaultLocalMethodSource(String argument) {
        assertNotNull(argument);
    }

    static Stream<String> testWithDefaultLocalMethodSource() {
        return Stream.of("apple", "banana");
    }

    // Streams for primitive types (DoubleStream, IntStream, and LongStream)
    // are also supported as demonstrated by the following example.
    @ParameterizedTest
    @MethodSource("range")
    void testWithRangeMethodSource(int argument) {
        assertNotEquals(9, argument);
    }

    static IntStream range() {
        return IntStream.range(0, 20).skip(10);
    }

    @ParameterizedTest
    @MethodSource("stringIntAndListProvider")
    void testWithMultiArgMethodSource(String str, int num, List<String> list) {
        assertEquals(5, str.length());
        assertTrue(num >=1 && num <=2);
        assertEquals(2, list.size());
    }

    static Stream<Arguments> stringIntAndListProvider() {
        return Stream.of(
                Arguments.arguments("apple", 1, Arrays.asList("a", "b")),
                Arguments.arguments("lemon", 2, Arrays.asList("x", "y"))
        );
    }
}

class ExternalMethodSourceDemo {

    @ParameterizedTest
    @MethodSource("com.devmoin.junit5.parameterized.StringsProviders#tinyStrings")
    void testWithExternalMethodSource(String tinyString) {
        System.out.println(tinyString.toUpperCase());
    }
}

class StringsProviders {

    static Stream<String> tinyStrings() {
        return Stream.of("hello", "world", "junit5");
    }
}