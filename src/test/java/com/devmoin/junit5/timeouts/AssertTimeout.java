package com.devmoin.junit5.timeouts;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertTimeout;

/**
 * Created by moin
 * on December, 2019
 **/
public class AssertTimeout {
    @Test
    void timeoutNotExceeded()
    {
        assertTimeout(Duration.ofMinutes(2), () -> {
            System.out.println("Perform some task that takes < 2 mins...");
        });
    }

    @Test
    void timeoutExceeded() {
        assertTimeout(Duration.ofMillis(10), () -> {
            Thread.sleep(100);
        });
    }
}
