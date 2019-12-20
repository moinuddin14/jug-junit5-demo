package com.devmoin.junit5.parameterized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import static org.junit.jupiter.api.Assertions.*;

import java.util.EnumSet;
import java.util.concurrent.TimeUnit;

/**
 * Created by moin
 * on December, 2019
 **/
public class EnumSourceTest {

    @ParameterizedTest(name = "{index} - {arguments}")
    @EnumSource(TimeUnit.class)
    void testEnumParams(TimeUnit timeUnit) {
        System.out.println(timeUnit);
    }

    @ParameterizedTest(name = "{index} - {arguments}")
    @EnumSource(EnumSeason.class)
    void testEnumSeason1(EnumSeason enumSeason) {
        System.out.println(enumSeason);
    }

    @ParameterizedTest(name = "{index} - {arguments}")
    @EnumSource(names = {"WINTER", "SPRING", "SUMMER"})
    void testEnumSeason2(EnumSeason enumSeason) {
        System.out.println(enumSeason);
    }

    @ParameterizedTest
    @EnumSource(value = TimeUnit.class, mode = EnumSource.Mode.EXCLUDE, names = { "DAYS", "HOURS" })
    void testWithEnumSourceExclude(TimeUnit timeUnit) {
        assertFalse(EnumSet.of(TimeUnit.DAYS, TimeUnit.HOURS).contains(timeUnit));
        assertTrue(timeUnit.name().length() > 5);
    }
}
