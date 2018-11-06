package com.foxminded.anagrams;

import org.junit.Test;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.foxminded.anagrams.Anagram.reverseText;


public class AnagramTest {

	@Test
	public void givenNullWhenRevrseTextThenEmptyString() {
		String actual = reverseText(null);
		
		assertEquals("", actual);
	}

	@Test
	public void givenEmptyStringWhenReverseTextThenEmptyString() {
		String actual = reverseText("");
		
		assertEquals("", actual);
	}
	
	@Test
	public void givenSingleSpaceWhenReverseTextThenEmptyString() {
		String actual = reverseText(" ");
		
		assertEquals("", actual);
	}

	@Test
	public void givenDigitsWhenReverseTextThenDigitsOnTheSomePlaces() {
		String actual = reverseText("12345 67890");
		
		assertEquals("12345 67890", actual);
	}
	
	@Test
	public void givenLiteralsTextWhenReverseTextsThenReversedText() {
		String actual = reverseText("abcd efgh");
		
		assertEquals("dcba hgfe", actual);
	}

	@Test
	public void givenLiteralsAndDigitsTextWhenReverseTextThenDigitsOnTheSomePlacesAndReversedLiterals() {
		String actual = reverseText("a1bcd efg!h");
		
		assertEquals("d1cba hgf!e", actual);
	}

	@Test
	public void givenTextWithSpacesWhenReversTextThenTrimAllSpacesAfterLastSymbol() {
		String actual = reverseText("a1bcd efg!h     ");
		
		assertEquals("d1cba hgf!e", actual);
	}

}
