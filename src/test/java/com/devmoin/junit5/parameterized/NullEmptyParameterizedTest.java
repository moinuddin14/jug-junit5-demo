package com.devmoin.junit5.parameterized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Created by moin
 * on December, 2019
 **/

public class NullEmptyParameterizedTest {
    @ParameterizedTest
    @EmptySource
    @NullSource
    @ValueSource(strings = {"   ", "\t", "\n", "\r", "\f", "\b", "\1"})
    void nullEmptyAndBlankStrings(String text) {
        assertTrue(text == null || text.trim().isEmpty());
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { " ", "  ", "\t", "\n", "hello" })
    void nullAndEmptySourceTest(String text) {
        assertTrue(text == null || text.trim().isEmpty());
    }


}
