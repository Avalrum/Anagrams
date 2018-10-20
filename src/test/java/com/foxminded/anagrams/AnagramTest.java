package com.foxminded.anagrams;

import org.junit.Test;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.foxminded.anagrams.Anagram.reverseText;

public class AnagramTest {

	@Test(expected = NullPointerException.class)
	public void shouldNullPointerExceptionIfGivenNull() {
		String actual = reverseText(null);
		
		assertNull(actual);
	}

	@Test
	public void shouldReturnEmptyText() {
		String actual = reverseText("");
		
		assertEquals("", actual);
	}

	@Test
	public void shouldReturnDigitsOnTheSamePlases() {
		String actual = reverseText("12345 67890");
		
		assertEquals("12345 67890", actual);
	}
	
	@Test
	public void shouldReturnReversedWords() {
		String actual = reverseText("abcd efgh");
		
		assertEquals("dcba hgfe", actual);
	}

	@Test
	public void shouldReturnDigitsOnTheSamePlasesAndReversedLiteterals() {
		String actual = reverseText("a1bcd efg!h");
		
		assertEquals("d1cba hgf!e", actual);
	}

	@Test
	public void shouldReturnEmptyTextIfInputTextIsSingleSpace() {
		String actual = reverseText(" ");
		
		assertEquals("", actual);
	}

	@Test
	public void shouldDeleteSpacesAfterCharacters() {
		String actual = reverseText("a1bcd efg!h     ");
		
		assertEquals("d1cba hgf!e", actual);
	}

}
