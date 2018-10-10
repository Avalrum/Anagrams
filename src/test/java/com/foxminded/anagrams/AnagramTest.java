package com.foxminded.anagrams;

import org.junit.Test;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.foxminded.anagrams.Anagram.reverseText;

public class AnagramTest {

	String actual;

	@Test(expected = Exception.class)
	public void testTextIsNull() {
		actual = reverseText(null);
		assertNull("Verify that object is null", actual);
	}

	@Test
	public void testTextIsEmpty() {
		actual = reverseText("");
		assertEquals("", actual);
	}

	@Test
	public void testTextIsAlphabetic() {
		actual = reverseText("abcd efgh");
		assertEquals("dcba hgfe", actual);
	}

	@Test
	public void testTextOfAnyCharacters() {
		actual = reverseText("a1bcd efg!h");
		assertEquals("d1cba hgf!e", actual);
	}

	@Test
	public void testTextIsSingleSpace() {
		actual = reverseText(" ");
		assertEquals("", actual);
	}

	@Test
	public void testDeleteSpacesAfterText() {
		actual = reverseText("a1bcd efg!h     ");
		assertEquals("d1cba hgf!e", actual);
	}

}
