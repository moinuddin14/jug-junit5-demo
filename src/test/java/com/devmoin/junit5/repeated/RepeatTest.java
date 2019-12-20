package com.devmoin.junit5.repeated;


import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Created by moin
 * on November, 2019
 **/
public class RepeatTest {
    @RepeatedTest(value = 10, name = "{displayName} :: repetition {currentRepetition} of {totalRepetitions} :smile:")
    void repeatedTest() {
        System.out.println(":smile:");
    }

    @RepeatedTest(value = 1, name = RepeatedTest.LONG_DISPLAY_NAME)
    @DisplayName("Details...")
    void customDisplayNameWithLongPattern(TestInfo testInfo) {
        assertEquals("Details... :: repetition 1 of 1", testInfo.getDisplayName());
    }

    static class RepeatTestLifeCycle {
        @BeforeEach
        public void setUp() {
            System.out.println("Inside setup...");
        }

        @AfterEach
        public void tearDown() {
            System.out.println("Inside teardown...");
        }

        @RepeatedTest(value = 10, name = "{displayName} :: repetition {currentRepetition} of {totalRepetitions} :smile:")
        @DisplayName("{testEmoji1} \uD83D\uDE03")
        void testEmoji1() {
            System.out.println("Testing Emoji...");
        }
    }
}
