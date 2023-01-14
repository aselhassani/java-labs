package com.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		String chars = "Allah is The Greatest";
		System.out.println(chars);
		System.out.println(groupCharsByCount(chars));
	}

	public static Map<Character, Integer> groupCharsByCount(String chars) {

		chars = chars.toLowerCase();

		Map<Character, Integer> result = new HashMap<>();

		for (int i = 0; i < chars.length(); i++) {

			// skip spaces
			if (chars.charAt(i) == ' ')
				continue;

			// this will increment the count
			int count = result.get(chars.charAt(i)) == null ? 0 : result.get(chars.charAt(i));
			result.put(chars.charAt(i), ++count);
		}

		return result;

    }
}
