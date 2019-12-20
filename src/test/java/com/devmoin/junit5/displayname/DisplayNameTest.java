package com.devmoin.junit5.displayname;

import org.junit.jupiter.api.*;

/**
 * Created by moin
 * on November, 2019
 **/
//@DisplayName("Display Name Tests")
public class DisplayNameTest {

    @Test
    void demoTest() {
        System.out.println("Hello World!");
    }

    @Test
    @DisplayName("Display Name First Test")
    void DisplayNameTestCase() {
        System.out.println("Hello World...");
    }

    @Test
    @DisplayName("╯°□°）╯")
    void testWithDisplayNameContainingSpecialCharacters() {
    }

    @Test
    @DisplayName("😱")
    void testWithDisplayNameContainingEmoji() {
    }

    @Test
    @DisplayName("Another emoji example \uD83D\uDE0E")
    void testWithDisplayNameContainingEmoji2() {

    }
}