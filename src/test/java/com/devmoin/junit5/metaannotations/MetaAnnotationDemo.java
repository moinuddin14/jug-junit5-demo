package com.devmoin.junit5.metaannotations;

/**
 * Created by moin
 * on December, 2019
 **/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MetaAnnotationDemo {
    @Fast
    @Test
    void fastTest() {
        System.out.println("Fast Test...");
        Assertions.assertEquals(1, 2, "Fail");
    }

    @Fastest
    void fastest() {
        System.out.println("Inside Fastest Test...");
    }
}
