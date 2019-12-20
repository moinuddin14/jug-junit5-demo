package com.devmoin.junit5.parameterized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by moin
 * on December, 2019
 **/
public class CsvFileSourceTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/two-column.csv", numLinesToSkip = 1)
    void testWithCsvFileSource(String country, int reference) {
        assertNotNull(country);
        assertNotEquals(0, reference);
    }
}
