package com.foxminded.anagrams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class AnagramTest {

	@Test
	public void testReverseText() {
		assertEquals("", Anagram.reverseText(""));
		assertEquals("", Anagram.reverseText(" "));
		assertEquals("dcba hgfe", Anagram.reverseText("abcd efgh"));
		assertEquals("d1cba hgf!e", Anagram.reverseText("a1bcd efg!h"));
	}
}
