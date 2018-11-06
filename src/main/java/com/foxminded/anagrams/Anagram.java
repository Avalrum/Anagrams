package com.foxminded.anagrams;

import java.util.Scanner;
import static java.lang.Character.isAlphabetic;

public class Anagram {

	public static final String SEPARATOR = " ";

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String text = scanner.nextLine();
			System.out.println(reverseText(text));
		}
	}

	public static String reverseText(String text) {
		if (text != null) {
			String[] words = text.split(SEPARATOR);
			StringBuilder result = new StringBuilder();

			for (String word : words) {
				if (result.length() != 0) {
					result.append(SEPARATOR);
				}
				result.append(reverseWord(word));
			}
			return result.toString();
		} else {
			return "";
		}
	}

	private static String reverseWord(String word) {
		char[] chars = word.toCharArray();
		int leftIndex = 0;
		int rightIndex = chars.length - 1;

		while (leftIndex < rightIndex) {
			if (!isAlphabetic(chars[leftIndex])) {
				leftIndex++;
			} else if (!isAlphabetic(chars[rightIndex])) {
				rightIndex--;
			} else {
				char leftChar = chars[leftIndex];
				chars[leftIndex] = chars[rightIndex];
				chars[rightIndex] = leftChar;
				leftIndex++;
				rightIndex--;
			}
		}
		return new String(chars);
	}

}
