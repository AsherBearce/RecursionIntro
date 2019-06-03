package edu.cnm.deepdive;

import static org.junit.Assert.*;

public class PalindromeTest {

  @org.junit.Test
  public void isPalindrome() {
  assertTrue(Palindrome.isPalindrome("racecar"));
    assertTrue(Palindrome.isPalindrome("radar"));
    assertTrue(Palindrome.isPalindrome("eve"));
    assertTrue(Palindrome.isPalindrome("a"));
    assertTrue(Palindrome.isPalindrome("eeee"));
    assertTrue(Palindrome.isPalindrome(""));
    assertTrue(Palindrome.isPalindrome("deified"));
    assertTrue(Palindrome.isPalindrome("92139455493129"));
    assertFalse(Palindrome.isPalindrome("eve is eve"));
    assertFalse(Palindrome.isPalindrome("hi"));
    assertFalse(Palindrome.isPalindrome("away"));
    assertFalse(Palindrome.isPalindrome("1234"));
    assertFalse(Palindrome.isPalindrome("9070120709"));

  }
}