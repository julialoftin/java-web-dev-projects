package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void testBracketsSurroundString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void testFirstBracketWithinString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void testStringBeginsWithBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void testEmptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void testNoClosingBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void testBackwardBracketsWithOtherChars() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void testOpenBracketOnly() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void testBackwardBracketsOnly() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void testMultiplePairedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][]"));
    }
    @Test
    public void testMultipleUnPairedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][][]["));
    }
}