package com.devmoin.junit5.tags;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * Created by moin
 * on December, 2019
 **/
public class TagsDemoTest {
    @Test
    @Tag("smoke")
    void database() {
        System.out.println("This test is wip...");
    }
}