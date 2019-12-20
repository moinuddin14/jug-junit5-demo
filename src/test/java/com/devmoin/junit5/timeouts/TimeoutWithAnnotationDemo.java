package com.devmoin.junit5.timeouts;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

/**
 * Created by moin
 * on December, 2019
 **/
public class TimeoutWithAnnotationDemo {

    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void test_this() throws InterruptedException{
        Thread.sleep(400);
    }
}
