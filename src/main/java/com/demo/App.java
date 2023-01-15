package com.demo;

import java.util.HashMap;
import java.util.Map;

public class App 
{
	public static void main(String[] args)
    {
		String chars = "Soccer is the best sport";
		System.out.println(chars);
		System.out.println(groupCharsByCount(chars));
	}

	public static Map<Character, Integer> groupCharsByCount(String chars) {

		chars = chars.toLowerCase();

		Map<Character, Integer> result = new HashMap<>();

		for (int i = 0; i < chars.length(); i++) {

			char c = chars.charAt(i);

			// skip spaces
			if (c == ' ')
				continue;

			// this will increment the count
			int count = result.containsKey(c) ? 0 : result.get(c);

			result.put(c, ++count);
		}

		return result;

    }
}
