package com.devmoin.junit5.assertassume;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * Created by moin
 * on December, 2019
 **/
public class AssertVsAssume {
    @Test
    void trueAssumption() {
        assumeTrue(true);
        assertEquals(7,3 + 4);
    }

    @Test
    @DisplayName("Assertion Timeout Test")
    void timeoutNotExceeded(){
        assertTimeout(Duration.ofSeconds(5),()-> Thread.sleep(4000));
    }
}
