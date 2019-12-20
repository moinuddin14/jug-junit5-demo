package com.devmoin.junit5.testmethodorder;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * Created by moin
 * on December, 2019
 **/
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TestMethodOrderTest {

    @Test
    @Order(1)
    void nullValues() {}

    @Test
    @Order(2)
    void emptyValues() {}

    @Test
    @Order(3)
    void validValues() {}

    @Test
    void someRandomTest() {}
}
